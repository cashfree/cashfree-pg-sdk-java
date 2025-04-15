package com.cashfree.pg;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.cashfree.pg.model.App;
import com.cashfree.pg.model.AppPaymentMethod;
import com.cashfree.pg.model.Card;
import com.cashfree.pg.model.CardPaymentMethod;
import com.cashfree.pg.model.CreateOrderRequest;
import com.cashfree.pg.model.CustomerDetails;
import com.cashfree.pg.model.NetBankingPaymentMethod;
import com.cashfree.pg.model.Netbanking;
import com.cashfree.pg.model.OrderEntity;
import com.cashfree.pg.model.OrderMeta;
import com.cashfree.pg.model.PayOrderEntity;
import com.cashfree.pg.model.PayOrderEntity.ChannelEnum;
import com.cashfree.pg.model.PayOrderEntity.PaymentMethodEnum;
import com.cashfree.pg.model.PayOrderRequest;
import com.cashfree.pg.model.PayOrderRequestPaymentMethod;
import com.cashfree.pg.model.PaymentEntity;

public class OrderTest {

  Cashfree cashfree = new Cashfree(
      Cashfree.SANDBOX,
      "",
      "",
      null, null, null);

  final double orderAmount = 1.0;

  @Test
  public void testCreateOrder() throws ApiException {
    ApiResponse<OrderEntity> response = createOrderAndReturnSession();
    assertNotNull(response.getData().getPaymentSessionId());
  }

  @Test
  public void testPayNetbanking() throws ApiException {
    ApiResponse<OrderEntity> session = createOrderAndReturnSession();
    ApiResponse<PayOrderEntity> response = payOrder(session.getData().getPaymentSessionId(), createNetbankingPaymentMethod());

    assertEquals(ChannelEnum.LINK, response.getData().getChannel());
    assertEquals(PaymentMethodEnum.NETBANKING, response.getData().getPaymentMethod());
    assertNotNull(response.getData().getPaymentAmount());
    assertTrue(response.getData().getPaymentAmount().compareTo(BigDecimal.valueOf(orderAmount)) >= 0);
  }

  @Test
  public void testPayCard() throws ApiException {
    ApiResponse<OrderEntity> session = createOrderAndReturnSession();
    ApiResponse<PayOrderEntity> response = payOrder(session.getData().getPaymentSessionId(), createCardPaymentMethod("123"));

    assertEquals(ChannelEnum.LINK, response.getData().getChannel());
    assertEquals(PaymentMethodEnum.CARD, response.getData().getPaymentMethod());
    assertNotNull(response.getData().getPaymentAmount());
    assertTrue(response.getData().getPaymentAmount().compareTo(BigDecimal.valueOf(orderAmount)) >= 0);
  }

  @Test
  public void testPayCardWithEmptyCVV() {
    Exception exception = assertThrows(Exception.class, () -> {
      ApiResponse<OrderEntity> session = createOrderAndReturnSession();
      payOrder(session.getData().getPaymentSessionId(), createCardPaymentMethod(""));
    });

    assertTrue(exception.getMessage().contains("card_cvv"));
  }

  @Test
  public void testPayWalletPhonePe() throws ApiException {
    ApiResponse<OrderEntity> session = createOrderAndReturnSession();
    ApiResponse<PayOrderEntity> response = payOrder(session.getData().getPaymentSessionId(), createWalletPaymentMethod());

    assertEquals(200, response.getStatusCode());
  }

  @Test
  public void testInvalidCurrency() {
    Exception exception = assertThrows(Exception.class, () -> {
      CreateOrderRequest request = new CreateOrderRequest()
          .orderAmount(BigDecimal.valueOf(orderAmount))
          .orderCurrency("INjR")
          .customerDetails(new CustomerDetails()
              .customerId("iij")
              .customerName("abcd")
              .customerEmail("success@eligibility.com")
              .customerPhone("9999999999"));

      cashfree.PGCreateOrder(request, null, null, null);
    });

    assertTrue(exception.getMessage().contains("order_currency"));
  }

  @Test
  public void testInvalidAmount() {
    Exception exception = assertThrows(Exception.class, () -> {
      CreateOrderRequest request = new CreateOrderRequest()
          .orderAmount(BigDecimal.valueOf(-100))
          .orderCurrency("INR")
          .customerDetails(new CustomerDetails()
              .customerId("iij")
              .customerName("abcd")
              .customerEmail("success@eligibility.com")
              .customerPhone("9999999999"));
      cashfree.PGCreateOrder(request, null, null, null);
    });
    assertTrue(exception.getMessage().contains("Invalid amount"));
  }

  @Test
  public void testEmptyCustomerPhone() {
    Exception exception = assertThrows(Exception.class, () -> {
      CreateOrderRequest request = new CreateOrderRequest()
          .orderAmount(BigDecimal.valueOf(orderAmount))
          .orderCurrency("INR")
          .customerDetails(new CustomerDetails()
              .customerId("iij")
              .customerName("abcd")
              .customerEmail("success@eligibility.com")
              .customerPhone(""));

      cashfree.PGCreateOrder(request, null, null, null);
    });

    assertTrue(exception.getMessage().contains("customer_phone"));
  }

  @Test
  public void testFetchOrder() throws ApiException {
    ApiResponse<OrderEntity> session = createOrderAndReturnSession();

    ApiResponse<OrderEntity> response = cashfree.PGFetchOrder(session.getData().getOrderId(), null, null, null);
    assertEquals("INR", response.getData().getOrderCurrency());
  }

  @Test
  public void testFetchPaymentsForOrder() throws ApiException {
    ApiResponse<OrderEntity> session = createOrderAndReturnSession();
    Card cardDetails = new Card()
        .channel(Card.ChannelEnum.LINK)
        .cardNumber("4838305610460100")
        .cardHolderName("Tushar Gupta")
        .cardExpiryMm("06")
        .cardExpiryYy("25")
        .cardCvv("123");

    CardPaymentMethod cardMethod = new CardPaymentMethod()
        .card(cardDetails);
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod(cardMethod);

    PayOrderRequest request = new PayOrderRequest()
        .paymentSessionId(session.getData().getPaymentSessionId())
        .paymentMethod(paymentMethod);

    ApiResponse<PayOrderEntity> payOrderResponse = cashfree.PGPayOrder(request, null, null, null);
    assertEquals(200, payOrderResponse.getStatusCode(), "Status code mismatching");

    ApiResponse<PaymentEntity> response = cashfree.PGOrderFetchPayment(session.getData().getOrderId(),
        payOrderResponse.getData().getCfPaymentId(), null, null, null);
    assertEquals(200, response.getStatusCode());
  }

  private String generateOrderId() {
    return "order_" + (int) (Math.random() * 100000000);
  }

  private ApiResponse<OrderEntity> createOrderAndReturnSession() throws ApiException{
    String orderId = generateOrderId();

    CreateOrderRequest request = new CreateOrderRequest()
        .orderAmount(BigDecimal.valueOf(orderAmount))
        .orderCurrency("INR")
        .orderId(orderId)
        .customerDetails(new CustomerDetails()
            .customerId("testCustomer")
            .customerPhone("9999999999")
            .customerEmail("test@cashfree.com"))
        .orderMeta(new OrderMeta()
            .returnUrl("https://www.cashfree.com/devstudio/preview/pg/web/checkout?order_id={order_id}"));

    ApiResponse<OrderEntity> response = cashfree.PGCreateOrder(request, null, null, null);
    assertNotNull(response.getData().getPaymentSessionId());
    return response;
  }

  private PayOrderRequest buildPayOrderRequest(String sessionId, PayOrderRequestPaymentMethod method) {
    return new PayOrderRequest()
        .paymentSessionId(sessionId)
        .paymentMethod(method);
  }

  private PayOrderRequestPaymentMethod createCardPaymentMethod(String cvv) {
    Card cardDetails = new Card()
        .channel(Card.ChannelEnum.LINK)
        .cardNumber("4838305610460100")
        .cardHolderName("Tushar Gupta")
        .cardExpiryMm("06")
        .cardExpiryYy("25")
        .cardCvv(cvv);

    return new PayOrderRequestPaymentMethod(
        new CardPaymentMethod().card(cardDetails)
    );
  }

  private PayOrderRequestPaymentMethod createNetbankingPaymentMethod() {
    Netbanking netbankingDetails = new Netbanking()
        .netbankingBankCode(3087)
        .channel("link");

    return new PayOrderRequestPaymentMethod(
        new NetBankingPaymentMethod().netbanking(netbankingDetails)
    );
  }

  private PayOrderRequestPaymentMethod createWalletPaymentMethod() {
    App walletDetails = new App()
        .provider(App.ProviderEnum.PHONEPE)
        .phone("8474090512")
        .channel("link");

    return new PayOrderRequestPaymentMethod(
        new AppPaymentMethod().app(walletDetails)
    );
  }

  private ApiResponse<PayOrderEntity> payOrder(String sessionId, PayOrderRequestPaymentMethod paymentMethod) throws ApiException {
    PayOrderRequest request = buildPayOrderRequest(sessionId, paymentMethod);
    return cashfree.PGPayOrder(request, null, null, null);
  }

}

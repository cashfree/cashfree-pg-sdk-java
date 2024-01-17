package com.cashfree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.cashfree.model.LinkEntity;
import com.cashfree.model.App;
import com.cashfree.model.CreateLinkRequest;
import com.cashfree.model.LinkCustomerDetailsEntity;
import com.cashfree.model.LinkNotifyEntity;
import com.cashfree.model.PaymentEntity;
import com.cashfree.model.App.ProviderEnum;
import com.cashfree.model.AppPaymentMethod;
import com.cashfree.model.Card;
import com.cashfree.model.Card.ChannelEnum;
import com.cashfree.model.CardEMI;
import com.cashfree.model.CardEMI.CardBankNameEnum;
import com.cashfree.model.CardEMIPaymentMethod;
import com.cashfree.model.CardPaymentMethod;
import com.cashfree.model.CardlessEMI;
import com.cashfree.model.CardlessEMIPaymentMethod;
import com.cashfree.model.CreateOrderRequest;
import com.cashfree.model.CustomerDetails;
import com.cashfree.model.NetBankingPaymentMethod;
import com.cashfree.model.Netbanking;
import com.cashfree.model.OrderEntity;
import com.cashfree.model.PayOrderRequest;
import com.cashfree.model.PayOrderRequestPaymentMethod;
import com.cashfree.model.Paylater;
import com.cashfree.model.PaylaterPaymentMethod;
import com.cashfree.model.UPIPaymentMethod;
import com.cashfree.model.Upi;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import com.cashfree.Cashfree;



public class CashfreeTest {

  private Cashfree cashfree = new Cashfree();
  private String xApiVersion = "2022-09-01";

  private static String time = String.valueOf((Timestamp.valueOf(LocalDateTime.now()).getTime()));

  private String linkId = "Test"+time;

  @Test
  void testPGCreateOrder_HappyCase() throws ApiException {
    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    HashMap<String, String> orderTags = new HashMap<>();
    orderTags.put("abc", "def");
    CustomerDetails customerDetails = new CustomerDetails();
    customerDetails.customerId("iij");
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("9999999999");
    customerDetails.customerEmail("success@eligibility.com");
    CreateOrderRequest createOrderRequest = new CreateOrderRequest();
    createOrderRequest.orderId("");
    createOrderRequest.orderAmount(1.0);
    createOrderRequest.orderCurrency("INR");
    createOrderRequest.customerDetails(customerDetails);
    createOrderRequest.orderNote("Test Order");
    createOrderRequest.orderTags(orderTags);
    ApiResponse<OrderEntity> expected = cashfree.PGCreateOrder(xApiVersion, createOrderRequest, null, null, null);
//    assertEquals(expected.getData().getOrderCurrency(), "INR");
  }

  @Test
  void testPGCreateOrder_InvalidAmount() {
    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    HashMap<String, String> orderTags = new HashMap<>();
    orderTags.put("abc", "def");
    CustomerDetails customerDetails = new CustomerDetails();
    customerDetails.customerId("iij");
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("9999999999");
    customerDetails.customerEmail("fail@eligibility.com");
    CreateOrderRequest createOrderRequest = new CreateOrderRequest();
    createOrderRequest.orderId("");
    createOrderRequest.orderAmount(-3000.0);
    createOrderRequest.orderCurrency("INR");
    createOrderRequest.customerDetails(customerDetails);
    createOrderRequest.orderNote("Test Order");
    createOrderRequest.orderTags(orderTags);
    try {
      ApiResponse expected = cashfree.PGCreateOrder(xApiVersion, createOrderRequest, null, null, null);
    } catch (ApiException e) {
//      assertEquals(e.getCode(), 400);
//      assertEquals(e.getResponseBody(),
//          "{\"message\":\"order_amount : Invalid amount entered \",\"code\":\"order_amount_invalid\",\"type\":\"invalid_request_error\"}\n");
    }
  }

  @Test
  void testPGCreateOrder_InvalidCurrency() {
    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    HashMap<String, String> orderTags = new HashMap<>();
    orderTags.put("abc", "def");
    CustomerDetails customerDetails = new CustomerDetails();
    customerDetails.customerId("iij");
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("9999999999");
    customerDetails.customerEmail("fail@eligibility.com");
    CreateOrderRequest createOrderRequest = new CreateOrderRequest();
    createOrderRequest.orderId("");
    createOrderRequest.orderAmount(3000.0);
    createOrderRequest.orderCurrency("currency");
    createOrderRequest.customerDetails(customerDetails);
    createOrderRequest.orderNote("Test Order");
    createOrderRequest.orderTags(orderTags);
    try {
      ApiResponse expected = cashfree.PGCreateOrder(xApiVersion, createOrderRequest, null, null, null);
    } catch (ApiException e) {
//      assertEquals(e.getCode(), 400);
//      assertEquals(e.getResponseBody(),"{\"message\":\"order_currency : is not valid or not enabled. Value received: currency\",\"code\":\"order_currency_invalid\",\"type\":\"invalid_request_error\"}\n");
    }
  }

  @Test
  void testPGCreateOrder_EmptyPhoneNumber() {
    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    HashMap<String, String> orderTags = new HashMap<>();
    orderTags.put("abc", "def");
    CustomerDetails customerDetails = new CustomerDetails();
    customerDetails.customerId("iij");
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("");
    customerDetails.customerEmail("fail@eligibility.com");
    CreateOrderRequest createOrderRequest = new CreateOrderRequest();
    createOrderRequest.orderId("");
    createOrderRequest.orderAmount(3000.0);
    createOrderRequest.orderCurrency("INR");
    createOrderRequest.customerDetails(customerDetails);
    createOrderRequest.orderNote("Test Order");
    createOrderRequest.orderTags(orderTags);
    try {
      ApiResponse expected = cashfree.PGCreateOrder(xApiVersion, createOrderRequest, null, null, null);
    } catch (ApiException e) {
//      assertEquals(e.getCode(), 400);
//      assertEquals(e.getResponseBody(),"{\"message\":\"customer_details.customer_phone : is missing in the request. Value received: \",\"code\":\"customer_details.customer_phone_missing\",\"type\":\"invalid_request_error\"}\n");
    }
  }

  @Test
  void testPGFetchOrder_HappyCase() throws ApiException {
    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String OrderId = "order_342Z9ljdyCY0T94juEyqGjUazAruB";
    ApiResponse<OrderEntity> expected = cashfree.PGFetchOrder(xApiVersion, OrderId, null, null, null);
//    assertEquals(expected.getData().getCfOrderId(), 2152745961L);
  }

  @Test
  void testPGFetchOrder_OrderId_Invalid() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String OrderId = "1hyubuu";
    try {
      ApiResponse<OrderEntity> expected = cashfree.PGFetchOrder(xApiVersion, OrderId, null, null, null);
    }
    catch (ApiException e){
//      assertEquals(404,e.getCode());
//      assertEquals(e.getResponseBody(),"{\"message\":\"Order Reference Id does not exist\",\"code\":\"order_not_found\",\"type\":\"invalid_request_error\"}\n");
    }

  }

  @Test
  void testPGPayOrder_Invalid_PaymentSession() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    Card card = new Card();
    card.channel(ChannelEnum.LINK);
    card.cardNumber("4011381307320153");
    card.cardCvv("051");
    card.cardExpiryYy("27");
    card.cardExpiryMm("12");
    card.cardHolderName("sudheer");
    CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
    cardPaymentMethod.card(card);
    paymentMethod.setActualInstance(cardPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");
    try {
      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404,e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }

  }

  @Test
  void testPGPayOrder_HappyCase_card() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    Card card = new Card();
    card.channel(ChannelEnum.LINK);
    card.cardNumber("4011381307320153");
    card.cardCvv("051");
    card.cardExpiryYy("27");
    card.cardExpiryMm("12");
    card.cardHolderName("sudheer");
    CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
    cardPaymentMethod.card(card);
    paymentMethod.setActualInstance(cardPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");

    try {
      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404,e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGPayOrder_HappyCase_NetBanking() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    Netbanking netbanking = new Netbanking();
    netbanking.netbankingBankCode(3087);
    netbanking.channel("link");
    NetBankingPaymentMethod netBankingPaymentMethod = new NetBankingPaymentMethod();
    netBankingPaymentMethod.netbanking(netbanking);
    paymentMethod.setActualInstance(netBankingPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }

  }
  @Test
  void testPGPayOrder_HappyCase_UPI() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    Upi upi = new Upi();
    upi.upiId("6305423263@ybl");
    upi.channel(Upi.ChannelEnum.LINK);
    UPIPaymentMethod  upiPaymentMethod= new UPIPaymentMethod();
    upiPaymentMethod.upi(upi);
    paymentMethod.setActualInstance(upiPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGPayOrder_HappyCase_AppPayment() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    App app = new App();
    app.channel("link");
    app.provider(App.ProviderEnum.AMAZON);
    app.phone("6305423263");
    AppPaymentMethod appPaymentMethod= new AppPaymentMethod();
    appPaymentMethod.app(app);
    paymentMethod.setActualInstance(appPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGPayOrder_HappyCase_CardEmi() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    CardEMI cardEMI = new CardEMI();
    cardEMI.channel("link");
    cardEMI.cardNumber("4838305610460100");
    cardEMI.cardExpiryMm("12");
    cardEMI.cardExpiryYy("27");
    cardEMI.cardCvv("051");
    cardEMI.cardBankName(CardBankNameEnum.AU);
    cardEMI.emiTenure(3);
    cardEMI.cardHolderName("sudheer");
    CardEMIPaymentMethod cardEMIPaymentMethod = new CardEMIPaymentMethod();
    cardEMIPaymentMethod.emi(cardEMI);
    paymentMethod.setActualInstance(cardEMIPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("session_jkCKgrhxiK5qYWO9LjkoJw3JVTz4iiCoasLO8MZcWxzoifFWp_H5qk_qsTb8oDF-LSJgdtKB_asU1p3ag4sfK4eowvdaZRNuKjREmo5EkYlP");
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(400, e.getCode());
//      assertEquals("{\"message\":\"card not enabled for emi\",\"code\":\"card_unsupported\",\"type\":\"invalid_request_error\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGPayOrder_HappyCase_CardLessEmi() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    CardlessEMI cardlessEMI = new CardlessEMI();
    cardlessEMI.channel("link");
    cardlessEMI.emiTenure(3);
    cardlessEMI.phone("6305423263");
    cardlessEMI.provider(CardlessEMI.ProviderEnum.HDFC);
    CardlessEMIPaymentMethod cardlessEMIPaymentMethod = new CardlessEMIPaymentMethod();
    cardlessEMIPaymentMethod.cardlessEmi(cardlessEMI);
    paymentMethod.setActualInstance(cardlessEMIPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGPayOrder_HappyCase_PayLater() {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    Paylater paylater =new Paylater();
    paylater.channel("link");
    paylater.phone("6305423263");
    paylater.provider(Paylater.ProviderEnum.LAZYPAY);
    PaylaterPaymentMethod paylaterPaymentMethod = new PaylaterPaymentMethod();
    paylaterPaymentMethod.paylater(paylater);
    paymentMethod.setActualInstance(paylaterPaymentMethod);
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.paymentMethod(paymentMethod);
    payOrderRequest.paymentSessionId("");
    try {

      ApiResponse<com.cashfree.model.PayOrderEntity> actual = cashfree.PGPayOrder(xApiVersion, payOrderRequest, null,
          null, null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"payment_session_id is missing in the request\",\"code\":\"payment_session_id_invalid\",\"type\":\"request_failed\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGFetchPayments_HappyCase() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String orderId = "order_342ZAG3iLDihWgWIUPoR411biSw7A";
    ApiResponse<java.util.List<PaymentEntity>> actual = cashfree.PGOrderFetchPayments(xApiVersion, orderId,null,null,null );
//    assertEquals("order_342ZAG3iLDihWgWIUPoR411biSw7A",actual.getData().stream().findFirst().get().getOrderId());
  }

  @Test
  void testPGFetchPayments_OrderId_Empty() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String orderId = "";
    try {

      ApiResponse<java.util.List<PaymentEntity>> actual = cashfree.PGOrderFetchPayments(xApiVersion, orderId, null,
          null, null);
    }
    catch (ApiException e)  {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"Order Reference Id does not exist\",\"code\":\"order_not_found\",\"type\":\"invalid_request_error\"}\n",e.getResponseBody());
    }
  }

  @Test
  void testPGFetchPayment_HappyCase() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String orderId = "order_342ZAG3iLDihWgWIUPoR411biSw7A";
    String cfPaymentId = "14909865538";
    ApiResponse<PaymentEntity> expected = cashfree.PGOrderFetchPayment(xApiVersion, orderId, cfPaymentId, null, null,null );
//    assertEquals("payment",expected.getData().getEntity());
//    assertEquals(14909865538L, expected.getData().getCfPaymentId());
//    assertEquals("order_342ZAG3iLDihWgWIUPoR411biSw7A",expected.getData().getOrderId());

  }


  @Test
  void testPGFetchPayment_CFPaymentId_Is_Invalid() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String orderId = "order_342ZAG3iLDihWgWIUPoR411biSw7A";
    String cfPaymentId = "67476861";
    try {
      ApiResponse<PaymentEntity> expected = cashfree.PGOrderFetchPayment(xApiVersion, orderId, cfPaymentId, null, null,
          null);
    }
    catch (ApiException e) {
//      assertEquals(404, e.getCode());
//      assertEquals("{\"message\":\"transaction not found\",\"code\":\"payment_not_found\",\"type\":\"invalid_request_error\"}\n",e.getResponseBody());

    }
  }

  @Test
  void testPGFetchPayment_OrderId_Is_Invalid() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    String orderId = "wrfhug1";
    String cfPaymentId = "14909865538";
    try {
      ApiResponse<PaymentEntity> expected = cashfree.PGOrderFetchPayment(xApiVersion, orderId, cfPaymentId, null, null,
          null);
    }
    catch (ApiException e) {
//      assertEquals(400, e.getCode());
//      assertEquals("{\"message\":\"Order Reference Id does not exist\",\"code\":\"order_not_found\",\"type\":\"invalid_request_error\"}\n",e.getResponseBody());

    }
  }

  @Test
  void testPGCreateLink_HappyCase() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    LinkCustomerDetailsEntity customerDetails = new LinkCustomerDetailsEntity();
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("9999999999");
    customerDetails.customerEmail("success@eligibility.com");
    LinkNotifyEntity linkNotifyEntity = new LinkNotifyEntity();
    linkNotifyEntity.sendEmail(false);
    linkNotifyEntity.sendSms(false);
    CreateLinkRequest createLinkRequest = new CreateLinkRequest();
    createLinkRequest.linkId(linkId);
    createLinkRequest.linkAmount(1.00);
    createLinkRequest.linkCurrency("INR");
    createLinkRequest.linkPurpose("payment");
    createLinkRequest.linkNotify(linkNotifyEntity);
    createLinkRequest.linkPartialPayments(false);
    createLinkRequest.customerDetails(customerDetails);
    ApiResponse<LinkEntity> actual = cashfree.PGCreateLink(xApiVersion, createLinkRequest, null, null, null);
//    assertEquals(linkId,actual.getData().getLinkId() );

  }

  @Test
  void testPGCreateLink_LinkId_Empty() throws ApiException {

    Cashfree.XClientId = System.getenv("CLIENT_ID");
    Cashfree.XClientSecret = System.getenv("CLIENT_SECRET");
    LinkCustomerDetailsEntity customerDetails = new LinkCustomerDetailsEntity();
    customerDetails.customerName("abcd");
    customerDetails.customerPhone("9999999999");
    customerDetails.customerEmail("success@eligibility.com");
    LinkNotifyEntity linkNotifyEntity = new LinkNotifyEntity();
    linkNotifyEntity.sendEmail(false);
    linkNotifyEntity.sendSms(false);
    CreateLinkRequest createLinkRequest = new CreateLinkRequest();
    String linkId = "";
    createLinkRequest.linkId(linkId);
    createLinkRequest.linkAmount(1.00);
    createLinkRequest.linkCurrency("INR");
    createLinkRequest.linkPurpose("payment");
    createLinkRequest.linkNotify(linkNotifyEntity);
    createLinkRequest.linkPartialPayments(false);
    createLinkRequest.customerDetails(customerDetails);
    try {
      ApiResponse<LinkEntity> actual = cashfree.PGCreateLink(xApiVersion, createLinkRequest, null, null, null);
    } catch (ApiException e) {
//      assertEquals(400,e.getCode());
//      assertEquals("{\"message\":\"link_id : is missing in the request. Value received: \",\"code\":\"link_id_missing\",\"type\":\"invalid_request_error\"}\n",e.getResponseBody());
    }

  }

}


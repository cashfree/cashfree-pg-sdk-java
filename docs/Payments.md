# Payments

Method | HTTP request | Description
------------- | ------------- | -------------
[**PGOrderFetchPayment**](Payments.md#PGOrderFetchPayment) | **Get** /orders/{order_id}/payments/{cf_payment_id} | Get Payment by ID
[**PGOrderFetchPayments**](Payments.md#PGOrderFetchPayments) | **Get** /orders/{order_id}/payments | Get Payments for an Order
[**PGPayOrder**](Payments.md#PGPayOrder) | **Post** /orders/sessions | Order Pay
[**PGAuthorizeOrder**](Payments.md#PGAuthorizeOrder) | **Post** /orders/{order_id}/authorization | Preauthorization
[**PGOrderAuthenticatePayment**](Payments.md#PGOrderAuthenticatePayment) | **Post** /orders/pay/authenticate/{cf_payment_id} | Submit or Resend OTP


## PGOrderFetchPayment

> PGOrderFetchPayment(x_api_version: string, order_id: string, cf_payment_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<PaymentEntity, any>>

Get Payment by ID ([Docs](https://docs.cashfree.com/reference/pgorderfetchpayment))



### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String orderId = "order_8123order_8123"; // String | The id which uniquely identifies your order
        String cfPaymentId = "12376123"; // String | The Cashfree payment or transaction ID.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            PaymentEntity result = cashfree.PGOrderFetchPayment(xApiVersion, orderId, cfPaymentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#PGOrderFetchPayment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **orderId** | **String**| The id which uniquely identifies your order | |
| **cfPaymentId** | **String**| The Cashfree payment or transaction ID. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
{
  "cf_payment_id": 12376123,
  "order_id": "order_8123",
  "entity": "payment",
  "payment_currency": "INR",
  "error_details": null,
  "order_amount": 10.01,
  "is_captured": true,
  "payment_group": "upi",
  "authorization": {
    "action": "CAPTURE",
    "status": "PENDING",
    "captured_amount": 100,
    "start_time": "2022-02-09T18:04:34+05:30",
    "end_time": "2022-02-19T18:04:34+05:30",
    "approve_by": "2022-02-09T18:04:34+05:30",
    "action_reference": "6595231908096894505959",
    "action_time": "2022-08-03T16:09:51"
  },
  "payment_method": {
    "upi": {
      "channel": "collect",
      "upi_id": "rohit@xcxcx"
    }
  },
  "payment_amount": 10.01,
  "payment_time": "2021-07-23T12:15:06+05:30",
  "payment_completion_time": "2021-07-23T12:18:59+05:30",
  "payment_status": "SUCCESS",
  "payment_message": "Transaction successful",
  "bank_reference": "P78112898712",
  "auth_id": "A898101"
}
```



## PGOrderFetchPayments

> PGOrderFetchPayments(x_api_version: string, order_id: string, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<PaymentEntity[], any>>

Get Payments for an Order ([Docs](https://docs.cashfree.com/reference/pgorderfetchpayments))



### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String orderId = "order_8123"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            List<PaymentEntity> result = cashfree.PGOrderFetchPayments(xApiVersion, orderId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#PGOrderFetchPayments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **orderId** | **String**| The id which uniquely identifies your order | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
[
  {
    "cf_payment_id": 12376123,
    "order_id": "order_8123",
    "entity": "payment",
    "payment_currency": "INR",
    "error_details": null,
    "order_amount": 10.01,
    "is_captured": true,
    "payment_group": "upi",
    "authorization": {
      "action": "CAPTURE",
      "status": "PENDING",
      "captured_amount": 100,
      "start_time": "2022-02-09T18:04:34+05:30",
      "end_time": "2022-02-19T18:04:34+05:30",
      "approve_by": "2022-02-09T18:04:34+05:30",
      "action_reference": "6595231908096894505959",
      "action_time": "2022-08-03T16:09:51"
    },
    "payment_method": {
      "upi": {
        "channel": "collect",
        "upi_id": "rohit@xcxcx"
      }
    },
    "payment_amount": 10.01,
    "payment_time": "2021-07-23T12:15:06+05:30",
    "payment_completion_time": "2021-07-23T12:18:59+05:30",
    "payment_status": "SUCCESS",
    "payment_message": "Transaction successful",
    "bank_reference": "P78112898712",
    "auth_id": "A898101"
  },
  {
    "cf_payment_id": 12376124,
    "order_id": "order_8123",
    "entity": "payment",
    "payment_currency": "INR",
    "error_details": {
      "error_code": "TRANSACTION_DECLINED",
      "error_description": "issuer bank or payment service provider declined the transaction",
      "error_reason": "auth_declined",
      "error_source": "customer"
    },
    "order_amount": 10.01,
    "is_captured": true,
    "payment_group": "credit_card",
    "authorization": null,
    "payment_method": {
      "card": {
        "channel": "link",
        "card_number": "xxxxxx1111"
      }
    },
    "payment_amount": 10.01,
    "payment_time": "2021-07-23T12:15:06+05:30",
    "payment_completion_time": "2021-07-23T12:18:59+05:30",
    "payment_status": "FAILED",
    "payment_message": "Transaction failed",
    "bank_reference": "P78112898712",
    "auth_id": "A898101"
  }
]
```

## PGPayOrder

> PGPayOrder(x_api_version: string, PayOrderRequest: PayOrderRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<PayOrderEntity, any>>

Order Pay ([Docs](https://docs.cashfree.com/reference/pgpayorder))

### Example

```java
// Import classes:

import com.cashfree.*;
import com.cashfree.model.Card;
import com.cashfree.model.PayOrderRequestPaymentMethod;
import com.cashfree.models.*;
import com.cashfree.model.PayOrderRequest;
import com.cashfree.model.CardPaymentMethod;
public class Example {

  public static void main(String[] args) {

    Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
    Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
    Cashfree.XEnvironment = Cashfree.SANDBOX;

    Cashfree cashfree = new Cashfree();

    String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
    PayOrderRequest payOrderRequest = new PayOrderRequest();
    payOrderRequest.setPaymentSessionId(
        "session_CLLC8TuxmB48U8pYJy4z8Ktk9Eh6IMnJzAScehfhKRarvab9KCl09YNxLsDjfeU104u4bqcKgk3ckbIsGsAWHBjvlv0XhRlJEzx4E5cLUHRC");
    Card card = new Card();
    card.setCardCvv("123");
    card.setChannel("link");
    card.setCardHolderName("test");
    card.setCardNumber("4111111111111111");
    card.cardExpiryMm("12");
    card.cardExpiryYy("30");
    CardPaymentMethod cardPaymentMethod = new CardPaymentMethod();
    cardPaymentMethod.card(card);
    PayOrderRequestPaymentMethod paymentMethod = new PayOrderRequestPaymentMethod();
    paymentMethod.setActualInstance(cardPaymentMethod);
    payOrderRequest.setPaymentMethod(paymentMethod);// PayOrderRequest | Request body to create a transaction at cashfree using `payment_session_id`
    String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
    UUID xIdempotencyKey = UUID.fromString(
        "47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
    try {
      PayOrderEntity result = cashfree.PGPayOrder(xApiVersion, payOrderRequest, xRequestId,
          xIdempotencyKeyOkHttpClient httpClient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#PGPayOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **payOrderRequest** | [**PayOrderRequest**](PayOrderRequest.md)| Request body to create a transaction at cashfree using &#x60;payment_session_id&#x60; | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

#### Netbanking

```java
PayOrderRequest payOrderRequest = new PayOrderRequest();
payOrderRequest.setPaymentSessionId("session_CLLC8TuxmB48U8pYJy4z8Ktk9Eh6IMnJzAScehfhKRarvab9KCl09YNxLsDjfeU104u4bqcKgk3ckbIsGsAWHBjvlv0XhRlJEzx4E5cLUHRC");

Netbanking netbanking = new Netbanking();
netbanking.setChannel("link");
netbanking.setNetbankingBankCode(3021);
NetBankingPaymentMethod netBankingPaymentMethod = new NetBankingPaymentMethod();
netBankingPaymentMethod.netbanking(netBanking);
PayOrderRequestPaymentMethod paymentMethod = new PaymentMethod();
paymentMethod.setActualInstance(netbanking);
payOrderRequest.setPaymentMethod(paymentMethod);
```

#### UPI
```java
PayOrderRequest payOrderRequest = new PayOrderRequest();
payOrderRequest.setPaymentSessionId("session_CLLC8TuxmB48U8pYJy4z8Ktk9Eh6IMnJzAScehfhKRarvab9KCl09YNxLsDjfeU104u4bqcKgk3ckbIsGsAWHBjvlv0XhRlJEzx4E5cLUHRC");
Upi upi = new Upi();
upi.setChannel("collect");
upi.setUpiId("testsuccess@gocash");
UPIPaymentMethod upiPaymentMethod = new UPIPaymentMethod();
upiPaymentMethod.upi(upi);
PayOrderRequestPaymentMethod paymentMethod = new PaymentMethod();
paymentMethod.setActualInstance(upiPaymentMethod);
payOrderRequest.setPaymentMethod(paymentMethod);
```

#### UPI
```java
PayOrderRequest payOrderRequest = new PayOrderRequest();
payOrderRequest.setPaymentSessionId("session_CLLC8TuxmB48U8pYJy4z8Ktk9Eh6IMnJzAScehfhKRarvab9KCl09YNxLsDjfeU104u4bqcKgk3ckbIsGsAWHBjvlv0XhRlJEzx4E5cLUHRC");
Upi upi = new Upi();
upi.setChannel("link");
UPIPaymentMethod upiPaymentMethod = new UPIPaymentMethod();
upiPaymentMethod.upi(upi);
PayOrderRequestPaymentMethod paymentMethod = new PaymentMethod();
paymentMethod.setActualInstance(upiPaymentMethod);
payOrderRequest.setPaymentMethod(paymentMethod);
```

#### EMI
```java
PayOrderRequest payOrderRequest = new PayOrderRequest();
payOrderRequest.setPaymentSessionId("session_CLLC8TuxmB48U8pYJy4z8Ktk9Eh6IMnJzAScehfhKRarvab9KCl09YNxLsDjfeU104u4bqcKgk3ckbIsGsAWHBjvlv0XhRlJEzx4E5cLUHRC");
CardEMI cardEMI = new CardEMI();
cardEMI.setChannel("link");
cardEMI.setCardNumber("4748461111111111");
cardEMI.setCardExpiryMm("12");
cardEMI.setCardExpiryYy("24");
cardEMI.setCardCvv("123");
cardEMI.setCardBankName("ICICI");
cardEMI.setEmiTenure(3);
CardEMIPaymentMethod cardEMIPaymentMethod = new CardEMIPaymentMethod();
cardEMIPaymentMethod.emi(cardEMI);
PayOrderRequestPaymentMethod paymentMethod = new PaymentMethod();
paymentMethod.setActualInstance(cardEMIPaymentMethod);
payOrderRequest.setPaymentMethod(paymentMethod);
```

### Response
```json
{
  "payment_method": "card",
  "channel": "link",
  "action": "link",
  "cf_payment_id": 91235,
  "payment_amount": 22.42,
  "data": {
    "url": "https://sandbox.cashfree.com/pg/view/gateway/FHsuvhayLM5mmhINoqri7ba296e2ebca8b98e6119f6223021a13",
    "payload": {
      "name": "card"
    },
    "content_type": "application/x-www-form-urlencoded",
    "method": "post"
  }
}
```

## PGAuthorizeOrder

> PGAuthorizeOrder(x_api_version: string, order_id: string, AuthorizeOrderRequest: AuthorizeOrderRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<PaymentEntity, any>>

Preauthorization ([Docs](https://docs.cashfree.com/reference/pgauthorizeorder))

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;
import com.cashfree.model.AuthorizeOrderRequest;

public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String orderId = "your-order-id"; // String | The id which uniquely identifies your order
        AuthorizeOrderRequest authorizeOrderRequest = new AuthorizeOrderRequest();
        authorizeOrderRequest.setAction("CAPTURE");
        authorizeOrderRequest.setAmount(1);// AuthorizeOrderRequest | Request to Capture or Void Transactions
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            PaymentEntity result = cashfree.PGAuthorizeOrder(xApiVersion, orderId, authorizeOrderRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#PGAuthorizeOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **orderId** | **String**| The id which uniquely identifies your order | |
| **authorizeOrderRequest** | [**AuthorizeOrderRequest**](AuthorizeOrderRequest.md)| Request to Capture or Void Transactions | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
{
  "cf_payment_id": 12376123,
  "order_id": "order_8123",
  "entity": "payment",
  "payment_currency": "INR",
  "error_details": null,
  "order_amount": 10.01,
  "is_captured": true,
  "payment_group": "upi",
  "authorization": {
    "action": "CAPTURE",
    "status": "PENDING",
    "captured_amount": 100,
    "start_time": "2022-02-09T18:04:34+05:30",
    "end_time": "2022-02-19T18:04:34+05:30",
    "approve_by": "2022-02-09T18:04:34+05:30",
    "action_reference": "6595231908096894505959",
    "action_time": "2022-08-03T16:09:51"
  },
  "payment_method": {
    "upi": {
      "channel": "collect",
      "upi_id": "rohit@xcxcx"
    }
  },
  "payment_amount": 10.01,
  "payment_time": "2021-07-23T12:15:06+05:30",
  "payment_completion_time": "2021-07-23T12:18:59+05:30",
  "payment_status": "SUCCESS",
  "payment_message": "Transaction successful",
  "bank_reference": "P78112898712",
  "auth_id": "A898101"
}
```


## PGOrderAuthenticatePayment

> PGOrderAuthenticatePayment(x_api_version: string, cf_payment_id: string, OrderAuthenticatePaymentRequest: OrderAuthenticatePaymentRequest, x_request_id?: string, x_idempotency_key?: string, options?: AxiosRequestConfig): Promise<import("axios").AxiosResponse<OrderAuthenticateEntity, any>>

Submit or Resend OTP ([Docs](https://docs.cashfree.com/reference/pgorderauthenticatepayment))

### Example

```java
// Import classes:
import com.cashfree.*;
import com.cashfree.models.*;
import com.cashfree.model.OrderAuthenticatePaymentRequest

public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2023-08-01"; // String | API version to be used. Format is in YYYY-MM-DD
        String cfPaymentId = "121224562"; // String | The Cashfree payment or transaction ID.
        OrderAuthenticatePaymentRequest orderAuthenticatePaymentRequest = new OrderAuthenticatePaymentRequest();
        orderAuthenticatePaymentRequest.setAction("SUBMIT_OTP");
        orderAuthenticatePaymentRequest.setOtp("111000");// OrderAuthenticatePaymentRequest | Request body to submit/resend headless OTP. To use this API make sure you have headless OTP enabled for your account
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            OrderAuthenticateEntity result = cashfree.PGOrderAuthenticatePayment(xApiVersion, cfPaymentId, orderAuthenticatePaymentRequest, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#PGOrderAuthenticatePayment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2023-08-01] |
| **cfPaymentId** | **String**| The Cashfree payment or transaction ID. | |
| **orderAuthenticatePaymentRequest** | [**OrderAuthenticatePaymentRequest**](OrderAuthenticatePaymentRequest.md)| Request body to submit/resend headless OTP. To use this API make sure you have headless OTP enabled for your account | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Response
```json
{
  "cf_payment_id": 975654863,
  "authenticate_status": "FAILED",
  "action": "SUBMIT_OTP",
  "payment_message": "otp is invalid"
}
```

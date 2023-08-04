# cashfree-pg-sdk-java

New Payment Gateway APIs
- API version: 2.1.5


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cashfree.pg.java</groupId>
  <artifactId>api</artifactId>
  <version>2.1.5</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:
# Creating a CFConfig

The CFConfig consists of properties such as Client-ID, Client-Secret-Key, Api-Version, Environment. An instance of CFConfig is required for all the method calls that are exposed by the SDK. The following is the code snippet to create a CFConfig instance. Client-Id and Client-Secret are to be passed as strings.:-

```
CFConfig config =
            CFConfig.builder()
                    .ClientId(client-id)
                    .ClientSecret(client-secret)
                    .ApiVersion("2022-09-01")
                    .Environment(CFConfig.CFEnvironment.SANDBOX)
                    .build();
```
---
## Creating a CFHeader

The CFHeader consists of properties such as Request-Id, Idempotency-Key that are sent in the headers as part of every request. The following code snippet can be used to create a CFHeader instance. Request_Id and Idempotency-Key are to be passed as strings.:-
Note: This is an optional type, where in the Request-Id can help for better logging.
```
    CFHeaders headers = CFHeaders.builder().RequestID(request-id-as-string).IdempotencyKey(idempotency-key-as-string).build();
```
---
## Creating an Order with Cashfree

To process any payment on Cashfree PG, the merchant needs to create an order in the cashfree system. An order can be created using a similar code to the following code snippet. Some more parameters can be set depending on use case.:-

```
CFCustomerDetails customerDetails =
            new CFCustomerDetails().customerId("some_random_id").customerPhone("9999999999");
CFOrderRequest createOrderRequest =
            new CFOrderRequest()
                    .orderAmount(12.0)
                    .orderCurrency("INR")
                    .customerDetails(customerDetails);
public static void main(String[] args) {
    CFPaymentGatewayService apiInstance = new CFPaymentGatewayService();
    try {
         ApiResponse<CFOrder> orderCreateResponse =
                apiInstance.createOrder(config, headers, createOrderRequest);
               System.out.println(orderCreateResponse);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
}
    
```
---

## Paying 
---
## Other APIs:

Use similar logic as create order to access other APIs. Use other functions from the CFPaymentGatewayService class to pay order, get order, create refund etc,.

---
## Documentation for Models

 - [CFApp](docs/CFApp.md)
 - [CFAppPayment](docs/CFAppPayment.md)
 - [CFAuthorizationInPaymentsEntity](docs/CFAuthorizationInPaymentsEntity.md)
 - [CFAuthorizationRequest](docs/CFAuthorizationRequest.md)
 - [CFCard](docs/CFCard.md)
 - [CFCardEMI](docs/CFCardEMI.md)
 - [CFCardPayment](docs/CFCardPayment.md)
 - [CFCardlessEMI](docs/CFCardlessEMI.md)
 - [CFCardlessEMIPayment](docs/CFCardlessEMIPayment.md)
 - [CFCryptogram](docs/CFCryptogram.md)
 - [CFCustomerDetails](docs/CFCustomerDetails.md)
 - [CFEMIPayment](docs/CFEMIPayment.md)
 - [CFError](docs/CFError.md)
 - [CFFetchAllSavedInstruments](docs/CFFetchAllSavedInstruments.md)
 - [CFLink](docs/CFLink.md)
 - [CFLinkCancelledResponse](docs/CFLinkCancelledResponse.md)
 - [CFLinkCustomerDetailsEntity](docs/CFLinkCustomerDetailsEntity.md)
 - [CFLinkMetaEntity](docs/CFLinkMetaEntity.md)
 - [CFLinkNotifyEntity](docs/CFLinkNotifyEntity.md)
 - [CFLinkOrders](docs/CFLinkOrders.md)
 - [CFLinkRequest](docs/CFLinkRequest.md)
 - [CFNetbanking](docs/CFNetbanking.md)
 - [CFNetbankingPayment](docs/CFNetbankingPayment.md)
 - [CFOrder](docs/CFOrder.md)
 - [CFOrderMeta](docs/CFOrderMeta.md)
 - [CFOrderPayData](docs/CFOrderPayData.md)
 - [CFOrderPayRequest](docs/CFOrderPayRequest.md)
 - [CFOrderPayResponse](docs/CFOrderPayResponse.md)
 - [CFOrderRequest](docs/CFOrderRequest.md)
 - [CFPaylater](docs/CFPaylater.md)
 - [CFPaylaterPayment](docs/CFPaylaterPayment.md)
 - [CFPaymentMethod](docs/CFPaymentMethod.md)
 - [CFPaymentURLObject](docs/CFPaymentURLObject.md)
 - [CFPaymentsEntity](docs/CFPaymentsEntity.md)
 - [CFPaymentsEntityApp](docs/CFPaymentsEntityApp.md)
 - [CFPaymentsEntityAppPayment](docs/CFPaymentsEntityAppPayment.md)
 - [CFPaymentsEntityCard](docs/CFPaymentsEntityCard.md)
 - [CFPaymentsEntityCardPayment](docs/CFPaymentsEntityCardPayment.md)
 - [CFPaymentsEntityCardlessEMI](docs/CFPaymentsEntityCardlessEMI.md)
 - [CFPaymentsEntityCardlessEMIPayment](docs/CFPaymentsEntityCardlessEMIPayment.md)
 - [CFPaymentsEntityMethod](docs/CFPaymentsEntityMethod.md)
 - [CFPaymentsEntityNetbankingPayment](docs/CFPaymentsEntityNetbankingPayment.md)
 - [CFPaymentsEntityPaylater](docs/CFPaymentsEntityPaylater.md)
 - [CFPaymentsEntityPaylaterPayment](docs/CFPaymentsEntityPaylaterPayment.md)
 - [CFPaymentsEntityUPI](docs/CFPaymentsEntityUPI.md)
 - [CFPaymentsEntityUPIPayment](docs/CFPaymentsEntityUPIPayment.md)
 - [CFRefund](docs/CFRefund.md)
 - [CFRefundRequest](docs/CFRefundRequest.md)
 - [CFRefundURLObject](docs/CFRefundURLObject.md)
 - [CFSavedInstrumentMeta](docs/CFSavedInstrumentMeta.md)
 - [CFSettlementURLObject](docs/CFSettlementURLObject.md)
 - [CFSettlementsEntity](docs/CFSettlementsEntity.md)
 - [CFUPI](docs/CFUPI.md)
 - [CFUPIAuthorizeDetails](docs/CFUPIAuthorizeDetails.md)
 - [CFUPIPayment](docs/CFUPIPayment.md)
 - [CFVendorSplit](docs/CFVendorSplit.md)
 - [LinkCancelledError](docs/LinkCancelledError.md)
 - [RefundSpeed](docs/RefundSpeed.md)

## Author

developers@cashfree.com


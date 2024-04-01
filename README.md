# Cashfree PG Java SDK
![GitHub](https://img.shields.io/github/license/cashfree/cashfree-pg-sdk-java) ![Discord](https://img.shields.io/discord/931125665669972018?label=discord) ![GitHub last commit (branch)](https://img.shields.io/github/last-commit/cashfree/cashfree-pg-sdk-java/main) ![GitHub release (with filter)](https://img.shields.io/github/v/release/cashfree/cashfree-pg-sdk-java?label=latest) ![GitHub forks](https://img.shields.io/github/forks/cashfree/cashfree-pg-sdk-java) [![Coverage Status](https://coveralls.io/repos/github/cashfree/cashfree-pg-sdk-java/badge.svg?branch=main)](https://coveralls.io/github/cashfree/cashfree-pg-sdk-java?branch=main)

The Cashfree PG Java SDK offers a convenient solution to access [Cashfree PG APIs](https://docs.cashfree.com/reference/pg-new-apis-endpoint) from a server-side Java  applications. 



## Documentation

Cashfree's PG API Documentation - https://docs.cashfree.com/reference/pg-new-apis-endpoint

Learn and understand payment gateway workflows at Cashfree Payments [here](https://docs.cashfree.com/docs/payment-gateway)

Try out our interactive guides at [Cashfree Dev Studio](https://www.cashfree.com/devstudio) !

## Getting Started

### Installation
* Gradle Project
```bash
implementation `com.cashfree.pg.java:cashfree_pg:4.1.2`
```
* Maven Project
```bash
<dependency>
  <groupId>com.cashfree.pg.java</groupId>
  <artifactId>cashfree_pg</artifactId>
  <version>4.1.2</version>
  <scope>compile</scope>
</dependency>
<dependency>
    <groupId>com.squareup.okhttp3</groupId>
    <artifactId>okhttp</artifactId>
    <version>4.10.0</version>
</dependency>
```
### Configuration

```java 
import com.cashfree.*;

Cashfree.XClientId = "<x-client-id>";
Cashfree.XClientSecret = "<x-client-secret>";
Cashfree.XEnvironment = Cashfree.SANDBOX;

Cashfree cashfree = new Cashfree();
String xApiVersion = "2022-09-01";
```

Generate your API keys (x-client-id , x-client-secret) from [Cashfree Merchant Dashboard](https://merchant.cashfree.com/merchants/login)

### Basic Usage
Create Order
```java
CustomerDetails customerDetails = new CustomerDetails();
customerDetails.setCustomerId("walterwNrcMi");
customerDetails.setCustomerPhone("9999999999");

CreateOrderRequest request = new CreateOrderRequest();
request.setOrderAmount(1.0);
request.setOrderCurrency("INR");
request.setCustomerDetails(customerDetails);
try {
    ApiResponse<OrderEntity> response = cashfree.PGCreateOrder(xApiVersion, request, null, null, null);
    System.out.println(response.getData().getOrderId());
} catch (ApiException e) {
    throw new RuntimeException(e);
}
```

Get Order
```java
try {
    ApiResponse<OrderEntity> responseFetchOrder = cashfree.PGFetchOrder(xApiVersion, "<order_id>", null, null, null);
    System.out.println(response.getData().getOrderId());
} catch (ApiException e) {
    throw new RuntimeException(e);
}
```

## Licence

Apache Licensed. See [LICENSE.md](LICENSE.md) for more details

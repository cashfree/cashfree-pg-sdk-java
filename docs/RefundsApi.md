# RefundsApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createrefund**](RefundsApi.md#createrefund) | **POST** /orders/{order_id}/refunds | Create Refund |
| [**getRefund**](RefundsApi.md#getRefund) | **GET** /orders/{order_id}/refunds/{refund_id} | Get Refund |
| [**getallrefundsfororder**](RefundsApi.md#getallrefundsfororder) | **GET** /orders/{order_id}/refunds | Get All Refunds for an Order |


<a name="createrefund"></a>
# **createrefund**
> CFRefund createrefund(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId, cfRefundRequest)

Create Refund

Use this API to initiate refunds.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    RefundsApi apiInstance = new RefundsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    CFRefundRequest cfRefundRequest = new CFRefundRequest(); // CFRefundRequest | 
    try {
      CFRefund result = apiInstance.createrefund(xClientId, xClientSecret, orderId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId, cfRefundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundsApi#createrefund");
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
| **xClientId** | **String**|  | |
| **xClientSecret** | **String**|  | |
| **orderId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |
| **cfRefundRequest** | [**CFRefundRequest**](CFRefundRequest.md)|  | [optional] |

### Return type

[**CFRefund**](CFRefund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund created |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **0** | Any bad or invalid request will lead to following error object |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="getRefund"></a>
# **getRefund**
> CFRefund getRefund(xClientId, xClientSecret, orderId, refundId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Get Refund

Use this API to fetch a specific refund processed on your Cashfree Account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    RefundsApi apiInstance = new RefundsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    String refundId = "refundId_example"; // String | Refund Id of the refund you want to fetch.
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFRefund result = apiInstance.getRefund(xClientId, xClientSecret, orderId, refundId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundsApi#getRefund");
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
| **xClientId** | **String**|  | |
| **xClientSecret** | **String**|  | |
| **orderId** | **String**|  | |
| **refundId** | **String**| Refund Id of the refund you want to fetch. | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**CFRefund**](CFRefund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **0** | Any bad or invalid request will lead to following error object |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="getallrefundsfororder"></a>
# **getallrefundsfororder**
> List&lt;CFRefund&gt; getallrefundsfororder(xClientId, xClientSecret, orderId, xApiVersion)

Get All Refunds for an Order

Use this API to fetch all refunds processed against an order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    RefundsApi apiInstance = new RefundsApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String orderId = "orderId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    try {
      List<CFRefund> result = apiInstance.getallrefundsfororder(xClientId, xClientSecret, orderId, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RefundsApi#getallrefundsfororder");
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
| **xClientId** | **String**|  | |
| **xClientSecret** | **String**|  | |
| **orderId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |

### Return type

[**List&lt;CFRefund&gt;**](CFRefund.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **0** | Any bad or invalid request will lead to following error object |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |


# PaymentLinksApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelPaymentLink**](PaymentLinksApi.md#cancelPaymentLink) | **POST** /links/{link_id}/cancel | Cancel Payment Link |
| [**createPaymentLink**](PaymentLinksApi.md#createPaymentLink) | **POST** /links | Create Payment Link |
| [**getPaymentLinkDetails**](PaymentLinksApi.md#getPaymentLinkDetails) | **GET** /links/{link_id} | Fetch Payment Link Details |
| [**getPaymentLinkOrders**](PaymentLinksApi.md#getPaymentLinkOrders) | **GET** /links/{link_id}/orders | Get Orders for a Payment Link |


<a name="cancelPaymentLink"></a>
# **cancelPaymentLink**
> CFLinkCancelledResponse cancelPaymentLink(xClientId, xClientSecret, linkId, xApiVersion)

Cancel Payment Link

Use this API to cancel a payment link. No further payments can be done against a cancelled link. Only a link in ACTIVE status can be cancelled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentLinksApi apiInstance = new PaymentLinksApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String linkId = "linkId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    try {
      CFLinkCancelledResponse result = apiInstance.cancelPaymentLink(xClientId, xClientSecret, linkId, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#cancelPaymentLink");
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
| **linkId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |

### Return type

[**CFLinkCancelledResponse**](CFLinkCancelledResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment Link cancelled |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |
| **400** | Cannot cancel Payment Link if status is not ACTIVE |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="createPaymentLink"></a>
# **createPaymentLink**
> CFLink createPaymentLink(xClientId, xClientSecret, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId, cfLinkRequest)

Create Payment Link

Use this API to create a new payment link. The created payment link url will be available in the API response parameter link_url.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentLinksApi apiInstance = new PaymentLinksApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    CFLinkRequest cfLinkRequest = new CFLinkRequest(); // CFLinkRequest | 
    try {
      CFLink result = apiInstance.createPaymentLink(xClientId, xClientSecret, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId, cfLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#createPaymentLink");
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
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |
| **cfLinkRequest** | [**CFLinkRequest**](CFLinkRequest.md)|  | [optional] |

### Return type

[**CFLink**](CFLink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment Link created |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="getPaymentLinkDetails"></a>
# **getPaymentLinkDetails**
> CFLink getPaymentLinkDetails(xClientId, xClientSecret, linkId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Fetch Payment Link Details

Use this API to view all details and status of a payment link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentLinksApi apiInstance = new PaymentLinksApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String linkId = "linkId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFLink result = apiInstance.getPaymentLinkDetails(xClientId, xClientSecret, linkId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#getPaymentLinkDetails");
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
| **linkId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**CFLink**](CFLink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |

<a name="getPaymentLinkOrders"></a>
# **getPaymentLinkOrders**
> List&lt;CFLinkOrders&gt; getPaymentLinkOrders(xClientId, xClientSecret, linkId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Get Orders for a Payment Link

Use this API to view all order details for a payment link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentLinksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    PaymentLinksApi apiInstance = new PaymentLinksApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String linkId = "linkId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      List<CFLinkOrders> result = apiInstance.getPaymentLinkOrders(xClientId, xClientSecret, linkId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentLinksApi#getPaymentLinkOrders");
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
| **linkId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**List&lt;CFLinkOrders&gt;**](CFLinkOrders.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  |


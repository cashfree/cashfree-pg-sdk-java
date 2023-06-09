# TokenVaultApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSpecificSavedInstrument**](TokenVaultApi.md#deleteSpecificSavedInstrument) | **DELETE** /customers/{customer_id}/instruments/{instrument_id} | Delete Saved Instrument |
| [**fetchAllSavedInstruments**](TokenVaultApi.md#fetchAllSavedInstruments) | **GET** /customers/{customer_id}/instruments | Fetch All Saved Instruments |
| [**fetchCryptogram**](TokenVaultApi.md#fetchCryptogram) | **GET** /customers/{customer_id}/instruments/{instrument_id}/cryptogram | Fetch cryptogram for saved instrument |
| [**fetchSpecificSavedInstrument**](TokenVaultApi.md#fetchSpecificSavedInstrument) | **GET** /customers/{customer_id}/instruments/{instrument_id} | Fetch Single Saved Instrument |


<a name="deleteSpecificSavedInstrument"></a>
# **deleteSpecificSavedInstrument**
> CFFetchAllSavedInstruments deleteSpecificSavedInstrument(xClientId, xClientSecret, customerId, instrumentId, xApiVersion)

Delete Saved Instrument

To delete a saved instrument for a customer id and instrument id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokenVaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    TokenVaultApi apiInstance = new TokenVaultApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String instrumentId = "instrumentId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    try {
      CFFetchAllSavedInstruments result = apiInstance.deleteSpecificSavedInstrument(xClientId, xClientSecret, customerId, instrumentId, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenVaultApi#deleteSpecificSavedInstrument");
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
| **customerId** | **String**|  | |
| **instrumentId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |

### Return type

[**CFFetchAllSavedInstruments**](CFFetchAllSavedInstruments.md)

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

<a name="fetchAllSavedInstruments"></a>
# **fetchAllSavedInstruments**
> List&lt;CFFetchAllSavedInstruments&gt; fetchAllSavedInstruments(xClientId, xClientSecret, customerId, instrumentType, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Fetch All Saved Instruments

To get all saved instruments for a customer id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokenVaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    TokenVaultApi apiInstance = new TokenVaultApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String instrumentType = "card"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      List<CFFetchAllSavedInstruments> result = apiInstance.fetchAllSavedInstruments(xClientId, xClientSecret, customerId, instrumentType, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenVaultApi#fetchAllSavedInstruments");
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
| **customerId** | **String**|  | |
| **instrumentType** | **String**|  | [enum: card] |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**List&lt;CFFetchAllSavedInstruments&gt;**](CFFetchAllSavedInstruments.md)

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

<a name="fetchCryptogram"></a>
# **fetchCryptogram**
> CFCryptogram fetchCryptogram(xClientId, xClientSecret, customerId, instrumentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Fetch cryptogram for saved instrument

To get the card network token, token expiry and cryptogram for a saved instrument using instrument id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokenVaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    TokenVaultApi apiInstance = new TokenVaultApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String instrumentId = "instrumentId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFCryptogram result = apiInstance.fetchCryptogram(xClientId, xClientSecret, customerId, instrumentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenVaultApi#fetchCryptogram");
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
| **customerId** | **String**|  | |
| **instrumentId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**CFCryptogram**](CFCryptogram.md)

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

<a name="fetchSpecificSavedInstrument"></a>
# **fetchSpecificSavedInstrument**
> CFFetchAllSavedInstruments fetchSpecificSavedInstrument(xClientId, xClientSecret, customerId, instrumentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId)

Fetch Single Saved Instrument

To get specific saved instrument for a customer id and instrument id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TokenVaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://sandbox.cashfree.com/pg");

    TokenVaultApi apiInstance = new TokenVaultApi(defaultClient);
    String xClientId = "xClientId_example"; // String | 
    String xClientSecret = "xClientSecret_example"; // String | 
    String customerId = "customerId_example"; // String | 
    String instrumentId = "instrumentId_example"; // String | 
    String xApiVersion = "2022-01-01"; // String | 
    Boolean xIdempotencyReplayed = false; // Boolean | 
    String xIdempotencyKey = "xIdempotencyKey_example"; // String | 
    String xRequestId = "xRequestId_example"; // String | 
    try {
      CFFetchAllSavedInstruments result = apiInstance.fetchSpecificSavedInstrument(xClientId, xClientSecret, customerId, instrumentId, xApiVersion, xIdempotencyReplayed, xIdempotencyKey, xRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenVaultApi#fetchSpecificSavedInstrument");
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
| **customerId** | **String**|  | |
| **instrumentId** | **String**|  | |
| **xApiVersion** | **String**|  | [optional] [default to 2022-01-01] |
| **xIdempotencyReplayed** | **Boolean**|  | [optional] [default to false] |
| **xIdempotencyKey** | **String**|  | [optional] |
| **xRequestId** | **String**|  | [optional] |

### Return type

[**CFFetchAllSavedInstruments**](CFFetchAllSavedInstruments.md)

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


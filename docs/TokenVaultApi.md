# TokenVaultApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**PGCustomerDeleteInstrument**](TokenVaultApi.md#PGCustomerDeleteInstrument) | **DELETE** /customers/{customer_id}/instruments/{instrument_id} | Delete Saved Card Instrument |
| [**PGCustomerFetchInstrument**](TokenVaultApi.md#PGCustomerFetchInstrument) | **GET** /customers/{customer_id}/instruments/{instrument_id} | Fetch Specific Saved Card Instrument |
| [**PGCustomerFetchInstruments**](TokenVaultApi.md#PGCustomerFetchInstruments) | **GET** /customers/{customer_id}/instruments?instrument_type&#x3D;card | Fetch All Saved Card Instrument |
| [**PGCustomerInstrumentsFetchCryptogram**](TokenVaultApi.md#PGCustomerInstrumentsFetchCryptogram) | **GET** /customers/{customer_id}/instruments/{instrument_id}/cryptogram | Fetch Cryptogram for a Saved Card Instrument |



## PGCustomerDeleteInstrument

> DeletedInstrumentEntity PGCustomerDeleteInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKey)

Delete Saved Card Instrument

Use this API to delete a specific saved card stored for the customer in Cashfree’s [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault).

### Example

```java
// Import classes:
import com.cashfree.pg.*;
import com.cashfree.pg.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2026-01-01"; // String | API version to be used. Format is in YYYY-MM-DD.
        String customerId = "your-customer-id"; // String | The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer.
        String instrumentId = "some-instrument-id"; // String | The instrument_id which needs to be deleted.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        try {
            DeletedInstrumentEntity result = cashfree.PGCustomerDeleteInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerDeleteInstrument");
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
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD. | [default to 2026-01-01] |
| **customerId** | **String**| The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer. | |
| **instrumentId** | **String**| The instrument_id which needs to be deleted. | |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |

### Return type

[**DeletedInstrumentEntity**](DeletedInstrumentEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete saved card instrument object. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **502** | Bank related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## PGCustomerFetchInstrument

> InstrumentEntity PGCustomerFetchInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKey)

Fetch Specific Saved Card Instrument

Use this API to fetch a specific saved card stored for the customer in Cashfree’s [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault).

### Example

```java
// Import classes:
import com.cashfree.pg.*;
import com.cashfree.pg.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2026-01-01"; // String | API version to be used. Format is in YYYY-MM-DD.
        String customerId = "your-customer-id"; // String | The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer.
        String instrumentId = "some-instrument-id"; // String | The instrument_id of the saved instrument which needs to be queried.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        try {
            InstrumentEntity result = cashfree.PGCustomerFetchInstrument(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerFetchInstrument");
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
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD. | [default to 2026-01-01] |
| **customerId** | **String**| The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer. | |
| **instrumentId** | **String**| The instrument_id of the saved instrument which needs to be queried. | |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |

### Return type

[**InstrumentEntity**](InstrumentEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Saved card instrument object. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **502** | Bank related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## PGCustomerFetchInstruments

> List&lt;InstrumentEntityForAllSavedCard&gt; PGCustomerFetchInstruments(xApiVersion, customerId, instrumentType, xRequestId, xIdempotencyKey)

Fetch All Saved Card Instrument

Use this API to fetch all saved cards stored for the customer in Cashfree’s [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault).

### Example

```java
// Import classes:
import com.cashfree.pg.*;
import com.cashfree.pg.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2026-01-01"; // String | API version to be used. Format is in YYYY-MM-DD.
        String customerId = "your-customer-id"; // String | The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer.
        String instrumentType = "card"; // String | Payment mode or type of saved instrument.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        try {
            List<InstrumentEntityForAllSavedCard> result = cashfree.PGCustomerFetchInstruments(xApiVersion, customerId, instrumentType, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerFetchInstruments");
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
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD. | [default to 2026-01-01] |
| **customerId** | **String**| The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer. | |
| **instrumentType** | **String**| Payment mode or type of saved instrument. | [enum: card] |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |

### Return type

[**List&lt;InstrumentEntityForAllSavedCard&gt;**](InstrumentEntityForAllSavedCard.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contains list of all saved cards for the customer. Merchants are advised to filter out saved cards basis token expiry sent in API response, to only show active saved cards/tokens on their checkout. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


## PGCustomerInstrumentsFetchCryptogram

> CryptogramEntity PGCustomerInstrumentsFetchCryptogram(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKey)

Fetch Cryptogram for a Saved Card Instrument

Use this API to retrieve the token and cryptogram for a specific saved card stored in Cashfree&#39;s [Token Vault](https://www.cashfree.com/docs/payments/features/token-vault). 

### Example

```java
// Import classes:
import com.cashfree.pg.*;
import com.cashfree.pg.models.*;


public class Example {
    public static void main(String[] args) {
        
        Cashfree.XClientId = "TEST32461bf279b7ab306cdae3b423";
        Cashfree.XClientSecret = "TEST4a3236fe94e6b1e0e60b875639e2008695b977b2";
        Cashfree.XEnvironment = Cashfree.SANDBOX;

        Cashfree cashfree = new Cashfree();

        String xApiVersion = "2026-01-01"; // String | API version to be used. Format is in YYYY-MM-DD.
        String customerId = "your-customer-id"; // String | The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer.
        String instrumentId = "some-instrument-id"; // String | Identifier for the specific card to fetch its details.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        try {
            CryptogramEntity result = cashfree.PGCustomerInstrumentsFetchCryptogram(xApiVersion, customerId, instrumentId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TokenVaultApi#PGCustomerInstrumentsFetchCryptogram");
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
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD. | [default to 2026-01-01] |
| **customerId** | **String**| The customer ID provided by the merchant during the [Create Order API](https://www.cashfree.com/docs/api-reference/payments/latest/orders/create) call, used to save cards for the customer. | |
| **instrumentId** | **String**| Identifier for the specific card to fetch its details. | |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |

### Return type

[**CryptogramEntity**](CryptogramEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cryptogram object for a saved card. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **400** | Bad request error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **404** | Resource Not found. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **409** | Resource already present. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **422** | Idempotency error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **429** | Rate Limit Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **502** | Bank related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


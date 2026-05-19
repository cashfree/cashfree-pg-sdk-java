# DowntimeApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**FetchActiveEcosystemDowntimes**](DowntimeApi.md#FetchActiveEcosystemDowntimes) | **GET** /incident | Fetch All Downtimes |



## FetchActiveEcosystemDowntimes

> FetchActiveEcosystemDowntimes200Response FetchActiveEcosystemDowntimes(xApiVersion, xRequestId, xIdempotencyKey, incidentId, incidentStatus, incidentImpact, incidentType, incidentStartTime, incidentEndTime, paymentMethod)

Fetch All Downtimes

Fetches active downtimes across various payment methods based on filters. Gives all active downtimes when no filters are applied.

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
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        String incidentId = "your-incident-id"; // String | Valid incident id for fetching incident details.
        List<String> incidentStatus = Arrays.asList(); // List<String> | Filter incidents by status. Possible values: ACTIVE, UPCOMING, RESOLVED.
        List<String> incidentImpact = Arrays.asList(); // List<String> | Filter incidents by impact level. Possible values: HIGH, MEDIUM, LOW.
        List<String> incidentType = Arrays.asList(); // List<String> | Filter incidents by type. Possible values: SCHEDULED, UNSCHEDULED.
        OffsetDateTime incidentStartTime = OffsetDateTime.parse("2024-06-01 14:00:00"); // OffsetDateTime | Filter incidents by start time. Format: YYYY-MM-DD HH:MM:SS.
        OffsetDateTime incidentEndTime = OffsetDateTime.parse("2024-06-02 14:00:00"); // OffsetDateTime | Filter incidents by end time. Format: YYYY-MM-DD HH:MM:SS.
        List<String> paymentMethod = Arrays.asList(); // List<String> | Filter incidents by payment method. Possible values: UPI, CARD, NET_BANKING, WALLET.
        try {
            FetchActiveEcosystemDowntimes200Response result = cashfree.FetchActiveEcosystemDowntimes(xApiVersion, xRequestId, xIdempotencyKey, incidentId, incidentStatus, incidentImpact, incidentType, incidentStartTime, incidentEndTime, paymentMethodOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DowntimeApi#FetchActiveEcosystemDowntimes");
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
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |
| **incidentId** | **String**| Valid incident id for fetching incident details. | [optional] |
| **incidentStatus** | [**List&lt;String&gt;**](String.md)| Filter incidents by status. Possible values: ACTIVE, UPCOMING, RESOLVED. | [optional] [enum: ACTIVE, UPCOMING, RESOLVED] |
| **incidentImpact** | [**List&lt;String&gt;**](String.md)| Filter incidents by impact level. Possible values: HIGH, MEDIUM, LOW. | [optional] [enum: HIGH, MEDIUM, LOW] |
| **incidentType** | [**List&lt;String&gt;**](String.md)| Filter incidents by type. Possible values: SCHEDULED, UNSCHEDULED. | [optional] [enum: SCHEDULED, UNSCHEDULED] |
| **incidentStartTime** | **OffsetDateTime**| Filter incidents by start time. Format: YYYY-MM-DD HH:MM:SS. | [optional] |
| **incidentEndTime** | **OffsetDateTime**| Filter incidents by end time. Format: YYYY-MM-DD HH:MM:SS. | [optional] |
| **paymentMethod** | [**List&lt;String&gt;**](String.md)| Filter incidents by payment method. Possible values: UPI, CARD, NET_BANKING, WALLET. | [optional] [enum: UPI, CARD, NET_BANKING, WALLET] |

### Return type

[**FetchActiveEcosystemDowntimes200Response**](FetchActiveEcosystemDowntimes200Response.md)

### Authorization

[XClientSecret](../README.md#XClientSecret), [XClientID](../README.md#XClientID)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success response for Fetch All Downtimes. |  * X-Api-Version -  <br>  |
| **401** | Authentication Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |
| **500** | API related Error. |  * x-api-version -  <br>  * x-ratelimit-limit -  <br>  * x-ratelimit-remaining -  <br>  * x-ratelimit-retry -  <br>  * x-ratelimit-type -  <br>  * x-request-id -  <br>  * x-idempotency-key -  <br>  * x-idempotency-replayed -  <br>  |


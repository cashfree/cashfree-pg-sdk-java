# ReconciliationApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**PGESReconVendor**](ReconciliationApi.md#PGESReconVendor) | **POST** /recon/vendor | Vendor Reconciliation API |



## PGESReconVendor

> VendorRecon200Response PGESReconVendor(xApiVersion, vendorReconRequest, xRequestId, xIdempotencyKey, contentType)

Vendor Reconciliation API

This API allows you to fetch vendor reconciliation details by using different filters. Use the appropriate filters based on your requirements. After you receive a VENDOR_SETTLEMENT_SUCCESS webhook confirmation, wait 15 minutes before you call this API endpoint.  - **View Split Order Details Using Settlement ID**: Retrieve details of split orders within a settlement by Settlement ID.  - **Vendor Recon for a Time Period**: Fetch reconciliation details for all vendors within a specific time interval.  - **Vendor Recon Using Vendor ID &amp; Time Interval**: Get reconciliation details for a specific vendor within a given time interval. 

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
        VendorReconRequest vendorReconRequest = new VendorReconRequest(); // VendorReconRequest | Vendor Recon Request body.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree.
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions. 
        String contentType = "application/json"; // String | application/json.
        try {
            VendorRecon200Response result = cashfree.PGESReconVendor(xApiVersion, vendorReconRequest, xRequestId, xIdempotencyKey, contentTypeOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReconciliationApi#PGESReconVendor");
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
| **vendorReconRequest** | [**VendorReconRequest**](VendorReconRequest.md)| Vendor Recon Request body. | |
| **xRequestId** | **String**| Request ID for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to Cashfree. | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  | [optional] |
| **contentType** | **String**| application/json. | [optional] |

### Return type

[**VendorRecon200Response**](VendorRecon200Response.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Terminal created. |  -  |
| **400** | Vendor Recon Failure Response. |  -  |


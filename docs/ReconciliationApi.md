# ReconciliationApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**PGESReconVendor**](ReconciliationApi.md#PGESReconVendor) | **POST** /recon/vendor | Vendor Reconciliation API |



## PGESReconVendor

> VendorRecon200Response PGESReconVendor(xApiVersion, vendorReconRequest, contentType)

Vendor Reconciliation API

This API allows users to fetch vendor reconciliation details using different filters. Use the appropriate filters based on your requirements. - **View Split Order Details Using Settlement ID**: Retrieve details of split orders within a settlement by Settlement ID. - **Vendor Recon for a Time Period**: Fetch reconciliation details for all vendors within a specific time interval. - **Vendor Recon Using Vendor ID &amp; Time Interval**: Get reconciliation details for a specific vendor within a given time interval. 

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

        String xApiVersion = "2025-01-01"; // String | API version to be used. Format is in YYYY-MM-DD
        VendorReconRequest vendorReconRequest = new VendorReconRequest(); // VendorReconRequest | Vendor Recon Request body.
        String contentType = "application/json"; // String | application/json
        try {
            VendorRecon200Response result = cashfree.PGESReconVendor(xApiVersion, vendorReconRequest, contentTypeOkHttpClient httpClient);
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
| **xApiVersion** | **String**| API version to be used. Format is in YYYY-MM-DD | [default to 2025-01-01] |
| **vendorReconRequest** | [**VendorReconRequest**](VendorReconRequest.md)| Vendor Recon Request body. | |
| **contentType** | **String**| application/json | [optional] |

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
| **200** | Terminal created |  -  |
| **400** | Vendor Recon Failure Response. |  -  |


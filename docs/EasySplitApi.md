# EasySplitApi

All URIs are relative to *https://sandbox.cashfree.com/pg*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**PGESCreateAdjustment**](EasySplitApi.md#PGESCreateAdjustment) | **POST** /easy-split/vendors/{vendor_id}/adjustment | Create Adjustment |
| [**PGESCreateOnDemandTransfer**](EasySplitApi.md#PGESCreateOnDemandTransfer) | **POST** /easy-split/vendors/{vendor_id}/transfer | Create On Demand Transfer |
| [**PGESCreateVendors**](EasySplitApi.md#PGESCreateVendors) | **POST** /easy-split/vendors | Create vendor |
| [**PGESDownloadVendorsDocs**](EasySplitApi.md#PGESDownloadVendorsDocs) | **GET** /easy-split/vendor-docs/{vendor_id}/download/{doc_type} | Download Vendor Documents |
| [**PGESFetchVendors**](EasySplitApi.md#PGESFetchVendors) | **GET** /easy-split/vendors/{vendor_id} | Get Vendor All Details |
| [**PGESGetVendorBalance**](EasySplitApi.md#PGESGetVendorBalance) | **GET** /easy-split/vendors/{vendor_id}/balances | Get On Demand Balance |
| [**PGESGetVendorBalanceTransferCharges**](EasySplitApi.md#PGESGetVendorBalanceTransferCharges) | **GET** /easy-split/amount/{amount}/charges | Get Vendor Balance Transfer Charges |
| [**PGESGetVendorsDocs**](EasySplitApi.md#PGESGetVendorsDocs) | **GET** /easy-split/vendor-docs/{vendor_id} | Get Vendor All Documents Status |
| [**PGESOrderRecon**](EasySplitApi.md#PGESOrderRecon) | **POST** /split/order/vendor/recon | Get Split and Settlement Details by OrderID v2.0 |
| [**PGESUpdateVendors**](EasySplitApi.md#PGESUpdateVendors) | **PATCH** /easy-split/vendors/{vendor_id} | Update vendor Details |
| [**PGESUploadVendorsDocs**](EasySplitApi.md#PGESUploadVendorsDocs) | **POST** /easy-split/vendor-docs/{vendor_id} | Upload Vendor Docs |
| [**PGOrderSplitAfterPayment**](EasySplitApi.md#PGOrderSplitAfterPayment) | **POST** /easy-split/orders/{order_id}/split | Split After Payment |
| [**PGOrderStaticSplit**](EasySplitApi.md#PGOrderStaticSplit) | **POST** /easy-split/static-split | Create Static Split Configuration |
| [**PGSplitOrderRecon**](EasySplitApi.md#PGSplitOrderRecon) | **GET** /easy-split/orders/{order_id} | Get Split and Settlement Details by OrderID |



## PGESCreateAdjustment

> VendorAdjustmentSuccessResponse PGESCreateAdjustment(xApiVersion, vendorId, xRequestId, xIdempotencyKey, vendorAdjustmentRequest)

Create Adjustment

The Create Adjustment API will create a adjustment request either from vendor to the merchant or from merchant to the vendor.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        VendorAdjustmentRequest vendorAdjustmentRequest = new VendorAdjustmentRequest(); // VendorAdjustmentRequest | Vendor Adjustment Request Body.
        try {
            VendorAdjustmentSuccessResponse result = cashfree.PGESCreateAdjustment(xApiVersion, vendorId, xRequestId, xIdempotencyKey, vendorAdjustmentRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESCreateAdjustment");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **vendorAdjustmentRequest** | [**VendorAdjustmentRequest**](VendorAdjustmentRequest.md)| Vendor Adjustment Request Body. | [optional] |

### Return type

[**VendorAdjustmentSuccessResponse**](VendorAdjustmentSuccessResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vendor Adjustment Success Response. |  -  |
| **400** | Adjust Vendor Balance Failure Response. |  -  |


## PGESCreateOnDemandTransfer

> AdjustVendorBalanceResponse PGESCreateOnDemandTransfer(xApiVersion, vendorId, xRequestId, xIdempotencyKey, adjustVendorBalanceRequest)

Create On Demand Transfer

The Create On Demand Transfer API will create a new on-demand request either from to the merchant or from to the vendor.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        AdjustVendorBalanceRequest adjustVendorBalanceRequest = new AdjustVendorBalanceRequest(); // AdjustVendorBalanceRequest | Adjust Vendor Balance Request Body.
        try {
            AdjustVendorBalanceResponse result = cashfree.PGESCreateOnDemandTransfer(xApiVersion, vendorId, xRequestId, xIdempotencyKey, adjustVendorBalanceRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESCreateOnDemandTransfer");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **adjustVendorBalanceRequest** | [**AdjustVendorBalanceRequest**](AdjustVendorBalanceRequest.md)| Adjust Vendor Balance Request Body. | [optional] |

### Return type

[**AdjustVendorBalanceResponse**](AdjustVendorBalanceResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Adjust Vendor Balance Success Response. |  -  |
| **400** | Adjust Vendor Balance Failure Response. |  -  |


## PGESCreateVendors

> CreateVendorResponse PGESCreateVendors(xApiVersion, xRequestId, xIdempotencyKey, createVendorRequest)

Create vendor

Use this API to create a new vendor to your EasySplit account along with the KYC details. Provide KYC details such as account_type, business_type, gst, cin, pan, passport number and so on.

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
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        CreateVendorRequest createVendorRequest = new CreateVendorRequest(); // CreateVendorRequest | Create Vendor Request Body.
        try {
            CreateVendorResponse result = cashfree.PGESCreateVendors(xApiVersion, xRequestId, xIdempotencyKey, createVendorRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESCreateVendors");
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
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **createVendorRequest** | [**CreateVendorRequest**](CreateVendorRequest.md)| Create Vendor Request Body. | [optional] |

### Return type

[**CreateVendorResponse**](CreateVendorResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Vendor Success Response. |  -  |
| **400** | Create Vendor Failure Response. |  -  |


## PGESDownloadVendorsDocs

> VendorDocumentDownloadResponse PGESDownloadVendorsDocs(xApiVersion, docType, vendorId, xRequestId, xIdempotencyKey)

Download Vendor Documents

Use this API to download the uploaded KYC documents of that particular vendor. Provide the document type. Click the link from the sample request to download the KYC document.

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
        String docType = "docType_example"; // String | Mention the document type that has to be downloaded. Only an uploaded document can be downloaded.
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            VendorDocumentDownloadResponse result = cashfree.PGESDownloadVendorsDocs(xApiVersion, docType, vendorId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESDownloadVendorsDocs");
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
| **docType** | **String**| Mention the document type that has to be downloaded. Only an uploaded document can be downloaded. | |
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**VendorDocumentDownloadResponse**](VendorDocumentDownloadResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download Vendor Docs Success Response. |  -  |


## PGESFetchVendors

> VendorEntity PGESFetchVendors(xApiVersion, vendorId, xRequestId, xIdempotencyKey)

Get Vendor All Details

Use this API to get the details of a specific vendor associated with your Easy Split account.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            VendorEntity result = cashfree.PGESFetchVendors(xApiVersion, vendorId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESFetchVendors");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**VendorEntity**](VendorEntity.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vendor Success Response. |  -  |
| **400** | Get Vendor Docs Failure Response. |  -  |


## PGESGetVendorBalance

> VendorBalance PGESGetVendorBalance(xApiVersion, vendorId, xRequestId, xIdempotencyKey)

Get On Demand Balance

This API fetches the available amount with the merchant, vendor, and the unsettled amount for the merchant as well as the vendor.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            VendorBalance result = cashfree.PGESGetVendorBalance(xApiVersion, vendorId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESGetVendorBalance");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**VendorBalance**](VendorBalance.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vendor Balance Success Response. |  -  |
| **400** | Get Vendor Docs Failure Response. |  -  |


## PGESGetVendorBalanceTransferCharges

> VendorBalanceTransferCharges PGESGetVendorBalanceTransferCharges(xApiVersion, amount, rateType, xRequestId, xIdempotencyKey)

Get Vendor Balance Transfer Charges

This API returns the applicable service charge and service tax for a vendor balance transfer, based on the provided amount and rate type.

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
        BigDecimal amount = new BigDecimal("1000"); // BigDecimal | Specify the amount for which you want to view the service charges and service taxes in the response.
        String rateType = "VENDOR_ON_DEMAND"; // String | Mention the type of rate for which you want to check the charges. Possible value: VENDOR_ON_DEMAND
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            VendorBalanceTransferCharges result = cashfree.PGESGetVendorBalanceTransferCharges(xApiVersion, amount, rateType, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESGetVendorBalanceTransferCharges");
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
| **amount** | **BigDecimal**| Specify the amount for which you want to view the service charges and service taxes in the response. | |
| **rateType** | **String**| Mention the type of rate for which you want to check the charges. Possible value: VENDOR_ON_DEMAND | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**VendorBalanceTransferCharges**](VendorBalanceTransferCharges.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vendor Balance Transfer Charges Response. |  -  |
| **400** | Get Vendor Balance Transfer Charges Failure Response. |  -  |


## PGESGetVendorsDocs

> VendorDocumentsResponse PGESGetVendorsDocs(xApiVersion, vendorId, xRequestId, xIdempotencyKey)

Get Vendor All Documents Status

Use this API to fetch the details of all the KYC details of a particular vendor.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            VendorDocumentsResponse result = cashfree.PGESGetVendorsDocs(xApiVersion, vendorId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESGetVendorsDocs");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |

### Return type

[**VendorDocumentsResponse**](VendorDocumentsResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Vendor Docs Success Response. |  -  |
| **400** | Get Vendor Docs Failure Response. |  -  |


## PGESOrderRecon

> ESOrderReconResponse PGESOrderRecon(xApiVersion, xRequestId, xIdempotencyKey, esOrderReconRequest)

Get Split and Settlement Details by OrderID v2.0

Use this API to get all the split details, settled and unsettled transactions details of each vendor who were part of a particular order by providing order Id or start date and end date.

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
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        ESOrderReconRequest esOrderReconRequest = new ESOrderReconRequest(); // ESOrderReconRequest | Get Split and Settlement Details by OrderID v2.0
        try {
            ESOrderReconResponse result = cashfree.PGESOrderRecon(xApiVersion, xRequestId, xIdempotencyKey, esOrderReconRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESOrderRecon");
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
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **esOrderReconRequest** | [**ESOrderReconRequest**](ESOrderReconRequest.md)| Get Split and Settlement Details by OrderID v2.0 | [optional] |

### Return type

[**ESOrderReconResponse**](ESOrderReconResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ES Order Recon Success Response. |  -  |
| **400** | ES Order Recon Failure Response. |  -  |
| **404** | ES Order Recon Failure Response. |  -  |
| **409** | ES Order Recon Failure Response. |  -  |


## PGESUpdateVendors

> UpdateVendorResponse PGESUpdateVendors(xApiVersion, vendorId, xRequestId, xIdempotencyKey, updateVendorRequest)

Update vendor Details

Use this API to edit the existing vendor details added to your EasySplit account. You can edit vendor details such as name, email, phone number, upi details, and any of the KYC details.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        UpdateVendorRequest updateVendorRequest = new UpdateVendorRequest(); // UpdateVendorRequest | Create Vendor Request Body.
        try {
            UpdateVendorResponse result = cashfree.PGESUpdateVendors(xApiVersion, vendorId, xRequestId, xIdempotencyKey, updateVendorRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESUpdateVendors");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **updateVendorRequest** | [**UpdateVendorRequest**](UpdateVendorRequest.md)| Create Vendor Request Body. | [optional] |

### Return type

[**UpdateVendorResponse**](UpdateVendorResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update Vendor Success Response. |  -  |
| **400** | Update Vendor Failure Response. |  -  |


## PGESUploadVendorsDocs

> UploadVendorDocumentsResponse PGESUploadVendorsDocs(xApiVersion, vendorId, xRequestId, xIdempotencyKey, docType, docValue, _file)

Upload Vendor Docs

Use this API to upload KYC documents of a specific vendor.

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
        String vendorId = "your-vendor-id"; // String | The id which uniquely identifies your vendor.
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        String docType = "docType_example"; // String | Mention the type of the document you are uploading. Possible values: UIDAI_FRONT, UIDAI_BACK, UIDAI_NUMBER, DL, DL_NUMBER, PASSPORT_FRONT, PASSPORT_BACK, PASSPORT_NUMBER, VOTER_ID, VOTER_ID_NUMBER, PAN, PAN_NUMBER, GST, GSTIN_NUMBER, CIN, CIN_NUMBER, NBFC_CERTIFICATE. If the doc type ends with a number you should add the doc value else upload the doc file.
        String docValue = "docValue_example"; // String | Enter the display name of the uploaded file.
        File _file = new File("/path/to/file"); // File | Select the document that should be uploaded or provide the path of that file. You cannot upload a file that is more than 2MB in size.
        try {
            UploadVendorDocumentsResponse result = cashfree.PGESUploadVendorsDocs(xApiVersion, vendorId, xRequestId, xIdempotencyKey, docType, docValue, _fileOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGESUploadVendorsDocs");
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
| **vendorId** | **String**| The id which uniquely identifies your vendor. | |
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **docType** | **String**| Mention the type of the document you are uploading. Possible values: UIDAI_FRONT, UIDAI_BACK, UIDAI_NUMBER, DL, DL_NUMBER, PASSPORT_FRONT, PASSPORT_BACK, PASSPORT_NUMBER, VOTER_ID, VOTER_ID_NUMBER, PAN, PAN_NUMBER, GST, GSTIN_NUMBER, CIN, CIN_NUMBER, NBFC_CERTIFICATE. If the doc type ends with a number you should add the doc value else upload the doc file. | [optional] |
| **docValue** | **String**| Enter the display name of the uploaded file. | [optional] |
| **_file** | **File**| Select the document that should be uploaded or provide the path of that file. You cannot upload a file that is more than 2MB in size. | [optional] |

### Return type

[**UploadVendorDocumentsResponse**](UploadVendorDocumentsResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upload Vendor Docs Success Response. |  -  |
| **400** | Upload Vendor Docs Failure Response. |  -  |


## PGOrderSplitAfterPayment

> SplitAfterPaymentResponse PGOrderSplitAfterPayment(xApiVersion, orderId, xRequestId, xIdempotencyKey, splitAfterPaymentRequest)

Split After Payment

Split After Payment API splits the payments to vendors after successful payment from the customers.

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
        String orderId = "your-order-id"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        SplitAfterPaymentRequest splitAfterPaymentRequest = new SplitAfterPaymentRequest(); // SplitAfterPaymentRequest | Request Body to Create Split for an order.
        try {
            SplitAfterPaymentResponse result = cashfree.PGOrderSplitAfterPayment(xApiVersion, orderId, xRequestId, xIdempotencyKey, splitAfterPaymentRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGOrderSplitAfterPayment");
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
| **splitAfterPaymentRequest** | [**SplitAfterPaymentRequest**](SplitAfterPaymentRequest.md)| Request Body to Create Split for an order. | [optional] |

### Return type

[**SplitAfterPaymentResponse**](SplitAfterPaymentResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Split After Payment Success Response. |  -  |
| **400** | Split After Payment Failure Response. |  -  |
| **404** | Split After Payment Failure Response. |  -  |
| **409** | Split After Payment Failure Response. |  -  |


## PGOrderStaticSplit

> StaticSplitResponse PGOrderStaticSplit(xApiVersion, xRequestId, xIdempotencyKey, staticSplitRequest)

Create Static Split Configuration

This API will create a static split scheme wherein you can define the split type and the vendor-wise split percentage.

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
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        StaticSplitRequest staticSplitRequest = new StaticSplitRequest(); // StaticSplitRequest | Static Split
        try {
            StaticSplitResponse result = cashfree.PGOrderStaticSplit(xApiVersion, xRequestId, xIdempotencyKey, staticSplitRequestOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGOrderStaticSplit");
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
| **xRequestId** | **String**| Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree | [optional] |
| **xIdempotencyKey** | **UUID**| An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.   | [optional] |
| **staticSplitRequest** | [**StaticSplitRequest**](StaticSplitRequest.md)| Static Split | [optional] |

### Return type

[**StaticSplitResponse**](StaticSplitResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Static Split Success Response. |  -  |
| **400** | Static Split Failure Response. |  -  |


## PGSplitOrderRecon

> SplitOrderReconSuccessResponse PGSplitOrderRecon(xApiVersion, orderId, xRequestId, xIdempotencyKey)

Get Split and Settlement Details by OrderID

Use this API to get all the split details, settled and unsettled transactions details of each vendor who were part of a particular order by providing order Id or start date and end date.

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
        String orderId = "your-order-id"; // String | The id which uniquely identifies your order
        String xRequestId = "4dfb9780-46fe-11ee-be56-0242ac120002"; // String | Request id for the API call. Can be used to resolve tech issues. Communicate this in your tech related queries to cashfree
        UUID xIdempotencyKey = UUID.fromString("47bf8872-46fe-11ee-be56-0242ac120002"); // UUID | An idempotency key is a unique identifier you include with your API call. If the request fails or times out, you can safely retry it using the same key to avoid duplicate actions.  
        try {
            SplitOrderReconSuccessResponse result = cashfree.PGSplitOrderRecon(xApiVersion, orderId, xRequestId, xIdempotencyKeyOkHttpClient httpClient);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EasySplitApi#PGSplitOrderRecon");
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

### Return type

[**SplitOrderReconSuccessResponse**](SplitOrderReconSuccessResponse.md)

### Authorization

[XPartnerAPIKey](../README.md#XPartnerAPIKey), [XClientSecret](../README.md#XClientSecret), [XPartnerMerchantID](../README.md#XPartnerMerchantID), [XClientID](../README.md#XClientID), [XClientSignatureHeader](../README.md#XClientSignatureHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Split and Settlement Details by OrderID |  -  |
| **404** | Split Order Recon Failure Response. |  -  |


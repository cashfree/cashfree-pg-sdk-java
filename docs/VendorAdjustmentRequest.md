

# VendorAdjustmentRequest

Vendor Adjustment Request Body

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vendorId** | **String** | The unique identifier of the vendor to whom the adjustment is applied |  |
|**adjustmentId** | **Long** | The unique identifier for the adjustment transaction. |  |
|**amount** | **BigDecimal** | The adjustment amount to be applied. |  |
|**type** | **String** | The type of adjustment. Possible values: CREDIT, DEBIT. |  |
|**remarks** | **String** | Remarks for the adjustment transaction, if any. |  [optional] |




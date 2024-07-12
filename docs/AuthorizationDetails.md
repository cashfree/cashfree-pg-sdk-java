

# AuthorizationDetails

Details of the authorization done for the subscription. Returned in Get subscription and auth payments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizationAmount** | **BigDecimal** | Authorization amount for the auth payment. |  [optional] |
|**authorizationAmountRefund** | **Boolean** | Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription. |  [optional] |
|**authorizationReference** | **String** | Authorization reference. UMN for UPI, UMRN for EMandate/Physical Mandate and Enrollment ID for cards. |  [optional] |
|**authorizationTime** | **String** | Authorization time. |  [optional] |
|**authorizationStatus** | **String** | Status of the authorization. |  [optional] |
|**paymentId** | **String** | A unique ID passed by merchant for identifying the transaction. |  [optional] |
|**paymentMethod** | **String** | Payment method used for the authorization. |  [optional] |




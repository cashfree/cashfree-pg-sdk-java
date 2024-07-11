

# CreateVendorRequest

Create Vendor Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vendorId** | **String** | Specify the unique Vendor ID to identify the beneficiary. Alphanumeric and underscore (_) allowed. |  |
|**status** | **String** | Specify the status of vendor that should be updated. Possible values: ACTIVE,BLOCKED, DELETED |  |
|**name** | **String** | Specify the name of the vendor to be updated. Name should not have any special character except . / - &amp; |  |
|**email** | **String** | Specify the vendor email ID that should be updated. String in email ID format (Ex:johndoe_1@cashfree.com) should contain @ and dot (.) |  |
|**phone** | **String** | Specify the beneficiaries phone number to be updated. Phone number registered in India (only digits, 8 - 12 characters after excluding +91). |  |
|**verifyAccount** | **Boolean** | Specify if the vendor bank account details should be verified. Possible values: true or false |  [optional] |
|**dashboardAccess** | **Boolean** | Update if the vendor will have dashboard access or not. Possible values are: true or false |  [optional] |
|**scheduleOption** | **BigDecimal** | Specify the settlement cycle to be updated. View the settlement cycle details from the \&quot;Settlement Cycles Supported\&quot; table.  If no schedule option is configured, the settlement cycle ID \&quot;1\&quot; will be in effect. Select \&quot;8\&quot; or \&quot;9\&quot; if you want to schedule instant vendor settlements. |  [optional] |
|**bank** | [**List&lt;BankDetails&gt;**](BankDetails.md) | Specify the vendor bank account details to be updated. |  [optional] |
|**upi** | [**List&lt;UpiDetails&gt;**](UpiDetails.md) | Updated beneficiary upi vpa. Alphanumeric, dot (.), hyphen (-), at sign (@), and underscore allowed (100 character limit). Note: underscore and dot (.) gets accepted before and after @, but hyphen (-) is only accepted before @ sign. |  [optional] |
|**kycDetails** | [**List&lt;KycDetails&gt;**](KycDetails.md) | Specify the kyc details that should be updated. |  |




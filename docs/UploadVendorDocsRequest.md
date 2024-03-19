

# UploadVendorDocsRequest

Update Vendor Request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**docType** | **String** | Mention the type of the document you are uploading. Possible values: UIDAI_FRONT, UIDAI_BACK, UIDAI_NUMBER, DL, DL_NUMBER, PASSPORT_FRONT, PASSPORT_BACK, PASSPORT_NUMBER, VOTER_ID, VOTER_ID_NUMBER, PAN, PAN_NUMBER, GST, GSTIN_NUMBER, CIN, CIN_NUMBER, NBFC_CERTIFICATE. If the doc type ends with a number you should add the doc value else upload the doc file. |  [optional] |
|**docValue** | **File** | Enter the display name of the uploaded file. |  [optional] |
|**_file** | **String** | Select the document that should be uploaded or provide the path of that file. You cannot upload a file that is more than 2MB in size. |  [optional] |




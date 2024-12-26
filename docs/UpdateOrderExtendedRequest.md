

# UpdateOrderExtendedRequest

Request Body to Update extended data related to order

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shipmentDetails** | [**List&lt;ShipmentDetails&gt;**](ShipmentDetails.md) | Shipment details, such as the tracking company, tracking number, and tracking URLs, associated with the shipping of an order. Either &#x60;shipment_details&#x60; or &#x60;order_delivery_status&#x60; is required. |  |
|**orderDeliveryStatus** | [**OrderDeliveryStatus**](OrderDeliveryStatus.md) |  |  [optional] |




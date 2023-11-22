

# CreateTerminalRequest

Request body to create a terminal

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**terminalId** | **String** | merchant’s internal terminal id |  |
|**terminalPhoneNo** | **String** | phone number assigned to the terminal |  |
|**terminalName** | **String** | terminal name to be assigned by merchants |  |
|**terminalAddress** | **String** | address of the terminal. required for STOREFRONT |  [optional] |
|**terminalEmail** | **String** | terminal email ID of the AGENT/STOREFRONT assigned by merchants. |  |
|**terminalNote** | **String** | additional note for terminal |  [optional] |
|**terminalType** | **String** | mention the terminal type. possible values - AGENT, STOREFRONT. |  |
|**terminalMeta** | [**CreateTerminalRequestTerminalMeta**](CreateTerminalRequestTerminalMeta.md) |  |  [optional] |




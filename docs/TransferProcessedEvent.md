

# TransferProcessedEvent

The webhook will be sent when a transfer is processed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | **WebhookEventType** |  |  |
|**transferId** | **String** |  |  |
|**paymentType** | **PaymentType** |  |  |
|**returnForId** | **String** | The original transaction ID that is returned when the payment type is ACH_RETURN, WIRE_RETURN and CHEQUE_RETURN. |  [optional] |
|**companyId** | **String** |  This is the &#x60;id&#x60; returned in the [Get Company](https://developer.brex.com/openapi/webhooks_api/) endpoint. You can use the &#x60;company_id&#x60; to determine which access token to use when you get the details from our API endpoints.  |  [optional] |




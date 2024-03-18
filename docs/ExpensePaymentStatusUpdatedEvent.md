

# ExpensePaymentStatusUpdatedEvent

The webhook will be sent when an expense payment changes status. Account must be on Brex Empower to receive these events. Subscription must be registered with a user with the CARD_ADMIN role.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | **WebhookEventType** |  |  |
|**expenseId** | **String** |  |  |
|**paymentStatus** | **ExpensePaymentStatus** |  |  |
|**paymentType** | **ExpensePaymentType** |  |  |
|**companyId** | **String** |  This is the &#x60;id&#x60; returned in the [Get Company](https://developer.brex.com/openapi/webhooks_api/) endpoint. You can use the &#x60;company_id&#x60; to determine which access token to use when you get the details from our API endpoints.  |  [optional] |
|**amount** | [**ExpensePaymentStatusUpdatedEventAmount**](ExpensePaymentStatusUpdatedEventAmount.md) |  |  [optional] |
|**paymentDescription** | **String** | The name of the card acceptor. |  [optional] |
|**cardId** | **String** | The ID of the card that is associated with the expense. |  [optional] |




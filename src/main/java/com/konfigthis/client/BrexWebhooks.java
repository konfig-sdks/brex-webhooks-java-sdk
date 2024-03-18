package com.konfigthis.client;

import com.konfigthis.client.api.WebhookSubscriptionsApi;

public class BrexWebhooks {
    private ApiClient apiClient;
    public final WebhookSubscriptionsApi webhookSubscriptions;

    public BrexWebhooks() {
        this(null);
    }

    public BrexWebhooks(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.webhookSubscriptions = new WebhookSubscriptionsApi(this.apiClient);
    }

}

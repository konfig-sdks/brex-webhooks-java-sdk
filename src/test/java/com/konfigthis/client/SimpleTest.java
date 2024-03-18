package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://platform.brexapis.com";
        // Configure OAuth2 client credentials for "application" OAuth flow
        String clientId = System.getenv("CLIENT_ID");
        String clientSecret = System.getenv("CLIENT_SECRET");
        configuration.clientId = "clientId";
        configuration.clientSecret = "clientSecret";
        
        
        // Configure OAuth2 access token for authorization: OAuth2
        configuration.accessToken = "YOUR ACCESS TOKEN";
        BrexWebhooks client = new BrexWebhooks(configuration);
        assertNotNull(client);
    }
}

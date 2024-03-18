<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


Brex uses webhooks to send real-time notifications when events happen in the accounts that you manage.
Use webhook subscriptions to subscribe to different webhook events.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Webhooks&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-webhooks-java-sdk</artifactId>
  <version>0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-webhooks-java-sdk:0.1"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-webhooks-java-sdk-0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexWebhooks;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookSubscriptionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
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
    String id = "id_example";
    try {
      WebhookSubscription result = client
              .webhookSubscriptions
              .getDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getEventTypes());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookSubscription> response = client
              .webhookSubscriptions
              .getDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookSubscriptionsApi#getDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*WebhookSubscriptionsApi* | [**getDetails**](docs/WebhookSubscriptionsApi.md#getDetails) | **GET** /v1/webhooks/{id} | Get Webhook
*WebhookSubscriptionsApi* | [**list**](docs/WebhookSubscriptionsApi.md#list) | **GET** /v1/webhooks | List Webhooks
*WebhookSubscriptionsApi* | [**listSecrets**](docs/WebhookSubscriptionsApi.md#listSecrets) | **GET** /v1/webhooks/secrets | List Webhook Secrets
*WebhookSubscriptionsApi* | [**registerEndpoint**](docs/WebhookSubscriptionsApi.md#registerEndpoint) | **POST** /v1/webhooks | Register Webhook
*WebhookSubscriptionsApi* | [**unregisterWebhook**](docs/WebhookSubscriptionsApi.md#unregisterWebhook) | **DELETE** /v1/webhooks/{id} | Unregister Webhook
*WebhookSubscriptionsApi* | [**updateWebhook**](docs/WebhookSubscriptionsApi.md#updateWebhook) | **PUT** /v1/webhooks/{id} | Update Webhook


## Documentation for Models

 - [ApplicationStatus](docs/ApplicationStatus.md)
 - [CreateWebhookSubscriptionRequest](docs/CreateWebhookSubscriptionRequest.md)
 - [ExpensePaymentStatus](docs/ExpensePaymentStatus.md)
 - [ExpensePaymentStatusUpdatedEvent](docs/ExpensePaymentStatusUpdatedEvent.md)
 - [ExpensePaymentStatusUpdatedEventAmount](docs/ExpensePaymentStatusUpdatedEventAmount.md)
 - [ExpensePaymentType](docs/ExpensePaymentType.md)
 - [Money](docs/Money.md)
 - [PageWebhookSubscription](docs/PageWebhookSubscription.md)
 - [PaymentType](docs/PaymentType.md)
 - [ProductApplication](docs/ProductApplication.md)
 - [ReferralActivatedEvent](docs/ReferralActivatedEvent.md)
 - [ReferralApplicationStatusChangedEvent](docs/ReferralApplicationStatusChangedEvent.md)
 - [ReferralCreatedEvent](docs/ReferralCreatedEvent.md)
 - [TransferFailedEvent](docs/TransferFailedEvent.md)
 - [TransferProcessedEvent](docs/TransferProcessedEvent.md)
 - [UpdateWebhookSubscriptionRequest](docs/UpdateWebhookSubscriptionRequest.md)
 - [UpdateWebhookSubscriptionStatus](docs/UpdateWebhookSubscriptionStatus.md)
 - [UserAttributes](docs/UserAttributes.md)
 - [UserUpdatedEvent](docs/UserUpdatedEvent.md)
 - [WebhookEventType](docs/WebhookEventType.md)
 - [WebhookSecret](docs/WebhookSecret.md)
 - [WebhookSecretStatus](docs/WebhookSecretStatus.md)
 - [WebhookSubscription](docs/WebhookSubscription.md)
 - [WebhookSubscriptionStatus](docs/WebhookSubscriptionStatus.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

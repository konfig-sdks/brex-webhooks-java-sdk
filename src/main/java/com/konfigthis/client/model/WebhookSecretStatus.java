/*
 * Webhooks API
 *  Brex uses webhooks to send real-time notifications when events happen in the accounts that you manage. Use webhook subscriptions to subscribe to different webhook events. 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets WebhookSecretStatus
 */
@JsonAdapter(WebhookSecretStatus.Adapter.class)public enum WebhookSecretStatus {
  
  ACTIVE("ACTIVE"),
  
  PENDING_REVOKE("PENDING_REVOKE");

  private String value;

  WebhookSecretStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookSecretStatus fromValue(String value) {
    for (WebhookSecretStatus b : WebhookSecretStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookSecretStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookSecretStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookSecretStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookSecretStatus.fromValue(value);
    }
  }
}


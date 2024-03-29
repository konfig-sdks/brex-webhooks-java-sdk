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
 * Gets or Sets WebhookEventType
 */
@JsonAdapter(WebhookEventType.Adapter.class)public enum WebhookEventType {
  
  REFERRAL_CREATED("REFERRAL_CREATED"),
  
  REFERRAL_ACTIVATED("REFERRAL_ACTIVATED"),
  
  REFERRAL_APPLICATION_STATUS_CHANGED("REFERRAL_APPLICATION_STATUS_CHANGED"),
  
  TRANSFER_PROCESSED("TRANSFER_PROCESSED"),
  
  TRANSFER_FAILED("TRANSFER_FAILED"),
  
  EXPENSE_PAYMENT_UPDATED("EXPENSE_PAYMENT_UPDATED"),
  
  USER_UPDATED("USER_UPDATED");

  private String value;

  WebhookEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookEventType fromValue(String value) {
    for (WebhookEventType b : WebhookEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookEventType.fromValue(value);
    }
  }
}


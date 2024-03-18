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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * &#x60;PENDING&#x60;:The transaction is yet to be captured. It may be approved, yet to be approved, or yet to be declined.  &#x60;DECLINED&#x60;: The transaction was declined. 
 */
@JsonAdapter(ExpensePaymentStatus.Adapter.class)public enum ExpensePaymentStatus {
  
  PENDING("PENDING"),
  
  DECLINED("DECLINED");

  private String value;

  ExpensePaymentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExpensePaymentStatus fromValue(String value) {
    for (ExpensePaymentStatus b : ExpensePaymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExpensePaymentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExpensePaymentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExpensePaymentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExpensePaymentStatus.fromValue(value);
    }
  }
}

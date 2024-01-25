/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2023-08-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Offer Type Object
 */
@JsonAdapter(OfferType.Adapter.class)
public enum OfferType {
  
  DISCOUNT("DISCOUNT"),
  
  CASHBACK("CASHBACK"),
  
  DISCOUNT_AND_CASHBACK("DISCOUNT_AND_CASHBACK"),
  
  NO_COST_EMI("NO_COST_EMI"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  OfferType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferType fromValue(String value) {
    for (OfferType b : OfferType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  public static class Adapter extends TypeAdapter<OfferType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OfferType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OfferType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OfferType.fromValue(value);
    }
  }
}


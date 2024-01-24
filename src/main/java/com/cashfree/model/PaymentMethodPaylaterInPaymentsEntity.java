/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import com.cashfree.model.PaymentMethodAppInPaymentsEntityApp;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cashfree.JSON;

/**
 * paylater payment method object for pay api
 */
@Schema(description = "paylater payment method object for pay api")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-24T11:43:43.900337Z[Etc/UTC]")
public class PaymentMethodPaylaterInPaymentsEntity {
  public static final String SERIALIZED_NAME_PAYLATER = "paylater";
  @SerializedName(SERIALIZED_NAME_PAYLATER)
  private PaymentMethodAppInPaymentsEntityApp paylater;

  public PaymentMethodPaylaterInPaymentsEntity() {
  }

  public PaymentMethodPaylaterInPaymentsEntity paylater(PaymentMethodAppInPaymentsEntityApp paylater) {
    
    this.paylater = paylater;
    return this;
  }

   /**
   * Get paylater
   * @return paylater
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentMethodAppInPaymentsEntityApp getPaylater() {
    return paylater;
  }


  public void setPaylater(PaymentMethodAppInPaymentsEntityApp paylater) {
    this.paylater = paylater;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodPaylaterInPaymentsEntity paymentMethodPaylaterInPaymentsEntity = (PaymentMethodPaylaterInPaymentsEntity) o;
    return Objects.equals(this.paylater, paymentMethodPaylaterInPaymentsEntity.paylater);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paylater);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodPaylaterInPaymentsEntity {\n");
    sb.append("    paylater: ").append(toIndentedString(paylater)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("paylater");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodPaylaterInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `paylater`
      if (jsonObj.get("paylater") != null && !jsonObj.get("paylater").isJsonNull()) {
        PaymentMethodAppInPaymentsEntityApp.validateJsonElement(jsonObj.get("paylater"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodPaylaterInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodPaylaterInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodPaylaterInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodPaylaterInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodPaylaterInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentMethodPaylaterInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodPaylaterInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodPaylaterInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodPaylaterInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodPaylaterInPaymentsEntity
  */
  public static PaymentMethodPaylaterInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodPaylaterInPaymentsEntity.class);
  }

 /**
  * Convert an instance of PaymentMethodPaylaterInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2025-01-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.pg.model;

import java.util.Objects;
import com.cashfree.pg.model.PaymentMethodNetBankingInPaymentsEntityNetbanking;
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

import com.cashfree.pg.JSON;

/**
 * netbanking payment method object for pay
 */
@Schema(description = "netbanking payment method object for pay")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class PaymentMethodNetBankingInPaymentsEntity {
  public static final String SERIALIZED_NAME_NETBANKING = "netbanking";
  @SerializedName(SERIALIZED_NAME_NETBANKING)
  private PaymentMethodNetBankingInPaymentsEntityNetbanking netbanking;

  public PaymentMethodNetBankingInPaymentsEntity() {
  }

  public PaymentMethodNetBankingInPaymentsEntity netbanking(PaymentMethodNetBankingInPaymentsEntityNetbanking netbanking) {
    
    this.netbanking = netbanking;
    return this;
  }

   /**
   * Get netbanking
   * @return netbanking
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentMethodNetBankingInPaymentsEntityNetbanking getNetbanking() {
    return netbanking;
  }


  public void setNetbanking(PaymentMethodNetBankingInPaymentsEntityNetbanking netbanking) {
    this.netbanking = netbanking;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodNetBankingInPaymentsEntity paymentMethodNetBankingInPaymentsEntity = (PaymentMethodNetBankingInPaymentsEntity) o;
    return Objects.equals(this.netbanking, paymentMethodNetBankingInPaymentsEntity.netbanking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netbanking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodNetBankingInPaymentsEntity {\n");
    sb.append("    netbanking: ").append(toIndentedString(netbanking)).append("\n");
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
    openapiFields.add("netbanking");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodNetBankingInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `netbanking`
      if (jsonObj.get("netbanking") != null && !jsonObj.get("netbanking").isJsonNull()) {
        PaymentMethodNetBankingInPaymentsEntityNetbanking.validateJsonElement(jsonObj.get("netbanking"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodNetBankingInPaymentsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `netbanking`
      if (jsonObj.get("netbanking") != null && !jsonObj.get("netbanking").isJsonNull()) {
        PaymentMethodNetBankingInPaymentsEntityNetbanking.validateJsonElement(jsonObj.get("netbanking"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodNetBankingInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodNetBankingInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodNetBankingInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodNetBankingInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodNetBankingInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentMethodNetBankingInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodNetBankingInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodNetBankingInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodNetBankingInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodNetBankingInPaymentsEntity
  */
  public static PaymentMethodNetBankingInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodNetBankingInPaymentsEntity.class);
  }

 /**
  * Convert an instance of PaymentMethodNetBankingInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


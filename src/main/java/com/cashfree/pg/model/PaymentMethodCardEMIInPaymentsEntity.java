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
import com.cashfree.pg.model.PaymentMethodCardEMIInPaymentsEntityEmi;
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
 * payment method card emi object in payment entity
 */
@Schema(description = "payment method card emi object in payment entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:56:44.464357Z[Etc/UTC]")
public class PaymentMethodCardEMIInPaymentsEntity {
  public static final String SERIALIZED_NAME_EMI = "emi";
  @SerializedName(SERIALIZED_NAME_EMI)
  private PaymentMethodCardEMIInPaymentsEntityEmi emi;

  public PaymentMethodCardEMIInPaymentsEntity() {
  }

  public PaymentMethodCardEMIInPaymentsEntity emi(PaymentMethodCardEMIInPaymentsEntityEmi emi) {
    
    this.emi = emi;
    return this;
  }

   /**
   * Get emi
   * @return emi
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentMethodCardEMIInPaymentsEntityEmi getEmi() {
    return emi;
  }


  public void setEmi(PaymentMethodCardEMIInPaymentsEntityEmi emi) {
    this.emi = emi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardEMIInPaymentsEntity paymentMethodCardEMIInPaymentsEntity = (PaymentMethodCardEMIInPaymentsEntity) o;
    return Objects.equals(this.emi, paymentMethodCardEMIInPaymentsEntity.emi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardEMIInPaymentsEntity {\n");
    sb.append("    emi: ").append(toIndentedString(emi)).append("\n");
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
    openapiFields.add("emi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardEMIInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `emi`
      if (jsonObj.get("emi") != null && !jsonObj.get("emi").isJsonNull()) {
        PaymentMethodCardEMIInPaymentsEntityEmi.validateJsonElement(jsonObj.get("emi"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardEMIInPaymentsEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `emi`
      if (jsonObj.get("emi") != null && !jsonObj.get("emi").isJsonNull()) {
        PaymentMethodCardEMIInPaymentsEntityEmi.validateJsonElement(jsonObj.get("emi"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodCardEMIInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodCardEMIInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodCardEMIInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardEMIInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodCardEMIInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentMethodCardEMIInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodCardEMIInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodCardEMIInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodCardEMIInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodCardEMIInPaymentsEntity
  */
  public static PaymentMethodCardEMIInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodCardEMIInPaymentsEntity.class);
  }

 /**
  * Convert an instance of PaymentMethodCardEMIInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


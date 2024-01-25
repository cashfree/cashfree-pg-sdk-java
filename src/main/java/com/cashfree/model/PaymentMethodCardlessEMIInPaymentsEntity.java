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
 * payment method carless object in payment entity
 */
@Schema(description = "payment method carless object in payment entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-25T09:32:39.940911Z[Etc/UTC]")
public class PaymentMethodCardlessEMIInPaymentsEntity {
  public static final String SERIALIZED_NAME_CARDLESS_EMI = "cardless_emi";
  @SerializedName(SERIALIZED_NAME_CARDLESS_EMI)
  private PaymentMethodAppInPaymentsEntityApp cardlessEmi;

  public PaymentMethodCardlessEMIInPaymentsEntity() {
  }

  public PaymentMethodCardlessEMIInPaymentsEntity cardlessEmi(PaymentMethodAppInPaymentsEntityApp cardlessEmi) {
    
    this.cardlessEmi = cardlessEmi;
    return this;
  }

   /**
   * Get cardlessEmi
   * @return cardlessEmi
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentMethodAppInPaymentsEntityApp getCardlessEmi() {
    return cardlessEmi;
  }


  public void setCardlessEmi(PaymentMethodAppInPaymentsEntityApp cardlessEmi) {
    this.cardlessEmi = cardlessEmi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardlessEMIInPaymentsEntity paymentMethodCardlessEMIInPaymentsEntity = (PaymentMethodCardlessEMIInPaymentsEntity) o;
    return Objects.equals(this.cardlessEmi, paymentMethodCardlessEMIInPaymentsEntity.cardlessEmi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardlessEmi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardlessEMIInPaymentsEntity {\n");
    sb.append("    cardlessEmi: ").append(toIndentedString(cardlessEmi)).append("\n");
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
    openapiFields.add("cardless_emi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardlessEMIInPaymentsEntity
  */
  public static boolean validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cardless_emi`
      if (jsonObj.get("cardless_emi") != null && !jsonObj.get("cardless_emi").isJsonNull()) {
        PaymentMethodAppInPaymentsEntityApp.validateJsonElement(jsonObj.get("cardless_emi"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodCardlessEMIInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodCardlessEMIInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodCardlessEMIInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardlessEMIInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodCardlessEMIInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentMethodCardlessEMIInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodCardlessEMIInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodCardlessEMIInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodCardlessEMIInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodCardlessEMIInPaymentsEntity
  */
  public static PaymentMethodCardlessEMIInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodCardlessEMIInPaymentsEntity.class);
  }

 /**
  * Convert an instance of PaymentMethodCardlessEMIInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


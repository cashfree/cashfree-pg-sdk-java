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
 * Entity Simulation it contains payment_status and payment_error_code
 */
@Schema(description = "Entity Simulation it contains payment_status and payment_error_code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:49:56.545492Z[Etc/UTC]")
public class EntitySimulationResponse {
  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private String paymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_ERROR_CODE = "payment_error_code";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ERROR_CODE)
  private String paymentErrorCode;

  public EntitySimulationResponse() {
  }

  public EntitySimulationResponse paymentStatus(String paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Payment Status
   * @return paymentStatus
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Payment Status")
  public String getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public EntitySimulationResponse paymentErrorCode(String paymentErrorCode) {
    
    this.paymentErrorCode = paymentErrorCode;
    return this;
  }

   /**
   * Payment Error Code
   * @return paymentErrorCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment Error Code")
  public String getPaymentErrorCode() {
    return paymentErrorCode;
  }


  public void setPaymentErrorCode(String paymentErrorCode) {
    this.paymentErrorCode = paymentErrorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySimulationResponse entitySimulationResponse = (EntitySimulationResponse) o;
    return Objects.equals(this.paymentStatus, entitySimulationResponse.paymentStatus) &&
        Objects.equals(this.paymentErrorCode, entitySimulationResponse.paymentErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus, paymentErrorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySimulationResponse {\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentErrorCode: ").append(toIndentedString(paymentErrorCode)).append("\n");
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
    openapiFields.add("payment_status");
    openapiFields.add("payment_error_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitySimulationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EntitySimulationResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_error_code") != null && !jsonObj.get("payment_error_code").isJsonNull()) && !jsonObj.get("payment_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_error_code").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitySimulationResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EntitySimulationResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_error_code") != null && !jsonObj.get("payment_error_code").isJsonNull()) && !jsonObj.get("payment_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_error_code").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntitySimulationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntitySimulationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntitySimulationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntitySimulationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EntitySimulationResponse>() {
           @Override
           public void write(JsonWriter out, EntitySimulationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntitySimulationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntitySimulationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntitySimulationResponse
  * @throws IOException if the JSON string is invalid with respect to EntitySimulationResponse
  */
  public static EntitySimulationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntitySimulationResponse.class);
  }

 /**
  * Convert an instance of EntitySimulationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


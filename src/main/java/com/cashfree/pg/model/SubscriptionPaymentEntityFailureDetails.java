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
 * SubscriptionPaymentEntityFailureDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class SubscriptionPaymentEntityFailureDetails {
  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public SubscriptionPaymentEntityFailureDetails() {
  }

  public SubscriptionPaymentEntityFailureDetails failureReason(String failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Failure reason of the payment if the payment_status is failed.
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Failure reason of the payment if the payment_status is failed.")
  public String getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPaymentEntityFailureDetails subscriptionPaymentEntityFailureDetails = (SubscriptionPaymentEntityFailureDetails) o;
    return Objects.equals(this.failureReason, subscriptionPaymentEntityFailureDetails.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPaymentEntityFailureDetails {\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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
    openapiFields.add("failure_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentEntityFailureDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) && !jsonObj.get("failure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_reason").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionPaymentEntityFailureDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("failure_reason") != null && !jsonObj.get("failure_reason").isJsonNull()) && !jsonObj.get("failure_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `failure_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("failure_reason").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionPaymentEntityFailureDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionPaymentEntityFailureDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionPaymentEntityFailureDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionPaymentEntityFailureDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionPaymentEntityFailureDetails>() {
           @Override
           public void write(JsonWriter out, SubscriptionPaymentEntityFailureDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionPaymentEntityFailureDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionPaymentEntityFailureDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionPaymentEntityFailureDetails
  * @throws IOException if the JSON string is invalid with respect to SubscriptionPaymentEntityFailureDetails
  */
  public static SubscriptionPaymentEntityFailureDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionPaymentEntityFailureDetails.class);
  }

 /**
  * Convert an instance of SubscriptionPaymentEntityFailureDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


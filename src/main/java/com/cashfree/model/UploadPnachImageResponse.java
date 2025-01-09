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
 * Response of pnach image upload API.
 */
@Schema(description = "Response of pnach image upload API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class UploadPnachImageResponse {
  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_AUTHORIZATION_STATUS = "authorization_status";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_STATUS)
  private String authorizationStatus;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_PAYMENT_MESSAGE = "payment_message";
  @SerializedName(SERIALIZED_NAME_PAYMENT_MESSAGE)
  private String paymentMessage;

  public UploadPnachImageResponse() {
  }

  public UploadPnachImageResponse paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The payment_id against which the pnach image is uploaded.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The payment_id against which the pnach image is uploaded.")
  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public UploadPnachImageResponse authorizationStatus(String authorizationStatus) {
    
    this.authorizationStatus = authorizationStatus;
    return this;
  }

   /**
   * Authorization status of the subscription.
   * @return authorizationStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Authorization status of the subscription.")
  public String getAuthorizationStatus() {
    return authorizationStatus;
  }


  public void setAuthorizationStatus(String authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
  }


  public UploadPnachImageResponse action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action performed on the file.
   * @return action
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Action performed on the file.")
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public UploadPnachImageResponse paymentMessage(String paymentMessage) {
    
    this.paymentMessage = paymentMessage;
    return this;
  }

   /**
   * Message of the API.
   * @return paymentMessage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Message of the API.")
  public String getPaymentMessage() {
    return paymentMessage;
  }


  public void setPaymentMessage(String paymentMessage) {
    this.paymentMessage = paymentMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadPnachImageResponse uploadPnachImageResponse = (UploadPnachImageResponse) o;
    return Objects.equals(this.paymentId, uploadPnachImageResponse.paymentId) &&
        Objects.equals(this.authorizationStatus, uploadPnachImageResponse.authorizationStatus) &&
        Objects.equals(this.action, uploadPnachImageResponse.action) &&
        Objects.equals(this.paymentMessage, uploadPnachImageResponse.paymentMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, authorizationStatus, action, paymentMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadPnachImageResponse {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    paymentMessage: ").append(toIndentedString(paymentMessage)).append("\n");
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
    openapiFields.add("payment_id");
    openapiFields.add("authorization_status");
    openapiFields.add("action");
    openapiFields.add("payment_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadPnachImageResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("authorization_status") != null && !jsonObj.get("authorization_status").isJsonNull()) && !jsonObj.get("authorization_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_status").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadPnachImageResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("authorization_status") != null && !jsonObj.get("authorization_status").isJsonNull()) && !jsonObj.get("authorization_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_status").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadPnachImageResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadPnachImageResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadPnachImageResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadPnachImageResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadPnachImageResponse>() {
           @Override
           public void write(JsonWriter out, UploadPnachImageResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadPnachImageResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadPnachImageResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadPnachImageResponse
  * @throws IOException if the JSON string is invalid with respect to UploadPnachImageResponse
  */
  public static UploadPnachImageResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadPnachImageResponse.class);
  }

 /**
  * Convert an instance of UploadPnachImageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


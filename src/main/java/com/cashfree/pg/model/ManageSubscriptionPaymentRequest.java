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
import com.cashfree.pg.model.ManageSubscriptionPaymentRequestActionDetails;
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
 * Request body to manage a subscription payment.
 */
@Schema(description = "Request body to manage a subscription payment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:56:44.464357Z[Etc/UTC]")
public class ManageSubscriptionPaymentRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_ACTION_DETAILS = "action_details";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private ManageSubscriptionPaymentRequestActionDetails actionDetails;

  public ManageSubscriptionPaymentRequest() {
  }

  public ManageSubscriptionPaymentRequest subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The unique ID which was used to create subscription.
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The unique ID which was used to create subscription.")
  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public ManageSubscriptionPaymentRequest paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The unique ID which was used to create payment.
   * @return paymentId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The unique ID which was used to create payment.")
  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public ManageSubscriptionPaymentRequest action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action to be performed on the payment. Possible values - CANCEL, RETRY.
   * @return action
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Action to be performed on the payment. Possible values - CANCEL, RETRY.")
  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ManageSubscriptionPaymentRequest actionDetails(ManageSubscriptionPaymentRequestActionDetails actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ManageSubscriptionPaymentRequestActionDetails getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(ManageSubscriptionPaymentRequestActionDetails actionDetails) {
    this.actionDetails = actionDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManageSubscriptionPaymentRequest manageSubscriptionPaymentRequest = (ManageSubscriptionPaymentRequest) o;
    return Objects.equals(this.subscriptionId, manageSubscriptionPaymentRequest.subscriptionId) &&
        Objects.equals(this.paymentId, manageSubscriptionPaymentRequest.paymentId) &&
        Objects.equals(this.action, manageSubscriptionPaymentRequest.action) &&
        Objects.equals(this.actionDetails, manageSubscriptionPaymentRequest.actionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, paymentId, action, actionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageSubscriptionPaymentRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
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
    openapiFields.add("subscription_id");
    openapiFields.add("payment_id");
    openapiFields.add("action");
    openapiFields.add("action_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscription_id");
    openapiRequiredFields.add("payment_id");
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManageSubscriptionPaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManageSubscriptionPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if (!jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `action_details`
      if (jsonObj.get("action_details") != null && !jsonObj.get("action_details").isJsonNull()) {
        ManageSubscriptionPaymentRequestActionDetails.validateJsonElement(jsonObj.get("action_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManageSubscriptionPaymentRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManageSubscriptionPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      if (!jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      // validate the optional field `action_details`
      if (jsonObj.get("action_details") != null && !jsonObj.get("action_details").isJsonNull()) {
        ManageSubscriptionPaymentRequestActionDetails.validateJsonElement(jsonObj.get("action_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManageSubscriptionPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManageSubscriptionPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManageSubscriptionPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManageSubscriptionPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ManageSubscriptionPaymentRequest>() {
           @Override
           public void write(JsonWriter out, ManageSubscriptionPaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManageSubscriptionPaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManageSubscriptionPaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManageSubscriptionPaymentRequest
  * @throws IOException if the JSON string is invalid with respect to ManageSubscriptionPaymentRequest
  */
  public static ManageSubscriptionPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManageSubscriptionPaymentRequest.class);
  }

 /**
  * Convert an instance of ManageSubscriptionPaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * Details of the action to be performed.
 */
@Schema(description = "Details of the action to be performed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class ManageSubscriptionRequestActionDetails {
  public static final String SERIALIZED_NAME_NEXT_SCHEDULED_TIME = "next_scheduled_time";
  @SerializedName(SERIALIZED_NAME_NEXT_SCHEDULED_TIME)
  private String nextScheduledTime;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public ManageSubscriptionRequestActionDetails() {
  }

  public ManageSubscriptionRequestActionDetails nextScheduledTime(String nextScheduledTime) {
    
    this.nextScheduledTime = nextScheduledTime;
    return this;
  }

   /**
   * Next scheduled time for the action. Required for ACTIVATE action.
   * @return nextScheduledTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Next scheduled time for the action. Required for ACTIVATE action.")
  public String getNextScheduledTime() {
    return nextScheduledTime;
  }


  public void setNextScheduledTime(String nextScheduledTime) {
    this.nextScheduledTime = nextScheduledTime;
  }


  public ManageSubscriptionRequestActionDetails planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Plan ID to update. Required for CHANGE_PLAN action.
   * @return planId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Plan ID to update. Required for CHANGE_PLAN action.")
  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManageSubscriptionRequestActionDetails manageSubscriptionRequestActionDetails = (ManageSubscriptionRequestActionDetails) o;
    return Objects.equals(this.nextScheduledTime, manageSubscriptionRequestActionDetails.nextScheduledTime) &&
        Objects.equals(this.planId, manageSubscriptionRequestActionDetails.planId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextScheduledTime, planId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManageSubscriptionRequestActionDetails {\n");
    sb.append("    nextScheduledTime: ").append(toIndentedString(nextScheduledTime)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
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
    openapiFields.add("next_scheduled_time");
    openapiFields.add("plan_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManageSubscriptionRequestActionDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("next_scheduled_time") != null && !jsonObj.get("next_scheduled_time").isJsonNull()) && !jsonObj.get("next_scheduled_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_scheduled_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_scheduled_time").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ManageSubscriptionRequestActionDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("next_scheduled_time") != null && !jsonObj.get("next_scheduled_time").isJsonNull()) && !jsonObj.get("next_scheduled_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_scheduled_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_scheduled_time").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManageSubscriptionRequestActionDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManageSubscriptionRequestActionDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManageSubscriptionRequestActionDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManageSubscriptionRequestActionDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ManageSubscriptionRequestActionDetails>() {
           @Override
           public void write(JsonWriter out, ManageSubscriptionRequestActionDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManageSubscriptionRequestActionDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ManageSubscriptionRequestActionDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManageSubscriptionRequestActionDetails
  * @throws IOException if the JSON string is invalid with respect to ManageSubscriptionRequestActionDetails
  */
  public static ManageSubscriptionRequestActionDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManageSubscriptionRequestActionDetails.class);
  }

 /**
  * Convert an instance of ManageSubscriptionRequestActionDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


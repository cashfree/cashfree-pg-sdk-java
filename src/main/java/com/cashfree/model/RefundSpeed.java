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
 * How fast refund has to be proecessed
 */
@Schema(description = "How fast refund has to be proecessed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T09:13:46.373979Z[Etc/UTC]")
public class RefundSpeed {
  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private String requested;

  public static final String SERIALIZED_NAME_ACCEPTED = "accepted";
  @SerializedName(SERIALIZED_NAME_ACCEPTED)
  private String accepted;

  public static final String SERIALIZED_NAME_PROCESSED = "processed";
  @SerializedName(SERIALIZED_NAME_PROCESSED)
  private String processed;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public RefundSpeed() {
  }

  public RefundSpeed requested(String requested) {
    
    this.requested = requested;
    return this;
  }

   /**
   * Requested speed of refund.
   * @return requested
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Requested speed of refund.")
  public String getRequested() {
    return requested;
  }


  public void setRequested(String requested) {
    this.requested = requested;
  }


  public RefundSpeed accepted(String accepted) {
    
    this.accepted = accepted;
    return this;
  }

   /**
   * Accepted speed of refund.
   * @return accepted
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Accepted speed of refund.")
  public String getAccepted() {
    return accepted;
  }


  public void setAccepted(String accepted) {
    this.accepted = accepted;
  }


  public RefundSpeed processed(String processed) {
    
    this.processed = processed;
    return this;
  }

   /**
   * Processed speed of refund.
   * @return processed
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Processed speed of refund.")
  public String getProcessed() {
    return processed;
  }


  public void setProcessed(String processed) {
    this.processed = processed;
  }


  public RefundSpeed message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message, if any for refund_speed request
   * @return message
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Error message, if any for refund_speed request")
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundSpeed refundSpeed = (RefundSpeed) o;
    return Objects.equals(this.requested, refundSpeed.requested) &&
        Objects.equals(this.accepted, refundSpeed.accepted) &&
        Objects.equals(this.processed, refundSpeed.processed) &&
        Objects.equals(this.message, refundSpeed.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requested, accepted, processed, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundSpeed {\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("requested");
    openapiFields.add("accepted");
    openapiFields.add("processed");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RefundSpeed
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("requested") != null && !jsonObj.get("requested").isJsonNull()) && !jsonObj.get("requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requested").toString()));
      }
      if ((jsonObj.get("accepted") != null && !jsonObj.get("accepted").isJsonNull()) && !jsonObj.get("accepted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accepted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accepted").toString()));
      }
      if ((jsonObj.get("processed") != null && !jsonObj.get("processed").isJsonNull()) && !jsonObj.get("processed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundSpeed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundSpeed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundSpeed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundSpeed.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundSpeed>() {
           @Override
           public void write(JsonWriter out, RefundSpeed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundSpeed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RefundSpeed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundSpeed
  * @throws IOException if the JSON string is invalid with respect to RefundSpeed
  */
  public static RefundSpeed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundSpeed.class);
  }

 /**
  * Convert an instance of RefundSpeed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

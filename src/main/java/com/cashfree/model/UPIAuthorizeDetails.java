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
 * object when you are using preauth in UPI in order pay
 */
@Schema(description = "object when you are using preauth in UPI in order pay")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T13:03:12.873082Z[Etc/UTC]")
public class UPIAuthorizeDetails {
  public static final String SERIALIZED_NAME_APPROVE_BY = "approve_by";
  @SerializedName(SERIALIZED_NAME_APPROVE_BY)
  private String approveBy;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public UPIAuthorizeDetails() {
  }

  public UPIAuthorizeDetails approveBy(String approveBy) {
    
    this.approveBy = approveBy;
    return this;
  }

   /**
   * Time by which this authorization should be approved by the customer.
   * @return approveBy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time by which this authorization should be approved by the customer.")
  public String getApproveBy() {
    return approveBy;
  }


  public void setApproveBy(String approveBy) {
    this.approveBy = approveBy;
  }


  public UPIAuthorizeDetails startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * This is the time when the UPI one time mandate will start
   * @return startTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the UPI one time mandate will start")
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public UPIAuthorizeDetails endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * This is the time when the UPI mandate will be over. If the mandate has not been executed by this time, the funds will be returned back to the customer after this time.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the UPI mandate will be over. If the mandate has not been executed by this time, the funds will be returned back to the customer after this time.")
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UPIAuthorizeDetails upIAuthorizeDetails = (UPIAuthorizeDetails) o;
    return Objects.equals(this.approveBy, upIAuthorizeDetails.approveBy) &&
        Objects.equals(this.startTime, upIAuthorizeDetails.startTime) &&
        Objects.equals(this.endTime, upIAuthorizeDetails.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approveBy, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UPIAuthorizeDetails {\n");
    sb.append("    approveBy: ").append(toIndentedString(approveBy)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
    openapiFields.add("approve_by");
    openapiFields.add("start_time");
    openapiFields.add("end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UPIAuthorizeDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("approve_by") != null && !jsonObj.get("approve_by").isJsonNull()) && !jsonObj.get("approve_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approve_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approve_by").toString()));
      }
      if ((jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonNull()) && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if ((jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonNull()) && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UPIAuthorizeDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UPIAuthorizeDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UPIAuthorizeDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UPIAuthorizeDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UPIAuthorizeDetails>() {
           @Override
           public void write(JsonWriter out, UPIAuthorizeDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UPIAuthorizeDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UPIAuthorizeDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UPIAuthorizeDetails
  * @throws IOException if the JSON string is invalid with respect to UPIAuthorizeDetails
  */
  public static UPIAuthorizeDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UPIAuthorizeDetails.class);
  }

 /**
  * Convert an instance of UPIAuthorizeDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


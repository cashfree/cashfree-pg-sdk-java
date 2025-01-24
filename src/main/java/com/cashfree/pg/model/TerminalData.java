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
 * Terminal Data in the create order response
 */
@Schema(description = "Terminal Data in the create order response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T05:12:29.162122Z[Etc/UTC]")
public class TerminalData {
  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private Integer cfTerminalId;

  public static final String SERIALIZED_NAME_MERCHANT_TERMINAL_ID = "merchant_terminal_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TERMINAL_ID)
  private String merchantTerminalId;

  public static final String SERIALIZED_NAME_AGENT_MOBILE_NUMBER = "agent_mobile_number";
  @SerializedName(SERIALIZED_NAME_AGENT_MOBILE_NUMBER)
  private String agentMobileNumber;

  public static final String SERIALIZED_NAME_TERMINAL_TYPE = "terminal_type";
  @SerializedName(SERIALIZED_NAME_TERMINAL_TYPE)
  private String terminalType;

  public TerminalData() {
  }

  public TerminalData cfTerminalId(Integer cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * Get cfTerminalId
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(Integer cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public TerminalData merchantTerminalId(String merchantTerminalId) {
    
    this.merchantTerminalId = merchantTerminalId;
    return this;
  }

   /**
   * Get merchantTerminalId
   * @return merchantTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantTerminalId() {
    return merchantTerminalId;
  }


  public void setMerchantTerminalId(String merchantTerminalId) {
    this.merchantTerminalId = merchantTerminalId;
  }


  public TerminalData agentMobileNumber(String agentMobileNumber) {
    
    this.agentMobileNumber = agentMobileNumber;
    return this;
  }

   /**
   * Get agentMobileNumber
   * @return agentMobileNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAgentMobileNumber() {
    return agentMobileNumber;
  }


  public void setAgentMobileNumber(String agentMobileNumber) {
    this.agentMobileNumber = agentMobileNumber;
  }


  public TerminalData terminalType(String terminalType) {
    
    this.terminalType = terminalType;
    return this;
  }

   /**
   * Get terminalType
   * @return terminalType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalType() {
    return terminalType;
  }


  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalData terminalData = (TerminalData) o;
    return Objects.equals(this.cfTerminalId, terminalData.cfTerminalId) &&
        Objects.equals(this.merchantTerminalId, terminalData.merchantTerminalId) &&
        Objects.equals(this.agentMobileNumber, terminalData.agentMobileNumber) &&
        Objects.equals(this.terminalType, terminalData.terminalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfTerminalId, merchantTerminalId, agentMobileNumber, terminalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalData {\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    merchantTerminalId: ").append(toIndentedString(merchantTerminalId)).append("\n");
    sb.append("    agentMobileNumber: ").append(toIndentedString(agentMobileNumber)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
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
    openapiFields.add("cf_terminal_id");
    openapiFields.add("merchant_terminal_id");
    openapiFields.add("agent_mobile_number");
    openapiFields.add("terminal_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchant_terminal_id") != null && !jsonObj.get("merchant_terminal_id").isJsonNull()) && !jsonObj.get("merchant_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_terminal_id").toString()));
      }
      if ((jsonObj.get("agent_mobile_number") != null && !jsonObj.get("agent_mobile_number").isJsonNull()) && !jsonObj.get("agent_mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_mobile_number").toString()));
      }
      if ((jsonObj.get("terminal_type") != null && !jsonObj.get("terminal_type").isJsonNull()) && !jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalData
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchant_terminal_id") != null && !jsonObj.get("merchant_terminal_id").isJsonNull()) && !jsonObj.get("merchant_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_terminal_id").toString()));
      }
      if ((jsonObj.get("agent_mobile_number") != null && !jsonObj.get("agent_mobile_number").isJsonNull()) && !jsonObj.get("agent_mobile_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_mobile_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_mobile_number").toString()));
      }
      if ((jsonObj.get("terminal_type") != null && !jsonObj.get("terminal_type").isJsonNull()) && !jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalData.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalData>() {
           @Override
           public void write(JsonWriter out, TerminalData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalData
  * @throws IOException if the JSON string is invalid with respect to TerminalData
  */
  public static TerminalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalData.class);
  }

 /**
  * Convert an instance of TerminalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


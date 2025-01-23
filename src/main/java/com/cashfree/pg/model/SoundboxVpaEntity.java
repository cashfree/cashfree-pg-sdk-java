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
 * soundbox response object
 */
@Schema(description = "soundbox response object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:20:08.871845Z[Etc/UTC]")
public class SoundboxVpaEntity {
  public static final String SERIALIZED_NAME_VPA = "vpa";
  @SerializedName(SERIALIZED_NAME_VPA)
  private String vpa;

  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private String cfTerminalId;

  public static final String SERIALIZED_NAME_DEVICE_SERIAL_NO = "device_serial_no";
  @SerializedName(SERIALIZED_NAME_DEVICE_SERIAL_NO)
  private String deviceSerialNo;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public SoundboxVpaEntity() {
  }

  public SoundboxVpaEntity vpa(String vpa) {
    
    this.vpa = vpa;
    return this;
  }

   /**
   * Get vpa
   * @return vpa
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getVpa() {
    return vpa;
  }


  public void setVpa(String vpa) {
    this.vpa = vpa;
  }


  public SoundboxVpaEntity cfTerminalId(String cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * Get cfTerminalId
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(String cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public SoundboxVpaEntity deviceSerialNo(String deviceSerialNo) {
    
    this.deviceSerialNo = deviceSerialNo;
    return this;
  }

   /**
   * Get deviceSerialNo
   * @return deviceSerialNo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDeviceSerialNo() {
    return deviceSerialNo;
  }


  public void setDeviceSerialNo(String deviceSerialNo) {
    this.deviceSerialNo = deviceSerialNo;
  }


  public SoundboxVpaEntity merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public SoundboxVpaEntity language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoundboxVpaEntity soundboxVpaEntity = (SoundboxVpaEntity) o;
    return Objects.equals(this.vpa, soundboxVpaEntity.vpa) &&
        Objects.equals(this.cfTerminalId, soundboxVpaEntity.cfTerminalId) &&
        Objects.equals(this.deviceSerialNo, soundboxVpaEntity.deviceSerialNo) &&
        Objects.equals(this.merchantName, soundboxVpaEntity.merchantName) &&
        Objects.equals(this.language, soundboxVpaEntity.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpa, cfTerminalId, deviceSerialNo, merchantName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoundboxVpaEntity {\n");
    sb.append("    vpa: ").append(toIndentedString(vpa)).append("\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    deviceSerialNo: ").append(toIndentedString(deviceSerialNo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
    openapiFields.add("vpa");
    openapiFields.add("cf_terminal_id");
    openapiFields.add("device_serial_no");
    openapiFields.add("merchant_name");
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SoundboxVpaEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if ((jsonObj.get("device_serial_no") != null && !jsonObj.get("device_serial_no").isJsonNull()) && !jsonObj.get("device_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_serial_no").toString()));
      }
      if ((jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonNull()) && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SoundboxVpaEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vpa") != null && !jsonObj.get("vpa").isJsonNull()) && !jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if ((jsonObj.get("device_serial_no") != null && !jsonObj.get("device_serial_no").isJsonNull()) && !jsonObj.get("device_serial_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_serial_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_serial_no").toString()));
      }
      if ((jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonNull()) && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SoundboxVpaEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SoundboxVpaEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SoundboxVpaEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SoundboxVpaEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SoundboxVpaEntity>() {
           @Override
           public void write(JsonWriter out, SoundboxVpaEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SoundboxVpaEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SoundboxVpaEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SoundboxVpaEntity
  * @throws IOException if the JSON string is invalid with respect to SoundboxVpaEntity
  */
  public static SoundboxVpaEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SoundboxVpaEntity.class);
  }

 /**
  * Convert an instance of SoundboxVpaEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


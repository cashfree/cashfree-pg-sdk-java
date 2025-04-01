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
 * Request body to update soundbox vpa
 */
@Schema(description = "Request body to update soundbox vpa")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class UpdateSoundboxVpaRequest {
  public static final String SERIALIZED_NAME_VPA = "vpa";
  @SerializedName(SERIALIZED_NAME_VPA)
  private String vpa;

  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private String cfTerminalId;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public UpdateSoundboxVpaRequest() {
  }

  public UpdateSoundboxVpaRequest vpa(String vpa) {
    
    this.vpa = vpa;
    return this;
  }

   /**
   * Terminal Vpa,for which we need to update details.
   * @return vpa
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Terminal Vpa,for which we need to update details.")
  public String getVpa() {
    return vpa;
  }


  public void setVpa(String vpa) {
    this.vpa = vpa;
  }


  public UpdateSoundboxVpaRequest cfTerminalId(String cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * cashfree terminal id.
   * @return cfTerminalId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "cashfree terminal id.")
  public String getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(String cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public UpdateSoundboxVpaRequest merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Merchant Name that need to updated on soundbox
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Merchant Name that need to updated on soundbox")
  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public UpdateSoundboxVpaRequest language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * language of soundbox,currently English, Hindi, Tamil
   * @return language
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "language of soundbox,currently English, Hindi, Tamil")
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
    UpdateSoundboxVpaRequest updateSoundboxVpaRequest = (UpdateSoundboxVpaRequest) o;
    return Objects.equals(this.vpa, updateSoundboxVpaRequest.vpa) &&
        Objects.equals(this.cfTerminalId, updateSoundboxVpaRequest.cfTerminalId) &&
        Objects.equals(this.merchantName, updateSoundboxVpaRequest.merchantName) &&
        Objects.equals(this.language, updateSoundboxVpaRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpa, cfTerminalId, merchantName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSoundboxVpaRequest {\n");
    sb.append("    vpa: ").append(toIndentedString(vpa)).append("\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
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
    openapiFields.add("merchant_name");
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vpa");
    openapiRequiredFields.add("cf_terminal_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UpdateSoundboxVpaRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSoundboxVpaRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if (!jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
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
  * @throws IOException if the JSON Element is invalid with respect to UpdateSoundboxVpaRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSoundboxVpaRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("vpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpa").toString()));
      }
      if (!jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
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
       if (!UpdateSoundboxVpaRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSoundboxVpaRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSoundboxVpaRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSoundboxVpaRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSoundboxVpaRequest>() {
           @Override
           public void write(JsonWriter out, UpdateSoundboxVpaRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSoundboxVpaRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSoundboxVpaRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSoundboxVpaRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateSoundboxVpaRequest
  */
  public static UpdateSoundboxVpaRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSoundboxVpaRequest.class);
  }

 /**
  * Convert an instance of UpdateSoundboxVpaRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


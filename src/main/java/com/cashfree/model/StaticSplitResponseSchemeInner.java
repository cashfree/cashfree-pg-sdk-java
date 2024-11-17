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
 * StaticSplitResponseSchemeInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-17T14:57:47.426649Z[Etc/UTC]")
public class StaticSplitResponseSchemeInner {
  public static final String SERIALIZED_NAME_MERCHANT_VENDOR_ID = "merchantVendorId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_VENDOR_ID)
  private String merchantVendorId;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private String percentage;

  public StaticSplitResponseSchemeInner() {
  }

  public StaticSplitResponseSchemeInner merchantVendorId(String merchantVendorId) {
    
    this.merchantVendorId = merchantVendorId;
    return this;
  }

   /**
   * Get merchantVendorId
   * @return merchantVendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantVendorId() {
    return merchantVendorId;
  }


  public void setMerchantVendorId(String merchantVendorId) {
    this.merchantVendorId = merchantVendorId;
  }


  public StaticSplitResponseSchemeInner percentage(String percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPercentage() {
    return percentage;
  }


  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticSplitResponseSchemeInner staticSplitResponseSchemeInner = (StaticSplitResponseSchemeInner) o;
    return Objects.equals(this.merchantVendorId, staticSplitResponseSchemeInner.merchantVendorId) &&
        Objects.equals(this.percentage, staticSplitResponseSchemeInner.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantVendorId, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticSplitResponseSchemeInner {\n");
    sb.append("    merchantVendorId: ").append(toIndentedString(merchantVendorId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
    openapiFields.add("merchantVendorId");
    openapiFields.add("percentage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitResponseSchemeInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchantVendorId") != null && !jsonObj.get("merchantVendorId").isJsonNull()) && !jsonObj.get("merchantVendorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantVendorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantVendorId").toString()));
      }
      if ((jsonObj.get("percentage") != null && !jsonObj.get("percentage").isJsonNull()) && !jsonObj.get("percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentage").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitResponseSchemeInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchantVendorId") != null && !jsonObj.get("merchantVendorId").isJsonNull()) && !jsonObj.get("merchantVendorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantVendorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantVendorId").toString()));
      }
      if ((jsonObj.get("percentage") != null && !jsonObj.get("percentage").isJsonNull()) && !jsonObj.get("percentage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `percentage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("percentage").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaticSplitResponseSchemeInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaticSplitResponseSchemeInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaticSplitResponseSchemeInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaticSplitResponseSchemeInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StaticSplitResponseSchemeInner>() {
           @Override
           public void write(JsonWriter out, StaticSplitResponseSchemeInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaticSplitResponseSchemeInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaticSplitResponseSchemeInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaticSplitResponseSchemeInner
  * @throws IOException if the JSON string is invalid with respect to StaticSplitResponseSchemeInner
  */
  public static StaticSplitResponseSchemeInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaticSplitResponseSchemeInner.class);
  }

 /**
  * Convert an instance of StaticSplitResponseSchemeInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


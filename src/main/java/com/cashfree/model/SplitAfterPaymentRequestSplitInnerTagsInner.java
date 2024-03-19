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
 * SplitAfterPaymentRequestSplitInnerTagsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T10:54:45.822625Z[Etc/UTC]")
public class SplitAfterPaymentRequestSplitInnerTagsInner {
  public static final String SERIALIZED_NAME_KEY_VALUE1 = "Key Value 1";
  @SerializedName(SERIALIZED_NAME_KEY_VALUE1)
  private String keyValue1;

  public static final String SERIALIZED_NAME_KEY_VALUE2 = "Key Value 2";
  @SerializedName(SERIALIZED_NAME_KEY_VALUE2)
  private String keyValue2;

  public SplitAfterPaymentRequestSplitInnerTagsInner() {
  }

  public SplitAfterPaymentRequestSplitInnerTagsInner keyValue1(String keyValue1) {
    
    this.keyValue1 = keyValue1;
    return this;
  }

   /**
   * Get keyValue1
   * @return keyValue1
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getKeyValue1() {
    return keyValue1;
  }


  public void setKeyValue1(String keyValue1) {
    this.keyValue1 = keyValue1;
  }


  public SplitAfterPaymentRequestSplitInnerTagsInner keyValue2(String keyValue2) {
    
    this.keyValue2 = keyValue2;
    return this;
  }

   /**
   * Get keyValue2
   * @return keyValue2
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getKeyValue2() {
    return keyValue2;
  }


  public void setKeyValue2(String keyValue2) {
    this.keyValue2 = keyValue2;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitAfterPaymentRequestSplitInnerTagsInner splitAfterPaymentRequestSplitInnerTagsInner = (SplitAfterPaymentRequestSplitInnerTagsInner) o;
    return Objects.equals(this.keyValue1, splitAfterPaymentRequestSplitInnerTagsInner.keyValue1) &&
        Objects.equals(this.keyValue2, splitAfterPaymentRequestSplitInnerTagsInner.keyValue2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyValue1, keyValue2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitAfterPaymentRequestSplitInnerTagsInner {\n");
    sb.append("    keyValue1: ").append(toIndentedString(keyValue1)).append("\n");
    sb.append("    keyValue2: ").append(toIndentedString(keyValue2)).append("\n");
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
    openapiFields.add("Key Value 1");
    openapiFields.add("Key Value 2");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequestSplitInnerTagsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Key Value 1") != null && !jsonObj.get("Key Value 1").isJsonNull()) && !jsonObj.get("Key Value 1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key Value 1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key Value 1").toString()));
      }
      if ((jsonObj.get("Key Value 2") != null && !jsonObj.get("Key Value 2").isJsonNull()) && !jsonObj.get("Key Value 2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key Value 2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key Value 2").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequestSplitInnerTagsInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Key Value 1") != null && !jsonObj.get("Key Value 1").isJsonNull()) && !jsonObj.get("Key Value 1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key Value 1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key Value 1").toString()));
      }
      if ((jsonObj.get("Key Value 2") != null && !jsonObj.get("Key Value 2").isJsonNull()) && !jsonObj.get("Key Value 2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key Value 2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key Value 2").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitAfterPaymentRequestSplitInnerTagsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitAfterPaymentRequestSplitInnerTagsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitAfterPaymentRequestSplitInnerTagsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitAfterPaymentRequestSplitInnerTagsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitAfterPaymentRequestSplitInnerTagsInner>() {
           @Override
           public void write(JsonWriter out, SplitAfterPaymentRequestSplitInnerTagsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitAfterPaymentRequestSplitInnerTagsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitAfterPaymentRequestSplitInnerTagsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitAfterPaymentRequestSplitInnerTagsInner
  * @throws IOException if the JSON string is invalid with respect to SplitAfterPaymentRequestSplitInnerTagsInner
  */
  public static SplitAfterPaymentRequestSplitInnerTagsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitAfterPaymentRequestSplitInnerTagsInner.class);
  }

 /**
  * Convert an instance of SplitAfterPaymentRequestSplitInnerTagsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


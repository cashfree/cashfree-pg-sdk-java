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
import com.cashfree.model.ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * ESOrderReconResponseDataInnerOrderSplitsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T10:54:45.822625Z[Etc/UTC]")
public class ESOrderReconResponseDataInnerOrderSplitsInner {
  public static final String SERIALIZED_NAME_SPLIT = "split";
  @SerializedName(SERIALIZED_NAME_SPLIT)
  private List<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner> split;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public ESOrderReconResponseDataInnerOrderSplitsInner() {
  }

  public ESOrderReconResponseDataInnerOrderSplitsInner split(List<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner> split) {
    
    this.split = split;
    return this;
  }

  public ESOrderReconResponseDataInnerOrderSplitsInner addSplitItem(ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner splitItem) {
    if (this.split == null) {
      this.split = new ArrayList<>();
    }
    this.split.add(splitItem);
    return this;
  }

   /**
   * Get split
   * @return split
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner> getSplit() {
    return split;
  }


  public void setSplit(List<ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner> split) {
    this.split = split;
  }


  public ESOrderReconResponseDataInnerOrderSplitsInner createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ESOrderReconResponseDataInnerOrderSplitsInner esOrderReconResponseDataInnerOrderSplitsInner = (ESOrderReconResponseDataInnerOrderSplitsInner) o;
    return Objects.equals(this.split, esOrderReconResponseDataInnerOrderSplitsInner.split) &&
        Objects.equals(this.createdAt, esOrderReconResponseDataInnerOrderSplitsInner.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(split, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ESOrderReconResponseDataInnerOrderSplitsInner {\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
    openapiFields.add("split");
    openapiFields.add("created_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("split") != null && !jsonObj.get("split").isJsonNull()) {
        JsonArray jsonArraysplit = jsonObj.getAsJsonArray("split");
        if (jsonArraysplit != null) {
          // ensure the json data is an array
          if (!jsonObj.get("split").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `split` to be an array in the JSON string but got `%s`", jsonObj.get("split").toString()));
          }

          // validate the optional field `split` (array)
          for (int i = 0; i < jsonArraysplit.size(); i++) {
            ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner.validateJsonElement(jsonArraysplit.get(i));
          };
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("split") != null && !jsonObj.get("split").isJsonNull()) {
        JsonArray jsonArraysplit = jsonObj.getAsJsonArray("split");
        if (jsonArraysplit != null) {
          // ensure the json data is an array
          if (!jsonObj.get("split").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `split` to be an array in the JSON string but got `%s`", jsonObj.get("split").toString()));
          }

          // validate the optional field `split` (array)
          for (int i = 0; i < jsonArraysplit.size(); i++) {
            ESOrderReconResponseDataInnerOrderSplitsInnerSplitInner.validateJsonElement(jsonArraysplit.get(i));
          };
        }
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ESOrderReconResponseDataInnerOrderSplitsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ESOrderReconResponseDataInnerOrderSplitsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ESOrderReconResponseDataInnerOrderSplitsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ESOrderReconResponseDataInnerOrderSplitsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ESOrderReconResponseDataInnerOrderSplitsInner>() {
           @Override
           public void write(JsonWriter out, ESOrderReconResponseDataInnerOrderSplitsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ESOrderReconResponseDataInnerOrderSplitsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ESOrderReconResponseDataInnerOrderSplitsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ESOrderReconResponseDataInnerOrderSplitsInner
  * @throws IOException if the JSON string is invalid with respect to ESOrderReconResponseDataInnerOrderSplitsInner
  */
  public static ESOrderReconResponseDataInnerOrderSplitsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ESOrderReconResponseDataInnerOrderSplitsInner.class);
  }

 /**
  * Convert an instance of ESOrderReconResponseDataInnerOrderSplitsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


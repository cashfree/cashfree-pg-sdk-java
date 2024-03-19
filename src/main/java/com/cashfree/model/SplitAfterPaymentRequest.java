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
import com.cashfree.model.SplitAfterPaymentRequestSplitInner;
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
 * Split After Payment Request
 */
@Schema(description = "Split After Payment Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class SplitAfterPaymentRequest {
  public static final String SERIALIZED_NAME_SPLIT = "split";
  @SerializedName(SERIALIZED_NAME_SPLIT)
  private List<SplitAfterPaymentRequestSplitInner> split = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISABLE_SPLIT = "disable_split";
  @SerializedName(SERIALIZED_NAME_DISABLE_SPLIT)
  private Boolean disableSplit;

  public SplitAfterPaymentRequest() {
  }

  public SplitAfterPaymentRequest split(List<SplitAfterPaymentRequestSplitInner> split) {
    
    this.split = split;
    return this;
  }

  public SplitAfterPaymentRequest addSplitItem(SplitAfterPaymentRequestSplitInner splitItem) {
    if (this.split == null) {
      this.split = new ArrayList<>();
    }
    this.split.add(splitItem);
    return this;
  }

   /**
   * Specify the vendors order split details.
   * @return split
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the vendors order split details.")
  public List<SplitAfterPaymentRequestSplitInner> getSplit() {
    return split;
  }


  public void setSplit(List<SplitAfterPaymentRequestSplitInner> split) {
    this.split = split;
  }


  public SplitAfterPaymentRequest disableSplit(Boolean disableSplit) {
    
    this.disableSplit = disableSplit;
    return this;
  }

   /**
   * Specify if you want to end the split or continue creating further splits in future.
   * @return disableSplit
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify if you want to end the split or continue creating further splits in future.")
  public Boolean getDisableSplit() {
    return disableSplit;
  }


  public void setDisableSplit(Boolean disableSplit) {
    this.disableSplit = disableSplit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitAfterPaymentRequest splitAfterPaymentRequest = (SplitAfterPaymentRequest) o;
    return Objects.equals(this.split, splitAfterPaymentRequest.split) &&
        Objects.equals(this.disableSplit, splitAfterPaymentRequest.disableSplit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(split, disableSplit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitAfterPaymentRequest {\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    disableSplit: ").append(toIndentedString(disableSplit)).append("\n");
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
    openapiFields.add("disable_split");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("split");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SplitAfterPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("split").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `split` to be an array in the JSON string but got `%s`", jsonObj.get("split").toString()));
      }

      JsonArray jsonArraysplit = jsonObj.getAsJsonArray("split");
      // validate the required field `split` (array)
      for (int i = 0; i < jsonArraysplit.size(); i++) {
        SplitAfterPaymentRequestSplitInner.validateJsonElement(jsonArraysplit.get(i));
      };
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitAfterPaymentRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SplitAfterPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("split").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `split` to be an array in the JSON string but got `%s`", jsonObj.get("split").toString()));
      }

      JsonArray jsonArraysplit = jsonObj.getAsJsonArray("split");
      // validate the required field `split` (array)
      for (int i = 0; i < jsonArraysplit.size(); i++) {
        SplitAfterPaymentRequestSplitInner.validateJsonElement(jsonArraysplit.get(i));
      };
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitAfterPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitAfterPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitAfterPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitAfterPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitAfterPaymentRequest>() {
           @Override
           public void write(JsonWriter out, SplitAfterPaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitAfterPaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitAfterPaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitAfterPaymentRequest
  * @throws IOException if the JSON string is invalid with respect to SplitAfterPaymentRequest
  */
  public static SplitAfterPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitAfterPaymentRequest.class);
  }

 /**
  * Convert an instance of SplitAfterPaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


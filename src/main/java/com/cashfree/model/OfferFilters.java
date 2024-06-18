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
import com.cashfree.model.OfferType;
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
 * Filter for offers
 */
@Schema(description = "Filter for offers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-18T13:25:41.657534Z[Etc/UTC]")
public class OfferFilters {
  public static final String SERIALIZED_NAME_OFFER_TYPE = "offer_type";
  @SerializedName(SERIALIZED_NAME_OFFER_TYPE)
  private List<OfferType> offerType;

  public OfferFilters() {
  }

  public OfferFilters offerType(List<OfferType> offerType) {
    
    this.offerType = offerType;
    return this;
  }

  public OfferFilters addOfferTypeItem(OfferType offerTypeItem) {
    if (this.offerType == null) {
      this.offerType = new ArrayList<>();
    }
    this.offerType.add(offerTypeItem);
    return this;
  }

   /**
   * Array of offer_type to be filtered.
   * @return offerType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Array of offer_type to be filtered.")
  public List<OfferType> getOfferType() {
    return offerType;
  }


  public void setOfferType(List<OfferType> offerType) {
    this.offerType = offerType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferFilters offerFilters = (OfferFilters) o;
    return Objects.equals(this.offerType, offerFilters.offerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferFilters {\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
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
    openapiFields.add("offer_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferFilters
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("offer_type") != null && !jsonObj.get("offer_type").isJsonNull() && !jsonObj.get("offer_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_type` to be an array in the JSON string but got `%s`", jsonObj.get("offer_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferFilters
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("offer_type") != null && !jsonObj.get("offer_type").isJsonNull() && !jsonObj.get("offer_type").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_type` to be an array in the JSON string but got `%s`", jsonObj.get("offer_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferFilters.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferFilters' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferFilters> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferFilters.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferFilters>() {
           @Override
           public void write(JsonWriter out, OfferFilters value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferFilters read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferFilters given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferFilters
  * @throws IOException if the JSON string is invalid with respect to OfferFilters
  */
  public static OfferFilters fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferFilters.class);
  }

 /**
  * Convert an instance of OfferFilters to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


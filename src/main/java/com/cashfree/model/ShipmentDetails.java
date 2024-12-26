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
 * Shipment details associated with shipping of order like tracking company, tracking number,tracking urls etc.
 */
@Schema(description = "Shipment details associated with shipping of order like tracking company, tracking number,tracking urls etc.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:56:23.887789Z[Etc/UTC]")
public class ShipmentDetails {
  public static final String SERIALIZED_NAME_TRACKING_COMPANY = "tracking_company";
  @SerializedName(SERIALIZED_NAME_TRACKING_COMPANY)
  private String trackingCompany;

  public static final String SERIALIZED_NAME_TRACKING_URLS = "tracking_urls";
  @SerializedName(SERIALIZED_NAME_TRACKING_URLS)
  private List<String> trackingUrls = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRACKING_NUMBERS = "tracking_numbers";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBERS)
  private List<String> trackingNumbers = new ArrayList<>();

  public ShipmentDetails() {
  }

  public ShipmentDetails trackingCompany(String trackingCompany) {
    
    this.trackingCompany = trackingCompany;
    return this;
  }

   /**
   * Tracking company name associated with order.
   * @return trackingCompany
  **/
  @javax.annotation.Nonnull
  @Schema(example = "DHL", requiredMode = Schema.RequiredMode.REQUIRED, description = "Tracking company name associated with order.")
  public String getTrackingCompany() {
    return trackingCompany;
  }


  public void setTrackingCompany(String trackingCompany) {
    this.trackingCompany = trackingCompany;
  }


  public ShipmentDetails trackingUrls(List<String> trackingUrls) {
    
    this.trackingUrls = trackingUrls;
    return this;
  }

  public ShipmentDetails addTrackingUrlsItem(String trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = new ArrayList<>();
    }
    this.trackingUrls.add(trackingUrlsItem);
    return this;
  }

   /**
   * Tracking Urls associated with order.
   * @return trackingUrls
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Tracking Urls associated with order.")
  public List<String> getTrackingUrls() {
    return trackingUrls;
  }


  public void setTrackingUrls(List<String> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }


  public ShipmentDetails trackingNumbers(List<String> trackingNumbers) {
    
    this.trackingNumbers = trackingNumbers;
    return this;
  }

  public ShipmentDetails addTrackingNumbersItem(String trackingNumbersItem) {
    if (this.trackingNumbers == null) {
      this.trackingNumbers = new ArrayList<>();
    }
    this.trackingNumbers.add(trackingNumbersItem);
    return this;
  }

   /**
   * Tracking Numbers associated with order.
   * @return trackingNumbers
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Tracking Numbers associated with order.")
  public List<String> getTrackingNumbers() {
    return trackingNumbers;
  }


  public void setTrackingNumbers(List<String> trackingNumbers) {
    this.trackingNumbers = trackingNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDetails shipmentDetails = (ShipmentDetails) o;
    return Objects.equals(this.trackingCompany, shipmentDetails.trackingCompany) &&
        Objects.equals(this.trackingUrls, shipmentDetails.trackingUrls) &&
        Objects.equals(this.trackingNumbers, shipmentDetails.trackingNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingCompany, trackingUrls, trackingNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDetails {\n");
    sb.append("    trackingCompany: ").append(toIndentedString(trackingCompany)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    trackingNumbers: ").append(toIndentedString(trackingNumbers)).append("\n");
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
    openapiFields.add("tracking_company");
    openapiFields.add("tracking_urls");
    openapiFields.add("tracking_numbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tracking_company");
    openapiRequiredFields.add("tracking_urls");
    openapiRequiredFields.add("tracking_numbers");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ShipmentDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShipmentDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tracking_company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_company").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tracking_urls") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tracking_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_urls` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_urls").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tracking_numbers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tracking_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_numbers").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ShipmentDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ShipmentDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tracking_company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_company").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tracking_urls") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tracking_urls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_urls` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_urls").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tracking_numbers") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tracking_numbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_numbers` to be an array in the JSON string but got `%s`", jsonObj.get("tracking_numbers").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ShipmentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ShipmentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ShipmentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ShipmentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ShipmentDetails>() {
           @Override
           public void write(JsonWriter out, ShipmentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ShipmentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ShipmentDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ShipmentDetails
  * @throws IOException if the JSON string is invalid with respect to ShipmentDetails
  */
  public static ShipmentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ShipmentDetails.class);
  }

 /**
  * Convert an instance of ShipmentDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


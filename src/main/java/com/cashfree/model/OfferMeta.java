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
 * Offer meta details object
 */
@Schema(description = "Offer meta details object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T09:00:37.237094Z[Etc/UTC]")
public class OfferMeta {
  public static final String SERIALIZED_NAME_OFFER_TITLE = "offer_title";
  @SerializedName(SERIALIZED_NAME_OFFER_TITLE)
  private String offerTitle;

  public static final String SERIALIZED_NAME_OFFER_DESCRIPTION = "offer_description";
  @SerializedName(SERIALIZED_NAME_OFFER_DESCRIPTION)
  private String offerDescription;

  public static final String SERIALIZED_NAME_OFFER_CODE = "offer_code";
  @SerializedName(SERIALIZED_NAME_OFFER_CODE)
  private String offerCode;

  public static final String SERIALIZED_NAME_OFFER_START_TIME = "offer_start_time";
  @SerializedName(SERIALIZED_NAME_OFFER_START_TIME)
  private String offerStartTime;

  public static final String SERIALIZED_NAME_OFFER_END_TIME = "offer_end_time";
  @SerializedName(SERIALIZED_NAME_OFFER_END_TIME)
  private String offerEndTime;

  public OfferMeta() {
  }

  public OfferMeta offerTitle(String offerTitle) {
    
    this.offerTitle = offerTitle;
    return this;
  }

   /**
   * Title for the Offer.
   * @return offerTitle
  **/
  @javax.annotation.Nonnull
  @Schema(example = "Test Offer", requiredMode = Schema.RequiredMode.REQUIRED, description = "Title for the Offer.")
  public String getOfferTitle() {
    return offerTitle;
  }


  public void setOfferTitle(String offerTitle) {
    this.offerTitle = offerTitle;
  }


  public OfferMeta offerDescription(String offerDescription) {
    
    this.offerDescription = offerDescription;
    return this;
  }

   /**
   * Description for the Offer.
   * @return offerDescription
  **/
  @javax.annotation.Nonnull
  @Schema(example = "Lorem ipsum dolor sit amet, consectetur adipiscing elit", requiredMode = Schema.RequiredMode.REQUIRED, description = "Description for the Offer.")
  public String getOfferDescription() {
    return offerDescription;
  }


  public void setOfferDescription(String offerDescription) {
    this.offerDescription = offerDescription;
  }


  public OfferMeta offerCode(String offerCode) {
    
    this.offerCode = offerCode;
    return this;
  }

   /**
   * Unique identifier for the Offer.
   * @return offerCode
  **/
  @javax.annotation.Nonnull
  @Schema(example = "CFTESTOFFER", requiredMode = Schema.RequiredMode.REQUIRED, description = "Unique identifier for the Offer.")
  public String getOfferCode() {
    return offerCode;
  }


  public void setOfferCode(String offerCode) {
    this.offerCode = offerCode;
  }


  public OfferMeta offerStartTime(String offerStartTime) {
    
    this.offerStartTime = offerStartTime;
    return this;
  }

   /**
   * Start Time for the Offer
   * @return offerStartTime
  **/
  @javax.annotation.Nonnull
  @Schema(example = "2023-03-21T08:09:51Z", requiredMode = Schema.RequiredMode.REQUIRED, description = "Start Time for the Offer")
  public String getOfferStartTime() {
    return offerStartTime;
  }


  public void setOfferStartTime(String offerStartTime) {
    this.offerStartTime = offerStartTime;
  }


  public OfferMeta offerEndTime(String offerEndTime) {
    
    this.offerEndTime = offerEndTime;
    return this;
  }

   /**
   * Expiry Time for the Offer
   * @return offerEndTime
  **/
  @javax.annotation.Nonnull
  @Schema(example = "2023-03-29T08:09:51Z", requiredMode = Schema.RequiredMode.REQUIRED, description = "Expiry Time for the Offer")
  public String getOfferEndTime() {
    return offerEndTime;
  }


  public void setOfferEndTime(String offerEndTime) {
    this.offerEndTime = offerEndTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMeta offerMeta = (OfferMeta) o;
    return Objects.equals(this.offerTitle, offerMeta.offerTitle) &&
        Objects.equals(this.offerDescription, offerMeta.offerDescription) &&
        Objects.equals(this.offerCode, offerMeta.offerCode) &&
        Objects.equals(this.offerStartTime, offerMeta.offerStartTime) &&
        Objects.equals(this.offerEndTime, offerMeta.offerEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerTitle, offerDescription, offerCode, offerStartTime, offerEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMeta {\n");
    sb.append("    offerTitle: ").append(toIndentedString(offerTitle)).append("\n");
    sb.append("    offerDescription: ").append(toIndentedString(offerDescription)).append("\n");
    sb.append("    offerCode: ").append(toIndentedString(offerCode)).append("\n");
    sb.append("    offerStartTime: ").append(toIndentedString(offerStartTime)).append("\n");
    sb.append("    offerEndTime: ").append(toIndentedString(offerEndTime)).append("\n");
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
    openapiFields.add("offer_title");
    openapiFields.add("offer_description");
    openapiFields.add("offer_code");
    openapiFields.add("offer_start_time");
    openapiFields.add("offer_end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offer_title");
    openapiRequiredFields.add("offer_description");
    openapiRequiredFields.add("offer_code");
    openapiRequiredFields.add("offer_start_time");
    openapiRequiredFields.add("offer_end_time");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("offer_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_title").toString()));
      }
      if (!jsonObj.get("offer_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_description").toString()));
      }
      if (!jsonObj.get("offer_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_code").toString()));
      }
      if (!jsonObj.get("offer_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_start_time").toString()));
      }
      if (!jsonObj.get("offer_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_end_time").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferMeta
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OfferMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("offer_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_title").toString()));
      }
      if (!jsonObj.get("offer_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_description").toString()));
      }
      if (!jsonObj.get("offer_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_code").toString()));
      }
      if (!jsonObj.get("offer_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_start_time").toString()));
      }
      if (!jsonObj.get("offer_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_end_time").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferMeta>() {
           @Override
           public void write(JsonWriter out, OfferMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferMeta
  * @throws IOException if the JSON string is invalid with respect to OfferMeta
  */
  public static OfferMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferMeta.class);
  }

 /**
  * Convert an instance of OfferMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.pg.model.OfferDetails;
import com.cashfree.pg.model.OfferMeta;
import com.cashfree.pg.model.OfferTnc;
import com.cashfree.pg.model.OfferValidations;
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
 * Details of the offer which got applied to the paid order.
 */
@Schema(description = "Details of the offer which got applied to the paid order.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:50:37.026342Z[Etc/UTC]")
public class OfferExtendedDetails {
  public static final String SERIALIZED_NAME_OFFER_ID = "offer_id";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public static final String SERIALIZED_NAME_OFFER_STATUS = "offer_status";
  @SerializedName(SERIALIZED_NAME_OFFER_STATUS)
  private String offerStatus;

  public static final String SERIALIZED_NAME_OFFER_META = "offer_meta";
  @SerializedName(SERIALIZED_NAME_OFFER_META)
  private OfferMeta offerMeta;

  public static final String SERIALIZED_NAME_OFFER_TNC = "offer_tnc";
  @SerializedName(SERIALIZED_NAME_OFFER_TNC)
  private OfferTnc offerTnc;

  public static final String SERIALIZED_NAME_OFFER_DETAILS = "offer_details";
  @SerializedName(SERIALIZED_NAME_OFFER_DETAILS)
  private OfferDetails offerDetails;

  public static final String SERIALIZED_NAME_OFFER_VALIDATIONS = "offer_validations";
  @SerializedName(SERIALIZED_NAME_OFFER_VALIDATIONS)
  private OfferValidations offerValidations;

  public OfferExtendedDetails() {
  }

  public OfferExtendedDetails offerId(String offerId) {
    
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @javax.annotation.Nullable
  @Schema(example = "d2b430fb-1afe-455a-af31-66d00377b29a", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOfferId() {
    return offerId;
  }


  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }


  public OfferExtendedDetails offerStatus(String offerStatus) {
    
    this.offerStatus = offerStatus;
    return this;
  }

   /**
   * Get offerStatus
   * @return offerStatus
  **/
  @javax.annotation.Nullable
  @Schema(example = "active", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOfferStatus() {
    return offerStatus;
  }


  public void setOfferStatus(String offerStatus) {
    this.offerStatus = offerStatus;
  }


  public OfferExtendedDetails offerMeta(OfferMeta offerMeta) {
    
    this.offerMeta = offerMeta;
    return this;
  }

   /**
   * Get offerMeta
   * @return offerMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferMeta getOfferMeta() {
    return offerMeta;
  }


  public void setOfferMeta(OfferMeta offerMeta) {
    this.offerMeta = offerMeta;
  }


  public OfferExtendedDetails offerTnc(OfferTnc offerTnc) {
    
    this.offerTnc = offerTnc;
    return this;
  }

   /**
   * Get offerTnc
   * @return offerTnc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferTnc getOfferTnc() {
    return offerTnc;
  }


  public void setOfferTnc(OfferTnc offerTnc) {
    this.offerTnc = offerTnc;
  }


  public OfferExtendedDetails offerDetails(OfferDetails offerDetails) {
    
    this.offerDetails = offerDetails;
    return this;
  }

   /**
   * Get offerDetails
   * @return offerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferDetails getOfferDetails() {
    return offerDetails;
  }


  public void setOfferDetails(OfferDetails offerDetails) {
    this.offerDetails = offerDetails;
  }


  public OfferExtendedDetails offerValidations(OfferValidations offerValidations) {
    
    this.offerValidations = offerValidations;
    return this;
  }

   /**
   * Get offerValidations
   * @return offerValidations
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferValidations getOfferValidations() {
    return offerValidations;
  }


  public void setOfferValidations(OfferValidations offerValidations) {
    this.offerValidations = offerValidations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferExtendedDetails offerExtendedDetails = (OfferExtendedDetails) o;
    return Objects.equals(this.offerId, offerExtendedDetails.offerId) &&
        Objects.equals(this.offerStatus, offerExtendedDetails.offerStatus) &&
        Objects.equals(this.offerMeta, offerExtendedDetails.offerMeta) &&
        Objects.equals(this.offerTnc, offerExtendedDetails.offerTnc) &&
        Objects.equals(this.offerDetails, offerExtendedDetails.offerDetails) &&
        Objects.equals(this.offerValidations, offerExtendedDetails.offerValidations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, offerStatus, offerMeta, offerTnc, offerDetails, offerValidations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferExtendedDetails {\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerStatus: ").append(toIndentedString(offerStatus)).append("\n");
    sb.append("    offerMeta: ").append(toIndentedString(offerMeta)).append("\n");
    sb.append("    offerTnc: ").append(toIndentedString(offerTnc)).append("\n");
    sb.append("    offerDetails: ").append(toIndentedString(offerDetails)).append("\n");
    sb.append("    offerValidations: ").append(toIndentedString(offerValidations)).append("\n");
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
    openapiFields.add("offer_id");
    openapiFields.add("offer_status");
    openapiFields.add("offer_meta");
    openapiFields.add("offer_tnc");
    openapiFields.add("offer_details");
    openapiFields.add("offer_validations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferExtendedDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("offer_id") != null && !jsonObj.get("offer_id").isJsonNull()) && !jsonObj.get("offer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_id").toString()));
      }
      if ((jsonObj.get("offer_status") != null && !jsonObj.get("offer_status").isJsonNull()) && !jsonObj.get("offer_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_status").toString()));
      }
      // validate the optional field `offer_meta`
      if (jsonObj.get("offer_meta") != null && !jsonObj.get("offer_meta").isJsonNull()) {
        OfferMeta.validateJsonElement(jsonObj.get("offer_meta"));
      }
      // validate the optional field `offer_tnc`
      if (jsonObj.get("offer_tnc") != null && !jsonObj.get("offer_tnc").isJsonNull()) {
        OfferTnc.validateJsonElement(jsonObj.get("offer_tnc"));
      }
      // validate the optional field `offer_details`
      if (jsonObj.get("offer_details") != null && !jsonObj.get("offer_details").isJsonNull()) {
        OfferDetails.validateJsonElement(jsonObj.get("offer_details"));
      }
      // validate the optional field `offer_validations`
      if (jsonObj.get("offer_validations") != null && !jsonObj.get("offer_validations").isJsonNull()) {
        OfferValidations.validateJsonElement(jsonObj.get("offer_validations"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OfferExtendedDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("offer_id") != null && !jsonObj.get("offer_id").isJsonNull()) && !jsonObj.get("offer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_id").toString()));
      }
      if ((jsonObj.get("offer_status") != null && !jsonObj.get("offer_status").isJsonNull()) && !jsonObj.get("offer_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_status").toString()));
      }
      // validate the optional field `offer_meta`
      if (jsonObj.get("offer_meta") != null && !jsonObj.get("offer_meta").isJsonNull()) {
        OfferMeta.validateJsonElement(jsonObj.get("offer_meta"));
        return true;
      }
      // validate the optional field `offer_tnc`
      if (jsonObj.get("offer_tnc") != null && !jsonObj.get("offer_tnc").isJsonNull()) {
        OfferTnc.validateJsonElement(jsonObj.get("offer_tnc"));
        return true;
      }
      // validate the optional field `offer_details`
      if (jsonObj.get("offer_details") != null && !jsonObj.get("offer_details").isJsonNull()) {
        OfferDetails.validateJsonElement(jsonObj.get("offer_details"));
        return true;
      }
      // validate the optional field `offer_validations`
      if (jsonObj.get("offer_validations") != null && !jsonObj.get("offer_validations").isJsonNull()) {
        OfferValidations.validateJsonElement(jsonObj.get("offer_validations"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OfferExtendedDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OfferExtendedDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OfferExtendedDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OfferExtendedDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OfferExtendedDetails>() {
           @Override
           public void write(JsonWriter out, OfferExtendedDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OfferExtendedDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OfferExtendedDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OfferExtendedDetails
  * @throws IOException if the JSON string is invalid with respect to OfferExtendedDetails
  */
  public static OfferExtendedDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OfferExtendedDetails.class);
  }

 /**
  * Convert an instance of OfferExtendedDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


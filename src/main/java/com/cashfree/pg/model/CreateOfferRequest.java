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
 * create offer backend request object
 */
@Schema(description = "create offer backend request object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:50:37.026342Z[Etc/UTC]")
public class CreateOfferRequest {
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

  public CreateOfferRequest() {
  }

  public CreateOfferRequest offerMeta(OfferMeta offerMeta) {
    
    this.offerMeta = offerMeta;
    return this;
  }

   /**
   * Get offerMeta
   * @return offerMeta
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public OfferMeta getOfferMeta() {
    return offerMeta;
  }


  public void setOfferMeta(OfferMeta offerMeta) {
    this.offerMeta = offerMeta;
  }


  public CreateOfferRequest offerTnc(OfferTnc offerTnc) {
    
    this.offerTnc = offerTnc;
    return this;
  }

   /**
   * Get offerTnc
   * @return offerTnc
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public OfferTnc getOfferTnc() {
    return offerTnc;
  }


  public void setOfferTnc(OfferTnc offerTnc) {
    this.offerTnc = offerTnc;
  }


  public CreateOfferRequest offerDetails(OfferDetails offerDetails) {
    
    this.offerDetails = offerDetails;
    return this;
  }

   /**
   * Get offerDetails
   * @return offerDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public OfferDetails getOfferDetails() {
    return offerDetails;
  }


  public void setOfferDetails(OfferDetails offerDetails) {
    this.offerDetails = offerDetails;
  }


  public CreateOfferRequest offerValidations(OfferValidations offerValidations) {
    
    this.offerValidations = offerValidations;
    return this;
  }

   /**
   * Get offerValidations
   * @return offerValidations
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
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
    CreateOfferRequest createOfferRequest = (CreateOfferRequest) o;
    return Objects.equals(this.offerMeta, createOfferRequest.offerMeta) &&
        Objects.equals(this.offerTnc, createOfferRequest.offerTnc) &&
        Objects.equals(this.offerDetails, createOfferRequest.offerDetails) &&
        Objects.equals(this.offerValidations, createOfferRequest.offerValidations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMeta, offerTnc, offerDetails, offerValidations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOfferRequest {\n");
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
    openapiFields.add("offer_meta");
    openapiFields.add("offer_tnc");
    openapiFields.add("offer_details");
    openapiFields.add("offer_validations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("offer_meta");
    openapiRequiredFields.add("offer_tnc");
    openapiRequiredFields.add("offer_details");
    openapiRequiredFields.add("offer_validations");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOfferRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOfferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `offer_meta`
      OfferMeta.validateJsonElement(jsonObj.get("offer_meta"));
      // validate the required field `offer_tnc`
      OfferTnc.validateJsonElement(jsonObj.get("offer_tnc"));
      // validate the required field `offer_details`
      OfferDetails.validateJsonElement(jsonObj.get("offer_details"));
      // validate the required field `offer_validations`
      OfferValidations.validateJsonElement(jsonObj.get("offer_validations"));
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateOfferRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateOfferRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `offer_meta`
      OfferMeta.validateJsonElement(jsonObj.get("offer_meta"));
      // validate the required field `offer_tnc`
      OfferTnc.validateJsonElement(jsonObj.get("offer_tnc"));
      // validate the required field `offer_details`
      OfferDetails.validateJsonElement(jsonObj.get("offer_details"));
      // validate the required field `offer_validations`
      OfferValidations.validateJsonElement(jsonObj.get("offer_validations"));
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateOfferRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateOfferRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateOfferRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateOfferRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateOfferRequest>() {
           @Override
           public void write(JsonWriter out, CreateOfferRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateOfferRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateOfferRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateOfferRequest
  * @throws IOException if the JSON string is invalid with respect to CreateOfferRequest
  */
  public static CreateOfferRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateOfferRequest.class);
  }

 /**
  * Convert an instance of CreateOfferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


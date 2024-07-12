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
 * Card instrument meta information
 */
@Schema(description = "Card instrument meta information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T09:19:49.697679Z[Etc/UTC]")
public class SavedInstrumentMeta {
  public static final String SERIALIZED_NAME_CARD_NETWORK = "card_network";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK)
  private String cardNetwork;

  public static final String SERIALIZED_NAME_CARD_BANK_NAME = "card_bank_name";
  @SerializedName(SERIALIZED_NAME_CARD_BANK_NAME)
  private String cardBankName;

  public static final String SERIALIZED_NAME_CARD_COUNTRY = "card_country";
  @SerializedName(SERIALIZED_NAME_CARD_COUNTRY)
  private String cardCountry;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CARD_TOKEN_DETAILS = "card_token_details";
  @SerializedName(SERIALIZED_NAME_CARD_TOKEN_DETAILS)
  private Object cardTokenDetails;

  public SavedInstrumentMeta() {
  }

  public SavedInstrumentMeta cardNetwork(String cardNetwork) {
    
    this.cardNetwork = cardNetwork;
    return this;
  }

   /**
   * card scheme/network of the saved card. Example visa, mastercard
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  @Schema(example = "VISA", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "card scheme/network of the saved card. Example visa, mastercard")
  public String getCardNetwork() {
    return cardNetwork;
  }


  public void setCardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public SavedInstrumentMeta cardBankName(String cardBankName) {
    
    this.cardBankName = cardBankName;
    return this;
  }

   /**
   * Issuing bank name of saved card
   * @return cardBankName
  **/
  @javax.annotation.Nullable
  @Schema(example = "HDFC Bank", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Issuing bank name of saved card")
  public String getCardBankName() {
    return cardBankName;
  }


  public void setCardBankName(String cardBankName) {
    this.cardBankName = cardBankName;
  }


  public SavedInstrumentMeta cardCountry(String cardCountry) {
    
    this.cardCountry = cardCountry;
    return this;
  }

   /**
   * Issuing country of saved card
   * @return cardCountry
  **/
  @javax.annotation.Nullable
  @Schema(example = "IN", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Issuing country of saved card")
  public String getCardCountry() {
    return cardCountry;
  }


  public void setCardCountry(String cardCountry) {
    this.cardCountry = cardCountry;
  }


  public SavedInstrumentMeta cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Type of saved card
   * @return cardType
  **/
  @javax.annotation.Nullable
  @Schema(example = "DEBIT_CARD", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of saved card")
  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public SavedInstrumentMeta cardTokenDetails(Object cardTokenDetails) {
    
    this.cardTokenDetails = cardTokenDetails;
    return this;
  }

   /**
   * Get cardTokenDetails
   * @return cardTokenDetails
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"par\":\"somepar\",\"expiry_month\":\"12\",\"expiry_year\":\"23\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Object getCardTokenDetails() {
    return cardTokenDetails;
  }


  public void setCardTokenDetails(Object cardTokenDetails) {
    this.cardTokenDetails = cardTokenDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedInstrumentMeta savedInstrumentMeta = (SavedInstrumentMeta) o;
    return Objects.equals(this.cardNetwork, savedInstrumentMeta.cardNetwork) &&
        Objects.equals(this.cardBankName, savedInstrumentMeta.cardBankName) &&
        Objects.equals(this.cardCountry, savedInstrumentMeta.cardCountry) &&
        Objects.equals(this.cardType, savedInstrumentMeta.cardType) &&
        Objects.equals(this.cardTokenDetails, savedInstrumentMeta.cardTokenDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNetwork, cardBankName, cardCountry, cardType, cardTokenDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedInstrumentMeta {\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardBankName: ").append(toIndentedString(cardBankName)).append("\n");
    sb.append("    cardCountry: ").append(toIndentedString(cardCountry)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardTokenDetails: ").append(toIndentedString(cardTokenDetails)).append("\n");
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
    openapiFields.add("card_network");
    openapiFields.add("card_bank_name");
    openapiFields.add("card_country");
    openapiFields.add("card_type");
    openapiFields.add("card_token_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SavedInstrumentMeta
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_network") != null && !jsonObj.get("card_network").isJsonNull()) && !jsonObj.get("card_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network").toString()));
      }
      if ((jsonObj.get("card_bank_name") != null && !jsonObj.get("card_bank_name").isJsonNull()) && !jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
      if ((jsonObj.get("card_country") != null && !jsonObj.get("card_country").isJsonNull()) && !jsonObj.get("card_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_country").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SavedInstrumentMeta
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_network") != null && !jsonObj.get("card_network").isJsonNull()) && !jsonObj.get("card_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network").toString()));
      }
      if ((jsonObj.get("card_bank_name") != null && !jsonObj.get("card_bank_name").isJsonNull()) && !jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
      if ((jsonObj.get("card_country") != null && !jsonObj.get("card_country").isJsonNull()) && !jsonObj.get("card_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_country").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SavedInstrumentMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SavedInstrumentMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SavedInstrumentMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SavedInstrumentMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<SavedInstrumentMeta>() {
           @Override
           public void write(JsonWriter out, SavedInstrumentMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SavedInstrumentMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SavedInstrumentMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SavedInstrumentMeta
  * @throws IOException if the JSON string is invalid with respect to SavedInstrumentMeta
  */
  public static SavedInstrumentMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SavedInstrumentMeta.class);
  }

 /**
  * Convert an instance of SavedInstrumentMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


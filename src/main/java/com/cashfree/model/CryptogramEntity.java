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
 * Crytogram Card object
 */
@Schema(description = "Crytogram Card object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-23T08:48:11.064798Z[Etc/UTC]")
public class CryptogramEntity {
  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrument_id";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  public static final String SERIALIZED_NAME_TOKEN_REQUESTOR_ID = "token_requestor_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTOR_ID)
  private String tokenRequestorId;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_MM = "card_expiry_mm";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MM)
  private String cardExpiryMm;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_YY = "card_expiry_yy";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YY)
  private String cardExpiryYy;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;

  public static final String SERIALIZED_NAME_CARD_DISPLAY = "card_display";
  @SerializedName(SERIALIZED_NAME_CARD_DISPLAY)
  private String cardDisplay;

  public CryptogramEntity() {
  }

  public CryptogramEntity instrumentId(String instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * instrument_id of saved instrument
   * @return instrumentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "instrument_id of saved instrument")
  public String getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public CryptogramEntity tokenRequestorId(String tokenRequestorId) {
    
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * TRID issued by card networks
   * @return tokenRequestorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "TRID issued by card networks")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }


  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  public CryptogramEntity cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * token pan number
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "token pan number")
  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CryptogramEntity cardExpiryMm(String cardExpiryMm) {
    
    this.cardExpiryMm = cardExpiryMm;
    return this;
  }

   /**
   * token pan expiry month
   * @return cardExpiryMm
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "token pan expiry month")
  public String getCardExpiryMm() {
    return cardExpiryMm;
  }


  public void setCardExpiryMm(String cardExpiryMm) {
    this.cardExpiryMm = cardExpiryMm;
  }


  public CryptogramEntity cardExpiryYy(String cardExpiryYy) {
    
    this.cardExpiryYy = cardExpiryYy;
    return this;
  }

   /**
   * token pan expiry year
   * @return cardExpiryYy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "token pan expiry year")
  public String getCardExpiryYy() {
    return cardExpiryYy;
  }


  public void setCardExpiryYy(String cardExpiryYy) {
    this.cardExpiryYy = cardExpiryYy;
  }


  public CryptogramEntity cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * cryptogram
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "cryptogram")
  public String getCryptogram() {
    return cryptogram;
  }


  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  public CryptogramEntity cardDisplay(String cardDisplay) {
    
    this.cardDisplay = cardDisplay;
    return this;
  }

   /**
   * last 4 digits of original card number
   * @return cardDisplay
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "last 4 digits of original card number")
  public String getCardDisplay() {
    return cardDisplay;
  }


  public void setCardDisplay(String cardDisplay) {
    this.cardDisplay = cardDisplay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptogramEntity cryptogramEntity = (CryptogramEntity) o;
    return Objects.equals(this.instrumentId, cryptogramEntity.instrumentId) &&
        Objects.equals(this.tokenRequestorId, cryptogramEntity.tokenRequestorId) &&
        Objects.equals(this.cardNumber, cryptogramEntity.cardNumber) &&
        Objects.equals(this.cardExpiryMm, cryptogramEntity.cardExpiryMm) &&
        Objects.equals(this.cardExpiryYy, cryptogramEntity.cardExpiryYy) &&
        Objects.equals(this.cryptogram, cryptogramEntity.cryptogram) &&
        Objects.equals(this.cardDisplay, cryptogramEntity.cardDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrumentId, tokenRequestorId, cardNumber, cardExpiryMm, cardExpiryYy, cryptogram, cardDisplay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptogramEntity {\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
    sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    cardDisplay: ").append(toIndentedString(cardDisplay)).append("\n");
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
    openapiFields.add("instrument_id");
    openapiFields.add("token_requestor_id");
    openapiFields.add("card_number");
    openapiFields.add("card_expiry_mm");
    openapiFields.add("card_expiry_yy");
    openapiFields.add("cryptogram");
    openapiFields.add("card_display");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CryptogramEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("instrument_id") != null && !jsonObj.get("instrument_id").isJsonNull()) && !jsonObj.get("instrument_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_id").toString()));
      }
      if ((jsonObj.get("token_requestor_id") != null && !jsonObj.get("token_requestor_id").isJsonNull()) && !jsonObj.get("token_requestor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_requestor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_requestor_id").toString()));
      }
      if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull()) && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_expiry_mm") != null && !jsonObj.get("card_expiry_mm").isJsonNull()) && !jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if ((jsonObj.get("card_expiry_yy") != null && !jsonObj.get("card_expiry_yy").isJsonNull()) && !jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if ((jsonObj.get("cryptogram") != null && !jsonObj.get("cryptogram").isJsonNull()) && !jsonObj.get("cryptogram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptogram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cryptogram").toString()));
      }
      if ((jsonObj.get("card_display") != null && !jsonObj.get("card_display").isJsonNull()) && !jsonObj.get("card_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_display").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CryptogramEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CryptogramEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CryptogramEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CryptogramEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CryptogramEntity>() {
           @Override
           public void write(JsonWriter out, CryptogramEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CryptogramEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CryptogramEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CryptogramEntity
  * @throws IOException if the JSON string is invalid with respect to CryptogramEntity
  */
  public static CryptogramEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CryptogramEntity.class);
  }

 /**
  * Convert an instance of CryptogramEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


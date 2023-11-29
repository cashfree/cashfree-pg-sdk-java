/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * payment method card object in payment entity
 */
@Schema(description = "payment method card object in payment entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T13:37:25.496187Z[Etc/UTC]")
public class PaymentMethodCardInPaymentsEntity {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_NETWORK = "card_network";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK)
  private String cardNetwork;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CARD_COUNTRY = "card_country";
  @SerializedName(SERIALIZED_NAME_CARD_COUNTRY)
  private String cardCountry;

  public static final String SERIALIZED_NAME_CARD_BANK_NAME = "card_bank_name";
  @SerializedName(SERIALIZED_NAME_CARD_BANK_NAME)
  private String cardBankName;

  public static final String SERIALIZED_NAME_CARD_NETWORK_REFERENCE_ID = "card_network_reference_id";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK_REFERENCE_ID)
  private String cardNetworkReferenceId;

  public PaymentMethodCardInPaymentsEntity() {
  }

  public PaymentMethodCardInPaymentsEntity channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public PaymentMethodCardInPaymentsEntity cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public PaymentMethodCardInPaymentsEntity cardNetwork(String cardNetwork) {
    
    this.cardNetwork = cardNetwork;
    return this;
  }

   /**
   * Get cardNetwork
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardNetwork() {
    return cardNetwork;
  }


  public void setCardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public PaymentMethodCardInPaymentsEntity cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public PaymentMethodCardInPaymentsEntity cardCountry(String cardCountry) {
    
    this.cardCountry = cardCountry;
    return this;
  }

   /**
   * Get cardCountry
   * @return cardCountry
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardCountry() {
    return cardCountry;
  }


  public void setCardCountry(String cardCountry) {
    this.cardCountry = cardCountry;
  }


  public PaymentMethodCardInPaymentsEntity cardBankName(String cardBankName) {
    
    this.cardBankName = cardBankName;
    return this;
  }

   /**
   * Get cardBankName
   * @return cardBankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardBankName() {
    return cardBankName;
  }


  public void setCardBankName(String cardBankName) {
    this.cardBankName = cardBankName;
  }


  public PaymentMethodCardInPaymentsEntity cardNetworkReferenceId(String cardNetworkReferenceId) {
    
    this.cardNetworkReferenceId = cardNetworkReferenceId;
    return this;
  }

   /**
   * Get cardNetworkReferenceId
   * @return cardNetworkReferenceId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCardNetworkReferenceId() {
    return cardNetworkReferenceId;
  }


  public void setCardNetworkReferenceId(String cardNetworkReferenceId) {
    this.cardNetworkReferenceId = cardNetworkReferenceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCardInPaymentsEntity paymentMethodCardInPaymentsEntity = (PaymentMethodCardInPaymentsEntity) o;
    return Objects.equals(this.channel, paymentMethodCardInPaymentsEntity.channel) &&
        Objects.equals(this.cardNumber, paymentMethodCardInPaymentsEntity.cardNumber) &&
        Objects.equals(this.cardNetwork, paymentMethodCardInPaymentsEntity.cardNetwork) &&
        Objects.equals(this.cardType, paymentMethodCardInPaymentsEntity.cardType) &&
        Objects.equals(this.cardCountry, paymentMethodCardInPaymentsEntity.cardCountry) &&
        Objects.equals(this.cardBankName, paymentMethodCardInPaymentsEntity.cardBankName) &&
        Objects.equals(this.cardNetworkReferenceId, paymentMethodCardInPaymentsEntity.cardNetworkReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, cardNumber, cardNetwork, cardType, cardCountry, cardBankName, cardNetworkReferenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCardInPaymentsEntity {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardCountry: ").append(toIndentedString(cardCountry)).append("\n");
    sb.append("    cardBankName: ").append(toIndentedString(cardBankName)).append("\n");
    sb.append("    cardNetworkReferenceId: ").append(toIndentedString(cardNetworkReferenceId)).append("\n");
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
    openapiFields.add("channel");
    openapiFields.add("card_number");
    openapiFields.add("card_network");
    openapiFields.add("card_type");
    openapiFields.add("card_country");
    openapiFields.add("card_bank_name");
    openapiFields.add("card_network_reference_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodCardInPaymentsEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull()) && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_network") != null && !jsonObj.get("card_network").isJsonNull()) && !jsonObj.get("card_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("card_country") != null && !jsonObj.get("card_country").isJsonNull()) && !jsonObj.get("card_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_country").toString()));
      }
      if ((jsonObj.get("card_bank_name") != null && !jsonObj.get("card_bank_name").isJsonNull()) && !jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
      if ((jsonObj.get("card_network_reference_id") != null && !jsonObj.get("card_network_reference_id").isJsonNull()) && !jsonObj.get("card_network_reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network_reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network_reference_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodCardInPaymentsEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodCardInPaymentsEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodCardInPaymentsEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardInPaymentsEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodCardInPaymentsEntity>() {
           @Override
           public void write(JsonWriter out, PaymentMethodCardInPaymentsEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodCardInPaymentsEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodCardInPaymentsEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodCardInPaymentsEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodCardInPaymentsEntity
  */
  public static PaymentMethodCardInPaymentsEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodCardInPaymentsEntity.class);
  }

 /**
  * Convert an instance of PaymentMethodCardInPaymentsEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


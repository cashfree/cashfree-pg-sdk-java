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
 * payment method card.
 */
@Schema(description = "payment method card.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class CreateSubscriptionPaymentRequestCard {
  public static final String SERIALIZED_NAME_CARD_CVV = "card_cvv";
  @SerializedName(SERIALIZED_NAME_CARD_CVV)
  private String cardCvv;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_MM = "card_expiry_mm";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MM)
  private String cardExpiryMm;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_YY = "card_expiry_yy";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YY)
  private String cardExpiryYy;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "card_holder_name";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CARD_NETWORK = "card_network";
  @SerializedName(SERIALIZED_NAME_CARD_NETWORK)
  private String cardNetwork;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public CreateSubscriptionPaymentRequestCard() {
  }

  public CreateSubscriptionPaymentRequestCard cardCvv(String cardCvv) {
    
    this.cardCvv = cardCvv;
    return this;
  }

   /**
   * Card CVV
   * @return cardCvv
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card CVV")
  public String getCardCvv() {
    return cardCvv;
  }


  public void setCardCvv(String cardCvv) {
    this.cardCvv = cardCvv;
  }


  public CreateSubscriptionPaymentRequestCard cardExpiryMm(String cardExpiryMm) {
    
    this.cardExpiryMm = cardExpiryMm;
    return this;
  }

   /**
   * Card expiry month
   * @return cardExpiryMm
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card expiry month")
  public String getCardExpiryMm() {
    return cardExpiryMm;
  }


  public void setCardExpiryMm(String cardExpiryMm) {
    this.cardExpiryMm = cardExpiryMm;
  }


  public CreateSubscriptionPaymentRequestCard cardExpiryYy(String cardExpiryYy) {
    
    this.cardExpiryYy = cardExpiryYy;
    return this;
  }

   /**
   * Card expiry year
   * @return cardExpiryYy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card expiry year")
  public String getCardExpiryYy() {
    return cardExpiryYy;
  }


  public void setCardExpiryYy(String cardExpiryYy) {
    this.cardExpiryYy = cardExpiryYy;
  }


  public CreateSubscriptionPaymentRequestCard cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Card holder name
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card holder name")
  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public CreateSubscriptionPaymentRequestCard cardNetwork(String cardNetwork) {
    
    this.cardNetwork = cardNetwork;
    return this;
  }

   /**
   * Card network
   * @return cardNetwork
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card network")
  public String getCardNetwork() {
    return cardNetwork;
  }


  public void setCardNetwork(String cardNetwork) {
    this.cardNetwork = cardNetwork;
  }


  public CreateSubscriptionPaymentRequestCard cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card number
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card number")
  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CreateSubscriptionPaymentRequestCard cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * Card type
   * @return cardType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card type")
  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public CreateSubscriptionPaymentRequestCard channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel. can be link
   * @return channel
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Channel. can be link")
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionPaymentRequestCard createSubscriptionPaymentRequestCard = (CreateSubscriptionPaymentRequestCard) o;
    return Objects.equals(this.cardCvv, createSubscriptionPaymentRequestCard.cardCvv) &&
        Objects.equals(this.cardExpiryMm, createSubscriptionPaymentRequestCard.cardExpiryMm) &&
        Objects.equals(this.cardExpiryYy, createSubscriptionPaymentRequestCard.cardExpiryYy) &&
        Objects.equals(this.cardHolderName, createSubscriptionPaymentRequestCard.cardHolderName) &&
        Objects.equals(this.cardNetwork, createSubscriptionPaymentRequestCard.cardNetwork) &&
        Objects.equals(this.cardNumber, createSubscriptionPaymentRequestCard.cardNumber) &&
        Objects.equals(this.cardType, createSubscriptionPaymentRequestCard.cardType) &&
        Objects.equals(this.channel, createSubscriptionPaymentRequestCard.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardCvv, cardExpiryMm, cardExpiryYy, cardHolderName, cardNetwork, cardNumber, cardType, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionPaymentRequestCard {\n");
    sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
    sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
    sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardNetwork: ").append(toIndentedString(cardNetwork)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("card_cvv");
    openapiFields.add("card_expiry_mm");
    openapiFields.add("card_expiry_yy");
    openapiFields.add("card_holder_name");
    openapiFields.add("card_network");
    openapiFields.add("card_number");
    openapiFields.add("card_type");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequestCard
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_cvv") != null && !jsonObj.get("card_cvv").isJsonNull()) && !jsonObj.get("card_cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cvv").toString()));
      }
      if ((jsonObj.get("card_expiry_mm") != null && !jsonObj.get("card_expiry_mm").isJsonNull()) && !jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if ((jsonObj.get("card_expiry_yy") != null && !jsonObj.get("card_expiry_yy").isJsonNull()) && !jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if ((jsonObj.get("card_holder_name") != null && !jsonObj.get("card_holder_name").isJsonNull()) && !jsonObj.get("card_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_holder_name").toString()));
      }
      if ((jsonObj.get("card_network") != null && !jsonObj.get("card_network").isJsonNull()) && !jsonObj.get("card_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network").toString()));
      }
      if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull()) && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequestCard
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("card_cvv") != null && !jsonObj.get("card_cvv").isJsonNull()) && !jsonObj.get("card_cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cvv").toString()));
      }
      if ((jsonObj.get("card_expiry_mm") != null && !jsonObj.get("card_expiry_mm").isJsonNull()) && !jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if ((jsonObj.get("card_expiry_yy") != null && !jsonObj.get("card_expiry_yy").isJsonNull()) && !jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if ((jsonObj.get("card_holder_name") != null && !jsonObj.get("card_holder_name").isJsonNull()) && !jsonObj.get("card_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_holder_name").toString()));
      }
      if ((jsonObj.get("card_network") != null && !jsonObj.get("card_network").isJsonNull()) && !jsonObj.get("card_network").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_network` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_network").toString()));
      }
      if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull()) && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonNull()) && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionPaymentRequestCard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionPaymentRequestCard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionPaymentRequestCard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequestCard.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPaymentRequestCard>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionPaymentRequestCard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionPaymentRequestCard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionPaymentRequestCard given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPaymentRequestCard
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPaymentRequestCard
  */
  public static CreateSubscriptionPaymentRequestCard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPaymentRequestCard.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPaymentRequestCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


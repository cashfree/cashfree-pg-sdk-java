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
 * Payment method for card emi
 */
@Schema(description = "Payment method for card emi")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-17T14:57:47.426649Z[Etc/UTC]")
public class CardEMI {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_CARD_NUMBER = "card_number";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "card_holder_name";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private String cardHolderName;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_MM = "card_expiry_mm";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MM)
  private String cardExpiryMm;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_YY = "card_expiry_yy";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YY)
  private String cardExpiryYy;

  public static final String SERIALIZED_NAME_CARD_CVV = "card_cvv";
  @SerializedName(SERIALIZED_NAME_CARD_CVV)
  private String cardCvv;

  public static final String SERIALIZED_NAME_CARD_ALIAS = "card_alias";
  @SerializedName(SERIALIZED_NAME_CARD_ALIAS)
  private String cardAlias;

  /**
   * Card bank name, required for EMI payments. This is the bank user has selected for EMI. One of [\&quot;hdfc, \&quot;kotak\&quot;, \&quot;icici\&quot;, \&quot;rbl\&quot;, \&quot;bob\&quot;, \&quot;standard chartered\&quot;, \&quot;axis\&quot;, \&quot;au\&quot;, \&quot;yes\&quot;, \&quot;sbi\&quot;, \&quot;fed\&quot;, \&quot;hsbc\&quot;, \&quot;citi\&quot;, \&quot;amex\&quot;]
   */
  @JsonAdapter(CardBankNameEnum.Adapter.class)
  public enum CardBankNameEnum {
    HDFC("hdfc"),
    
    KOTAK("kotak"),
    
    ICICI("icici"),
    
    RBL("rbl"),
    
    BOB("bob"),
    
    STANDARD_CHARTERED("standard chartered"),
    
    AXIS("axis"),
    
    AU("au"),
    
    YES("yes"),
    
    SBI("sbi"),
    
    FED("fed"),
    
    HSBC("hsbc"),
    
    CITI("citi"),
    
    AMEX("amex"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    CardBankNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardBankNameEnum fromValue(String value) {
      for (CardBankNameEnum b : CardBankNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<CardBankNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardBankNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardBankNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardBankNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_BANK_NAME = "card_bank_name";
  @SerializedName(SERIALIZED_NAME_CARD_BANK_NAME)
  private CardBankNameEnum cardBankName;

  public static final String SERIALIZED_NAME_EMI_TENURE = "emi_tenure";
  @SerializedName(SERIALIZED_NAME_EMI_TENURE)
  private Integer emiTenure;

  public CardEMI() {
  }

  public CardEMI channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel for card payments will always be \&quot;link\&quot;
   * @return channel
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The channel for card payments will always be \"link\"")
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public CardEMI cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Customer card number.
   * @return cardNumber
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Customer card number.")
  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public CardEMI cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Customer name mentioned on the card.
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer name mentioned on the card.")
  public String getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public CardEMI cardExpiryMm(String cardExpiryMm) {
    
    this.cardExpiryMm = cardExpiryMm;
    return this;
  }

   /**
   * Card expiry month.
   * @return cardExpiryMm
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Card expiry month.")
  public String getCardExpiryMm() {
    return cardExpiryMm;
  }


  public void setCardExpiryMm(String cardExpiryMm) {
    this.cardExpiryMm = cardExpiryMm;
  }


  public CardEMI cardExpiryYy(String cardExpiryYy) {
    
    this.cardExpiryYy = cardExpiryYy;
    return this;
  }

   /**
   * Card expiry year.
   * @return cardExpiryYy
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Card expiry year.")
  public String getCardExpiryYy() {
    return cardExpiryYy;
  }


  public void setCardExpiryYy(String cardExpiryYy) {
    this.cardExpiryYy = cardExpiryYy;
  }


  public CardEMI cardCvv(String cardCvv) {
    
    this.cardCvv = cardCvv;
    return this;
  }

   /**
   * CVV mentioned on the card.
   * @return cardCvv
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "CVV mentioned on the card.")
  public String getCardCvv() {
    return cardCvv;
  }


  public void setCardCvv(String cardCvv) {
    this.cardCvv = cardCvv;
  }


  public CardEMI cardAlias(String cardAlias) {
    
    this.cardAlias = cardAlias;
    return this;
  }

   /**
   * Card alias as returned by Cashfree Vault API
   * @return cardAlias
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card alias as returned by Cashfree Vault API")
  public String getCardAlias() {
    return cardAlias;
  }


  public void setCardAlias(String cardAlias) {
    this.cardAlias = cardAlias;
  }


  public CardEMI cardBankName(CardBankNameEnum cardBankName) {
    
    this.cardBankName = cardBankName;
    return this;
  }

   /**
   * Card bank name, required for EMI payments. This is the bank user has selected for EMI. One of [\&quot;hdfc, \&quot;kotak\&quot;, \&quot;icici\&quot;, \&quot;rbl\&quot;, \&quot;bob\&quot;, \&quot;standard chartered\&quot;, \&quot;axis\&quot;, \&quot;au\&quot;, \&quot;yes\&quot;, \&quot;sbi\&quot;, \&quot;fed\&quot;, \&quot;hsbc\&quot;, \&quot;citi\&quot;, \&quot;amex\&quot;]
   * @return cardBankName
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Card bank name, required for EMI payments. This is the bank user has selected for EMI. One of [\"hdfc, \"kotak\", \"icici\", \"rbl\", \"bob\", \"standard chartered\", \"axis\", \"au\", \"yes\", \"sbi\", \"fed\", \"hsbc\", \"citi\", \"amex\"]")
  public CardBankNameEnum getCardBankName() {
    return cardBankName;
  }


  public void setCardBankName(CardBankNameEnum cardBankName) {
    this.cardBankName = cardBankName;
  }


  public CardEMI emiTenure(Integer emiTenure) {
    
    this.emiTenure = emiTenure;
    return this;
  }

   /**
   * EMI tenure selected by the user
   * @return emiTenure
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "EMI tenure selected by the user")
  public Integer getEmiTenure() {
    return emiTenure;
  }


  public void setEmiTenure(Integer emiTenure) {
    this.emiTenure = emiTenure;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardEMI cardEMI = (CardEMI) o;
    return Objects.equals(this.channel, cardEMI.channel) &&
        Objects.equals(this.cardNumber, cardEMI.cardNumber) &&
        Objects.equals(this.cardHolderName, cardEMI.cardHolderName) &&
        Objects.equals(this.cardExpiryMm, cardEMI.cardExpiryMm) &&
        Objects.equals(this.cardExpiryYy, cardEMI.cardExpiryYy) &&
        Objects.equals(this.cardCvv, cardEMI.cardCvv) &&
        Objects.equals(this.cardAlias, cardEMI.cardAlias) &&
        Objects.equals(this.cardBankName, cardEMI.cardBankName) &&
        Objects.equals(this.emiTenure, cardEMI.emiTenure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, cardNumber, cardHolderName, cardExpiryMm, cardExpiryYy, cardCvv, cardAlias, cardBankName, emiTenure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardEMI {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
    sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
    sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
    sb.append("    cardAlias: ").append(toIndentedString(cardAlias)).append("\n");
    sb.append("    cardBankName: ").append(toIndentedString(cardBankName)).append("\n");
    sb.append("    emiTenure: ").append(toIndentedString(emiTenure)).append("\n");
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
    openapiFields.add("card_holder_name");
    openapiFields.add("card_expiry_mm");
    openapiFields.add("card_expiry_yy");
    openapiFields.add("card_cvv");
    openapiFields.add("card_alias");
    openapiFields.add("card_bank_name");
    openapiFields.add("emi_tenure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
    openapiRequiredFields.add("card_number");
    openapiRequiredFields.add("card_expiry_mm");
    openapiRequiredFields.add("card_expiry_yy");
    openapiRequiredFields.add("card_cvv");
    openapiRequiredFields.add("card_bank_name");
    openapiRequiredFields.add("emi_tenure");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardEMI
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardEMI.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (!jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_holder_name") != null && !jsonObj.get("card_holder_name").isJsonNull()) && !jsonObj.get("card_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_holder_name").toString()));
      }
      if (!jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if (!jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if (!jsonObj.get("card_cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cvv").toString()));
      }
      if ((jsonObj.get("card_alias") != null && !jsonObj.get("card_alias").isJsonNull()) && !jsonObj.get("card_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_alias").toString()));
      }
      if (!jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardEMI
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardEMI.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if (!jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_holder_name") != null && !jsonObj.get("card_holder_name").isJsonNull()) && !jsonObj.get("card_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_holder_name").toString()));
      }
      if (!jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if (!jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if (!jsonObj.get("card_cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cvv").toString()));
      }
      if ((jsonObj.get("card_alias") != null && !jsonObj.get("card_alias").isJsonNull()) && !jsonObj.get("card_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_alias").toString()));
      }
      if (!jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardEMI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardEMI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardEMI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardEMI.class));

       return (TypeAdapter<T>) new TypeAdapter<CardEMI>() {
           @Override
           public void write(JsonWriter out, CardEMI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardEMI read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardEMI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardEMI
  * @throws IOException if the JSON string is invalid with respect to CardEMI
  */
  public static CardEMI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardEMI.class);
  }

 /**
  * Convert an instance of CardEMI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


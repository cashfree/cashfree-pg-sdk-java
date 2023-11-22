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
 * Card Payment method
 */
@Schema(description = "Card Payment method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:33:20.355612Z[Etc/UTC]")
public class Card {
  /**
   * The channel for card payments can be \&quot;link\&quot; or \&quot;post\&quot;. Post is used for seamless OTP payments where merchant captures OTP on their own page.
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    LINK("link"),
    
    POST("post"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

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

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrument_id";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  public static final String SERIALIZED_NAME_CRYPTOGRAM = "cryptogram";
  @SerializedName(SERIALIZED_NAME_CRYPTOGRAM)
  private String cryptogram;

  public static final String SERIALIZED_NAME_TOKEN_REQUESTOR_ID = "token_requestor_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_REQUESTOR_ID)
  private String tokenRequestorId;

  /**
   * Gets or Sets tokenType
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
  public enum TokenTypeEnum {
    ISSUER_TOKEN("ISSUER_TOKEN"),
    
    NETWORK_GC_TOKEN("NETWORK_GC_TOKEN"),
    
    ISSUER_GC_TOKEN("ISSUER_GC_TOKEN"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private TokenTypeEnum tokenType;

  public static final String SERIALIZED_NAME_CARD_DISPLAY = "card_display";
  @SerializedName(SERIALIZED_NAME_CARD_DISPLAY)
  private String cardDisplay;

  public static final String SERIALIZED_NAME_CARD_ALIAS = "card_alias";
  @SerializedName(SERIALIZED_NAME_CARD_ALIAS)
  private String cardAlias;

  /**
   * One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the bank user has selected for EMI
   */
  @JsonAdapter(CardBankNameEnum.Adapter.class)
  public enum CardBankNameEnum {
    KOTAK("Kotak"),
    
    ICICI("ICICI"),
    
    RBL("RBL"),
    
    BOB("BOB"),
    
    STANDARD_CHARTERED("Standard Chartered"),
    
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

  public Card() {
  }

  public Card channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The channel for card payments can be \&quot;link\&quot; or \&quot;post\&quot;. Post is used for seamless OTP payments where merchant captures OTP on their own page.
   * @return channel
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The channel for card payments can be \"link\" or \"post\". Post is used for seamless OTP payments where merchant captures OTP on their own page.")
  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public Card cardNumber(String cardNumber) {
    
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Customer card number for plain card transactions. Token pan number for tokenized card transactions.
   * @return cardNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Customer card number for plain card transactions. Token pan number for tokenized card transactions.")
  public String getCardNumber() {
    return cardNumber;
  }


  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  public Card cardHolderName(String cardHolderName) {
    
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


  public Card cardExpiryMm(String cardExpiryMm) {
    
    this.cardExpiryMm = cardExpiryMm;
    return this;
  }

   /**
   * Card expiry month for plain card transactions. Token expiry month for tokenized card transactions.
   * @return cardExpiryMm
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card expiry month for plain card transactions. Token expiry month for tokenized card transactions.")
  public String getCardExpiryMm() {
    return cardExpiryMm;
  }


  public void setCardExpiryMm(String cardExpiryMm) {
    this.cardExpiryMm = cardExpiryMm;
  }


  public Card cardExpiryYy(String cardExpiryYy) {
    
    this.cardExpiryYy = cardExpiryYy;
    return this;
  }

   /**
   * Card expiry year for plain card transactions. Token expiry year for tokenized card transactions.
   * @return cardExpiryYy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card expiry year for plain card transactions. Token expiry year for tokenized card transactions.")
  public String getCardExpiryYy() {
    return cardExpiryYy;
  }


  public void setCardExpiryYy(String cardExpiryYy) {
    this.cardExpiryYy = cardExpiryYy;
  }


  public Card cardCvv(String cardCvv) {
    
    this.cardCvv = cardCvv;
    return this;
  }

   /**
   * CVV mentioned on the card.
   * @return cardCvv
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "CVV mentioned on the card.")
  public String getCardCvv() {
    return cardCvv;
  }


  public void setCardCvv(String cardCvv) {
    this.cardCvv = cardCvv;
  }


  public Card instrumentId(String instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * instrument id of saved card. Required only to make payment using saved instrument.
   * @return instrumentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "instrument id of saved card. Required only to make payment using saved instrument.")
  public String getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public Card cryptogram(String cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * cryptogram received from card network. Required only for tokenized card transactions.
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "cryptogram received from card network. Required only for tokenized card transactions.")
  public String getCryptogram() {
    return cryptogram;
  }


  public void setCryptogram(String cryptogram) {
    this.cryptogram = cryptogram;
  }


  public Card tokenRequestorId(String tokenRequestorId) {
    
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * TRID issued by card networks. Required only for tokenized card transactions.
   * @return tokenRequestorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "TRID issued by card networks. Required only for tokenized card transactions.")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }


  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }


  public Card tokenType(TokenTypeEnum tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  public Card cardDisplay(String cardDisplay) {
    
    this.cardDisplay = cardDisplay;
    return this;
  }

   /**
   * last 4 digits of original card number. Required only for tokenized card transactions.
   * @return cardDisplay
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "last 4 digits of original card number. Required only for tokenized card transactions.")
  public String getCardDisplay() {
    return cardDisplay;
  }


  public void setCardDisplay(String cardDisplay) {
    this.cardDisplay = cardDisplay;
  }


  public Card cardAlias(String cardAlias) {
    
    this.cardAlias = cardAlias;
    return this;
  }

   /**
   * Card alias as returned by Cashfree Vault API.
   * @return cardAlias
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Card alias as returned by Cashfree Vault API.")
  public String getCardAlias() {
    return cardAlias;
  }


  public void setCardAlias(String cardAlias) {
    this.cardAlias = cardAlias;
  }


  public Card cardBankName(CardBankNameEnum cardBankName) {
    
    this.cardBankName = cardBankName;
    return this;
  }

   /**
   * One of [\&quot;Kotak\&quot;, \&quot;ICICI\&quot;, \&quot;RBL\&quot;, \&quot;BOB\&quot;, \&quot;Standard Chartered\&quot;]. Card bank name, required for EMI payments. This is the bank user has selected for EMI
   * @return cardBankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "One of [\"Kotak\", \"ICICI\", \"RBL\", \"BOB\", \"Standard Chartered\"]. Card bank name, required for EMI payments. This is the bank user has selected for EMI")
  public CardBankNameEnum getCardBankName() {
    return cardBankName;
  }


  public void setCardBankName(CardBankNameEnum cardBankName) {
    this.cardBankName = cardBankName;
  }


  public Card emiTenure(Integer emiTenure) {
    
    this.emiTenure = emiTenure;
    return this;
  }

   /**
   * EMI tenure selected by the user
   * @return emiTenure
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "EMI tenure selected by the user")
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
    Card card = (Card) o;
    return Objects.equals(this.channel, card.channel) &&
        Objects.equals(this.cardNumber, card.cardNumber) &&
        Objects.equals(this.cardHolderName, card.cardHolderName) &&
        Objects.equals(this.cardExpiryMm, card.cardExpiryMm) &&
        Objects.equals(this.cardExpiryYy, card.cardExpiryYy) &&
        Objects.equals(this.cardCvv, card.cardCvv) &&
        Objects.equals(this.instrumentId, card.instrumentId) &&
        Objects.equals(this.cryptogram, card.cryptogram) &&
        Objects.equals(this.tokenRequestorId, card.tokenRequestorId) &&
        Objects.equals(this.tokenType, card.tokenType) &&
        Objects.equals(this.cardDisplay, card.cardDisplay) &&
        Objects.equals(this.cardAlias, card.cardAlias) &&
        Objects.equals(this.cardBankName, card.cardBankName) &&
        Objects.equals(this.emiTenure, card.emiTenure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, cardNumber, cardHolderName, cardExpiryMm, cardExpiryYy, cardCvv, instrumentId, cryptogram, tokenRequestorId, tokenType, cardDisplay, cardAlias, cardBankName, emiTenure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardExpiryMm: ").append(toIndentedString(cardExpiryMm)).append("\n");
    sb.append("    cardExpiryYy: ").append(toIndentedString(cardExpiryYy)).append("\n");
    sb.append("    cardCvv: ").append(toIndentedString(cardCvv)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    cardDisplay: ").append(toIndentedString(cardDisplay)).append("\n");
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
    openapiFields.add("instrument_id");
    openapiFields.add("cryptogram");
    openapiFields.add("token_requestor_id");
    openapiFields.add("token_type");
    openapiFields.add("card_display");
    openapiFields.add("card_alias");
    openapiFields.add("card_bank_name");
    openapiFields.add("emi_tenure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("channel");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Card
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Card.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("card_number") != null && !jsonObj.get("card_number").isJsonNull()) && !jsonObj.get("card_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_number").toString()));
      }
      if ((jsonObj.get("card_holder_name") != null && !jsonObj.get("card_holder_name").isJsonNull()) && !jsonObj.get("card_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_holder_name").toString()));
      }
      if ((jsonObj.get("card_expiry_mm") != null && !jsonObj.get("card_expiry_mm").isJsonNull()) && !jsonObj.get("card_expiry_mm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_mm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_mm").toString()));
      }
      if ((jsonObj.get("card_expiry_yy") != null && !jsonObj.get("card_expiry_yy").isJsonNull()) && !jsonObj.get("card_expiry_yy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_expiry_yy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_expiry_yy").toString()));
      }
      if ((jsonObj.get("card_cvv") != null && !jsonObj.get("card_cvv").isJsonNull()) && !jsonObj.get("card_cvv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_cvv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_cvv").toString()));
      }
      if ((jsonObj.get("instrument_id") != null && !jsonObj.get("instrument_id").isJsonNull()) && !jsonObj.get("instrument_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_id").toString()));
      }
      if ((jsonObj.get("cryptogram") != null && !jsonObj.get("cryptogram").isJsonNull()) && !jsonObj.get("cryptogram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cryptogram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cryptogram").toString()));
      }
      if ((jsonObj.get("token_requestor_id") != null && !jsonObj.get("token_requestor_id").isJsonNull()) && !jsonObj.get("token_requestor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_requestor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_requestor_id").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if ((jsonObj.get("card_display") != null && !jsonObj.get("card_display").isJsonNull()) && !jsonObj.get("card_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_display").toString()));
      }
      if ((jsonObj.get("card_alias") != null && !jsonObj.get("card_alias").isJsonNull()) && !jsonObj.get("card_alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_alias").toString()));
      }
      if ((jsonObj.get("card_bank_name") != null && !jsonObj.get("card_bank_name").isJsonNull()) && !jsonObj.get("card_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Card.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Card' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Card> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Card.class));

       return (TypeAdapter<T>) new TypeAdapter<Card>() {
           @Override
           public void write(JsonWriter out, Card value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Card read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Card given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Card
  * @throws IOException if the JSON string is invalid with respect to Card
  */
  public static Card fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Card.class);
  }

 /**
  * Convert an instance of Card to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


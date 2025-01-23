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
 * payment method enach.
 */
@Schema(description = "payment method enach.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:50:37.026342Z[Etc/UTC]")
public class CreateSubscriptionPaymentRequestEnack {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_AUTH_MODE = "auth_mode";
  @SerializedName(SERIALIZED_NAME_AUTH_MODE)
  private String authMode;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_NAME = "account_holder_name";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_NAME)
  private String accountHolderName;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_BANK_CODE = "account_bank_code";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BANK_CODE)
  private String accountBankCode;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_IFSC = "account_ifsc";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IFSC)
  private String accountIfsc;

  public CreateSubscriptionPaymentRequestEnack() {
  }

  public CreateSubscriptionPaymentRequestEnack channel(String channel) {
    
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


  public CreateSubscriptionPaymentRequestEnack authMode(String authMode) {
    
    this.authMode = authMode;
    return this;
  }

   /**
   * Authentication mode. can be debit_card, aadhaar, or net_banking
   * @return authMode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Authentication mode. can be debit_card, aadhaar, or net_banking")
  public String getAuthMode() {
    return authMode;
  }


  public void setAuthMode(String authMode) {
    this.authMode = authMode;
  }


  public CreateSubscriptionPaymentRequestEnack accountHolderName(String accountHolderName) {
    
    this.accountHolderName = accountHolderName;
    return this;
  }

   /**
   * Account holder name
   * @return accountHolderName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account holder name")
  public String getAccountHolderName() {
    return accountHolderName;
  }


  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }


  public CreateSubscriptionPaymentRequestEnack accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account number
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account number")
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CreateSubscriptionPaymentRequestEnack accountBankCode(String accountBankCode) {
    
    this.accountBankCode = accountBankCode;
    return this;
  }

   /**
   * Account bank code (required without AccountIFSC)
   * @return accountBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account bank code (required without AccountIFSC)")
  public String getAccountBankCode() {
    return accountBankCode;
  }


  public void setAccountBankCode(String accountBankCode) {
    this.accountBankCode = accountBankCode;
  }


  public CreateSubscriptionPaymentRequestEnack accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Account type
   * @return accountType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account type")
  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public CreateSubscriptionPaymentRequestEnack accountIfsc(String accountIfsc) {
    
    this.accountIfsc = accountIfsc;
    return this;
  }

   /**
   * Account IFSC
   * @return accountIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account IFSC")
  public String getAccountIfsc() {
    return accountIfsc;
  }


  public void setAccountIfsc(String accountIfsc) {
    this.accountIfsc = accountIfsc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionPaymentRequestEnack createSubscriptionPaymentRequestEnack = (CreateSubscriptionPaymentRequestEnack) o;
    return Objects.equals(this.channel, createSubscriptionPaymentRequestEnack.channel) &&
        Objects.equals(this.authMode, createSubscriptionPaymentRequestEnack.authMode) &&
        Objects.equals(this.accountHolderName, createSubscriptionPaymentRequestEnack.accountHolderName) &&
        Objects.equals(this.accountNumber, createSubscriptionPaymentRequestEnack.accountNumber) &&
        Objects.equals(this.accountBankCode, createSubscriptionPaymentRequestEnack.accountBankCode) &&
        Objects.equals(this.accountType, createSubscriptionPaymentRequestEnack.accountType) &&
        Objects.equals(this.accountIfsc, createSubscriptionPaymentRequestEnack.accountIfsc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, authMode, accountHolderName, accountNumber, accountBankCode, accountType, accountIfsc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionPaymentRequestEnack {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    authMode: ").append(toIndentedString(authMode)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountBankCode: ").append(toIndentedString(accountBankCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountIfsc: ").append(toIndentedString(accountIfsc)).append("\n");
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
    openapiFields.add("auth_mode");
    openapiFields.add("account_holder_name");
    openapiFields.add("account_number");
    openapiFields.add("account_bank_code");
    openapiFields.add("account_type");
    openapiFields.add("account_ifsc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequestEnack
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("auth_mode") != null && !jsonObj.get("auth_mode").isJsonNull()) && !jsonObj.get("auth_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_mode").toString()));
      }
      if ((jsonObj.get("account_holder_name") != null && !jsonObj.get("account_holder_name").isJsonNull()) && !jsonObj.get("account_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder_name").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("account_bank_code") != null && !jsonObj.get("account_bank_code").isJsonNull()) && !jsonObj.get("account_bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_bank_code").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("account_ifsc") != null && !jsonObj.get("account_ifsc").isJsonNull()) && !jsonObj.get("account_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_ifsc").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequestEnack
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("auth_mode") != null && !jsonObj.get("auth_mode").isJsonNull()) && !jsonObj.get("auth_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_mode").toString()));
      }
      if ((jsonObj.get("account_holder_name") != null && !jsonObj.get("account_holder_name").isJsonNull()) && !jsonObj.get("account_holder_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder_name").toString()));
      }
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("account_bank_code") != null && !jsonObj.get("account_bank_code").isJsonNull()) && !jsonObj.get("account_bank_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_bank_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_bank_code").toString()));
      }
      if ((jsonObj.get("account_type") != null && !jsonObj.get("account_type").isJsonNull()) && !jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      if ((jsonObj.get("account_ifsc") != null && !jsonObj.get("account_ifsc").isJsonNull()) && !jsonObj.get("account_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_ifsc").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionPaymentRequestEnack.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionPaymentRequestEnack' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionPaymentRequestEnack> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequestEnack.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPaymentRequestEnack>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionPaymentRequestEnack value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionPaymentRequestEnack read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionPaymentRequestEnack given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPaymentRequestEnack
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPaymentRequestEnack
  */
  public static CreateSubscriptionPaymentRequestEnack fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPaymentRequestEnack.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPaymentRequestEnack to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


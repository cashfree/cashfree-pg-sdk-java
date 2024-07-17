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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Bank details object
 */
@Schema(description = "Bank details object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:49:56.545492Z[Etc/UTC]")
public class SubscriptionBankDetails {
  public static final String SERIALIZED_NAME_BANK_ID = "bank_id";
  @SerializedName(SERIALIZED_NAME_BANK_ID)
  private String bankId;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ACCOUNT_AUTH_MODES = "account_auth_modes";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_AUTH_MODES)
  private List<String> accountAuthModes;

  public SubscriptionBankDetails() {
  }

  public SubscriptionBankDetails bankId(String bankId) {
    
    this.bankId = bankId;
    return this;
  }

   /**
   * ID of the bank.
   * @return bankId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "ID of the bank.")
  public String getBankId() {
    return bankId;
  }


  public void setBankId(String bankId) {
    this.bankId = bankId;
  }


  public SubscriptionBankDetails bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * Name of the bank.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the bank.")
  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public SubscriptionBankDetails accountAuthModes(List<String> accountAuthModes) {
    
    this.accountAuthModes = accountAuthModes;
    return this;
  }

  public SubscriptionBankDetails addAccountAuthModesItem(String accountAuthModesItem) {
    if (this.accountAuthModes == null) {
      this.accountAuthModes = new ArrayList<>();
    }
    this.accountAuthModes.add(accountAuthModesItem);
    return this;
  }

   /**
   * List of account authentication modes supported by the bank. (e.g. DEBIT_CARD, NET_BANKING, AADHAAR)
   * @return accountAuthModes
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of account authentication modes supported by the bank. (e.g. DEBIT_CARD, NET_BANKING, AADHAAR)")
  public List<String> getAccountAuthModes() {
    return accountAuthModes;
  }


  public void setAccountAuthModes(List<String> accountAuthModes) {
    this.accountAuthModes = accountAuthModes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionBankDetails subscriptionBankDetails = (SubscriptionBankDetails) o;
    return Objects.equals(this.bankId, subscriptionBankDetails.bankId) &&
        Objects.equals(this.bankName, subscriptionBankDetails.bankName) &&
        Objects.equals(this.accountAuthModes, subscriptionBankDetails.accountAuthModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, bankName, accountAuthModes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionBankDetails {\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    accountAuthModes: ").append(toIndentedString(accountAuthModes)).append("\n");
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
    openapiFields.add("bank_id");
    openapiFields.add("bank_name");
    openapiFields.add("account_auth_modes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionBankDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_id") != null && !jsonObj.get("bank_id").isJsonNull()) && !jsonObj.get("bank_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_id").toString()));
      }
      if ((jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull()) && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_auth_modes") != null && !jsonObj.get("account_auth_modes").isJsonNull() && !jsonObj.get("account_auth_modes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_auth_modes` to be an array in the JSON string but got `%s`", jsonObj.get("account_auth_modes").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionBankDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("bank_id") != null && !jsonObj.get("bank_id").isJsonNull()) && !jsonObj.get("bank_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_id").toString()));
      }
      if ((jsonObj.get("bank_name") != null && !jsonObj.get("bank_name").isJsonNull()) && !jsonObj.get("bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("account_auth_modes") != null && !jsonObj.get("account_auth_modes").isJsonNull() && !jsonObj.get("account_auth_modes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_auth_modes` to be an array in the JSON string but got `%s`", jsonObj.get("account_auth_modes").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionBankDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionBankDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionBankDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionBankDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionBankDetails>() {
           @Override
           public void write(JsonWriter out, SubscriptionBankDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionBankDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionBankDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionBankDetails
  * @throws IOException if the JSON string is invalid with respect to SubscriptionBankDetails
  */
  public static SubscriptionBankDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionBankDetails.class);
  }

 /**
  * Convert an instance of SubscriptionBankDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * BankDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class BankDetails {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER = "account_holder";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER)
  private String accountHolder;

  public static final String SERIALIZED_NAME_IFSC = "ifsc";
  @SerializedName(SERIALIZED_NAME_IFSC)
  private String ifsc;

  public BankDetails() {
  }

  public BankDetails accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public BankDetails accountHolder(String accountHolder) {
    
    this.accountHolder = accountHolder;
    return this;
  }

   /**
   * Get accountHolder
   * @return accountHolder
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAccountHolder() {
    return accountHolder;
  }


  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }


  public BankDetails ifsc(String ifsc) {
    
    this.ifsc = ifsc;
    return this;
  }

   /**
   * Get ifsc
   * @return ifsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getIfsc() {
    return ifsc;
  }


  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankDetails bankDetails = (BankDetails) o;
    return Objects.equals(this.accountNumber, bankDetails.accountNumber) &&
        Objects.equals(this.accountHolder, bankDetails.accountHolder) &&
        Objects.equals(this.ifsc, bankDetails.ifsc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountHolder, ifsc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankDetails {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    ifsc: ").append(toIndentedString(ifsc)).append("\n");
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
    openapiFields.add("account_number");
    openapiFields.add("account_holder");
    openapiFields.add("ifsc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BankDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("account_holder") != null && !jsonObj.get("account_holder").isJsonNull()) && !jsonObj.get("account_holder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BankDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("account_number") != null && !jsonObj.get("account_number").isJsonNull()) && !jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if ((jsonObj.get("account_holder") != null && !jsonObj.get("account_holder").isJsonNull()) && !jsonObj.get("account_holder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_holder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_holder").toString()));
      }
      if ((jsonObj.get("ifsc") != null && !jsonObj.get("ifsc").isJsonNull()) && !jsonObj.get("ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ifsc").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<BankDetails>() {
           @Override
           public void write(JsonWriter out, BankDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankDetails
  * @throws IOException if the JSON string is invalid with respect to BankDetails
  */
  public static BankDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankDetails.class);
  }

 /**
  * Convert an instance of BankDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


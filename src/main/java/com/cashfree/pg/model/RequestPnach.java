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
 * payment method pnach.
 */
@Schema(description = "payment method pnach.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T13:20:08.871845Z[Etc/UTC]")
public class RequestPnach {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

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

  public static final String SERIALIZED_NAME_MANDATE_CREATION_DATE = "mandate_creation_date";
  @SerializedName(SERIALIZED_NAME_MANDATE_CREATION_DATE)
  private String mandateCreationDate;

  public static final String SERIALIZED_NAME_MANDATE_START_DATE = "mandate_start_date";
  @SerializedName(SERIALIZED_NAME_MANDATE_START_DATE)
  private String mandateStartDate;

  public RequestPnach() {
  }

  public RequestPnach channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel. can be post
   * @return channel
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Channel. can be post")
  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public RequestPnach accountHolderName(String accountHolderName) {
    
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


  public RequestPnach accountNumber(String accountNumber) {
    
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


  public RequestPnach accountBankCode(String accountBankCode) {
    
    this.accountBankCode = accountBankCode;
    return this;
  }

   /**
   * Account bank code
   * @return accountBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Account bank code")
  public String getAccountBankCode() {
    return accountBankCode;
  }


  public void setAccountBankCode(String accountBankCode) {
    this.accountBankCode = accountBankCode;
  }


  public RequestPnach accountType(String accountType) {
    
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


  public RequestPnach accountIfsc(String accountIfsc) {
    
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


  public RequestPnach mandateCreationDate(String mandateCreationDate) {
    
    this.mandateCreationDate = mandateCreationDate;
    return this;
  }

   /**
   * Mandate creation date
   * @return mandateCreationDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Mandate creation date")
  public String getMandateCreationDate() {
    return mandateCreationDate;
  }


  public void setMandateCreationDate(String mandateCreationDate) {
    this.mandateCreationDate = mandateCreationDate;
  }


  public RequestPnach mandateStartDate(String mandateStartDate) {
    
    this.mandateStartDate = mandateStartDate;
    return this;
  }

   /**
   * Mandate start date
   * @return mandateStartDate
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Mandate start date")
  public String getMandateStartDate() {
    return mandateStartDate;
  }


  public void setMandateStartDate(String mandateStartDate) {
    this.mandateStartDate = mandateStartDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestPnach requestPnach = (RequestPnach) o;
    return Objects.equals(this.channel, requestPnach.channel) &&
        Objects.equals(this.accountHolderName, requestPnach.accountHolderName) &&
        Objects.equals(this.accountNumber, requestPnach.accountNumber) &&
        Objects.equals(this.accountBankCode, requestPnach.accountBankCode) &&
        Objects.equals(this.accountType, requestPnach.accountType) &&
        Objects.equals(this.accountIfsc, requestPnach.accountIfsc) &&
        Objects.equals(this.mandateCreationDate, requestPnach.mandateCreationDate) &&
        Objects.equals(this.mandateStartDate, requestPnach.mandateStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, accountHolderName, accountNumber, accountBankCode, accountType, accountIfsc, mandateCreationDate, mandateStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestPnach {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    accountHolderName: ").append(toIndentedString(accountHolderName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountBankCode: ").append(toIndentedString(accountBankCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountIfsc: ").append(toIndentedString(accountIfsc)).append("\n");
    sb.append("    mandateCreationDate: ").append(toIndentedString(mandateCreationDate)).append("\n");
    sb.append("    mandateStartDate: ").append(toIndentedString(mandateStartDate)).append("\n");
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
    openapiFields.add("account_holder_name");
    openapiFields.add("account_number");
    openapiFields.add("account_bank_code");
    openapiFields.add("account_type");
    openapiFields.add("account_ifsc");
    openapiFields.add("mandate_creation_date");
    openapiFields.add("mandate_start_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RequestPnach
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
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
      if ((jsonObj.get("mandate_creation_date") != null && !jsonObj.get("mandate_creation_date").isJsonNull()) && !jsonObj.get("mandate_creation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandate_creation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandate_creation_date").toString()));
      }
      if ((jsonObj.get("mandate_start_date") != null && !jsonObj.get("mandate_start_date").isJsonNull()) && !jsonObj.get("mandate_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandate_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandate_start_date").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RequestPnach
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
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
      if ((jsonObj.get("mandate_creation_date") != null && !jsonObj.get("mandate_creation_date").isJsonNull()) && !jsonObj.get("mandate_creation_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandate_creation_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandate_creation_date").toString()));
      }
      if ((jsonObj.get("mandate_start_date") != null && !jsonObj.get("mandate_start_date").isJsonNull()) && !jsonObj.get("mandate_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mandate_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mandate_start_date").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestPnach.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestPnach' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestPnach> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestPnach.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestPnach>() {
           @Override
           public void write(JsonWriter out, RequestPnach value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestPnach read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestPnach given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestPnach
  * @throws IOException if the JSON string is invalid with respect to RequestPnach
  */
  public static RequestPnach fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestPnach.class);
  }

 /**
  * Convert an instance of RequestPnach to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


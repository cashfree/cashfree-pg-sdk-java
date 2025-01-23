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
 * PaymentMethodNetBankingInPaymentsEntityNetbanking
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class PaymentMethodNetBankingInPaymentsEntityNetbanking {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_NETBANKING_BANK_CODE = "netbanking_bank_code";
  @SerializedName(SERIALIZED_NAME_NETBANKING_BANK_CODE)
  private Integer netbankingBankCode;

  public static final String SERIALIZED_NAME_NETBANKING_BANK_NAME = "netbanking_bank_name";
  @SerializedName(SERIALIZED_NAME_NETBANKING_BANK_NAME)
  private String netbankingBankName;

  public static final String SERIALIZED_NAME_NETBANKING_IFSC = "netbanking_ifsc";
  @SerializedName(SERIALIZED_NAME_NETBANKING_IFSC)
  private String netbankingIfsc;

  public static final String SERIALIZED_NAME_NETBANKING_ACCOUNT_NUMBER = "netbanking_account_number";
  @SerializedName(SERIALIZED_NAME_NETBANKING_ACCOUNT_NUMBER)
  private String netbankingAccountNumber;

  public PaymentMethodNetBankingInPaymentsEntityNetbanking() {
  }

  public PaymentMethodNetBankingInPaymentsEntityNetbanking channel(String channel) {
    
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


  public PaymentMethodNetBankingInPaymentsEntityNetbanking netbankingBankCode(Integer netbankingBankCode) {
    
    this.netbankingBankCode = netbankingBankCode;
    return this;
  }

   /**
   * Get netbankingBankCode
   * @return netbankingBankCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getNetbankingBankCode() {
    return netbankingBankCode;
  }


  public void setNetbankingBankCode(Integer netbankingBankCode) {
    this.netbankingBankCode = netbankingBankCode;
  }


  public PaymentMethodNetBankingInPaymentsEntityNetbanking netbankingBankName(String netbankingBankName) {
    
    this.netbankingBankName = netbankingBankName;
    return this;
  }

   /**
   * Get netbankingBankName
   * @return netbankingBankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getNetbankingBankName() {
    return netbankingBankName;
  }


  public void setNetbankingBankName(String netbankingBankName) {
    this.netbankingBankName = netbankingBankName;
  }


  public PaymentMethodNetBankingInPaymentsEntityNetbanking netbankingIfsc(String netbankingIfsc) {
    
    this.netbankingIfsc = netbankingIfsc;
    return this;
  }

   /**
   * Get netbankingIfsc
   * @return netbankingIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getNetbankingIfsc() {
    return netbankingIfsc;
  }


  public void setNetbankingIfsc(String netbankingIfsc) {
    this.netbankingIfsc = netbankingIfsc;
  }


  public PaymentMethodNetBankingInPaymentsEntityNetbanking netbankingAccountNumber(String netbankingAccountNumber) {
    
    this.netbankingAccountNumber = netbankingAccountNumber;
    return this;
  }

   /**
   * Get netbankingAccountNumber
   * @return netbankingAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getNetbankingAccountNumber() {
    return netbankingAccountNumber;
  }


  public void setNetbankingAccountNumber(String netbankingAccountNumber) {
    this.netbankingAccountNumber = netbankingAccountNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodNetBankingInPaymentsEntityNetbanking paymentMethodNetBankingInPaymentsEntityNetbanking = (PaymentMethodNetBankingInPaymentsEntityNetbanking) o;
    return Objects.equals(this.channel, paymentMethodNetBankingInPaymentsEntityNetbanking.channel) &&
        Objects.equals(this.netbankingBankCode, paymentMethodNetBankingInPaymentsEntityNetbanking.netbankingBankCode) &&
        Objects.equals(this.netbankingBankName, paymentMethodNetBankingInPaymentsEntityNetbanking.netbankingBankName) &&
        Objects.equals(this.netbankingIfsc, paymentMethodNetBankingInPaymentsEntityNetbanking.netbankingIfsc) &&
        Objects.equals(this.netbankingAccountNumber, paymentMethodNetBankingInPaymentsEntityNetbanking.netbankingAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, netbankingBankCode, netbankingBankName, netbankingIfsc, netbankingAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodNetBankingInPaymentsEntityNetbanking {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    netbankingBankCode: ").append(toIndentedString(netbankingBankCode)).append("\n");
    sb.append("    netbankingBankName: ").append(toIndentedString(netbankingBankName)).append("\n");
    sb.append("    netbankingIfsc: ").append(toIndentedString(netbankingIfsc)).append("\n");
    sb.append("    netbankingAccountNumber: ").append(toIndentedString(netbankingAccountNumber)).append("\n");
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
    openapiFields.add("netbanking_bank_code");
    openapiFields.add("netbanking_bank_name");
    openapiFields.add("netbanking_ifsc");
    openapiFields.add("netbanking_account_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodNetBankingInPaymentsEntityNetbanking
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("netbanking_bank_name") != null && !jsonObj.get("netbanking_bank_name").isJsonNull()) && !jsonObj.get("netbanking_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_bank_name").toString()));
      }
      if ((jsonObj.get("netbanking_ifsc") != null && !jsonObj.get("netbanking_ifsc").isJsonNull()) && !jsonObj.get("netbanking_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_ifsc").toString()));
      }
      if ((jsonObj.get("netbanking_account_number") != null && !jsonObj.get("netbanking_account_number").isJsonNull()) && !jsonObj.get("netbanking_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_account_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodNetBankingInPaymentsEntityNetbanking
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("netbanking_bank_name") != null && !jsonObj.get("netbanking_bank_name").isJsonNull()) && !jsonObj.get("netbanking_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_bank_name").toString()));
      }
      if ((jsonObj.get("netbanking_ifsc") != null && !jsonObj.get("netbanking_ifsc").isJsonNull()) && !jsonObj.get("netbanking_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_ifsc").toString()));
      }
      if ((jsonObj.get("netbanking_account_number") != null && !jsonObj.get("netbanking_account_number").isJsonNull()) && !jsonObj.get("netbanking_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `netbanking_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("netbanking_account_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodNetBankingInPaymentsEntityNetbanking.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodNetBankingInPaymentsEntityNetbanking' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodNetBankingInPaymentsEntityNetbanking> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodNetBankingInPaymentsEntityNetbanking.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodNetBankingInPaymentsEntityNetbanking>() {
           @Override
           public void write(JsonWriter out, PaymentMethodNetBankingInPaymentsEntityNetbanking value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodNetBankingInPaymentsEntityNetbanking read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodNetBankingInPaymentsEntityNetbanking given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodNetBankingInPaymentsEntityNetbanking
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodNetBankingInPaymentsEntityNetbanking
  */
  public static PaymentMethodNetBankingInPaymentsEntityNetbanking fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodNetBankingInPaymentsEntityNetbanking.class);
  }

 /**
  * Convert an instance of PaymentMethodNetBankingInPaymentsEntityNetbanking to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


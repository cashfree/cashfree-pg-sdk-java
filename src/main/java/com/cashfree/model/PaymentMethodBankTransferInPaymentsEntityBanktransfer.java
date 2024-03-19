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
 * PaymentMethodBankTransferInPaymentsEntityBanktransfer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class PaymentMethodBankTransferInPaymentsEntityBanktransfer {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_BANKTRANSFER_BANK_NAME = "banktransfer_bank_name";
  @SerializedName(SERIALIZED_NAME_BANKTRANSFER_BANK_NAME)
  private String banktransferBankName;

  public static final String SERIALIZED_NAME_BANKTRANSFER_IFSC = "banktransfer_ifsc";
  @SerializedName(SERIALIZED_NAME_BANKTRANSFER_IFSC)
  private String banktransferIfsc;

  public static final String SERIALIZED_NAME_BANKTRANSFER_ACCOUNT_NUMBER = "banktransfer_account_number";
  @SerializedName(SERIALIZED_NAME_BANKTRANSFER_ACCOUNT_NUMBER)
  private String banktransferAccountNumber;

  public PaymentMethodBankTransferInPaymentsEntityBanktransfer() {
  }

  public PaymentMethodBankTransferInPaymentsEntityBanktransfer channel(String channel) {
    
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


  public PaymentMethodBankTransferInPaymentsEntityBanktransfer banktransferBankName(String banktransferBankName) {
    
    this.banktransferBankName = banktransferBankName;
    return this;
  }

   /**
   * Get banktransferBankName
   * @return banktransferBankName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBanktransferBankName() {
    return banktransferBankName;
  }


  public void setBanktransferBankName(String banktransferBankName) {
    this.banktransferBankName = banktransferBankName;
  }


  public PaymentMethodBankTransferInPaymentsEntityBanktransfer banktransferIfsc(String banktransferIfsc) {
    
    this.banktransferIfsc = banktransferIfsc;
    return this;
  }

   /**
   * Get banktransferIfsc
   * @return banktransferIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBanktransferIfsc() {
    return banktransferIfsc;
  }


  public void setBanktransferIfsc(String banktransferIfsc) {
    this.banktransferIfsc = banktransferIfsc;
  }


  public PaymentMethodBankTransferInPaymentsEntityBanktransfer banktransferAccountNumber(String banktransferAccountNumber) {
    
    this.banktransferAccountNumber = banktransferAccountNumber;
    return this;
  }

   /**
   * Get banktransferAccountNumber
   * @return banktransferAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getBanktransferAccountNumber() {
    return banktransferAccountNumber;
  }


  public void setBanktransferAccountNumber(String banktransferAccountNumber) {
    this.banktransferAccountNumber = banktransferAccountNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBankTransferInPaymentsEntityBanktransfer paymentMethodBankTransferInPaymentsEntityBanktransfer = (PaymentMethodBankTransferInPaymentsEntityBanktransfer) o;
    return Objects.equals(this.channel, paymentMethodBankTransferInPaymentsEntityBanktransfer.channel) &&
        Objects.equals(this.banktransferBankName, paymentMethodBankTransferInPaymentsEntityBanktransfer.banktransferBankName) &&
        Objects.equals(this.banktransferIfsc, paymentMethodBankTransferInPaymentsEntityBanktransfer.banktransferIfsc) &&
        Objects.equals(this.banktransferAccountNumber, paymentMethodBankTransferInPaymentsEntityBanktransfer.banktransferAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, banktransferBankName, banktransferIfsc, banktransferAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBankTransferInPaymentsEntityBanktransfer {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    banktransferBankName: ").append(toIndentedString(banktransferBankName)).append("\n");
    sb.append("    banktransferIfsc: ").append(toIndentedString(banktransferIfsc)).append("\n");
    sb.append("    banktransferAccountNumber: ").append(toIndentedString(banktransferAccountNumber)).append("\n");
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
    openapiFields.add("banktransfer_bank_name");
    openapiFields.add("banktransfer_ifsc");
    openapiFields.add("banktransfer_account_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodBankTransferInPaymentsEntityBanktransfer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("banktransfer_bank_name") != null && !jsonObj.get("banktransfer_bank_name").isJsonNull()) && !jsonObj.get("banktransfer_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_bank_name").toString()));
      }
      if ((jsonObj.get("banktransfer_ifsc") != null && !jsonObj.get("banktransfer_ifsc").isJsonNull()) && !jsonObj.get("banktransfer_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_ifsc").toString()));
      }
      if ((jsonObj.get("banktransfer_account_number") != null && !jsonObj.get("banktransfer_account_number").isJsonNull()) && !jsonObj.get("banktransfer_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_account_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodBankTransferInPaymentsEntityBanktransfer
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("banktransfer_bank_name") != null && !jsonObj.get("banktransfer_bank_name").isJsonNull()) && !jsonObj.get("banktransfer_bank_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_bank_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_bank_name").toString()));
      }
      if ((jsonObj.get("banktransfer_ifsc") != null && !jsonObj.get("banktransfer_ifsc").isJsonNull()) && !jsonObj.get("banktransfer_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_ifsc").toString()));
      }
      if ((jsonObj.get("banktransfer_account_number") != null && !jsonObj.get("banktransfer_account_number").isJsonNull()) && !jsonObj.get("banktransfer_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `banktransfer_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("banktransfer_account_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodBankTransferInPaymentsEntityBanktransfer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodBankTransferInPaymentsEntityBanktransfer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodBankTransferInPaymentsEntityBanktransfer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodBankTransferInPaymentsEntityBanktransfer.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodBankTransferInPaymentsEntityBanktransfer>() {
           @Override
           public void write(JsonWriter out, PaymentMethodBankTransferInPaymentsEntityBanktransfer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodBankTransferInPaymentsEntityBanktransfer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodBankTransferInPaymentsEntityBanktransfer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodBankTransferInPaymentsEntityBanktransfer
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodBankTransferInPaymentsEntityBanktransfer
  */
  public static PaymentMethodBankTransferInPaymentsEntityBanktransfer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodBankTransferInPaymentsEntityBanktransfer.class);
  }

 /**
  * Convert an instance of PaymentMethodBankTransferInPaymentsEntityBanktransfer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


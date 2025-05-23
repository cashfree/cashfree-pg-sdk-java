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
 * PaymentMethodUPIInPaymentsEntityUpi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class PaymentMethodUPIInPaymentsEntityUpi {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_UPI_ID = "upi_id";
  @SerializedName(SERIALIZED_NAME_UPI_ID)
  private String upiId;

  public static final String SERIALIZED_NAME_UPI_PAYER_IFSC = "upi_payer_ifsc";
  @SerializedName(SERIALIZED_NAME_UPI_PAYER_IFSC)
  private String upiPayerIfsc;

  public static final String SERIALIZED_NAME_UPI_PAYER_ACCOUNT_NUMBER = "upi_payer_account_number";
  @SerializedName(SERIALIZED_NAME_UPI_PAYER_ACCOUNT_NUMBER)
  private String upiPayerAccountNumber;

  public PaymentMethodUPIInPaymentsEntityUpi() {
  }

  public PaymentMethodUPIInPaymentsEntityUpi channel(String channel) {
    
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


  public PaymentMethodUPIInPaymentsEntityUpi upiId(String upiId) {
    
    this.upiId = upiId;
    return this;
  }

   /**
   * Get upiId
   * @return upiId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getUpiId() {
    return upiId;
  }


  public void setUpiId(String upiId) {
    this.upiId = upiId;
  }


  public PaymentMethodUPIInPaymentsEntityUpi upiPayerIfsc(String upiPayerIfsc) {
    
    this.upiPayerIfsc = upiPayerIfsc;
    return this;
  }

   /**
   * Get upiPayerIfsc
   * @return upiPayerIfsc
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getUpiPayerIfsc() {
    return upiPayerIfsc;
  }


  public void setUpiPayerIfsc(String upiPayerIfsc) {
    this.upiPayerIfsc = upiPayerIfsc;
  }


  public PaymentMethodUPIInPaymentsEntityUpi upiPayerAccountNumber(String upiPayerAccountNumber) {
    
    this.upiPayerAccountNumber = upiPayerAccountNumber;
    return this;
  }

   /**
   * Get upiPayerAccountNumber
   * @return upiPayerAccountNumber
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getUpiPayerAccountNumber() {
    return upiPayerAccountNumber;
  }


  public void setUpiPayerAccountNumber(String upiPayerAccountNumber) {
    this.upiPayerAccountNumber = upiPayerAccountNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodUPIInPaymentsEntityUpi paymentMethodUPIInPaymentsEntityUpi = (PaymentMethodUPIInPaymentsEntityUpi) o;
    return Objects.equals(this.channel, paymentMethodUPIInPaymentsEntityUpi.channel) &&
        Objects.equals(this.upiId, paymentMethodUPIInPaymentsEntityUpi.upiId) &&
        Objects.equals(this.upiPayerIfsc, paymentMethodUPIInPaymentsEntityUpi.upiPayerIfsc) &&
        Objects.equals(this.upiPayerAccountNumber, paymentMethodUPIInPaymentsEntityUpi.upiPayerAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, upiId, upiPayerIfsc, upiPayerAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodUPIInPaymentsEntityUpi {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    upiId: ").append(toIndentedString(upiId)).append("\n");
    sb.append("    upiPayerIfsc: ").append(toIndentedString(upiPayerIfsc)).append("\n");
    sb.append("    upiPayerAccountNumber: ").append(toIndentedString(upiPayerAccountNumber)).append("\n");
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
    openapiFields.add("upi_id");
    openapiFields.add("upi_payer_ifsc");
    openapiFields.add("upi_payer_account_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodUPIInPaymentsEntityUpi
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("upi_id") != null && !jsonObj.get("upi_id").isJsonNull()) && !jsonObj.get("upi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_id").toString()));
      }
      if ((jsonObj.get("upi_payer_ifsc") != null && !jsonObj.get("upi_payer_ifsc").isJsonNull()) && !jsonObj.get("upi_payer_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_payer_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_payer_ifsc").toString()));
      }
      if ((jsonObj.get("upi_payer_account_number") != null && !jsonObj.get("upi_payer_account_number").isJsonNull()) && !jsonObj.get("upi_payer_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_payer_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_payer_account_number").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodUPIInPaymentsEntityUpi
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("upi_id") != null && !jsonObj.get("upi_id").isJsonNull()) && !jsonObj.get("upi_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_id").toString()));
      }
      if ((jsonObj.get("upi_payer_ifsc") != null && !jsonObj.get("upi_payer_ifsc").isJsonNull()) && !jsonObj.get("upi_payer_ifsc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_payer_ifsc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_payer_ifsc").toString()));
      }
      if ((jsonObj.get("upi_payer_account_number") != null && !jsonObj.get("upi_payer_account_number").isJsonNull()) && !jsonObj.get("upi_payer_account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upi_payer_account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upi_payer_account_number").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethodUPIInPaymentsEntityUpi.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethodUPIInPaymentsEntityUpi' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethodUPIInPaymentsEntityUpi> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodUPIInPaymentsEntityUpi.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethodUPIInPaymentsEntityUpi>() {
           @Override
           public void write(JsonWriter out, PaymentMethodUPIInPaymentsEntityUpi value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethodUPIInPaymentsEntityUpi read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethodUPIInPaymentsEntityUpi given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodUPIInPaymentsEntityUpi
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodUPIInPaymentsEntityUpi
  */
  public static PaymentMethodUPIInPaymentsEntityUpi fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodUPIInPaymentsEntityUpi.class);
  }

 /**
  * Convert an instance of PaymentMethodUPIInPaymentsEntityUpi to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


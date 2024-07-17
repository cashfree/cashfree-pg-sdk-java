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
 * Request body to create a terminal transaction
 */
@Schema(description = "Request body to create a terminal transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:49:56.545492Z[Etc/UTC]")
public class CreateTerminalTransactionRequest {
  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private String cfOrderId;

  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private String cfTerminalId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_TERMINAL_PHONE_NO = "terminal_phone_no";
  @SerializedName(SERIALIZED_NAME_TERMINAL_PHONE_NO)
  private String terminalPhoneNo;

  public static final String SERIALIZED_NAME_ADD_INVOICE = "add_invoice";
  @SerializedName(SERIALIZED_NAME_ADD_INVOICE)
  private Boolean addInvoice;

  public CreateTerminalTransactionRequest() {
  }

  public CreateTerminalTransactionRequest cfOrderId(String cfOrderId) {
    
    this.cfOrderId = cfOrderId;
    return this;
  }

   /**
   * cashfree order ID that was returned while creating an order.
   * @return cfOrderId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "cashfree order ID that was returned while creating an order.")
  public String getCfOrderId() {
    return cfOrderId;
  }


  public void setCfOrderId(String cfOrderId) {
    this.cfOrderId = cfOrderId;
  }


  public CreateTerminalTransactionRequest cfTerminalId(String cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * cashfree terminal id. this is a required parameter when you do not provide the terminal phone number.
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "cashfree terminal id. this is a required parameter when you do not provide the terminal phone number.")
  public String getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(String cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public CreateTerminalTransactionRequest paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * mention the payment method used for the transaction. possible values - QR_CODE, LINK.
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "mention the payment method used for the transaction. possible values - QR_CODE, LINK.")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public CreateTerminalTransactionRequest terminalPhoneNo(String terminalPhoneNo) {
    
    this.terminalPhoneNo = terminalPhoneNo;
    return this;
  }

   /**
   * agent mobile number assigned to the terminal. this is a required parameter when you do not provide the cf_terminal_id.
   * @return terminalPhoneNo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "agent mobile number assigned to the terminal. this is a required parameter when you do not provide the cf_terminal_id.")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }


  public void setTerminalPhoneNo(String terminalPhoneNo) {
    this.terminalPhoneNo = terminalPhoneNo;
  }


  public CreateTerminalTransactionRequest addInvoice(Boolean addInvoice) {
    
    this.addInvoice = addInvoice;
    return this;
  }

   /**
   * make it true to have request be sent to create a Dynamic GST QR Code.
   * @return addInvoice
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "make it true to have request be sent to create a Dynamic GST QR Code.")
  public Boolean getAddInvoice() {
    return addInvoice;
  }


  public void setAddInvoice(Boolean addInvoice) {
    this.addInvoice = addInvoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTerminalTransactionRequest createTerminalTransactionRequest = (CreateTerminalTransactionRequest) o;
    return Objects.equals(this.cfOrderId, createTerminalTransactionRequest.cfOrderId) &&
        Objects.equals(this.cfTerminalId, createTerminalTransactionRequest.cfTerminalId) &&
        Objects.equals(this.paymentMethod, createTerminalTransactionRequest.paymentMethod) &&
        Objects.equals(this.terminalPhoneNo, createTerminalTransactionRequest.terminalPhoneNo) &&
        Objects.equals(this.addInvoice, createTerminalTransactionRequest.addInvoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfOrderId, cfTerminalId, paymentMethod, terminalPhoneNo, addInvoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTerminalTransactionRequest {\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    terminalPhoneNo: ").append(toIndentedString(terminalPhoneNo)).append("\n");
    sb.append("    addInvoice: ").append(toIndentedString(addInvoice)).append("\n");
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
    openapiFields.add("cf_order_id");
    openapiFields.add("cf_terminal_id");
    openapiFields.add("payment_method");
    openapiFields.add("terminal_phone_no");
    openapiFields.add("add_invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cf_order_id");
    openapiRequiredFields.add("payment_method");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTerminalTransactionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTerminalTransactionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if (!jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("terminal_phone_no") != null && !jsonObj.get("terminal_phone_no").isJsonNull()) && !jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTerminalTransactionRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTerminalTransactionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if (!jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if ((jsonObj.get("terminal_phone_no") != null && !jsonObj.get("terminal_phone_no").isJsonNull()) && !jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTerminalTransactionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTerminalTransactionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTerminalTransactionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTerminalTransactionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTerminalTransactionRequest>() {
           @Override
           public void write(JsonWriter out, CreateTerminalTransactionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTerminalTransactionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTerminalTransactionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTerminalTransactionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTerminalTransactionRequest
  */
  public static CreateTerminalTransactionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTerminalTransactionRequest.class);
  }

 /**
  * Convert an instance of CreateTerminalTransactionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


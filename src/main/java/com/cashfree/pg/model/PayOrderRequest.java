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
import com.cashfree.pg.model.PayOrderRequestPaymentMethod;
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
 * Complete object for the pay api that uses payment method objects
 */
@Schema(description = "Complete object for the pay api that uses payment method objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class PayOrderRequest {
  public static final String SERIALIZED_NAME_PAYMENT_SESSION_ID = "payment_session_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION_ID)
  private String paymentSessionId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PayOrderRequestPaymentMethod paymentMethod;

  public static final String SERIALIZED_NAME_SAVE_INSTRUMENT = "save_instrument";
  @SerializedName(SERIALIZED_NAME_SAVE_INSTRUMENT)
  private Boolean saveInstrument;

  public static final String SERIALIZED_NAME_OFFER_ID = "offer_id";
  @SerializedName(SERIALIZED_NAME_OFFER_ID)
  private String offerId;

  public PayOrderRequest() {
  }

  public PayOrderRequest paymentSessionId(String paymentSessionId) {
    
    this.paymentSessionId = paymentSessionId;
    return this;
  }

   /**
   * Get paymentSessionId
   * @return paymentSessionId
  **/
  @javax.annotation.Nonnull
  @Schema(example = "session__CvcEmNKDkmERQrxnx39ibhJ3Ii034pjc8ZVxf3qcgEXCWlgDDlHRgz2XYZCqpajDQSXMMtCusPgOIxYP2LZx0-05p39gC2Vgmq1RAj--gcn", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public String getPaymentSessionId() {
    return paymentSessionId;
  }


  public void setPaymentSessionId(String paymentSessionId) {
    this.paymentSessionId = paymentSessionId;
  }


  public PayOrderRequest paymentMethod(PayOrderRequestPaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public PayOrderRequestPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PayOrderRequestPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PayOrderRequest saveInstrument(Boolean saveInstrument) {
    
    this.saveInstrument = saveInstrument;
    return this;
  }

   /**
   * Get saveInstrument
   * @return saveInstrument
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getSaveInstrument() {
    return saveInstrument;
  }


  public void setSaveInstrument(Boolean saveInstrument) {
    this.saveInstrument = saveInstrument;
  }


  public PayOrderRequest offerId(String offerId) {
    
    this.offerId = offerId;
    return this;
  }

   /**
   * This is required if any offers needs to be applied to the order.
   * @return offerId
  **/
  @javax.annotation.Nullable
  @Schema(example = "faa6cc05-d1e2-401c-b0cf-0c9db3ff0f0b", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is required if any offers needs to be applied to the order.")
  public String getOfferId() {
    return offerId;
  }


  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayOrderRequest payOrderRequest = (PayOrderRequest) o;
    return Objects.equals(this.paymentSessionId, payOrderRequest.paymentSessionId) &&
        Objects.equals(this.paymentMethod, payOrderRequest.paymentMethod) &&
        Objects.equals(this.saveInstrument, payOrderRequest.saveInstrument) &&
        Objects.equals(this.offerId, payOrderRequest.offerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSessionId, paymentMethod, saveInstrument, offerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayOrderRequest {\n");
    sb.append("    paymentSessionId: ").append(toIndentedString(paymentSessionId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    saveInstrument: ").append(toIndentedString(saveInstrument)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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
    openapiFields.add("payment_session_id");
    openapiFields.add("payment_method");
    openapiFields.add("save_instrument");
    openapiFields.add("offer_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_session_id");
    openapiRequiredFields.add("payment_method");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PayOrderRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_session_id").toString()));
      }
      // validate the required field `payment_method`
      PayOrderRequestPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      if ((jsonObj.get("offer_id") != null && !jsonObj.get("offer_id").isJsonNull()) && !jsonObj.get("offer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_id").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PayOrderRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PayOrderRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_session_id").toString()));
      }
      // validate the required field `payment_method`
      PayOrderRequestPaymentMethod.validateJsonElement(jsonObj.get("payment_method"));
      if ((jsonObj.get("offer_id") != null && !jsonObj.get("offer_id").isJsonNull()) && !jsonObj.get("offer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `offer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("offer_id").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PayOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PayOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PayOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PayOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PayOrderRequest>() {
           @Override
           public void write(JsonWriter out, PayOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PayOrderRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PayOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PayOrderRequest
  * @throws IOException if the JSON string is invalid with respect to PayOrderRequest
  */
  public static PayOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PayOrderRequest.class);
  }

 /**
  * Convert an instance of PayOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


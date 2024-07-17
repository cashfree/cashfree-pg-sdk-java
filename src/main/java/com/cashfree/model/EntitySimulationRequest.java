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
 * Entity Simulation it contains payment_status and payment_error_code
 */
@Schema(description = "Entity Simulation it contains payment_status and payment_error_code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T09:16:46.389568Z[Etc/UTC]")
public class EntitySimulationRequest {
  /**
   * Payment Status
   */
  @JsonAdapter(PaymentStatusEnum.Adapter.class)
  public enum PaymentStatusEnum {
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED"),
    
    PENDING("PENDING"),
    
    USER_DROPPED("USER_DROPPED"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    PaymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<PaymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "payment_status";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  private PaymentStatusEnum paymentStatus;

  public static final String SERIALIZED_NAME_PAYMENT_ERROR_CODE = "payment_error_code";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ERROR_CODE)
  private String paymentErrorCode;

  public EntitySimulationRequest() {
  }

  public EntitySimulationRequest paymentStatus(PaymentStatusEnum paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * Payment Status
   * @return paymentStatus
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Payment Status")
  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }


  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public EntitySimulationRequest paymentErrorCode(String paymentErrorCode) {
    
    this.paymentErrorCode = paymentErrorCode;
    return this;
  }

   /**
   * Payment Error Code
   * @return paymentErrorCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment Error Code")
  public String getPaymentErrorCode() {
    return paymentErrorCode;
  }


  public void setPaymentErrorCode(String paymentErrorCode) {
    this.paymentErrorCode = paymentErrorCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySimulationRequest entitySimulationRequest = (EntitySimulationRequest) o;
    return Objects.equals(this.paymentStatus, entitySimulationRequest.paymentStatus) &&
        Objects.equals(this.paymentErrorCode, entitySimulationRequest.paymentErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus, paymentErrorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySimulationRequest {\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentErrorCode: ").append(toIndentedString(paymentErrorCode)).append("\n");
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
    openapiFields.add("payment_status");
    openapiFields.add("payment_error_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("payment_status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitySimulationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EntitySimulationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_error_code") != null && !jsonObj.get("payment_error_code").isJsonNull()) && !jsonObj.get("payment_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_error_code").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EntitySimulationRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EntitySimulationRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("payment_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_status").toString()));
      }
      if ((jsonObj.get("payment_error_code") != null && !jsonObj.get("payment_error_code").isJsonNull()) && !jsonObj.get("payment_error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_error_code").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EntitySimulationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EntitySimulationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EntitySimulationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EntitySimulationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EntitySimulationRequest>() {
           @Override
           public void write(JsonWriter out, EntitySimulationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EntitySimulationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EntitySimulationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EntitySimulationRequest
  * @throws IOException if the JSON string is invalid with respect to EntitySimulationRequest
  */
  public static EntitySimulationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EntitySimulationRequest.class);
  }

 /**
  * Convert an instance of EntitySimulationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
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
 * OTP to be submitted for headless/native OTP
 */
@Schema(description = "OTP to be submitted for headless/native OTP")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:16:03.269971Z[Etc/UTC]")
public class OrderAuthenticatePaymentRequest {
  public static final String SERIALIZED_NAME_OTP = "otp";
  @SerializedName(SERIALIZED_NAME_OTP)
  private String otp;

  /**
   * The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    SUBMIT_OTP("SUBMIT_OTP"),
    
    RESEND_OTP("RESEND_OTP"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public OrderAuthenticatePaymentRequest() {
  }

  public OrderAuthenticatePaymentRequest otp(String otp) {
    
    this.otp = otp;
    return this;
  }

   /**
   * OTP to be submitted
   * @return otp
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "OTP to be submitted")
  public String getOtp() {
    return otp;
  }


  public void setOtp(String otp) {
    this.otp = otp;
  }


  public OrderAuthenticatePaymentRequest action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP
   * @return action
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP")
  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAuthenticatePaymentRequest orderAuthenticatePaymentRequest = (OrderAuthenticatePaymentRequest) o;
    return Objects.equals(this.otp, orderAuthenticatePaymentRequest.otp) &&
        Objects.equals(this.action, orderAuthenticatePaymentRequest.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otp, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAuthenticatePaymentRequest {\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
    openapiFields.add("otp");
    openapiFields.add("action");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("otp");
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderAuthenticatePaymentRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderAuthenticatePaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("otp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `otp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("otp").toString()));
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderAuthenticatePaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderAuthenticatePaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderAuthenticatePaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderAuthenticatePaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderAuthenticatePaymentRequest>() {
           @Override
           public void write(JsonWriter out, OrderAuthenticatePaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderAuthenticatePaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderAuthenticatePaymentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderAuthenticatePaymentRequest
  * @throws IOException if the JSON string is invalid with respect to OrderAuthenticatePaymentRequest
  */
  public static OrderAuthenticatePaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderAuthenticatePaymentRequest.class);
  }

 /**
  * Convert an instance of OrderAuthenticatePaymentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


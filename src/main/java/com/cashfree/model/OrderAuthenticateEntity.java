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
 * This is the response shared when merchant inovkes the OTP submit or resend API
 */
@Schema(description = "This is the response shared when merchant inovkes the OTP submit or resend API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class OrderAuthenticateEntity {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  /**
   * The action that was invoked for this request.
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

  /**
   * Status of the is action. Will be either failed or successful. If the action is successful, you should still call the authorization status to verify the final payment status.
   */
  @JsonAdapter(AuthenticateStatusEnum.Adapter.class)
  public enum AuthenticateStatusEnum {
    FAILED("FAILED"),
    
    SUCCESS("SUCCESS"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    AuthenticateStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticateStatusEnum fromValue(String value) {
      for (AuthenticateStatusEnum b : AuthenticateStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<AuthenticateStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticateStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticateStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthenticateStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATE_STATUS = "authenticate_status";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATE_STATUS)
  private AuthenticateStatusEnum authenticateStatus;

  public static final String SERIALIZED_NAME_PAYMENT_MESSAGE = "payment_message";
  @SerializedName(SERIALIZED_NAME_PAYMENT_MESSAGE)
  private String paymentMessage;

  public OrderAuthenticateEntity() {
  }

  public OrderAuthenticateEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * The payment id for which this request was sent
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The payment id for which this request was sent")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public OrderAuthenticateEntity action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action that was invoked for this request.
   * @return action
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The action that was invoked for this request.")
  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public OrderAuthenticateEntity authenticateStatus(AuthenticateStatusEnum authenticateStatus) {
    
    this.authenticateStatus = authenticateStatus;
    return this;
  }

   /**
   * Status of the is action. Will be either failed or successful. If the action is successful, you should still call the authorization status to verify the final payment status.
   * @return authenticateStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the is action. Will be either failed or successful. If the action is successful, you should still call the authorization status to verify the final payment status.")
  public AuthenticateStatusEnum getAuthenticateStatus() {
    return authenticateStatus;
  }


  public void setAuthenticateStatus(AuthenticateStatusEnum authenticateStatus) {
    this.authenticateStatus = authenticateStatus;
  }


  public OrderAuthenticateEntity paymentMessage(String paymentMessage) {
    
    this.paymentMessage = paymentMessage;
    return this;
  }

   /**
   * Human readable message which describes the status in more detail
   * @return paymentMessage
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Human readable message which describes the status in more detail")
  public String getPaymentMessage() {
    return paymentMessage;
  }


  public void setPaymentMessage(String paymentMessage) {
    this.paymentMessage = paymentMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAuthenticateEntity orderAuthenticateEntity = (OrderAuthenticateEntity) o;
    return Objects.equals(this.cfPaymentId, orderAuthenticateEntity.cfPaymentId) &&
        Objects.equals(this.action, orderAuthenticateEntity.action) &&
        Objects.equals(this.authenticateStatus, orderAuthenticateEntity.authenticateStatus) &&
        Objects.equals(this.paymentMessage, orderAuthenticateEntity.paymentMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, action, authenticateStatus, paymentMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAuthenticateEntity {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    authenticateStatus: ").append(toIndentedString(authenticateStatus)).append("\n");
    sb.append("    paymentMessage: ").append(toIndentedString(paymentMessage)).append("\n");
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
    openapiFields.add("cf_payment_id");
    openapiFields.add("action");
    openapiFields.add("authenticate_status");
    openapiFields.add("payment_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderAuthenticateEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("authenticate_status") != null && !jsonObj.get("authenticate_status").isJsonNull()) && !jsonObj.get("authenticate_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authenticate_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticate_status").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderAuthenticateEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("authenticate_status") != null && !jsonObj.get("authenticate_status").isJsonNull()) && !jsonObj.get("authenticate_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authenticate_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authenticate_status").toString()));
      }
      if ((jsonObj.get("payment_message") != null && !jsonObj.get("payment_message").isJsonNull()) && !jsonObj.get("payment_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_message").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderAuthenticateEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderAuthenticateEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderAuthenticateEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderAuthenticateEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderAuthenticateEntity>() {
           @Override
           public void write(JsonWriter out, OrderAuthenticateEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderAuthenticateEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderAuthenticateEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderAuthenticateEntity
  * @throws IOException if the JSON string is invalid with respect to OrderAuthenticateEntity
  */
  public static OrderAuthenticateEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderAuthenticateEntity.class);
  }

 /**
  * Convert an instance of OrderAuthenticateEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


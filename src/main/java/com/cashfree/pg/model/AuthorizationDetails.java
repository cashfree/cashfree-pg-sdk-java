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
import java.math.BigDecimal;
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
 * Details of the authorization done for the subscription. Returned in Get subscription and auth payments.
 */
@Schema(description = "Details of the authorization done for the subscription. Returned in Get subscription and auth payments.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class AuthorizationDetails {
  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT = "authorization_amount";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT)
  private BigDecimal authorizationAmount;

  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT_REFUND = "authorization_amount_refund";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT_REFUND)
  private Boolean authorizationAmountRefund;

  public static final String SERIALIZED_NAME_AUTHORIZATION_REFERENCE = "authorization_reference";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_REFERENCE)
  private String authorizationReference;

  public static final String SERIALIZED_NAME_AUTHORIZATION_TIME = "authorization_time";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_TIME)
  private String authorizationTime;

  public static final String SERIALIZED_NAME_AUTHORIZATION_STATUS = "authorization_status";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_STATUS)
  private String authorizationStatus;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public AuthorizationDetails() {
  }

  public AuthorizationDetails authorizationAmount(BigDecimal authorizationAmount) {
    
    this.authorizationAmount = authorizationAmount;
    return this;
  }

   /**
   * Authorization amount for the auth payment.
   * @return authorizationAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Authorization amount for the auth payment.")
  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }


  public void setAuthorizationAmount(BigDecimal authorizationAmount) {
    this.authorizationAmount = authorizationAmount;
  }


  public AuthorizationDetails authorizationAmountRefund(Boolean authorizationAmountRefund) {
    
    this.authorizationAmountRefund = authorizationAmountRefund;
    return this;
  }

   /**
   * Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription.
   * @return authorizationAmountRefund
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Indicates whether the authorization amount should be refunded to the customer automatically. Merchants can use this field to specify if the authorized funds should be returned to the customer after authorization of the subscription.")
  public Boolean getAuthorizationAmountRefund() {
    return authorizationAmountRefund;
  }


  public void setAuthorizationAmountRefund(Boolean authorizationAmountRefund) {
    this.authorizationAmountRefund = authorizationAmountRefund;
  }


  public AuthorizationDetails authorizationReference(String authorizationReference) {
    
    this.authorizationReference = authorizationReference;
    return this;
  }

   /**
   * Authorization reference. UMN for UPI, UMRN for EMandate/Physical Mandate and Enrollment ID for cards.
   * @return authorizationReference
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Authorization reference. UMN for UPI, UMRN for EMandate/Physical Mandate and Enrollment ID for cards.")
  public String getAuthorizationReference() {
    return authorizationReference;
  }


  public void setAuthorizationReference(String authorizationReference) {
    this.authorizationReference = authorizationReference;
  }


  public AuthorizationDetails authorizationTime(String authorizationTime) {
    
    this.authorizationTime = authorizationTime;
    return this;
  }

   /**
   * Authorization time.
   * @return authorizationTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Authorization time.")
  public String getAuthorizationTime() {
    return authorizationTime;
  }


  public void setAuthorizationTime(String authorizationTime) {
    this.authorizationTime = authorizationTime;
  }


  public AuthorizationDetails authorizationStatus(String authorizationStatus) {
    
    this.authorizationStatus = authorizationStatus;
    return this;
  }

   /**
   * Status of the authorization.
   * @return authorizationStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the authorization.")
  public String getAuthorizationStatus() {
    return authorizationStatus;
  }


  public void setAuthorizationStatus(String authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
  }


  public AuthorizationDetails paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the transaction.
   * @return paymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A unique ID passed by merchant for identifying the transaction.")
  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public AuthorizationDetails paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method used for the authorization.
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment method used for the authorization.")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationDetails authorizationDetails = (AuthorizationDetails) o;
    return Objects.equals(this.authorizationAmount, authorizationDetails.authorizationAmount) &&
        Objects.equals(this.authorizationAmountRefund, authorizationDetails.authorizationAmountRefund) &&
        Objects.equals(this.authorizationReference, authorizationDetails.authorizationReference) &&
        Objects.equals(this.authorizationTime, authorizationDetails.authorizationTime) &&
        Objects.equals(this.authorizationStatus, authorizationDetails.authorizationStatus) &&
        Objects.equals(this.paymentId, authorizationDetails.paymentId) &&
        Objects.equals(this.paymentMethod, authorizationDetails.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationAmount, authorizationAmountRefund, authorizationReference, authorizationTime, authorizationStatus, paymentId, paymentMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationDetails {\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorizationAmountRefund: ").append(toIndentedString(authorizationAmountRefund)).append("\n");
    sb.append("    authorizationReference: ").append(toIndentedString(authorizationReference)).append("\n");
    sb.append("    authorizationTime: ").append(toIndentedString(authorizationTime)).append("\n");
    sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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
    openapiFields.add("authorization_amount");
    openapiFields.add("authorization_amount_refund");
    openapiFields.add("authorization_reference");
    openapiFields.add("authorization_time");
    openapiFields.add("authorization_status");
    openapiFields.add("payment_id");
    openapiFields.add("payment_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthorizationDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authorization_reference") != null && !jsonObj.get("authorization_reference").isJsonNull()) && !jsonObj.get("authorization_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_reference").toString()));
      }
      if ((jsonObj.get("authorization_time") != null && !jsonObj.get("authorization_time").isJsonNull()) && !jsonObj.get("authorization_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_time").toString()));
      }
      if ((jsonObj.get("authorization_status") != null && !jsonObj.get("authorization_status").isJsonNull()) && !jsonObj.get("authorization_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_status").toString()));
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AuthorizationDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authorization_reference") != null && !jsonObj.get("authorization_reference").isJsonNull()) && !jsonObj.get("authorization_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_reference").toString()));
      }
      if ((jsonObj.get("authorization_time") != null && !jsonObj.get("authorization_time").isJsonNull()) && !jsonObj.get("authorization_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_time").toString()));
      }
      if ((jsonObj.get("authorization_status") != null && !jsonObj.get("authorization_status").isJsonNull()) && !jsonObj.get("authorization_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorization_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorization_status").toString()));
      }
      if ((jsonObj.get("payment_id") != null && !jsonObj.get("payment_id").isJsonNull()) && !jsonObj.get("payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_id").toString()));
      }
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationDetails>() {
           @Override
           public void write(JsonWriter out, AuthorizationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorizationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorizationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationDetails
  * @throws IOException if the JSON string is invalid with respect to AuthorizationDetails
  */
  public static AuthorizationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationDetails.class);
  }

 /**
  * Convert an instance of AuthorizationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * CreateSubscriptionRequestAuthorizationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:56:23.887789Z[Etc/UTC]")
public class CreateSubscriptionRequestAuthorizationDetails {
  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT = "authorization_amount";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT)
  private BigDecimal authorizationAmount;

  public static final String SERIALIZED_NAME_AUTHORIZATION_AMOUNT_REFUND = "authorization_amount_refund";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_AMOUNT_REFUND)
  private Boolean authorizationAmountRefund;

  public static final String SERIALIZED_NAME_PAYMENT_METHODS = "payment_methods";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHODS)
  private List<String> paymentMethods;

  public CreateSubscriptionRequestAuthorizationDetails() {
  }

  public CreateSubscriptionRequestAuthorizationDetails authorizationAmount(BigDecimal authorizationAmount) {
    
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


  public CreateSubscriptionRequestAuthorizationDetails authorizationAmountRefund(Boolean authorizationAmountRefund) {
    
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


  public CreateSubscriptionRequestAuthorizationDetails paymentMethods(List<String> paymentMethods) {
    
    this.paymentMethods = paymentMethods;
    return this;
  }

  public CreateSubscriptionRequestAuthorizationDetails addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Payment methods for the subscription. enach, pnach, upi, card are possible values.
   * @return paymentMethods
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment methods for the subscription. enach, pnach, upi, card are possible values.")
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }


  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionRequestAuthorizationDetails createSubscriptionRequestAuthorizationDetails = (CreateSubscriptionRequestAuthorizationDetails) o;
    return Objects.equals(this.authorizationAmount, createSubscriptionRequestAuthorizationDetails.authorizationAmount) &&
        Objects.equals(this.authorizationAmountRefund, createSubscriptionRequestAuthorizationDetails.authorizationAmountRefund) &&
        Objects.equals(this.paymentMethods, createSubscriptionRequestAuthorizationDetails.paymentMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationAmount, authorizationAmountRefund, paymentMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequestAuthorizationDetails {\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorizationAmountRefund: ").append(toIndentedString(authorizationAmountRefund)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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
    openapiFields.add("payment_methods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequestAuthorizationDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("payment_methods") != null && !jsonObj.get("payment_methods").isJsonNull() && !jsonObj.get("payment_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_methods` to be an array in the JSON string but got `%s`", jsonObj.get("payment_methods").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequestAuthorizationDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("payment_methods") != null && !jsonObj.get("payment_methods").isJsonNull() && !jsonObj.get("payment_methods").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_methods` to be an array in the JSON string but got `%s`", jsonObj.get("payment_methods").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionRequestAuthorizationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionRequestAuthorizationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionRequestAuthorizationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionRequestAuthorizationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionRequestAuthorizationDetails>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionRequestAuthorizationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionRequestAuthorizationDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionRequestAuthorizationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionRequestAuthorizationDetails
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionRequestAuthorizationDetails
  */
  public static CreateSubscriptionRequestAuthorizationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionRequestAuthorizationDetails.class);
  }

 /**
  * Convert an instance of CreateSubscriptionRequestAuthorizationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.model.OfferEntity;
import com.cashfree.model.PaymentEntity;
import com.cashfree.model.PaymentWebhookCustomerEntity;
import com.cashfree.model.PaymentWebhookErrorEntity;
import com.cashfree.model.PaymentWebhookGatewayDetailsEntity;
import com.cashfree.model.PaymentWebhookOrderEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
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
 * data entity in webhook
 */
@Schema(description = "data entity in webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class PaymentWebhookDataEntity {
  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private PaymentWebhookOrderEntity order;

  public static final String SERIALIZED_NAME_PAYMENT = "payment";
  @SerializedName(SERIALIZED_NAME_PAYMENT)
  private PaymentEntity payment;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private PaymentWebhookCustomerEntity customerDetails;

  public static final String SERIALIZED_NAME_ERROR_DETAILS = "error_details";
  @SerializedName(SERIALIZED_NAME_ERROR_DETAILS)
  private PaymentWebhookErrorEntity errorDetails;

  public static final String SERIALIZED_NAME_PAYMENT_GATEWAY_DETAILS = "payment_gateway_details";
  @SerializedName(SERIALIZED_NAME_PAYMENT_GATEWAY_DETAILS)
  private PaymentWebhookGatewayDetailsEntity paymentGatewayDetails;

  public static final String SERIALIZED_NAME_PAYMENT_OFFERS = "payment_offers";
  @SerializedName(SERIALIZED_NAME_PAYMENT_OFFERS)
  private List<OfferEntity> paymentOffers;

  public PaymentWebhookDataEntity() {
  }

  public PaymentWebhookDataEntity order(PaymentWebhookOrderEntity order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentWebhookOrderEntity getOrder() {
    return order;
  }


  public void setOrder(PaymentWebhookOrderEntity order) {
    this.order = order;
  }


  public PaymentWebhookDataEntity payment(PaymentEntity payment) {
    
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentEntity getPayment() {
    return payment;
  }


  public void setPayment(PaymentEntity payment) {
    this.payment = payment;
  }


  public PaymentWebhookDataEntity customerDetails(PaymentWebhookCustomerEntity customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentWebhookCustomerEntity getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(PaymentWebhookCustomerEntity customerDetails) {
    this.customerDetails = customerDetails;
  }


  public PaymentWebhookDataEntity errorDetails(PaymentWebhookErrorEntity errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentWebhookErrorEntity getErrorDetails() {
    return errorDetails;
  }


  public void setErrorDetails(PaymentWebhookErrorEntity errorDetails) {
    this.errorDetails = errorDetails;
  }


  public PaymentWebhookDataEntity paymentGatewayDetails(PaymentWebhookGatewayDetailsEntity paymentGatewayDetails) {
    
    this.paymentGatewayDetails = paymentGatewayDetails;
    return this;
  }

   /**
   * Get paymentGatewayDetails
   * @return paymentGatewayDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentWebhookGatewayDetailsEntity getPaymentGatewayDetails() {
    return paymentGatewayDetails;
  }


  public void setPaymentGatewayDetails(PaymentWebhookGatewayDetailsEntity paymentGatewayDetails) {
    this.paymentGatewayDetails = paymentGatewayDetails;
  }


  public PaymentWebhookDataEntity paymentOffers(List<OfferEntity> paymentOffers) {
    
    this.paymentOffers = paymentOffers;
    return this;
  }

  public PaymentWebhookDataEntity addPaymentOffersItem(OfferEntity paymentOffersItem) {
    if (this.paymentOffers == null) {
      this.paymentOffers = new ArrayList<>();
    }
    this.paymentOffers.add(paymentOffersItem);
    return this;
  }

   /**
   * Get paymentOffers
   * @return paymentOffers
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<OfferEntity> getPaymentOffers() {
    return paymentOffers;
  }


  public void setPaymentOffers(List<OfferEntity> paymentOffers) {
    this.paymentOffers = paymentOffers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentWebhookDataEntity paymentWebhookDataEntity = (PaymentWebhookDataEntity) o;
    return Objects.equals(this.order, paymentWebhookDataEntity.order) &&
        Objects.equals(this.payment, paymentWebhookDataEntity.payment) &&
        Objects.equals(this.customerDetails, paymentWebhookDataEntity.customerDetails) &&
        Objects.equals(this.errorDetails, paymentWebhookDataEntity.errorDetails) &&
        Objects.equals(this.paymentGatewayDetails, paymentWebhookDataEntity.paymentGatewayDetails) &&
        Objects.equals(this.paymentOffers, paymentWebhookDataEntity.paymentOffers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, payment, customerDetails, errorDetails, paymentGatewayDetails, paymentOffers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentWebhookDataEntity {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    paymentGatewayDetails: ").append(toIndentedString(paymentGatewayDetails)).append("\n");
    sb.append("    paymentOffers: ").append(toIndentedString(paymentOffers)).append("\n");
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
    openapiFields.add("order");
    openapiFields.add("payment");
    openapiFields.add("customer_details");
    openapiFields.add("error_details");
    openapiFields.add("payment_gateway_details");
    openapiFields.add("payment_offers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentWebhookDataEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        PaymentWebhookOrderEntity.validateJsonElement(jsonObj.get("order"));
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        PaymentEntity.validateJsonElement(jsonObj.get("payment"));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        PaymentWebhookCustomerEntity.validateJsonElement(jsonObj.get("customer_details"));
      }
      // validate the optional field `error_details`
      if (jsonObj.get("error_details") != null && !jsonObj.get("error_details").isJsonNull()) {
        PaymentWebhookErrorEntity.validateJsonElement(jsonObj.get("error_details"));
      }
      // validate the optional field `payment_gateway_details`
      if (jsonObj.get("payment_gateway_details") != null && !jsonObj.get("payment_gateway_details").isJsonNull()) {
        PaymentWebhookGatewayDetailsEntity.validateJsonElement(jsonObj.get("payment_gateway_details"));
      }
      if (jsonObj.get("payment_offers") != null && !jsonObj.get("payment_offers").isJsonNull()) {
        JsonArray jsonArraypaymentOffers = jsonObj.getAsJsonArray("payment_offers");
        if (jsonArraypaymentOffers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_offers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_offers` to be an array in the JSON string but got `%s`", jsonObj.get("payment_offers").toString()));
          }

          // validate the optional field `payment_offers` (array)
          for (int i = 0; i < jsonArraypaymentOffers.size(); i++) {
            OfferEntity.validateJsonElement(jsonArraypaymentOffers.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentWebhookDataEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `order`
      if (jsonObj.get("order") != null && !jsonObj.get("order").isJsonNull()) {
        PaymentWebhookOrderEntity.validateJsonElement(jsonObj.get("order"));
        return true;
      }
      // validate the optional field `payment`
      if (jsonObj.get("payment") != null && !jsonObj.get("payment").isJsonNull()) {
        PaymentEntity.validateJsonElement(jsonObj.get("payment"));
        return true;
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        PaymentWebhookCustomerEntity.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      // validate the optional field `error_details`
      if (jsonObj.get("error_details") != null && !jsonObj.get("error_details").isJsonNull()) {
        PaymentWebhookErrorEntity.validateJsonElement(jsonObj.get("error_details"));
        return true;
      }
      // validate the optional field `payment_gateway_details`
      if (jsonObj.get("payment_gateway_details") != null && !jsonObj.get("payment_gateway_details").isJsonNull()) {
        PaymentWebhookGatewayDetailsEntity.validateJsonElement(jsonObj.get("payment_gateway_details"));
        return true;
      }
      if (jsonObj.get("payment_offers") != null && !jsonObj.get("payment_offers").isJsonNull()) {
        JsonArray jsonArraypaymentOffers = jsonObj.getAsJsonArray("payment_offers");
        if (jsonArraypaymentOffers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payment_offers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payment_offers` to be an array in the JSON string but got `%s`", jsonObj.get("payment_offers").toString()));
          }

          // validate the optional field `payment_offers` (array)
          for (int i = 0; i < jsonArraypaymentOffers.size(); i++) {
            OfferEntity.validateJsonElement(jsonArraypaymentOffers.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentWebhookDataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentWebhookDataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentWebhookDataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentWebhookDataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentWebhookDataEntity>() {
           @Override
           public void write(JsonWriter out, PaymentWebhookDataEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentWebhookDataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentWebhookDataEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentWebhookDataEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentWebhookDataEntity
  */
  public static PaymentWebhookDataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentWebhookDataEntity.class);
  }

 /**
  * Convert an instance of PaymentWebhookDataEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


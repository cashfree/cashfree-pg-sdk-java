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
import com.cashfree.model.AddressDetails;
import com.cashfree.model.ChargesEntity;
import com.cashfree.model.ExtendedCartDetails;
import com.cashfree.model.ExtendedCustomerDetails;
import com.cashfree.model.OfferExtendedDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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
 * The complete order extended data entity
 */
@Schema(description = "The complete order extended data entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class OrderExtendedDataEntity {
  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private String cfOrderId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private ChargesEntity charges;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private ExtendedCustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_SHIPPING_ADDRESS = "shipping_address";
  @SerializedName(SERIALIZED_NAME_SHIPPING_ADDRESS)
  private AddressDetails shippingAddress;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billing_address";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private AddressDetails billingAddress;

  public static final String SERIALIZED_NAME_CART = "cart";
  @SerializedName(SERIALIZED_NAME_CART)
  private ExtendedCartDetails cart;

  public static final String SERIALIZED_NAME_OFFER = "offer";
  @SerializedName(SERIALIZED_NAME_OFFER)
  private OfferExtendedDetails offer;

  public OrderExtendedDataEntity() {
  }

  public OrderExtendedDataEntity cfOrderId(String cfOrderId) {
    
    this.cfOrderId = cfOrderId;
    return this;
  }

   /**
   * unique id generated by cashfree for your order
   * @return cfOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "unique id generated by cashfree for your order")
  public String getCfOrderId() {
    return cfOrderId;
  }


  public void setCfOrderId(String cfOrderId) {
    this.cfOrderId = cfOrderId;
  }


  public OrderExtendedDataEntity orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * order_id sent during the api request
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "order_id sent during the api request")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderExtendedDataEntity orderAmount(BigDecimal orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Get orderAmount
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }


  public OrderExtendedDataEntity orderCurrency(String orderCurrency) {
    
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Currency of the order. Example INR
   * @return orderCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the order. Example INR")
  public String getOrderCurrency() {
    return orderCurrency;
  }


  public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
  }


  public OrderExtendedDataEntity createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When the order was created at cashfree&#39;s server
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Schema(example = "2022-08-16T14:45:38+05:30", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "When the order was created at cashfree's server")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public OrderExtendedDataEntity charges(ChargesEntity charges) {
    
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ChargesEntity getCharges() {
    return charges;
  }


  public void setCharges(ChargesEntity charges) {
    this.charges = charges;
  }


  public OrderExtendedDataEntity customerDetails(ExtendedCustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ExtendedCustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(ExtendedCustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public OrderExtendedDataEntity shippingAddress(AddressDetails shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AddressDetails getShippingAddress() {
    return shippingAddress;
  }


  public void setShippingAddress(AddressDetails shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public OrderExtendedDataEntity billingAddress(AddressDetails billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AddressDetails getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(AddressDetails billingAddress) {
    this.billingAddress = billingAddress;
  }


  public OrderExtendedDataEntity cart(ExtendedCartDetails cart) {
    
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ExtendedCartDetails getCart() {
    return cart;
  }


  public void setCart(ExtendedCartDetails cart) {
    this.cart = cart;
  }


  public OrderExtendedDataEntity offer(OfferExtendedDetails offer) {
    
    this.offer = offer;
    return this;
  }

   /**
   * Get offer
   * @return offer
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferExtendedDetails getOffer() {
    return offer;
  }


  public void setOffer(OfferExtendedDetails offer) {
    this.offer = offer;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExtendedDataEntity orderExtendedDataEntity = (OrderExtendedDataEntity) o;
    return Objects.equals(this.cfOrderId, orderExtendedDataEntity.cfOrderId) &&
        Objects.equals(this.orderId, orderExtendedDataEntity.orderId) &&
        Objects.equals(this.orderAmount, orderExtendedDataEntity.orderAmount) &&
        Objects.equals(this.orderCurrency, orderExtendedDataEntity.orderCurrency) &&
        Objects.equals(this.createdAt, orderExtendedDataEntity.createdAt) &&
        Objects.equals(this.charges, orderExtendedDataEntity.charges) &&
        Objects.equals(this.customerDetails, orderExtendedDataEntity.customerDetails) &&
        Objects.equals(this.shippingAddress, orderExtendedDataEntity.shippingAddress) &&
        Objects.equals(this.billingAddress, orderExtendedDataEntity.billingAddress) &&
        Objects.equals(this.cart, orderExtendedDataEntity.cart) &&
        Objects.equals(this.offer, orderExtendedDataEntity.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfOrderId, orderId, orderAmount, orderCurrency, createdAt, charges, customerDetails, shippingAddress, billingAddress, cart, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExtendedDataEntity {\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("order_amount");
    openapiFields.add("order_currency");
    openapiFields.add("created_at");
    openapiFields.add("charges");
    openapiFields.add("customer_details");
    openapiFields.add("shipping_address");
    openapiFields.add("billing_address");
    openapiFields.add("cart");
    openapiFields.add("offer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderExtendedDataEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      // validate the optional field `charges`
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        ChargesEntity.validateJsonElement(jsonObj.get("charges"));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        ExtendedCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      }
      // validate the optional field `shipping_address`
      if (jsonObj.get("shipping_address") != null && !jsonObj.get("shipping_address").isJsonNull()) {
        AddressDetails.validateJsonElement(jsonObj.get("shipping_address"));
      }
      // validate the optional field `billing_address`
      if (jsonObj.get("billing_address") != null && !jsonObj.get("billing_address").isJsonNull()) {
        AddressDetails.validateJsonElement(jsonObj.get("billing_address"));
      }
      // validate the optional field `cart`
      if (jsonObj.get("cart") != null && !jsonObj.get("cart").isJsonNull()) {
        ExtendedCartDetails.validateJsonElement(jsonObj.get("cart"));
      }
      // validate the optional field `offer`
      if (jsonObj.get("offer") != null && !jsonObj.get("offer").isJsonNull()) {
        OfferExtendedDetails.validateJsonElement(jsonObj.get("offer"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderExtendedDataEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      // validate the optional field `charges`
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        ChargesEntity.validateJsonElement(jsonObj.get("charges"));
        return true;
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        ExtendedCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      // validate the optional field `shipping_address`
      if (jsonObj.get("shipping_address") != null && !jsonObj.get("shipping_address").isJsonNull()) {
        AddressDetails.validateJsonElement(jsonObj.get("shipping_address"));
        return true;
      }
      // validate the optional field `billing_address`
      if (jsonObj.get("billing_address") != null && !jsonObj.get("billing_address").isJsonNull()) {
        AddressDetails.validateJsonElement(jsonObj.get("billing_address"));
        return true;
      }
      // validate the optional field `cart`
      if (jsonObj.get("cart") != null && !jsonObj.get("cart").isJsonNull()) {
        ExtendedCartDetails.validateJsonElement(jsonObj.get("cart"));
        return true;
      }
      // validate the optional field `offer`
      if (jsonObj.get("offer") != null && !jsonObj.get("offer").isJsonNull()) {
        OfferExtendedDetails.validateJsonElement(jsonObj.get("offer"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderExtendedDataEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderExtendedDataEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderExtendedDataEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderExtendedDataEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderExtendedDataEntity>() {
           @Override
           public void write(JsonWriter out, OrderExtendedDataEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderExtendedDataEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderExtendedDataEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderExtendedDataEntity
  * @throws IOException if the JSON string is invalid with respect to OrderExtendedDataEntity
  */
  public static OrderExtendedDataEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderExtendedDataEntity.class);
  }

 /**
  * Convert an instance of OrderExtendedDataEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


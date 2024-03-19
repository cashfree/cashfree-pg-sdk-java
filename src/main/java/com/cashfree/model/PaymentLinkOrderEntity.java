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
import com.cashfree.model.OrderMeta;
import com.cashfree.model.PaymentLinkCustomerDetails;
import com.cashfree.model.VendorSplit;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * The complete order entity
 */
@Schema(description = "The complete order entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class PaymentLinkOrderEntity {
  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private String cfOrderId;

  public static final String SERIALIZED_NAME_LINK_ID = "link_id";
  @SerializedName(SERIALIZED_NAME_LINK_ID)
  private String linkId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_PAYMENT_SESSION_ID = "payment_session_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SESSION_ID)
  private String paymentSessionId;

  public static final String SERIALIZED_NAME_ORDER_EXPIRY_TIME = "order_expiry_time";
  @SerializedName(SERIALIZED_NAME_ORDER_EXPIRY_TIME)
  private OffsetDateTime orderExpiryTime;

  public static final String SERIALIZED_NAME_ORDER_NOTE = "order_note";
  @SerializedName(SERIALIZED_NAME_ORDER_NOTE)
  private String orderNote;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ORDER_SPLITS = "order_splits";
  @SerializedName(SERIALIZED_NAME_ORDER_SPLITS)
  private List<VendorSplit> orderSplits;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private PaymentLinkCustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_ORDER_META = "order_meta";
  @SerializedName(SERIALIZED_NAME_ORDER_META)
  private OrderMeta orderMeta;

  public static final String SERIALIZED_NAME_ORDER_TAGS = "order_tags";
  @SerializedName(SERIALIZED_NAME_ORDER_TAGS)
  private Map<String, String> orderTags = new HashMap<>();

  public PaymentLinkOrderEntity() {
  }

  public PaymentLinkOrderEntity cfOrderId(String cfOrderId) {
    
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


  public PaymentLinkOrderEntity linkId(String linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * link id of the order
   * @return linkId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "link id of the order")
  public String getLinkId() {
    return linkId;
  }


  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  public PaymentLinkOrderEntity orderId(String orderId) {
    
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


  public PaymentLinkOrderEntity entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Type of the entity.
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of the entity.")
  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public PaymentLinkOrderEntity orderCurrency(String orderCurrency) {
    
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


  public PaymentLinkOrderEntity orderAmount(BigDecimal orderAmount) {
    
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


  public PaymentLinkOrderEntity orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Possible values are  - &#x60;ACTIVE&#x60;: Order does not have a sucessful transaction yet - &#x60;PAID&#x60;: Order is PAID with one successful transaction - &#x60;EXPIRED&#x60;: Order was not PAID and not it has expired. No transaction can be initiated for an EXPIRED order. 
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Possible values are  - `ACTIVE`: Order does not have a sucessful transaction yet - `PAID`: Order is PAID with one successful transaction - `EXPIRED`: Order was not PAID and not it has expired. No transaction can be initiated for an EXPIRED order. ")
  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public PaymentLinkOrderEntity paymentSessionId(String paymentSessionId) {
    
    this.paymentSessionId = paymentSessionId;
    return this;
  }

   /**
   * Get paymentSessionId
   * @return paymentSessionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentSessionId() {
    return paymentSessionId;
  }


  public void setPaymentSessionId(String paymentSessionId) {
    this.paymentSessionId = paymentSessionId;
  }


  public PaymentLinkOrderEntity orderExpiryTime(OffsetDateTime orderExpiryTime) {
    
    this.orderExpiryTime = orderExpiryTime;
    return this;
  }

   /**
   * Get orderExpiryTime
   * @return orderExpiryTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OffsetDateTime getOrderExpiryTime() {
    return orderExpiryTime;
  }


  public void setOrderExpiryTime(OffsetDateTime orderExpiryTime) {
    this.orderExpiryTime = orderExpiryTime;
  }


  public PaymentLinkOrderEntity orderNote(String orderNote) {
    
    this.orderNote = orderNote;
    return this;
  }

   /**
   * Additional note for order
   * @return orderNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Additional note for order")
  public String getOrderNote() {
    return orderNote;
  }


  public void setOrderNote(String orderNote) {
    this.orderNote = orderNote;
  }


  public PaymentLinkOrderEntity createdAt(OffsetDateTime createdAt) {
    
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


  public PaymentLinkOrderEntity orderSplits(List<VendorSplit> orderSplits) {
    
    this.orderSplits = orderSplits;
    return this;
  }

  public PaymentLinkOrderEntity addOrderSplitsItem(VendorSplit orderSplitsItem) {
    if (this.orderSplits == null) {
      this.orderSplits = new ArrayList<>();
    }
    this.orderSplits.add(orderSplitsItem);
    return this;
  }

   /**
   * Get orderSplits
   * @return orderSplits
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<VendorSplit> getOrderSplits() {
    return orderSplits;
  }


  public void setOrderSplits(List<VendorSplit> orderSplits) {
    this.orderSplits = orderSplits;
  }


  public PaymentLinkOrderEntity customerDetails(PaymentLinkCustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentLinkCustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(PaymentLinkCustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public PaymentLinkOrderEntity orderMeta(OrderMeta orderMeta) {
    
    this.orderMeta = orderMeta;
    return this;
  }

   /**
   * Get orderMeta
   * @return orderMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OrderMeta getOrderMeta() {
    return orderMeta;
  }


  public void setOrderMeta(OrderMeta orderMeta) {
    this.orderMeta = orderMeta;
  }


  public PaymentLinkOrderEntity orderTags(Map<String, String> orderTags) {
    
    this.orderTags = orderTags;
    return this;
  }

  public PaymentLinkOrderEntity putOrderTagsItem(String key, String orderTagsItem) {
    if (this.orderTags == null) {
      this.orderTags = new HashMap<>();
    }
    this.orderTags.put(key, orderTagsItem);
    return this;
  }

   /**
   * Custom Tags in thr form of {\&quot;key\&quot;:\&quot;value\&quot;} which can be passed for an order. A maximum of 10 tags can be added
   * @return orderTags
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"product\":\"Laptop\",\"shipping_address\":\"123 Main St\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Custom Tags in thr form of {\"key\":\"value\"} which can be passed for an order. A maximum of 10 tags can be added")
  public Map<String, String> getOrderTags() {
    return orderTags;
  }


  public void setOrderTags(Map<String, String> orderTags) {
    this.orderTags = orderTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkOrderEntity paymentLinkOrderEntity = (PaymentLinkOrderEntity) o;
    return Objects.equals(this.cfOrderId, paymentLinkOrderEntity.cfOrderId) &&
        Objects.equals(this.linkId, paymentLinkOrderEntity.linkId) &&
        Objects.equals(this.orderId, paymentLinkOrderEntity.orderId) &&
        Objects.equals(this.entity, paymentLinkOrderEntity.entity) &&
        Objects.equals(this.orderCurrency, paymentLinkOrderEntity.orderCurrency) &&
        Objects.equals(this.orderAmount, paymentLinkOrderEntity.orderAmount) &&
        Objects.equals(this.orderStatus, paymentLinkOrderEntity.orderStatus) &&
        Objects.equals(this.paymentSessionId, paymentLinkOrderEntity.paymentSessionId) &&
        Objects.equals(this.orderExpiryTime, paymentLinkOrderEntity.orderExpiryTime) &&
        Objects.equals(this.orderNote, paymentLinkOrderEntity.orderNote) &&
        Objects.equals(this.createdAt, paymentLinkOrderEntity.createdAt) &&
        Objects.equals(this.orderSplits, paymentLinkOrderEntity.orderSplits) &&
        Objects.equals(this.customerDetails, paymentLinkOrderEntity.customerDetails) &&
        Objects.equals(this.orderMeta, paymentLinkOrderEntity.orderMeta) &&
        Objects.equals(this.orderTags, paymentLinkOrderEntity.orderTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfOrderId, linkId, orderId, entity, orderCurrency, orderAmount, orderStatus, paymentSessionId, orderExpiryTime, orderNote, createdAt, orderSplits, customerDetails, orderMeta, orderTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkOrderEntity {\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    paymentSessionId: ").append(toIndentedString(paymentSessionId)).append("\n");
    sb.append("    orderExpiryTime: ").append(toIndentedString(orderExpiryTime)).append("\n");
    sb.append("    orderNote: ").append(toIndentedString(orderNote)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    orderSplits: ").append(toIndentedString(orderSplits)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    orderMeta: ").append(toIndentedString(orderMeta)).append("\n");
    sb.append("    orderTags: ").append(toIndentedString(orderTags)).append("\n");
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
    openapiFields.add("link_id");
    openapiFields.add("order_id");
    openapiFields.add("entity");
    openapiFields.add("order_currency");
    openapiFields.add("order_amount");
    openapiFields.add("order_status");
    openapiFields.add("payment_session_id");
    openapiFields.add("order_expiry_time");
    openapiFields.add("order_note");
    openapiFields.add("created_at");
    openapiFields.add("order_splits");
    openapiFields.add("customer_details");
    openapiFields.add("order_meta");
    openapiFields.add("order_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentLinkOrderEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("link_id") != null && !jsonObj.get("link_id").isJsonNull()) && !jsonObj.get("link_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonNull()) && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if ((jsonObj.get("payment_session_id") != null && !jsonObj.get("payment_session_id").isJsonNull()) && !jsonObj.get("payment_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_session_id").toString()));
      }
      if ((jsonObj.get("order_note") != null && !jsonObj.get("order_note").isJsonNull()) && !jsonObj.get("order_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_note").toString()));
      }
      if (jsonObj.get("order_splits") != null && !jsonObj.get("order_splits").isJsonNull()) {
        JsonArray jsonArrayorderSplits = jsonObj.getAsJsonArray("order_splits");
        if (jsonArrayorderSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("order_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `order_splits` to be an array in the JSON string but got `%s`", jsonObj.get("order_splits").toString()));
          }

          // validate the optional field `order_splits` (array)
          for (int i = 0; i < jsonArrayorderSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayorderSplits.get(i));
          };
        }
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        PaymentLinkCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      }
      // validate the optional field `order_meta`
      if (jsonObj.get("order_meta") != null && !jsonObj.get("order_meta").isJsonNull()) {
        OrderMeta.validateJsonElement(jsonObj.get("order_meta"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentLinkOrderEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_order_id") != null && !jsonObj.get("cf_order_id").isJsonNull()) && !jsonObj.get("cf_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_order_id").toString()));
      }
      if ((jsonObj.get("link_id") != null && !jsonObj.get("link_id").isJsonNull()) && !jsonObj.get("link_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonNull()) && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if ((jsonObj.get("payment_session_id") != null && !jsonObj.get("payment_session_id").isJsonNull()) && !jsonObj.get("payment_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_session_id").toString()));
      }
      if ((jsonObj.get("order_note") != null && !jsonObj.get("order_note").isJsonNull()) && !jsonObj.get("order_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_note").toString()));
      }
      if (jsonObj.get("order_splits") != null && !jsonObj.get("order_splits").isJsonNull()) {
        JsonArray jsonArrayorderSplits = jsonObj.getAsJsonArray("order_splits");
        if (jsonArrayorderSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("order_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `order_splits` to be an array in the JSON string but got `%s`", jsonObj.get("order_splits").toString()));
          }

          // validate the optional field `order_splits` (array)
          for (int i = 0; i < jsonArrayorderSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayorderSplits.get(i));
          };
        }
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        PaymentLinkCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      // validate the optional field `order_meta`
      if (jsonObj.get("order_meta") != null && !jsonObj.get("order_meta").isJsonNull()) {
        OrderMeta.validateJsonElement(jsonObj.get("order_meta"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentLinkOrderEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentLinkOrderEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentLinkOrderEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentLinkOrderEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentLinkOrderEntity>() {
           @Override
           public void write(JsonWriter out, PaymentLinkOrderEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentLinkOrderEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentLinkOrderEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentLinkOrderEntity
  * @throws IOException if the JSON string is invalid with respect to PaymentLinkOrderEntity
  */
  public static PaymentLinkOrderEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentLinkOrderEntity.class);
  }

 /**
  * Convert an instance of PaymentLinkOrderEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


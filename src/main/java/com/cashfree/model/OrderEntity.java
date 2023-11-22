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
import com.cashfree.model.CustomerDetails;
import com.cashfree.model.OrderMeta;
import com.cashfree.model.PaymentURLObject;
import com.cashfree.model.RefundURLObject;
import com.cashfree.model.SettlementURLObject;
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
import org.openapitools.jackson.nullable.JsonNullable;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:53:25.180420Z[Etc/UTC]")
public class OrderEntity {
  public static final String SERIALIZED_NAME_CF_ORDER_ID = "cf_order_id";
  @SerializedName(SERIALIZED_NAME_CF_ORDER_ID)
  private Long cfOrderId;

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
  private CustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_ORDER_META = "order_meta";
  @SerializedName(SERIALIZED_NAME_ORDER_META)
  private OrderMeta orderMeta;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private PaymentURLObject payments;

  public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";
  @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
  private SettlementURLObject settlements;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private RefundURLObject refunds;

  public static final String SERIALIZED_NAME_ORDER_TAGS = "order_tags";
  @SerializedName(SERIALIZED_NAME_ORDER_TAGS)
  private Map<String, String> orderTags;

  public OrderEntity() {
  }

  public OrderEntity cfOrderId(Long cfOrderId) {
    
    this.cfOrderId = cfOrderId;
    return this;
  }

   /**
   * unique id generated by cashfree for your order
   * @return cfOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "unique id generated by cashfree for your order")
  public Long getCfOrderId() {
    return cfOrderId;
  }


  public void setCfOrderId(Long cfOrderId) {
    this.cfOrderId = cfOrderId;
  }


  public OrderEntity orderId(String orderId) {
    
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


  public OrderEntity entity(String entity) {
    
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


  public OrderEntity orderCurrency(String orderCurrency) {
    
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


  public OrderEntity orderAmount(BigDecimal orderAmount) {
    
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


  public OrderEntity orderStatus(String orderStatus) {
    
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


  public OrderEntity paymentSessionId(String paymentSessionId) {
    
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


  public OrderEntity orderExpiryTime(OffsetDateTime orderExpiryTime) {
    
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


  public OrderEntity orderNote(String orderNote) {
    
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


  public OrderEntity createdAt(OffsetDateTime createdAt) {
    
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


  public OrderEntity orderSplits(List<VendorSplit> orderSplits) {
    
    this.orderSplits = orderSplits;
    return this;
  }

  public OrderEntity addOrderSplitsItem(VendorSplit orderSplitsItem) {
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


  public OrderEntity customerDetails(CustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(CustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public OrderEntity orderMeta(OrderMeta orderMeta) {
    
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


  public OrderEntity payments(PaymentURLObject payments) {
    
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PaymentURLObject getPayments() {
    return payments;
  }


  public void setPayments(PaymentURLObject payments) {
    this.payments = payments;
  }


  public OrderEntity settlements(SettlementURLObject settlements) {
    
    this.settlements = settlements;
    return this;
  }

   /**
   * Get settlements
   * @return settlements
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SettlementURLObject getSettlements() {
    return settlements;
  }


  public void setSettlements(SettlementURLObject settlements) {
    this.settlements = settlements;
  }


  public OrderEntity refunds(RefundURLObject refunds) {
    
    this.refunds = refunds;
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public RefundURLObject getRefunds() {
    return refunds;
  }


  public void setRefunds(RefundURLObject refunds) {
    this.refunds = refunds;
  }


  public OrderEntity orderTags(Map<String, String> orderTags) {
    
    this.orderTags = orderTags;
    return this;
  }

  public OrderEntity putOrderTagsItem(String key, String orderTagsItem) {
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
    OrderEntity orderEntity = (OrderEntity) o;
    return Objects.equals(this.cfOrderId, orderEntity.cfOrderId) &&
        Objects.equals(this.orderId, orderEntity.orderId) &&
        Objects.equals(this.entity, orderEntity.entity) &&
        Objects.equals(this.orderCurrency, orderEntity.orderCurrency) &&
        Objects.equals(this.orderAmount, orderEntity.orderAmount) &&
        Objects.equals(this.orderStatus, orderEntity.orderStatus) &&
        Objects.equals(this.paymentSessionId, orderEntity.paymentSessionId) &&
        Objects.equals(this.orderExpiryTime, orderEntity.orderExpiryTime) &&
        Objects.equals(this.orderNote, orderEntity.orderNote) &&
        Objects.equals(this.createdAt, orderEntity.createdAt) &&
        Objects.equals(this.orderSplits, orderEntity.orderSplits) &&
        Objects.equals(this.customerDetails, orderEntity.customerDetails) &&
        Objects.equals(this.orderMeta, orderEntity.orderMeta) &&
        Objects.equals(this.payments, orderEntity.payments) &&
        Objects.equals(this.settlements, orderEntity.settlements) &&
        Objects.equals(this.refunds, orderEntity.refunds) &&
        Objects.equals(this.orderTags, orderEntity.orderTags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfOrderId, orderId, entity, orderCurrency, orderAmount, orderStatus, paymentSessionId, orderExpiryTime, orderNote, createdAt, orderSplits, customerDetails, orderMeta, payments, settlements, refunds, orderTags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEntity {\n");
    sb.append("    cfOrderId: ").append(toIndentedString(cfOrderId)).append("\n");
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
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
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
    openapiFields.add("payments");
    openapiFields.add("settlements");
    openapiFields.add("refunds");
    openapiFields.add("order_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
        CustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      }
      // validate the optional field `order_meta`
      if (jsonObj.get("order_meta") != null && !jsonObj.get("order_meta").isJsonNull()) {
        OrderMeta.validateJsonElement(jsonObj.get("order_meta"));
      }
      // validate the optional field `payments`
      if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
        PaymentURLObject.validateJsonElement(jsonObj.get("payments"));
      }
      // validate the optional field `settlements`
      if (jsonObj.get("settlements") != null && !jsonObj.get("settlements").isJsonNull()) {
        SettlementURLObject.validateJsonElement(jsonObj.get("settlements"));
      }
      // validate the optional field `refunds`
      if (jsonObj.get("refunds") != null && !jsonObj.get("refunds").isJsonNull()) {
        RefundURLObject.validateJsonElement(jsonObj.get("refunds"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderEntity>() {
           @Override
           public void write(JsonWriter out, OrderEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderEntity
  * @throws IOException if the JSON string is invalid with respect to OrderEntity
  */
  public static OrderEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderEntity.class);
  }

 /**
  * Convert an instance of OrderEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


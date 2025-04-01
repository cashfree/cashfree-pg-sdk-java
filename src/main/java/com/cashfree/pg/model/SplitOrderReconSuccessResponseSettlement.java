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
import java.time.OffsetDateTime;
import java.util.Arrays;
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

import com.cashfree.pg.JSON;

/**
 * Details of the settlement information.
 */
@Schema(description = "Details of the settlement information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T11:00:02.685522Z[Etc/UTC]")
public class SplitOrderReconSuccessResponseSettlement {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_CF_SETTLEMENT_ID = "cf_settlement_id";
  @SerializedName(SERIALIZED_NAME_CF_SETTLEMENT_ID)
  private Long cfSettlementId;

  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private Long cfPaymentId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_CURRENCY = "order_currency";
  @SerializedName(SERIALIZED_NAME_ORDER_CURRENCY)
  private String orderCurrency;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_SERVICE_CHARGE = "service_charge";
  @SerializedName(SERIALIZED_NAME_SERVICE_CHARGE)
  private BigDecimal serviceCharge;

  public static final String SERIALIZED_NAME_SERVICE_TAX = "service_tax";
  @SerializedName(SERIALIZED_NAME_SERVICE_TAX)
  private BigDecimal serviceTax;

  public static final String SERIALIZED_NAME_SETTLEMENT_AMOUNT = "settlement_amount";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_AMOUNT)
  private BigDecimal settlementAmount;

  public static final String SERIALIZED_NAME_SETTLEMENT_CURRENCY = "settlement_currency";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CURRENCY)
  private String settlementCurrency;

  public static final String SERIALIZED_NAME_TRANSFER_UTR = "transfer_utr";
  @SerializedName(SERIALIZED_NAME_TRANSFER_UTR)
  private String transferUtr;

  public static final String SERIALIZED_NAME_TRANSFER_TIME = "transfer_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TIME)
  private OffsetDateTime transferTime;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "payment_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private OffsetDateTime paymentTime;

  public SplitOrderReconSuccessResponseSettlement() {
  }

  public SplitOrderReconSuccessResponseSettlement entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Type of entity. Example: \&quot;settlement\&quot;.
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of entity. Example: \"settlement\".")
  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public SplitOrderReconSuccessResponseSettlement cfSettlementId(Long cfSettlementId) {
    
    this.cfSettlementId = cfSettlementId;
    return this;
  }

   /**
   * Unique Cashfree settlement ID.
   * @return cfSettlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique Cashfree settlement ID.")
  public Long getCfSettlementId() {
    return cfSettlementId;
  }


  public void setCfSettlementId(Long cfSettlementId) {
    this.cfSettlementId = cfSettlementId;
  }


  public SplitOrderReconSuccessResponseSettlement cfPaymentId(Long cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Unique Cashfree payment ID associated with the order.
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique Cashfree payment ID associated with the order.")
  public Long getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(Long cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public SplitOrderReconSuccessResponseSettlement orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique identifier for the order.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique identifier for the order.")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public SplitOrderReconSuccessResponseSettlement orderCurrency(String orderCurrency) {
    
    this.orderCurrency = orderCurrency;
    return this;
  }

   /**
   * Currency of the order. Example: \&quot;INR\&quot;.
   * @return orderCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the order. Example: \"INR\".")
  public String getOrderCurrency() {
    return orderCurrency;
  }


  public void setOrderCurrency(String orderCurrency) {
    this.orderCurrency = orderCurrency;
  }


  public SplitOrderReconSuccessResponseSettlement transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Unique transfer ID if available, otherwise null.
   * @return transferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique transfer ID if available, otherwise null.")
  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public SplitOrderReconSuccessResponseSettlement orderAmount(BigDecimal orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * Total amount of the order.
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Total amount of the order.")
  public BigDecimal getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }


  public SplitOrderReconSuccessResponseSettlement serviceCharge(BigDecimal serviceCharge) {
    
    this.serviceCharge = serviceCharge;
    return this;
  }

   /**
   * Service charge for the order.
   * @return serviceCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service charge for the order.")
  public BigDecimal getServiceCharge() {
    return serviceCharge;
  }


  public void setServiceCharge(BigDecimal serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  public SplitOrderReconSuccessResponseSettlement serviceTax(BigDecimal serviceTax) {
    
    this.serviceTax = serviceTax;
    return this;
  }

   /**
   * Service tax for the order.
   * @return serviceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Service tax for the order.")
  public BigDecimal getServiceTax() {
    return serviceTax;
  }


  public void setServiceTax(BigDecimal serviceTax) {
    this.serviceTax = serviceTax;
  }


  public SplitOrderReconSuccessResponseSettlement settlementAmount(BigDecimal settlementAmount) {
    
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * Amount to be settled after charges and tax.
   * @return settlementAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Amount to be settled after charges and tax.")
  public BigDecimal getSettlementAmount() {
    return settlementAmount;
  }


  public void setSettlementAmount(BigDecimal settlementAmount) {
    this.settlementAmount = settlementAmount;
  }


  public SplitOrderReconSuccessResponseSettlement settlementCurrency(String settlementCurrency) {
    
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * Currency of the settlement. Example: \&quot;INR\&quot;.
   * @return settlementCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the settlement. Example: \"INR\".")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }


  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  public SplitOrderReconSuccessResponseSettlement transferUtr(String transferUtr) {
    
    this.transferUtr = transferUtr;
    return this;
  }

   /**
   * UTR (Unique Transaction Reference) for the transfer if available, otherwise null.
   * @return transferUtr
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "UTR (Unique Transaction Reference) for the transfer if available, otherwise null.")
  public String getTransferUtr() {
    return transferUtr;
  }


  public void setTransferUtr(String transferUtr) {
    this.transferUtr = transferUtr;
  }


  public SplitOrderReconSuccessResponseSettlement transferTime(OffsetDateTime transferTime) {
    
    this.transferTime = transferTime;
    return this;
  }

   /**
   * Time of transfer if available, otherwise null.
   * @return transferTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time of transfer if available, otherwise null.")
  public OffsetDateTime getTransferTime() {
    return transferTime;
  }


  public void setTransferTime(OffsetDateTime transferTime) {
    this.transferTime = transferTime;
  }


  public SplitOrderReconSuccessResponseSettlement paymentTime(OffsetDateTime paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * Timestamp when payment was made.
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Timestamp when payment was made.")
  public OffsetDateTime getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(OffsetDateTime paymentTime) {
    this.paymentTime = paymentTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitOrderReconSuccessResponseSettlement splitOrderReconSuccessResponseSettlement = (SplitOrderReconSuccessResponseSettlement) o;
    return Objects.equals(this.entity, splitOrderReconSuccessResponseSettlement.entity) &&
        Objects.equals(this.cfSettlementId, splitOrderReconSuccessResponseSettlement.cfSettlementId) &&
        Objects.equals(this.cfPaymentId, splitOrderReconSuccessResponseSettlement.cfPaymentId) &&
        Objects.equals(this.orderId, splitOrderReconSuccessResponseSettlement.orderId) &&
        Objects.equals(this.orderCurrency, splitOrderReconSuccessResponseSettlement.orderCurrency) &&
        Objects.equals(this.transferId, splitOrderReconSuccessResponseSettlement.transferId) &&
        Objects.equals(this.orderAmount, splitOrderReconSuccessResponseSettlement.orderAmount) &&
        Objects.equals(this.serviceCharge, splitOrderReconSuccessResponseSettlement.serviceCharge) &&
        Objects.equals(this.serviceTax, splitOrderReconSuccessResponseSettlement.serviceTax) &&
        Objects.equals(this.settlementAmount, splitOrderReconSuccessResponseSettlement.settlementAmount) &&
        Objects.equals(this.settlementCurrency, splitOrderReconSuccessResponseSettlement.settlementCurrency) &&
        Objects.equals(this.transferUtr, splitOrderReconSuccessResponseSettlement.transferUtr) &&
        Objects.equals(this.transferTime, splitOrderReconSuccessResponseSettlement.transferTime) &&
        Objects.equals(this.paymentTime, splitOrderReconSuccessResponseSettlement.paymentTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, cfSettlementId, cfPaymentId, orderId, orderCurrency, transferId, orderAmount, serviceCharge, serviceTax, settlementAmount, settlementCurrency, transferUtr, transferTime, paymentTime);
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
    sb.append("class SplitOrderReconSuccessResponseSettlement {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    cfSettlementId: ").append(toIndentedString(cfSettlementId)).append("\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderCurrency: ").append(toIndentedString(orderCurrency)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    serviceTax: ").append(toIndentedString(serviceTax)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    transferUtr: ").append(toIndentedString(transferUtr)).append("\n");
    sb.append("    transferTime: ").append(toIndentedString(transferTime)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("cf_settlement_id");
    openapiFields.add("cf_payment_id");
    openapiFields.add("order_id");
    openapiFields.add("order_currency");
    openapiFields.add("transfer_id");
    openapiFields.add("order_amount");
    openapiFields.add("service_charge");
    openapiFields.add("service_tax");
    openapiFields.add("settlement_amount");
    openapiFields.add("settlement_currency");
    openapiFields.add("transfer_utr");
    openapiFields.add("transfer_time");
    openapiFields.add("payment_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponseSettlement
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("transfer_id") != null && !jsonObj.get("transfer_id").isJsonNull()) && !jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("settlement_currency") != null && !jsonObj.get("settlement_currency").isJsonNull()) && !jsonObj.get("settlement_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_currency").toString()));
      }
      if ((jsonObj.get("transfer_utr") != null && !jsonObj.get("transfer_utr").isJsonNull()) && !jsonObj.get("transfer_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_utr").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SplitOrderReconSuccessResponseSettlement
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("order_currency") != null && !jsonObj.get("order_currency").isJsonNull()) && !jsonObj.get("order_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_currency").toString()));
      }
      if ((jsonObj.get("transfer_id") != null && !jsonObj.get("transfer_id").isJsonNull()) && !jsonObj.get("transfer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_id").toString()));
      }
      if ((jsonObj.get("settlement_currency") != null && !jsonObj.get("settlement_currency").isJsonNull()) && !jsonObj.get("settlement_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_currency").toString()));
      }
      if ((jsonObj.get("transfer_utr") != null && !jsonObj.get("transfer_utr").isJsonNull()) && !jsonObj.get("transfer_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_utr").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SplitOrderReconSuccessResponseSettlement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SplitOrderReconSuccessResponseSettlement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SplitOrderReconSuccessResponseSettlement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SplitOrderReconSuccessResponseSettlement.class));

       return (TypeAdapter<T>) new TypeAdapter<SplitOrderReconSuccessResponseSettlement>() {
           @Override
           public void write(JsonWriter out, SplitOrderReconSuccessResponseSettlement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SplitOrderReconSuccessResponseSettlement read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SplitOrderReconSuccessResponseSettlement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SplitOrderReconSuccessResponseSettlement
  * @throws IOException if the JSON string is invalid with respect to SplitOrderReconSuccessResponseSettlement
  */
  public static SplitOrderReconSuccessResponseSettlement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SplitOrderReconSuccessResponseSettlement.class);
  }

 /**
  * Convert an instance of SplitOrderReconSuccessResponseSettlement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


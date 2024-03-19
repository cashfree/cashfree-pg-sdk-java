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
 * Settlement entity object
 */
@Schema(description = "Settlement entity object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T11:26:29.184559Z[Etc/UTC]")
public class SettlementEntity {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_CF_SETTLEMENT_ID = "cf_settlement_id";
  @SerializedName(SERIALIZED_NAME_CF_SETTLEMENT_ID)
  private String cfSettlementId;

  public static final String SERIALIZED_NAME_SETTLEMENT_CURRENCY = "settlement_currency";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CURRENCY)
  private String settlementCurrency;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private BigDecimal orderAmount;

  public static final String SERIALIZED_NAME_PAYMENT_TIME = "payment_time";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TIME)
  private String paymentTime;

  public static final String SERIALIZED_NAME_SERVICE_CHARGE = "service_charge";
  @SerializedName(SERIALIZED_NAME_SERVICE_CHARGE)
  private BigDecimal serviceCharge;

  public static final String SERIALIZED_NAME_SERVICE_TAX = "service_tax";
  @SerializedName(SERIALIZED_NAME_SERVICE_TAX)
  private BigDecimal serviceTax;

  public static final String SERIALIZED_NAME_SETTLEMENT_AMOUNT = "settlement_amount";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_AMOUNT)
  private BigDecimal settlementAmount;

  public static final String SERIALIZED_NAME_SETTLEMENT_ID = "settlement_id";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ID)
  private Integer settlementId;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private Integer transferId;

  public static final String SERIALIZED_NAME_TRANSFER_TIME = "transfer_time";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TIME)
  private String transferTime;

  public static final String SERIALIZED_NAME_TRANSFER_UTR = "transfer_utr";
  @SerializedName(SERIALIZED_NAME_TRANSFER_UTR)
  private String transferUtr;

  public SettlementEntity() {
  }

  public SettlementEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Get cfPaymentId
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public SettlementEntity cfSettlementId(String cfSettlementId) {
    
    this.cfSettlementId = cfSettlementId;
    return this;
  }

   /**
   * Get cfSettlementId
   * @return cfSettlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCfSettlementId() {
    return cfSettlementId;
  }


  public void setCfSettlementId(String cfSettlementId) {
    this.cfSettlementId = cfSettlementId;
  }


  public SettlementEntity settlementCurrency(String settlementCurrency) {
    
    this.settlementCurrency = settlementCurrency;
    return this;
  }

   /**
   * Get settlementCurrency
   * @return settlementCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSettlementCurrency() {
    return settlementCurrency;
  }


  public void setSettlementCurrency(String settlementCurrency) {
    this.settlementCurrency = settlementCurrency;
  }


  public SettlementEntity orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public SettlementEntity entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public SettlementEntity orderAmount(BigDecimal orderAmount) {
    
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


  public SettlementEntity paymentTime(String paymentTime) {
    
    this.paymentTime = paymentTime;
    return this;
  }

   /**
   * Get paymentTime
   * @return paymentTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentTime() {
    return paymentTime;
  }


  public void setPaymentTime(String paymentTime) {
    this.paymentTime = paymentTime;
  }


  public SettlementEntity serviceCharge(BigDecimal serviceCharge) {
    
    this.serviceCharge = serviceCharge;
    return this;
  }

   /**
   * Get serviceCharge
   * @return serviceCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getServiceCharge() {
    return serviceCharge;
  }


  public void setServiceCharge(BigDecimal serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  public SettlementEntity serviceTax(BigDecimal serviceTax) {
    
    this.serviceTax = serviceTax;
    return this;
  }

   /**
   * Get serviceTax
   * @return serviceTax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getServiceTax() {
    return serviceTax;
  }


  public void setServiceTax(BigDecimal serviceTax) {
    this.serviceTax = serviceTax;
  }


  public SettlementEntity settlementAmount(BigDecimal settlementAmount) {
    
    this.settlementAmount = settlementAmount;
    return this;
  }

   /**
   * Get settlementAmount
   * @return settlementAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getSettlementAmount() {
    return settlementAmount;
  }


  public void setSettlementAmount(BigDecimal settlementAmount) {
    this.settlementAmount = settlementAmount;
  }


  public SettlementEntity settlementId(Integer settlementId) {
    
    this.settlementId = settlementId;
    return this;
  }

   /**
   * Get settlementId
   * @return settlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getSettlementId() {
    return settlementId;
  }


  public void setSettlementId(Integer settlementId) {
    this.settlementId = settlementId;
  }


  public SettlementEntity transferId(Integer transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Get transferId
   * @return transferId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getTransferId() {
    return transferId;
  }


  public void setTransferId(Integer transferId) {
    this.transferId = transferId;
  }


  public SettlementEntity transferTime(String transferTime) {
    
    this.transferTime = transferTime;
    return this;
  }

   /**
   * Get transferTime
   * @return transferTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTransferTime() {
    return transferTime;
  }


  public void setTransferTime(String transferTime) {
    this.transferTime = transferTime;
  }


  public SettlementEntity transferUtr(String transferUtr) {
    
    this.transferUtr = transferUtr;
    return this;
  }

   /**
   * Get transferUtr
   * @return transferUtr
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTransferUtr() {
    return transferUtr;
  }


  public void setTransferUtr(String transferUtr) {
    this.transferUtr = transferUtr;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettlementEntity settlementEntity = (SettlementEntity) o;
    return Objects.equals(this.cfPaymentId, settlementEntity.cfPaymentId) &&
        Objects.equals(this.cfSettlementId, settlementEntity.cfSettlementId) &&
        Objects.equals(this.settlementCurrency, settlementEntity.settlementCurrency) &&
        Objects.equals(this.orderId, settlementEntity.orderId) &&
        Objects.equals(this.entity, settlementEntity.entity) &&
        Objects.equals(this.orderAmount, settlementEntity.orderAmount) &&
        Objects.equals(this.paymentTime, settlementEntity.paymentTime) &&
        Objects.equals(this.serviceCharge, settlementEntity.serviceCharge) &&
        Objects.equals(this.serviceTax, settlementEntity.serviceTax) &&
        Objects.equals(this.settlementAmount, settlementEntity.settlementAmount) &&
        Objects.equals(this.settlementId, settlementEntity.settlementId) &&
        Objects.equals(this.transferId, settlementEntity.transferId) &&
        Objects.equals(this.transferTime, settlementEntity.transferTime) &&
        Objects.equals(this.transferUtr, settlementEntity.transferUtr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, cfSettlementId, settlementCurrency, orderId, entity, orderAmount, paymentTime, serviceCharge, serviceTax, settlementAmount, settlementId, transferId, transferTime, transferUtr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementEntity {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    cfSettlementId: ").append(toIndentedString(cfSettlementId)).append("\n");
    sb.append("    settlementCurrency: ").append(toIndentedString(settlementCurrency)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
    sb.append("    serviceCharge: ").append(toIndentedString(serviceCharge)).append("\n");
    sb.append("    serviceTax: ").append(toIndentedString(serviceTax)).append("\n");
    sb.append("    settlementAmount: ").append(toIndentedString(settlementAmount)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    transferTime: ").append(toIndentedString(transferTime)).append("\n");
    sb.append("    transferUtr: ").append(toIndentedString(transferUtr)).append("\n");
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
    openapiFields.add("cf_settlement_id");
    openapiFields.add("settlement_currency");
    openapiFields.add("order_id");
    openapiFields.add("entity");
    openapiFields.add("order_amount");
    openapiFields.add("payment_time");
    openapiFields.add("service_charge");
    openapiFields.add("service_tax");
    openapiFields.add("settlement_amount");
    openapiFields.add("settlement_id");
    openapiFields.add("transfer_id");
    openapiFields.add("transfer_time");
    openapiFields.add("transfer_utr");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_settlement_id") != null && !jsonObj.get("cf_settlement_id").isJsonNull()) && !jsonObj.get("cf_settlement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_settlement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_settlement_id").toString()));
      }
      if ((jsonObj.get("settlement_currency") != null && !jsonObj.get("settlement_currency").isJsonNull()) && !jsonObj.get("settlement_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_currency").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonNull()) && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if ((jsonObj.get("transfer_time") != null && !jsonObj.get("transfer_time").isJsonNull()) && !jsonObj.get("transfer_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_time").toString()));
      }
      if ((jsonObj.get("transfer_utr") != null && !jsonObj.get("transfer_utr").isJsonNull()) && !jsonObj.get("transfer_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_utr").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_settlement_id") != null && !jsonObj.get("cf_settlement_id").isJsonNull()) && !jsonObj.get("cf_settlement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_settlement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_settlement_id").toString()));
      }
      if ((jsonObj.get("settlement_currency") != null && !jsonObj.get("settlement_currency").isJsonNull()) && !jsonObj.get("settlement_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_currency").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("payment_time") != null && !jsonObj.get("payment_time").isJsonNull()) && !jsonObj.get("payment_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_time").toString()));
      }
      if ((jsonObj.get("transfer_time") != null && !jsonObj.get("transfer_time").isJsonNull()) && !jsonObj.get("transfer_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transfer_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transfer_time").toString()));
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
       if (!SettlementEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementEntity>() {
           @Override
           public void write(JsonWriter out, SettlementEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SettlementEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SettlementEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementEntity
  * @throws IOException if the JSON string is invalid with respect to SettlementEntity
  */
  public static SettlementEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementEntity.class);
  }

 /**
  * Convert an instance of SettlementEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


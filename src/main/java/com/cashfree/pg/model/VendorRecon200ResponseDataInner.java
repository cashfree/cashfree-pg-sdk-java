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
 * VendorRecon200ResponseDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T12:53:05.189649Z[Etc/UTC]")
public class VendorRecon200ResponseDataInner {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_SETTLEMENT_ELIGIBILITY_TIME = "settlement_eligibility_time";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ELIGIBILITY_TIME)
  private String settlementEligibilityTime;

  public static final String SERIALIZED_NAME_MERCHANT_ORDER_ID = "merchant_order_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ORDER_ID)
  private String merchantOrderId;

  public static final String SERIALIZED_NAME_TX_TIME = "tx_time";
  @SerializedName(SERIALIZED_NAME_TX_TIME)
  private String txTime;

  public static final String SERIALIZED_NAME_SETTLEMENT_ID = "settlement_id";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ID)
  private Integer settlementId;

  public static final String SERIALIZED_NAME_SETTLED = "settled";
  @SerializedName(SERIALIZED_NAME_SETTLED)
  private Boolean settled;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private String fee;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private String tax;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MERCHANT_VENDOR_ID = "merchant_vendor_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_VENDOR_ID)
  private String merchantVendorId;

  public static final String SERIALIZED_NAME_ADDED_ON_TIME = "added_on_time";
  @SerializedName(SERIALIZED_NAME_ADDED_ON_TIME)
  private String addedOnTime;

  public static final String SERIALIZED_NAME_SETTLEMENT_TIME = "settlement_time";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TIME)
  private String settlementTime;

  public static final String SERIALIZED_NAME_SETTLEMENT_UTR = "settlement_utr";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_UTR)
  private String settlementUtr;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DEBIT = "debit";
  @SerializedName(SERIALIZED_NAME_DEBIT)
  private String debit;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private String credit;

  public static final String SERIALIZED_NAME_REFUND_ARN = "refund_arn";
  @SerializedName(SERIALIZED_NAME_REFUND_ARN)
  private String refundArn;

  public VendorRecon200ResponseDataInner() {
  }

  public VendorRecon200ResponseDataInner amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public VendorRecon200ResponseDataInner settlementEligibilityTime(String settlementEligibilityTime) {
    
    this.settlementEligibilityTime = settlementEligibilityTime;
    return this;
  }

   /**
   * Get settlementEligibilityTime
   * @return settlementEligibilityTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSettlementEligibilityTime() {
    return settlementEligibilityTime;
  }


  public void setSettlementEligibilityTime(String settlementEligibilityTime) {
    this.settlementEligibilityTime = settlementEligibilityTime;
  }


  public VendorRecon200ResponseDataInner merchantOrderId(String merchantOrderId) {
    
    this.merchantOrderId = merchantOrderId;
    return this;
  }

   /**
   * Get merchantOrderId
   * @return merchantOrderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantOrderId() {
    return merchantOrderId;
  }


  public void setMerchantOrderId(String merchantOrderId) {
    this.merchantOrderId = merchantOrderId;
  }


  public VendorRecon200ResponseDataInner txTime(String txTime) {
    
    this.txTime = txTime;
    return this;
  }

   /**
   * Get txTime
   * @return txTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTxTime() {
    return txTime;
  }


  public void setTxTime(String txTime) {
    this.txTime = txTime;
  }


  public VendorRecon200ResponseDataInner settlementId(Integer settlementId) {
    
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


  public VendorRecon200ResponseDataInner settled(Boolean settled) {
    
    this.settled = settled;
    return this;
  }

   /**
   * Get settled
   * @return settled
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getSettled() {
    return settled;
  }


  public void setSettled(Boolean settled) {
    this.settled = settled;
  }


  public VendorRecon200ResponseDataInner fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getFee() {
    return fee;
  }


  public void setFee(String fee) {
    this.fee = fee;
  }


  public VendorRecon200ResponseDataInner tax(String tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTax() {
    return tax;
  }


  public void setTax(String tax) {
    this.tax = tax;
  }


  public VendorRecon200ResponseDataInner entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public VendorRecon200ResponseDataInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VendorRecon200ResponseDataInner merchantVendorId(String merchantVendorId) {
    
    this.merchantVendorId = merchantVendorId;
    return this;
  }

   /**
   * Get merchantVendorId
   * @return merchantVendorId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getMerchantVendorId() {
    return merchantVendorId;
  }


  public void setMerchantVendorId(String merchantVendorId) {
    this.merchantVendorId = merchantVendorId;
  }


  public VendorRecon200ResponseDataInner addedOnTime(String addedOnTime) {
    
    this.addedOnTime = addedOnTime;
    return this;
  }

   /**
   * Get addedOnTime
   * @return addedOnTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAddedOnTime() {
    return addedOnTime;
  }


  public void setAddedOnTime(String addedOnTime) {
    this.addedOnTime = addedOnTime;
  }


  public VendorRecon200ResponseDataInner settlementTime(String settlementTime) {
    
    this.settlementTime = settlementTime;
    return this;
  }

   /**
   * Get settlementTime
   * @return settlementTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSettlementTime() {
    return settlementTime;
  }


  public void setSettlementTime(String settlementTime) {
    this.settlementTime = settlementTime;
  }


  public VendorRecon200ResponseDataInner settlementUtr(String settlementUtr) {
    
    this.settlementUtr = settlementUtr;
    return this;
  }

   /**
   * Get settlementUtr
   * @return settlementUtr
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSettlementUtr() {
    return settlementUtr;
  }


  public void setSettlementUtr(String settlementUtr) {
    this.settlementUtr = settlementUtr;
  }


  public VendorRecon200ResponseDataInner currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public VendorRecon200ResponseDataInner debit(String debit) {
    
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getDebit() {
    return debit;
  }


  public void setDebit(String debit) {
    this.debit = debit;
  }


  public VendorRecon200ResponseDataInner credit(String credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCredit() {
    return credit;
  }


  public void setCredit(String credit) {
    this.credit = credit;
  }


  public VendorRecon200ResponseDataInner refundArn(String refundArn) {
    
    this.refundArn = refundArn;
    return this;
  }

   /**
   * Get refundArn
   * @return refundArn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getRefundArn() {
    return refundArn;
  }


  public void setRefundArn(String refundArn) {
    this.refundArn = refundArn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorRecon200ResponseDataInner vendorRecon200ResponseDataInner = (VendorRecon200ResponseDataInner) o;
    return Objects.equals(this.amount, vendorRecon200ResponseDataInner.amount) &&
        Objects.equals(this.settlementEligibilityTime, vendorRecon200ResponseDataInner.settlementEligibilityTime) &&
        Objects.equals(this.merchantOrderId, vendorRecon200ResponseDataInner.merchantOrderId) &&
        Objects.equals(this.txTime, vendorRecon200ResponseDataInner.txTime) &&
        Objects.equals(this.settlementId, vendorRecon200ResponseDataInner.settlementId) &&
        Objects.equals(this.settled, vendorRecon200ResponseDataInner.settled) &&
        Objects.equals(this.fee, vendorRecon200ResponseDataInner.fee) &&
        Objects.equals(this.tax, vendorRecon200ResponseDataInner.tax) &&
        Objects.equals(this.entityId, vendorRecon200ResponseDataInner.entityId) &&
        Objects.equals(this.type, vendorRecon200ResponseDataInner.type) &&
        Objects.equals(this.merchantVendorId, vendorRecon200ResponseDataInner.merchantVendorId) &&
        Objects.equals(this.addedOnTime, vendorRecon200ResponseDataInner.addedOnTime) &&
        Objects.equals(this.settlementTime, vendorRecon200ResponseDataInner.settlementTime) &&
        Objects.equals(this.settlementUtr, vendorRecon200ResponseDataInner.settlementUtr) &&
        Objects.equals(this.currency, vendorRecon200ResponseDataInner.currency) &&
        Objects.equals(this.debit, vendorRecon200ResponseDataInner.debit) &&
        Objects.equals(this.credit, vendorRecon200ResponseDataInner.credit) &&
        Objects.equals(this.refundArn, vendorRecon200ResponseDataInner.refundArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, settlementEligibilityTime, merchantOrderId, txTime, settlementId, settled, fee, tax, entityId, type, merchantVendorId, addedOnTime, settlementTime, settlementUtr, currency, debit, credit, refundArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorRecon200ResponseDataInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    settlementEligibilityTime: ").append(toIndentedString(settlementEligibilityTime)).append("\n");
    sb.append("    merchantOrderId: ").append(toIndentedString(merchantOrderId)).append("\n");
    sb.append("    txTime: ").append(toIndentedString(txTime)).append("\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    settled: ").append(toIndentedString(settled)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    merchantVendorId: ").append(toIndentedString(merchantVendorId)).append("\n");
    sb.append("    addedOnTime: ").append(toIndentedString(addedOnTime)).append("\n");
    sb.append("    settlementTime: ").append(toIndentedString(settlementTime)).append("\n");
    sb.append("    settlementUtr: ").append(toIndentedString(settlementUtr)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    refundArn: ").append(toIndentedString(refundArn)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("settlement_eligibility_time");
    openapiFields.add("merchant_order_id");
    openapiFields.add("tx_time");
    openapiFields.add("settlement_id");
    openapiFields.add("settled");
    openapiFields.add("fee");
    openapiFields.add("tax");
    openapiFields.add("entity_id");
    openapiFields.add("type");
    openapiFields.add("merchant_vendor_id");
    openapiFields.add("added_on_time");
    openapiFields.add("settlement_time");
    openapiFields.add("settlement_utr");
    openapiFields.add("currency");
    openapiFields.add("debit");
    openapiFields.add("credit");
    openapiFields.add("refund_arn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorRecon200ResponseDataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("settlement_eligibility_time") != null && !jsonObj.get("settlement_eligibility_time").isJsonNull()) && !jsonObj.get("settlement_eligibility_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_eligibility_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_eligibility_time").toString()));
      }
      if ((jsonObj.get("merchant_order_id") != null && !jsonObj.get("merchant_order_id").isJsonNull()) && !jsonObj.get("merchant_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_id").toString()));
      }
      if ((jsonObj.get("tx_time") != null && !jsonObj.get("tx_time").isJsonNull()) && !jsonObj.get("tx_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_time").toString()));
      }
      if ((jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) && !jsonObj.get("fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee").toString()));
      }
      if ((jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) && !jsonObj.get("tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("merchant_vendor_id") != null && !jsonObj.get("merchant_vendor_id").isJsonNull()) && !jsonObj.get("merchant_vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_vendor_id").toString()));
      }
      if ((jsonObj.get("added_on_time") != null && !jsonObj.get("added_on_time").isJsonNull()) && !jsonObj.get("added_on_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on_time").toString()));
      }
      if ((jsonObj.get("settlement_time") != null && !jsonObj.get("settlement_time").isJsonNull()) && !jsonObj.get("settlement_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_time").toString()));
      }
      if ((jsonObj.get("settlement_utr") != null && !jsonObj.get("settlement_utr").isJsonNull()) && !jsonObj.get("settlement_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_utr").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("debit") != null && !jsonObj.get("debit").isJsonNull()) && !jsonObj.get("debit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debit").toString()));
      }
      if ((jsonObj.get("credit") != null && !jsonObj.get("credit").isJsonNull()) && !jsonObj.get("credit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit").toString()));
      }
      if ((jsonObj.get("refund_arn") != null && !jsonObj.get("refund_arn").isJsonNull()) && !jsonObj.get("refund_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_arn").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to VendorRecon200ResponseDataInner
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("settlement_eligibility_time") != null && !jsonObj.get("settlement_eligibility_time").isJsonNull()) && !jsonObj.get("settlement_eligibility_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_eligibility_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_eligibility_time").toString()));
      }
      if ((jsonObj.get("merchant_order_id") != null && !jsonObj.get("merchant_order_id").isJsonNull()) && !jsonObj.get("merchant_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_order_id").toString()));
      }
      if ((jsonObj.get("tx_time") != null && !jsonObj.get("tx_time").isJsonNull()) && !jsonObj.get("tx_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_time").toString()));
      }
      if ((jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) && !jsonObj.get("fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee").toString()));
      }
      if ((jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) && !jsonObj.get("tax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("merchant_vendor_id") != null && !jsonObj.get("merchant_vendor_id").isJsonNull()) && !jsonObj.get("merchant_vendor_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_vendor_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_vendor_id").toString()));
      }
      if ((jsonObj.get("added_on_time") != null && !jsonObj.get("added_on_time").isJsonNull()) && !jsonObj.get("added_on_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on_time").toString()));
      }
      if ((jsonObj.get("settlement_time") != null && !jsonObj.get("settlement_time").isJsonNull()) && !jsonObj.get("settlement_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_time").toString()));
      }
      if ((jsonObj.get("settlement_utr") != null && !jsonObj.get("settlement_utr").isJsonNull()) && !jsonObj.get("settlement_utr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlement_utr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settlement_utr").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("debit") != null && !jsonObj.get("debit").isJsonNull()) && !jsonObj.get("debit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debit").toString()));
      }
      if ((jsonObj.get("credit") != null && !jsonObj.get("credit").isJsonNull()) && !jsonObj.get("credit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit").toString()));
      }
      if ((jsonObj.get("refund_arn") != null && !jsonObj.get("refund_arn").isJsonNull()) && !jsonObj.get("refund_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_arn").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VendorRecon200ResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VendorRecon200ResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VendorRecon200ResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VendorRecon200ResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<VendorRecon200ResponseDataInner>() {
           @Override
           public void write(JsonWriter out, VendorRecon200ResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VendorRecon200ResponseDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VendorRecon200ResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VendorRecon200ResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to VendorRecon200ResponseDataInner
  */
  public static VendorRecon200ResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VendorRecon200ResponseDataInner.class);
  }

 /**
  * Convert an instance of VendorRecon200ResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


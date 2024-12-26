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
import com.cashfree.model.RefundSpeed;
import com.cashfree.model.VendorSplit;
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
 * The refund entity
 */
@Schema(description = "The refund entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:56:23.887789Z[Etc/UTC]")
public class RefundEntity {
  public static final String SERIALIZED_NAME_CF_PAYMENT_ID = "cf_payment_id";
  @SerializedName(SERIALIZED_NAME_CF_PAYMENT_ID)
  private String cfPaymentId;

  public static final String SERIALIZED_NAME_CF_REFUND_ID = "cf_refund_id";
  @SerializedName(SERIALIZED_NAME_CF_REFUND_ID)
  private String cfRefundId;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_REFUND_ID = "refund_id";
  @SerializedName(SERIALIZED_NAME_REFUND_ID)
  private String refundId;

  /**
   * Type of object
   */
  @JsonAdapter(EntityEnum.Adapter.class)
  public enum EntityEnum {
    REFUND("refund"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    EntityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityEnum fromValue(String value) {
      for (EntityEnum b : EntityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<EntityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private EntityEnum entity;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private BigDecimal refundAmount;

  public static final String SERIALIZED_NAME_REFUND_CURRENCY = "refund_currency";
  @SerializedName(SERIALIZED_NAME_REFUND_CURRENCY)
  private String refundCurrency;

  public static final String SERIALIZED_NAME_REFUND_NOTE = "refund_note";
  @SerializedName(SERIALIZED_NAME_REFUND_NOTE)
  private String refundNote;

  /**
   * This can be one of [\&quot;SUCCESS\&quot;, \&quot;PENDING\&quot;, \&quot;CANCELLED\&quot;, \&quot;ONHOLD\&quot;, \&quot;FAILED\&quot;]
   */
  @JsonAdapter(RefundStatusEnum.Adapter.class)
  public enum RefundStatusEnum {
    SUCCESS("SUCCESS"),
    
    PENDING("PENDING"),
    
    CANCELLED("CANCELLED"),
    
    ONHOLD("ONHOLD"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RefundStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefundStatusEnum fromValue(String value) {
      for (RefundStatusEnum b : RefundStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<RefundStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefundStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefundStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFUND_STATUS = "refund_status";
  @SerializedName(SERIALIZED_NAME_REFUND_STATUS)
  private RefundStatusEnum refundStatus;

  public static final String SERIALIZED_NAME_REFUND_ARN = "refund_arn";
  @SerializedName(SERIALIZED_NAME_REFUND_ARN)
  private String refundArn;

  public static final String SERIALIZED_NAME_REFUND_CHARGE = "refund_charge";
  @SerializedName(SERIALIZED_NAME_REFUND_CHARGE)
  private BigDecimal refundCharge;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "status_description";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_REFUND_SPLITS = "refund_splits";
  @SerializedName(SERIALIZED_NAME_REFUND_SPLITS)
  private List<VendorSplit> refundSplits;

  /**
   * This can be one of [\&quot;PAYMENT_AUTO_REFUND\&quot;, \&quot;MERCHANT_INITIATED\&quot;, \&quot;UNRECONCILED_AUTO_REFUND\&quot;]
   */
  @JsonAdapter(RefundTypeEnum.Adapter.class)
  public enum RefundTypeEnum {
    PAYMENT_AUTO_REFUND("PAYMENT_AUTO_REFUND"),
    
    MERCHANT_INITIATED("MERCHANT_INITIATED"),
    
    UNRECONCILED_AUTO_REFUND("UNRECONCILED_AUTO_REFUND"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RefundTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefundTypeEnum fromValue(String value) {
      for (RefundTypeEnum b : RefundTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<RefundTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefundTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefundTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefundTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFUND_TYPE = "refund_type";
  @SerializedName(SERIALIZED_NAME_REFUND_TYPE)
  private RefundTypeEnum refundType;

  public static final String SERIALIZED_NAME_REFUND_MODE = "refund_mode";
  @SerializedName(SERIALIZED_NAME_REFUND_MODE)
  private String refundMode;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_PROCESSED_AT = "processed_at";
  @SerializedName(SERIALIZED_NAME_PROCESSED_AT)
  private String processedAt;

  public static final String SERIALIZED_NAME_REFUND_SPEED = "refund_speed";
  @SerializedName(SERIALIZED_NAME_REFUND_SPEED)
  private RefundSpeed refundSpeed;

  public RefundEntity() {
  }

  public RefundEntity cfPaymentId(String cfPaymentId) {
    
    this.cfPaymentId = cfPaymentId;
    return this;
  }

   /**
   * Cashfree Payments ID of the payment for which refund is initiated
   * @return cfPaymentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree Payments ID of the payment for which refund is initiated")
  public String getCfPaymentId() {
    return cfPaymentId;
  }


  public void setCfPaymentId(String cfPaymentId) {
    this.cfPaymentId = cfPaymentId;
  }


  public RefundEntity cfRefundId(String cfRefundId) {
    
    this.cfRefundId = cfRefundId;
    return this;
  }

   /**
   * Cashfree Payments ID for a refund
   * @return cfRefundId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree Payments ID for a refund")
  public String getCfRefundId() {
    return cfRefundId;
  }


  public void setCfRefundId(String cfRefundId) {
    this.cfRefundId = cfRefundId;
  }


  public RefundEntity orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Merchant’s order Id of the order for which refund is initiated
   * @return orderId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Merchant’s order Id of the order for which refund is initiated")
  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public RefundEntity refundId(String refundId) {
    
    this.refundId = refundId;
    return this;
  }

   /**
   * Merchant’s refund ID of the refund
   * @return refundId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Merchant’s refund ID of the refund")
  public String getRefundId() {
    return refundId;
  }


  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }


  public RefundEntity entity(EntityEnum entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Type of object
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of object")
  public EntityEnum getEntity() {
    return entity;
  }


  public void setEntity(EntityEnum entity) {
    this.entity = entity;
  }


  public RefundEntity refundAmount(BigDecimal refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Amount that is refunded
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Amount that is refunded")
  public BigDecimal getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(BigDecimal refundAmount) {
    this.refundAmount = refundAmount;
  }


  public RefundEntity refundCurrency(String refundCurrency) {
    
    this.refundCurrency = refundCurrency;
    return this;
  }

   /**
   * Currency of the refund amount
   * @return refundCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the refund amount")
  public String getRefundCurrency() {
    return refundCurrency;
  }


  public void setRefundCurrency(String refundCurrency) {
    this.refundCurrency = refundCurrency;
  }


  public RefundEntity refundNote(String refundNote) {
    
    this.refundNote = refundNote;
    return this;
  }

   /**
   * Note added by merchant for the refund
   * @return refundNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Note added by merchant for the refund")
  public String getRefundNote() {
    return refundNote;
  }


  public void setRefundNote(String refundNote) {
    this.refundNote = refundNote;
  }


  public RefundEntity refundStatus(RefundStatusEnum refundStatus) {
    
    this.refundStatus = refundStatus;
    return this;
  }

   /**
   * This can be one of [\&quot;SUCCESS\&quot;, \&quot;PENDING\&quot;, \&quot;CANCELLED\&quot;, \&quot;ONHOLD\&quot;, \&quot;FAILED\&quot;]
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This can be one of [\"SUCCESS\", \"PENDING\", \"CANCELLED\", \"ONHOLD\", \"FAILED\"]")
  public RefundStatusEnum getRefundStatus() {
    return refundStatus;
  }


  public void setRefundStatus(RefundStatusEnum refundStatus) {
    this.refundStatus = refundStatus;
  }


  public RefundEntity refundArn(String refundArn) {
    
    this.refundArn = refundArn;
    return this;
  }

   /**
   * The bank reference number for refund
   * @return refundArn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The bank reference number for refund")
  public String getRefundArn() {
    return refundArn;
  }


  public void setRefundArn(String refundArn) {
    this.refundArn = refundArn;
  }


  public RefundEntity refundCharge(BigDecimal refundCharge) {
    
    this.refundCharge = refundCharge;
    return this;
  }

   /**
   * Charges in INR for processing refund
   * @return refundCharge
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Charges in INR for processing refund")
  public BigDecimal getRefundCharge() {
    return refundCharge;
  }


  public void setRefundCharge(BigDecimal refundCharge) {
    this.refundCharge = refundCharge;
  }


  public RefundEntity statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Description of refund status
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Description of refund status")
  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public RefundEntity metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs
   * @return metadata
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs")
  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RefundEntity refundSplits(List<VendorSplit> refundSplits) {
    
    this.refundSplits = refundSplits;
    return this;
  }

  public RefundEntity addRefundSplitsItem(VendorSplit refundSplitsItem) {
    if (this.refundSplits == null) {
      this.refundSplits = new ArrayList<>();
    }
    this.refundSplits.add(refundSplitsItem);
    return this;
  }

   /**
   * Get refundSplits
   * @return refundSplits
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<VendorSplit> getRefundSplits() {
    return refundSplits;
  }


  public void setRefundSplits(List<VendorSplit> refundSplits) {
    this.refundSplits = refundSplits;
  }


  public RefundEntity refundType(RefundTypeEnum refundType) {
    
    this.refundType = refundType;
    return this;
  }

   /**
   * This can be one of [\&quot;PAYMENT_AUTO_REFUND\&quot;, \&quot;MERCHANT_INITIATED\&quot;, \&quot;UNRECONCILED_AUTO_REFUND\&quot;]
   * @return refundType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This can be one of [\"PAYMENT_AUTO_REFUND\", \"MERCHANT_INITIATED\", \"UNRECONCILED_AUTO_REFUND\"]")
  public RefundTypeEnum getRefundType() {
    return refundType;
  }


  public void setRefundType(RefundTypeEnum refundType) {
    this.refundType = refundType;
  }


  public RefundEntity refundMode(String refundMode) {
    
    this.refundMode = refundMode;
    return this;
  }

   /**
   * Method or speed of processing refund
   * @return refundMode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Method or speed of processing refund")
  public String getRefundMode() {
    return refundMode;
  }


  public void setRefundMode(String refundMode) {
    this.refundMode = refundMode;
  }


  public RefundEntity createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time of refund creation
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time of refund creation")
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public RefundEntity processedAt(String processedAt) {
    
    this.processedAt = processedAt;
    return this;
  }

   /**
   * Time when refund was processed successfully
   * @return processedAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time when refund was processed successfully")
  public String getProcessedAt() {
    return processedAt;
  }


  public void setProcessedAt(String processedAt) {
    this.processedAt = processedAt;
  }


  public RefundEntity refundSpeed(RefundSpeed refundSpeed) {
    
    this.refundSpeed = refundSpeed;
    return this;
  }

   /**
   * Get refundSpeed
   * @return refundSpeed
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public RefundSpeed getRefundSpeed() {
    return refundSpeed;
  }


  public void setRefundSpeed(RefundSpeed refundSpeed) {
    this.refundSpeed = refundSpeed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundEntity refundEntity = (RefundEntity) o;
    return Objects.equals(this.cfPaymentId, refundEntity.cfPaymentId) &&
        Objects.equals(this.cfRefundId, refundEntity.cfRefundId) &&
        Objects.equals(this.orderId, refundEntity.orderId) &&
        Objects.equals(this.refundId, refundEntity.refundId) &&
        Objects.equals(this.entity, refundEntity.entity) &&
        Objects.equals(this.refundAmount, refundEntity.refundAmount) &&
        Objects.equals(this.refundCurrency, refundEntity.refundCurrency) &&
        Objects.equals(this.refundNote, refundEntity.refundNote) &&
        Objects.equals(this.refundStatus, refundEntity.refundStatus) &&
        Objects.equals(this.refundArn, refundEntity.refundArn) &&
        Objects.equals(this.refundCharge, refundEntity.refundCharge) &&
        Objects.equals(this.statusDescription, refundEntity.statusDescription) &&
        Objects.equals(this.metadata, refundEntity.metadata) &&
        Objects.equals(this.refundSplits, refundEntity.refundSplits) &&
        Objects.equals(this.refundType, refundEntity.refundType) &&
        Objects.equals(this.refundMode, refundEntity.refundMode) &&
        Objects.equals(this.createdAt, refundEntity.createdAt) &&
        Objects.equals(this.processedAt, refundEntity.processedAt) &&
        Objects.equals(this.refundSpeed, refundEntity.refundSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPaymentId, cfRefundId, orderId, refundId, entity, refundAmount, refundCurrency, refundNote, refundStatus, refundArn, refundCharge, statusDescription, metadata, refundSplits, refundType, refundMode, createdAt, processedAt, refundSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundEntity {\n");
    sb.append("    cfPaymentId: ").append(toIndentedString(cfPaymentId)).append("\n");
    sb.append("    cfRefundId: ").append(toIndentedString(cfRefundId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    refundId: ").append(toIndentedString(refundId)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    refundCurrency: ").append(toIndentedString(refundCurrency)).append("\n");
    sb.append("    refundNote: ").append(toIndentedString(refundNote)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    refundArn: ").append(toIndentedString(refundArn)).append("\n");
    sb.append("    refundCharge: ").append(toIndentedString(refundCharge)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    refundSplits: ").append(toIndentedString(refundSplits)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    refundMode: ").append(toIndentedString(refundMode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    refundSpeed: ").append(toIndentedString(refundSpeed)).append("\n");
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
    openapiFields.add("cf_refund_id");
    openapiFields.add("order_id");
    openapiFields.add("refund_id");
    openapiFields.add("entity");
    openapiFields.add("refund_amount");
    openapiFields.add("refund_currency");
    openapiFields.add("refund_note");
    openapiFields.add("refund_status");
    openapiFields.add("refund_arn");
    openapiFields.add("refund_charge");
    openapiFields.add("status_description");
    openapiFields.add("metadata");
    openapiFields.add("refund_splits");
    openapiFields.add("refund_type");
    openapiFields.add("refund_mode");
    openapiFields.add("created_at");
    openapiFields.add("processed_at");
    openapiFields.add("refund_speed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RefundEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_refund_id") != null && !jsonObj.get("cf_refund_id").isJsonNull()) && !jsonObj.get("cf_refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_refund_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("refund_id") != null && !jsonObj.get("refund_id").isJsonNull()) && !jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("refund_currency") != null && !jsonObj.get("refund_currency").isJsonNull()) && !jsonObj.get("refund_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_currency").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonNull()) && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      if ((jsonObj.get("refund_arn") != null && !jsonObj.get("refund_arn").isJsonNull()) && !jsonObj.get("refund_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_arn").toString()));
      }
      if ((jsonObj.get("status_description") != null && !jsonObj.get("status_description").isJsonNull()) && !jsonObj.get("status_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_description").toString()));
      }
      if (jsonObj.get("refund_splits") != null && !jsonObj.get("refund_splits").isJsonNull()) {
        JsonArray jsonArrayrefundSplits = jsonObj.getAsJsonArray("refund_splits");
        if (jsonArrayrefundSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("refund_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `refund_splits` to be an array in the JSON string but got `%s`", jsonObj.get("refund_splits").toString()));
          }

          // validate the optional field `refund_splits` (array)
          for (int i = 0; i < jsonArrayrefundSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayrefundSplits.get(i));
          };
        }
      }
      if ((jsonObj.get("refund_type") != null && !jsonObj.get("refund_type").isJsonNull()) && !jsonObj.get("refund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_type").toString()));
      }
      if ((jsonObj.get("refund_mode") != null && !jsonObj.get("refund_mode").isJsonNull()) && !jsonObj.get("refund_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_mode").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("processed_at") != null && !jsonObj.get("processed_at").isJsonNull()) && !jsonObj.get("processed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed_at").toString()));
      }
      // validate the optional field `refund_speed`
      if (jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) {
        RefundSpeed.validateJsonElement(jsonObj.get("refund_speed"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RefundEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cf_payment_id") != null && !jsonObj.get("cf_payment_id").isJsonNull()) && !jsonObj.get("cf_payment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_payment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_payment_id").toString()));
      }
      if ((jsonObj.get("cf_refund_id") != null && !jsonObj.get("cf_refund_id").isJsonNull()) && !jsonObj.get("cf_refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_refund_id").toString()));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("refund_id") != null && !jsonObj.get("refund_id").isJsonNull()) && !jsonObj.get("refund_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("refund_currency") != null && !jsonObj.get("refund_currency").isJsonNull()) && !jsonObj.get("refund_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_currency").toString()));
      }
      if ((jsonObj.get("refund_note") != null && !jsonObj.get("refund_note").isJsonNull()) && !jsonObj.get("refund_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_note").toString()));
      }
      if ((jsonObj.get("refund_status") != null && !jsonObj.get("refund_status").isJsonNull()) && !jsonObj.get("refund_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_status").toString()));
      }
      if ((jsonObj.get("refund_arn") != null && !jsonObj.get("refund_arn").isJsonNull()) && !jsonObj.get("refund_arn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_arn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_arn").toString()));
      }
      if ((jsonObj.get("status_description") != null && !jsonObj.get("status_description").isJsonNull()) && !jsonObj.get("status_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_description").toString()));
      }
      if (jsonObj.get("refund_splits") != null && !jsonObj.get("refund_splits").isJsonNull()) {
        JsonArray jsonArrayrefundSplits = jsonObj.getAsJsonArray("refund_splits");
        if (jsonArrayrefundSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("refund_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `refund_splits` to be an array in the JSON string but got `%s`", jsonObj.get("refund_splits").toString()));
          }

          // validate the optional field `refund_splits` (array)
          for (int i = 0; i < jsonArrayrefundSplits.size(); i++) {
            VendorSplit.validateJsonElement(jsonArrayrefundSplits.get(i));
          };
        }
      }
      if ((jsonObj.get("refund_type") != null && !jsonObj.get("refund_type").isJsonNull()) && !jsonObj.get("refund_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_type").toString()));
      }
      if ((jsonObj.get("refund_mode") != null && !jsonObj.get("refund_mode").isJsonNull()) && !jsonObj.get("refund_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refund_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refund_mode").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("processed_at") != null && !jsonObj.get("processed_at").isJsonNull()) && !jsonObj.get("processed_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processed_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processed_at").toString()));
      }
      // validate the optional field `refund_speed`
      if (jsonObj.get("refund_speed") != null && !jsonObj.get("refund_speed").isJsonNull()) {
        RefundSpeed.validateJsonElement(jsonObj.get("refund_speed"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RefundEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RefundEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RefundEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RefundEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<RefundEntity>() {
           @Override
           public void write(JsonWriter out, RefundEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RefundEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RefundEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RefundEntity
  * @throws IOException if the JSON string is invalid with respect to RefundEntity
  */
  public static RefundEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RefundEntity.class);
  }

 /**
  * Convert an instance of RefundEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


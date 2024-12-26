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
import com.cashfree.model.CustomerDetailsInDisputesEntity;
import com.cashfree.model.Evidence;
import com.cashfree.model.EvidencesToContestDispute;
import com.cashfree.model.OrderDetailsInDisputesEntity;
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
 * DisputesEntityMerchantAccepted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T13:33:59.432802Z[Etc/UTC]")
public class DisputesEntityMerchantAccepted {
  public static final String SERIALIZED_NAME_DISPUTE_ID = "dispute_id";
  @SerializedName(SERIALIZED_NAME_DISPUTE_ID)
  private Integer disputeId;

  /**
   * Gets or Sets disputeType
   */
  @JsonAdapter(DisputeTypeEnum.Adapter.class)
  public enum DisputeTypeEnum {
    DISPUTE("DISPUTE"),
    
    CHARGEBACK("CHARGEBACK"),
    
    RETRIEVAL("RETRIEVAL"),
    
    PRE_ARBITRATION("PRE_ARBITRATION"),
    
    ARBITRATION("ARBITRATION"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DisputeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisputeTypeEnum fromValue(String value) {
      for (DisputeTypeEnum b : DisputeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DisputeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisputeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisputeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisputeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPUTE_TYPE = "dispute_type";
  @SerializedName(SERIALIZED_NAME_DISPUTE_TYPE)
  private DisputeTypeEnum disputeType;

  public static final String SERIALIZED_NAME_REASON_CODE = "reason_code";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_REASON_DESCRIPTION = "reason_description";
  @SerializedName(SERIALIZED_NAME_REASON_DESCRIPTION)
  private String reasonDescription;

  public static final String SERIALIZED_NAME_DISPUTE_AMOUNT = "dispute_amount";
  @SerializedName(SERIALIZED_NAME_DISPUTE_AMOUNT)
  private BigDecimal disputeAmount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_RESPOND_BY = "respond_by";
  @SerializedName(SERIALIZED_NAME_RESPOND_BY)
  private String respondBy;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_RESOLVED_AT = "resolved_at";
  @SerializedName(SERIALIZED_NAME_RESOLVED_AT)
  private String resolvedAt;

  /**
   * Gets or Sets disputeStatus
   */
  @JsonAdapter(DisputeStatusEnum.Adapter.class)
  public enum DisputeStatusEnum {
    DISPUTE_CREATED("DISPUTE_CREATED"),
    
    DISPUTE_DOCS_RECEIVED("DISPUTE_DOCS_RECEIVED"),
    
    DISPUTE_UNDER_REVIEW("DISPUTE_UNDER_REVIEW"),
    
    DISPUTE_MERCHANT_WON("DISPUTE_MERCHANT_WON"),
    
    DISPUTE_MERCHANT_LOST("DISPUTE_MERCHANT_LOST"),
    
    DISPUTE_MERCHANT_ACCEPTED("DISPUTE_MERCHANT_ACCEPTED"),
    
    DISPUTE_INSUFFICIENT_EVIDENCE("DISPUTE_INSUFFICIENT_EVIDENCE"),
    
    CHARGEBACK_CREATED("CHARGEBACK_CREATED"),
    
    CHARGEBACK_DOCS_RECEIVED("CHARGEBACK_DOCS_RECEIVED"),
    
    CHARGEBACK_UNDER_REVIEW("CHARGEBACK_UNDER_REVIEW"),
    
    CHARGEBACK_MERCHANT_WON("CHARGEBACK_MERCHANT_WON"),
    
    CHARGEBACK_MERCHANT_LOST("CHARGEBACK_MERCHANT_LOST"),
    
    CHARGEBACK_MERCHANT_ACCEPTED("CHARGEBACK_MERCHANT_ACCEPTED"),
    
    CHARGEBACK_INSUFFICIENT_EVIDENCE("CHARGEBACK_INSUFFICIENT_EVIDENCE"),
    
    RETRIEVAL_CREATED("RETRIEVAL_CREATED"),
    
    RETRIEVAL_DOCS_RECEIVED("RETRIEVAL_DOCS_RECEIVED"),
    
    RETRIEVAL_UNDER_REVIEW("RETRIEVAL_UNDER_REVIEW"),
    
    RETRIEVAL_MERCHANT_WON("RETRIEVAL_MERCHANT_WON"),
    
    RETRIEVAL_MERCHANT_LOST("RETRIEVAL_MERCHANT_LOST"),
    
    RETRIEVAL_MERCHANT_ACCEPTED("RETRIEVAL_MERCHANT_ACCEPTED"),
    
    RETRIEVAL_INSUFFICIENT_EVIDENCE("RETRIEVAL_INSUFFICIENT_EVIDENCE"),
    
    PRE_ARBITRATION_CREATED("PRE_ARBITRATION_CREATED"),
    
    PRE_ARBITRATION_DOCS_RECEIVED("PRE_ARBITRATION_DOCS_RECEIVED"),
    
    PRE_ARBITRATION_UNDER_REVIEW("PRE_ARBITRATION_UNDER_REVIEW"),
    
    PRE_ARBITRATION_MERCHANT_WON("PRE_ARBITRATION_MERCHANT_WON"),
    
    PRE_ARBITRATION_MERCHANT_LOST("PRE_ARBITRATION_MERCHANT_LOST"),
    
    PRE_ARBITRATION_MERCHANT_ACCEPTED("PRE_ARBITRATION_MERCHANT_ACCEPTED"),
    
    PRE_ARBITRATION_INSUFFICIENT_EVIDENCE("PRE_ARBITRATION_INSUFFICIENT_EVIDENCE"),
    
    ARBITRATION_CREATED("ARBITRATION_CREATED"),
    
    ARBITRATION_DOCS_RECEIVED("ARBITRATION_DOCS_RECEIVED"),
    
    ARBITRATION_UNDER_REVIEW("ARBITRATION_UNDER_REVIEW"),
    
    ARBITRATION_MERCHANT_WON("ARBITRATION_MERCHANT_WON"),
    
    ARBITRATION_MERCHANT_LOST("ARBITRATION_MERCHANT_LOST"),
    
    ARBITRATION_MERCHANT_ACCEPTED("ARBITRATION_MERCHANT_ACCEPTED"),
    
    ARBITRATION_INSUFFICIENT_EVIDENCE("ARBITRATION_INSUFFICIENT_EVIDENCE"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    DisputeStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisputeStatusEnum fromValue(String value) {
      for (DisputeStatusEnum b : DisputeStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<DisputeStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisputeStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisputeStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DisputeStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISPUTE_STATUS = "dispute_status";
  @SerializedName(SERIALIZED_NAME_DISPUTE_STATUS)
  private DisputeStatusEnum disputeStatus;

  public static final String SERIALIZED_NAME_CF_DISPUTE_REMARKS = "cf_dispute_remarks";
  @SerializedName(SERIALIZED_NAME_CF_DISPUTE_REMARKS)
  private String cfDisputeRemarks;

  public static final String SERIALIZED_NAME_PREFERRED_EVIDENCE = "preferred_evidence";
  @SerializedName(SERIALIZED_NAME_PREFERRED_EVIDENCE)
  private List<EvidencesToContestDispute> preferredEvidence;

  public static final String SERIALIZED_NAME_DISPUTE_EVIDENCE = "dispute_evidence";
  @SerializedName(SERIALIZED_NAME_DISPUTE_EVIDENCE)
  private List<Evidence> disputeEvidence;

  public static final String SERIALIZED_NAME_ORDER_DETAILS = "order_details";
  @SerializedName(SERIALIZED_NAME_ORDER_DETAILS)
  private OrderDetailsInDisputesEntity orderDetails;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private CustomerDetailsInDisputesEntity customerDetails;

  public DisputesEntityMerchantAccepted() {
  }

  public DisputesEntityMerchantAccepted disputeId(Integer disputeId) {
    
    this.disputeId = disputeId;
    return this;
  }

   /**
   * Get disputeId
   * @return disputeId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getDisputeId() {
    return disputeId;
  }


  public void setDisputeId(Integer disputeId) {
    this.disputeId = disputeId;
  }


  public DisputesEntityMerchantAccepted disputeType(DisputeTypeEnum disputeType) {
    
    this.disputeType = disputeType;
    return this;
  }

   /**
   * Get disputeType
   * @return disputeType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DisputeTypeEnum getDisputeType() {
    return disputeType;
  }


  public void setDisputeType(DisputeTypeEnum disputeType) {
    this.disputeType = disputeType;
  }


  public DisputesEntityMerchantAccepted reasonCode(String reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public DisputesEntityMerchantAccepted reasonDescription(String reasonDescription) {
    
    this.reasonDescription = reasonDescription;
    return this;
  }

   /**
   * Get reasonDescription
   * @return reasonDescription
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getReasonDescription() {
    return reasonDescription;
  }


  public void setReasonDescription(String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }


  public DisputesEntityMerchantAccepted disputeAmount(BigDecimal disputeAmount) {
    
    this.disputeAmount = disputeAmount;
    return this;
  }

   /**
   * Dispute amount may differ from transaction amount for partial cases.
   * @return disputeAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Dispute amount may differ from transaction amount for partial cases.")
  public BigDecimal getDisputeAmount() {
    return disputeAmount;
  }


  public void setDisputeAmount(BigDecimal disputeAmount) {
    this.disputeAmount = disputeAmount;
  }


  public DisputesEntityMerchantAccepted createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * This is the time when the dispute was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the dispute was created.")
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public DisputesEntityMerchantAccepted respondBy(String respondBy) {
    
    this.respondBy = respondBy;
    return this;
  }

   /**
   * This is the time by which evidence should be submitted to contest the dispute.
   * @return respondBy
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time by which evidence should be submitted to contest the dispute.")
  public String getRespondBy() {
    return respondBy;
  }


  public void setRespondBy(String respondBy) {
    this.respondBy = respondBy;
  }


  public DisputesEntityMerchantAccepted updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * This is the time when the dispute case was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the dispute case was updated.")
  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public DisputesEntityMerchantAccepted resolvedAt(String resolvedAt) {
    
    this.resolvedAt = resolvedAt;
    return this;
  }

   /**
   * This is the time when the dispute case was closed.
   * @return resolvedAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the time when the dispute case was closed.")
  public String getResolvedAt() {
    return resolvedAt;
  }


  public void setResolvedAt(String resolvedAt) {
    this.resolvedAt = resolvedAt;
  }


  public DisputesEntityMerchantAccepted disputeStatus(DisputeStatusEnum disputeStatus) {
    
    this.disputeStatus = disputeStatus;
    return this;
  }

   /**
   * Get disputeStatus
   * @return disputeStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public DisputeStatusEnum getDisputeStatus() {
    return disputeStatus;
  }


  public void setDisputeStatus(DisputeStatusEnum disputeStatus) {
    this.disputeStatus = disputeStatus;
  }


  public DisputesEntityMerchantAccepted cfDisputeRemarks(String cfDisputeRemarks) {
    
    this.cfDisputeRemarks = cfDisputeRemarks;
    return this;
  }

   /**
   * Get cfDisputeRemarks
   * @return cfDisputeRemarks
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getCfDisputeRemarks() {
    return cfDisputeRemarks;
  }


  public void setCfDisputeRemarks(String cfDisputeRemarks) {
    this.cfDisputeRemarks = cfDisputeRemarks;
  }


  public DisputesEntityMerchantAccepted preferredEvidence(List<EvidencesToContestDispute> preferredEvidence) {
    
    this.preferredEvidence = preferredEvidence;
    return this;
  }

   /**
   * Get preferredEvidence
   * @return preferredEvidence
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"prefferred_evidence\":[{\"document_type\":\"Delivery/Service Proof\",\"document_description\":\"Proof that the cardholder/customer received the goods or services.\"},{\"document_type\":\"Statement of Service\",\"document_description\":\"Account Statement of wallet where funds were loaded by customer.\"}]}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<EvidencesToContestDispute> getPreferredEvidence() {
    return preferredEvidence;
  }


  public void setPreferredEvidence(List<EvidencesToContestDispute> preferredEvidence) {
    this.preferredEvidence = preferredEvidence;
  }


  public DisputesEntityMerchantAccepted disputeEvidence(List<Evidence> disputeEvidence) {
    
    this.disputeEvidence = disputeEvidence;
    return this;
  }

   /**
   * Get disputeEvidence
   * @return disputeEvidence
  **/
  @javax.annotation.Nullable
  @Schema(example = "[{\"document_id\":18150,\"document_name\":\"disputeSampleFile.pdf\",\"document_type\":\"DeliveryProof\"}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<Evidence> getDisputeEvidence() {
    return disputeEvidence;
  }


  public void setDisputeEvidence(List<Evidence> disputeEvidence) {
    this.disputeEvidence = disputeEvidence;
  }


  public DisputesEntityMerchantAccepted orderDetails(OrderDetailsInDisputesEntity orderDetails) {
    
    this.orderDetails = orderDetails;
    return this;
  }

   /**
   * Get orderDetails
   * @return orderDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OrderDetailsInDisputesEntity getOrderDetails() {
    return orderDetails;
  }


  public void setOrderDetails(OrderDetailsInDisputesEntity orderDetails) {
    this.orderDetails = orderDetails;
  }


  public DisputesEntityMerchantAccepted customerDetails(CustomerDetailsInDisputesEntity customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CustomerDetailsInDisputesEntity getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(CustomerDetailsInDisputesEntity customerDetails) {
    this.customerDetails = customerDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputesEntityMerchantAccepted disputesEntityMerchantAccepted = (DisputesEntityMerchantAccepted) o;
    return Objects.equals(this.disputeId, disputesEntityMerchantAccepted.disputeId) &&
        Objects.equals(this.disputeType, disputesEntityMerchantAccepted.disputeType) &&
        Objects.equals(this.reasonCode, disputesEntityMerchantAccepted.reasonCode) &&
        Objects.equals(this.reasonDescription, disputesEntityMerchantAccepted.reasonDescription) &&
        Objects.equals(this.disputeAmount, disputesEntityMerchantAccepted.disputeAmount) &&
        Objects.equals(this.createdAt, disputesEntityMerchantAccepted.createdAt) &&
        Objects.equals(this.respondBy, disputesEntityMerchantAccepted.respondBy) &&
        Objects.equals(this.updatedAt, disputesEntityMerchantAccepted.updatedAt) &&
        Objects.equals(this.resolvedAt, disputesEntityMerchantAccepted.resolvedAt) &&
        Objects.equals(this.disputeStatus, disputesEntityMerchantAccepted.disputeStatus) &&
        Objects.equals(this.cfDisputeRemarks, disputesEntityMerchantAccepted.cfDisputeRemarks) &&
        Objects.equals(this.preferredEvidence, disputesEntityMerchantAccepted.preferredEvidence) &&
        Objects.equals(this.disputeEvidence, disputesEntityMerchantAccepted.disputeEvidence) &&
        Objects.equals(this.orderDetails, disputesEntityMerchantAccepted.orderDetails) &&
        Objects.equals(this.customerDetails, disputesEntityMerchantAccepted.customerDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disputeId, disputeType, reasonCode, reasonDescription, disputeAmount, createdAt, respondBy, updatedAt, resolvedAt, disputeStatus, cfDisputeRemarks, preferredEvidence, disputeEvidence, orderDetails, customerDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputesEntityMerchantAccepted {\n");
    sb.append("    disputeId: ").append(toIndentedString(disputeId)).append("\n");
    sb.append("    disputeType: ").append(toIndentedString(disputeType)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    disputeAmount: ").append(toIndentedString(disputeAmount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    respondBy: ").append(toIndentedString(respondBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
    sb.append("    disputeStatus: ").append(toIndentedString(disputeStatus)).append("\n");
    sb.append("    cfDisputeRemarks: ").append(toIndentedString(cfDisputeRemarks)).append("\n");
    sb.append("    preferredEvidence: ").append(toIndentedString(preferredEvidence)).append("\n");
    sb.append("    disputeEvidence: ").append(toIndentedString(disputeEvidence)).append("\n");
    sb.append("    orderDetails: ").append(toIndentedString(orderDetails)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
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
    openapiFields.add("dispute_id");
    openapiFields.add("dispute_type");
    openapiFields.add("reason_code");
    openapiFields.add("reason_description");
    openapiFields.add("dispute_amount");
    openapiFields.add("created_at");
    openapiFields.add("respond_by");
    openapiFields.add("updated_at");
    openapiFields.add("resolved_at");
    openapiFields.add("dispute_status");
    openapiFields.add("cf_dispute_remarks");
    openapiFields.add("preferred_evidence");
    openapiFields.add("dispute_evidence");
    openapiFields.add("order_details");
    openapiFields.add("customer_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DisputesEntityMerchantAccepted
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dispute_type") != null && !jsonObj.get("dispute_type").isJsonNull()) && !jsonObj.get("dispute_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dispute_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dispute_type").toString()));
      }
      if ((jsonObj.get("reason_code") != null && !jsonObj.get("reason_code").isJsonNull()) && !jsonObj.get("reason_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_code").toString()));
      }
      if ((jsonObj.get("reason_description") != null && !jsonObj.get("reason_description").isJsonNull()) && !jsonObj.get("reason_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_description").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("respond_by") != null && !jsonObj.get("respond_by").isJsonNull()) && !jsonObj.get("respond_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `respond_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("respond_by").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("resolved_at") != null && !jsonObj.get("resolved_at").isJsonNull()) && !jsonObj.get("resolved_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolved_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolved_at").toString()));
      }
      if ((jsonObj.get("dispute_status") != null && !jsonObj.get("dispute_status").isJsonNull()) && !jsonObj.get("dispute_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dispute_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dispute_status").toString()));
      }
      if ((jsonObj.get("cf_dispute_remarks") != null && !jsonObj.get("cf_dispute_remarks").isJsonNull()) && !jsonObj.get("cf_dispute_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_dispute_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_dispute_remarks").toString()));
      }
      // validate the optional field `order_details`
      if (jsonObj.get("order_details") != null && !jsonObj.get("order_details").isJsonNull()) {
        OrderDetailsInDisputesEntity.validateJsonElement(jsonObj.get("order_details"));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        CustomerDetailsInDisputesEntity.validateJsonElement(jsonObj.get("customer_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DisputesEntityMerchantAccepted
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dispute_type") != null && !jsonObj.get("dispute_type").isJsonNull()) && !jsonObj.get("dispute_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dispute_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dispute_type").toString()));
      }
      if ((jsonObj.get("reason_code") != null && !jsonObj.get("reason_code").isJsonNull()) && !jsonObj.get("reason_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_code").toString()));
      }
      if ((jsonObj.get("reason_description") != null && !jsonObj.get("reason_description").isJsonNull()) && !jsonObj.get("reason_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason_description").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      if ((jsonObj.get("respond_by") != null && !jsonObj.get("respond_by").isJsonNull()) && !jsonObj.get("respond_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `respond_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("respond_by").toString()));
      }
      if ((jsonObj.get("updated_at") != null && !jsonObj.get("updated_at").isJsonNull()) && !jsonObj.get("updated_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated_at").toString()));
      }
      if ((jsonObj.get("resolved_at") != null && !jsonObj.get("resolved_at").isJsonNull()) && !jsonObj.get("resolved_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resolved_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resolved_at").toString()));
      }
      if ((jsonObj.get("dispute_status") != null && !jsonObj.get("dispute_status").isJsonNull()) && !jsonObj.get("dispute_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dispute_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dispute_status").toString()));
      }
      if ((jsonObj.get("cf_dispute_remarks") != null && !jsonObj.get("cf_dispute_remarks").isJsonNull()) && !jsonObj.get("cf_dispute_remarks").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_dispute_remarks` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_dispute_remarks").toString()));
      }
      // validate the optional field `order_details`
      if (jsonObj.get("order_details") != null && !jsonObj.get("order_details").isJsonNull()) {
        OrderDetailsInDisputesEntity.validateJsonElement(jsonObj.get("order_details"));
        return true;
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        CustomerDetailsInDisputesEntity.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DisputesEntityMerchantAccepted.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DisputesEntityMerchantAccepted' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DisputesEntityMerchantAccepted> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DisputesEntityMerchantAccepted.class));

       return (TypeAdapter<T>) new TypeAdapter<DisputesEntityMerchantAccepted>() {
           @Override
           public void write(JsonWriter out, DisputesEntityMerchantAccepted value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DisputesEntityMerchantAccepted read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DisputesEntityMerchantAccepted given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DisputesEntityMerchantAccepted
  * @throws IOException if the JSON string is invalid with respect to DisputesEntityMerchantAccepted
  */
  public static DisputesEntityMerchantAccepted fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DisputesEntityMerchantAccepted.class);
  }

 /**
  * Convert an instance of DisputesEntityMerchantAccepted to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


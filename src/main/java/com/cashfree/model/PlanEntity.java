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
 * The response returned for Get, Create and Manage Plan APIs
 */
@Schema(description = "The response returned for Get, Create and Manage Plan APIs")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class PlanEntity {
  public static final String SERIALIZED_NAME_PLAN_CURRENCY = "plan_currency";
  @SerializedName(SERIALIZED_NAME_PLAN_CURRENCY)
  private String planCurrency;

  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_INTERVAL_TYPE = "plan_interval_type";
  @SerializedName(SERIALIZED_NAME_PLAN_INTERVAL_TYPE)
  private String planIntervalType;

  public static final String SERIALIZED_NAME_PLAN_INTERVALS = "plan_intervals";
  @SerializedName(SERIALIZED_NAME_PLAN_INTERVALS)
  private Integer planIntervals;

  public static final String SERIALIZED_NAME_PLAN_MAX_AMOUNT = "plan_max_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_MAX_AMOUNT)
  private BigDecimal planMaxAmount;

  public static final String SERIALIZED_NAME_PLAN_MAX_CYCLES = "plan_max_cycles";
  @SerializedName(SERIALIZED_NAME_PLAN_MAX_CYCLES)
  private Integer planMaxCycles;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_NOTE = "plan_note";
  @SerializedName(SERIALIZED_NAME_PLAN_NOTE)
  private String planNote;

  public static final String SERIALIZED_NAME_PLAN_RECURRING_AMOUNT = "plan_recurring_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_RECURRING_AMOUNT)
  private BigDecimal planRecurringAmount;

  public static final String SERIALIZED_NAME_PLAN_STATUS = "plan_status";
  @SerializedName(SERIALIZED_NAME_PLAN_STATUS)
  private String planStatus;

  public static final String SERIALIZED_NAME_PLAN_TYPE = "plan_type";
  @SerializedName(SERIALIZED_NAME_PLAN_TYPE)
  private String planType;

  public PlanEntity() {
  }

  public PlanEntity planCurrency(String planCurrency) {
    
    this.planCurrency = planCurrency;
    return this;
  }

   /**
   * Currency for the plan.
   * @return planCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency for the plan.")
  public String getPlanCurrency() {
    return planCurrency;
  }


  public void setPlanCurrency(String planCurrency) {
    this.planCurrency = planCurrency;
  }


  public PlanEntity planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Plan ID provided by merchant.
   * @return planId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Plan ID provided by merchant.")
  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public PlanEntity planIntervalType(String planIntervalType) {
    
    this.planIntervalType = planIntervalType;
    return this;
  }

   /**
   * Interval type for the plan.
   * @return planIntervalType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Interval type for the plan.")
  public String getPlanIntervalType() {
    return planIntervalType;
  }


  public void setPlanIntervalType(String planIntervalType) {
    this.planIntervalType = planIntervalType;
  }


  public PlanEntity planIntervals(Integer planIntervals) {
    
    this.planIntervals = planIntervals;
    return this;
  }

   /**
   * Number of intervals for the plan.
   * @return planIntervals
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Number of intervals for the plan.")
  public Integer getPlanIntervals() {
    return planIntervals;
  }


  public void setPlanIntervals(Integer planIntervals) {
    this.planIntervals = planIntervals;
  }


  public PlanEntity planMaxAmount(BigDecimal planMaxAmount) {
    
    this.planMaxAmount = planMaxAmount;
    return this;
  }

   /**
   * Maximum amount for the plan.
   * @return planMaxAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Maximum amount for the plan.")
  public BigDecimal getPlanMaxAmount() {
    return planMaxAmount;
  }


  public void setPlanMaxAmount(BigDecimal planMaxAmount) {
    this.planMaxAmount = planMaxAmount;
  }


  public PlanEntity planMaxCycles(Integer planMaxCycles) {
    
    this.planMaxCycles = planMaxCycles;
    return this;
  }

   /**
   * Maximum number of payment cycles for the plan.
   * @return planMaxCycles
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Maximum number of payment cycles for the plan.")
  public Integer getPlanMaxCycles() {
    return planMaxCycles;
  }


  public void setPlanMaxCycles(Integer planMaxCycles) {
    this.planMaxCycles = planMaxCycles;
  }


  public PlanEntity planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Name of the plan.
   * @return planName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the plan.")
  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public PlanEntity planNote(String planNote) {
    
    this.planNote = planNote;
    return this;
  }

   /**
   * Note for the plan.
   * @return planNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Note for the plan.")
  public String getPlanNote() {
    return planNote;
  }


  public void setPlanNote(String planNote) {
    this.planNote = planNote;
  }


  public PlanEntity planRecurringAmount(BigDecimal planRecurringAmount) {
    
    this.planRecurringAmount = planRecurringAmount;
    return this;
  }

   /**
   * Recurring amount for the plan.
   * @return planRecurringAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Recurring amount for the plan.")
  public BigDecimal getPlanRecurringAmount() {
    return planRecurringAmount;
  }


  public void setPlanRecurringAmount(BigDecimal planRecurringAmount) {
    this.planRecurringAmount = planRecurringAmount;
  }


  public PlanEntity planStatus(String planStatus) {
    
    this.planStatus = planStatus;
    return this;
  }

   /**
   * Status of the plan.
   * @return planStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the plan.")
  public String getPlanStatus() {
    return planStatus;
  }


  public void setPlanStatus(String planStatus) {
    this.planStatus = planStatus;
  }


  public PlanEntity planType(String planType) {
    
    this.planType = planType;
    return this;
  }

   /**
   * Type of the plan.
   * @return planType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of the plan.")
  public String getPlanType() {
    return planType;
  }


  public void setPlanType(String planType) {
    this.planType = planType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanEntity planEntity = (PlanEntity) o;
    return Objects.equals(this.planCurrency, planEntity.planCurrency) &&
        Objects.equals(this.planId, planEntity.planId) &&
        Objects.equals(this.planIntervalType, planEntity.planIntervalType) &&
        Objects.equals(this.planIntervals, planEntity.planIntervals) &&
        Objects.equals(this.planMaxAmount, planEntity.planMaxAmount) &&
        Objects.equals(this.planMaxCycles, planEntity.planMaxCycles) &&
        Objects.equals(this.planName, planEntity.planName) &&
        Objects.equals(this.planNote, planEntity.planNote) &&
        Objects.equals(this.planRecurringAmount, planEntity.planRecurringAmount) &&
        Objects.equals(this.planStatus, planEntity.planStatus) &&
        Objects.equals(this.planType, planEntity.planType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planCurrency, planId, planIntervalType, planIntervals, planMaxAmount, planMaxCycles, planName, planNote, planRecurringAmount, planStatus, planType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanEntity {\n");
    sb.append("    planCurrency: ").append(toIndentedString(planCurrency)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planIntervalType: ").append(toIndentedString(planIntervalType)).append("\n");
    sb.append("    planIntervals: ").append(toIndentedString(planIntervals)).append("\n");
    sb.append("    planMaxAmount: ").append(toIndentedString(planMaxAmount)).append("\n");
    sb.append("    planMaxCycles: ").append(toIndentedString(planMaxCycles)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planNote: ").append(toIndentedString(planNote)).append("\n");
    sb.append("    planRecurringAmount: ").append(toIndentedString(planRecurringAmount)).append("\n");
    sb.append("    planStatus: ").append(toIndentedString(planStatus)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
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
    openapiFields.add("plan_currency");
    openapiFields.add("plan_id");
    openapiFields.add("plan_interval_type");
    openapiFields.add("plan_intervals");
    openapiFields.add("plan_max_amount");
    openapiFields.add("plan_max_cycles");
    openapiFields.add("plan_name");
    openapiFields.add("plan_note");
    openapiFields.add("plan_recurring_amount");
    openapiFields.add("plan_status");
    openapiFields.add("plan_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlanEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plan_currency") != null && !jsonObj.get("plan_currency").isJsonNull()) && !jsonObj.get("plan_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_currency").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("plan_interval_type") != null && !jsonObj.get("plan_interval_type").isJsonNull()) && !jsonObj.get("plan_interval_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_interval_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_interval_type").toString()));
      }
      if ((jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonNull()) && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if ((jsonObj.get("plan_note") != null && !jsonObj.get("plan_note").isJsonNull()) && !jsonObj.get("plan_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_note").toString()));
      }
      if ((jsonObj.get("plan_status") != null && !jsonObj.get("plan_status").isJsonNull()) && !jsonObj.get("plan_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_status").toString()));
      }
      if ((jsonObj.get("plan_type") != null && !jsonObj.get("plan_type").isJsonNull()) && !jsonObj.get("plan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlanEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plan_currency") != null && !jsonObj.get("plan_currency").isJsonNull()) && !jsonObj.get("plan_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_currency").toString()));
      }
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("plan_interval_type") != null && !jsonObj.get("plan_interval_type").isJsonNull()) && !jsonObj.get("plan_interval_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_interval_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_interval_type").toString()));
      }
      if ((jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonNull()) && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if ((jsonObj.get("plan_note") != null && !jsonObj.get("plan_note").isJsonNull()) && !jsonObj.get("plan_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_note").toString()));
      }
      if ((jsonObj.get("plan_status") != null && !jsonObj.get("plan_status").isJsonNull()) && !jsonObj.get("plan_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_status").toString()));
      }
      if ((jsonObj.get("plan_type") != null && !jsonObj.get("plan_type").isJsonNull()) && !jsonObj.get("plan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlanEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlanEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlanEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlanEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<PlanEntity>() {
           @Override
           public void write(JsonWriter out, PlanEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlanEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PlanEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlanEntity
  * @throws IOException if the JSON string is invalid with respect to PlanEntity
  */
  public static PlanEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlanEntity.class);
  }

 /**
  * Convert an instance of PlanEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


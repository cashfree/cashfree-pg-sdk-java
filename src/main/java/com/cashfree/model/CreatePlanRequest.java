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
 * Request body to create a plan.
 */
@Schema(description = "Request body to create a plan.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-26T12:56:23.887789Z[Etc/UTC]")
public class CreatePlanRequest {
  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "plan_name";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_TYPE = "plan_type";
  @SerializedName(SERIALIZED_NAME_PLAN_TYPE)
  private String planType;

  public static final String SERIALIZED_NAME_PLAN_CURRENCY = "plan_currency";
  @SerializedName(SERIALIZED_NAME_PLAN_CURRENCY)
  private String planCurrency;

  public static final String SERIALIZED_NAME_PLAN_RECURRING_AMOUNT = "plan_recurring_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_RECURRING_AMOUNT)
  private BigDecimal planRecurringAmount;

  public static final String SERIALIZED_NAME_PLAN_MAX_AMOUNT = "plan_max_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_MAX_AMOUNT)
  private BigDecimal planMaxAmount;

  public static final String SERIALIZED_NAME_PLAN_MAX_CYCLES = "plan_max_cycles";
  @SerializedName(SERIALIZED_NAME_PLAN_MAX_CYCLES)
  private Integer planMaxCycles;

  public static final String SERIALIZED_NAME_PLAN_INTERVALS = "plan_intervals";
  @SerializedName(SERIALIZED_NAME_PLAN_INTERVALS)
  private Integer planIntervals;

  public static final String SERIALIZED_NAME_PLAN_INTERVAL_TYPE = "plan_interval_type";
  @SerializedName(SERIALIZED_NAME_PLAN_INTERVAL_TYPE)
  private String planIntervalType;

  public static final String SERIALIZED_NAME_PLAN_NOTE = "plan_note";
  @SerializedName(SERIALIZED_NAME_PLAN_NOTE)
  private String planNote;

  public CreatePlanRequest() {
  }

  public CreatePlanRequest planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Unique ID to identify the plan. Only alpha-numerics, dot, hyphen and underscore allowed.
   * @return planId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Unique ID to identify the plan. Only alpha-numerics, dot, hyphen and underscore allowed.")
  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public CreatePlanRequest planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Name of the plan.
   * @return planName
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Name of the plan.")
  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public CreatePlanRequest planType(String planType) {
    
    this.planType = planType;
    return this;
  }

   /**
   * Type of the plan. Possible values - PERIODIC, ON_DEMAND.
   * @return planType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Type of the plan. Possible values - PERIODIC, ON_DEMAND.")
  public String getPlanType() {
    return planType;
  }


  public void setPlanType(String planType) {
    this.planType = planType;
  }


  public CreatePlanRequest planCurrency(String planCurrency) {
    
    this.planCurrency = planCurrency;
    return this;
  }

   /**
   * Currency of the plan.
   * @return planCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Currency of the plan.")
  public String getPlanCurrency() {
    return planCurrency;
  }


  public void setPlanCurrency(String planCurrency) {
    this.planCurrency = planCurrency;
  }


  public CreatePlanRequest planRecurringAmount(BigDecimal planRecurringAmount) {
    
    this.planRecurringAmount = planRecurringAmount;
    return this;
  }

   /**
   * Recurring amount for the plan. Required for PERIODIC plan_type.
   * @return planRecurringAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Recurring amount for the plan. Required for PERIODIC plan_type.")
  public BigDecimal getPlanRecurringAmount() {
    return planRecurringAmount;
  }


  public void setPlanRecurringAmount(BigDecimal planRecurringAmount) {
    this.planRecurringAmount = planRecurringAmount;
  }


  public CreatePlanRequest planMaxAmount(BigDecimal planMaxAmount) {
    
    this.planMaxAmount = planMaxAmount;
    return this;
  }

   /**
   * Maximum amount for the plan.
   * @return planMaxAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Maximum amount for the plan.")
  public BigDecimal getPlanMaxAmount() {
    return planMaxAmount;
  }


  public void setPlanMaxAmount(BigDecimal planMaxAmount) {
    this.planMaxAmount = planMaxAmount;
  }


  public CreatePlanRequest planMaxCycles(Integer planMaxCycles) {
    
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


  public CreatePlanRequest planIntervals(Integer planIntervals) {
    
    this.planIntervals = planIntervals;
    return this;
  }

   /**
   * Number of billing cycles between charges. For instance, if set to 2 and the interval type is &#39;week&#39;, the service will be billed every 2 weeks. Similarly, if set to 3 and the interval type is &#39;month&#39;, the service will be billed every 3 months. Required for PERIODIC plan_type.
   * @return planIntervals
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Number of billing cycles between charges. For instance, if set to 2 and the interval type is 'week', the service will be billed every 2 weeks. Similarly, if set to 3 and the interval type is 'month', the service will be billed every 3 months. Required for PERIODIC plan_type.")
  public Integer getPlanIntervals() {
    return planIntervals;
  }


  public void setPlanIntervals(Integer planIntervals) {
    this.planIntervals = planIntervals;
  }


  public CreatePlanRequest planIntervalType(String planIntervalType) {
    
    this.planIntervalType = planIntervalType;
    return this;
  }

   /**
   * Interval type for the plan. Possible values - DAY, WEEK, MONTH, YEAR.
   * @return planIntervalType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Interval type for the plan. Possible values - DAY, WEEK, MONTH, YEAR.")
  public String getPlanIntervalType() {
    return planIntervalType;
  }


  public void setPlanIntervalType(String planIntervalType) {
    this.planIntervalType = planIntervalType;
  }


  public CreatePlanRequest planNote(String planNote) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePlanRequest createPlanRequest = (CreatePlanRequest) o;
    return Objects.equals(this.planId, createPlanRequest.planId) &&
        Objects.equals(this.planName, createPlanRequest.planName) &&
        Objects.equals(this.planType, createPlanRequest.planType) &&
        Objects.equals(this.planCurrency, createPlanRequest.planCurrency) &&
        Objects.equals(this.planRecurringAmount, createPlanRequest.planRecurringAmount) &&
        Objects.equals(this.planMaxAmount, createPlanRequest.planMaxAmount) &&
        Objects.equals(this.planMaxCycles, createPlanRequest.planMaxCycles) &&
        Objects.equals(this.planIntervals, createPlanRequest.planIntervals) &&
        Objects.equals(this.planIntervalType, createPlanRequest.planIntervalType) &&
        Objects.equals(this.planNote, createPlanRequest.planNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, planType, planCurrency, planRecurringAmount, planMaxAmount, planMaxCycles, planIntervals, planIntervalType, planNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePlanRequest {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    planCurrency: ").append(toIndentedString(planCurrency)).append("\n");
    sb.append("    planRecurringAmount: ").append(toIndentedString(planRecurringAmount)).append("\n");
    sb.append("    planMaxAmount: ").append(toIndentedString(planMaxAmount)).append("\n");
    sb.append("    planMaxCycles: ").append(toIndentedString(planMaxCycles)).append("\n");
    sb.append("    planIntervals: ").append(toIndentedString(planIntervals)).append("\n");
    sb.append("    planIntervalType: ").append(toIndentedString(planIntervalType)).append("\n");
    sb.append("    planNote: ").append(toIndentedString(planNote)).append("\n");
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
    openapiFields.add("plan_id");
    openapiFields.add("plan_name");
    openapiFields.add("plan_type");
    openapiFields.add("plan_currency");
    openapiFields.add("plan_recurring_amount");
    openapiFields.add("plan_max_amount");
    openapiFields.add("plan_max_cycles");
    openapiFields.add("plan_intervals");
    openapiFields.add("plan_interval_type");
    openapiFields.add("plan_note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("plan_id");
    openapiRequiredFields.add("plan_name");
    openapiRequiredFields.add("plan_type");
    openapiRequiredFields.add("plan_max_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreatePlanRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePlanRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (!jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if (!jsonObj.get("plan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_type").toString()));
      }
      if ((jsonObj.get("plan_currency") != null && !jsonObj.get("plan_currency").isJsonNull()) && !jsonObj.get("plan_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_currency").toString()));
      }
      if ((jsonObj.get("plan_interval_type") != null && !jsonObj.get("plan_interval_type").isJsonNull()) && !jsonObj.get("plan_interval_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_interval_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_interval_type").toString()));
      }
      if ((jsonObj.get("plan_note") != null && !jsonObj.get("plan_note").isJsonNull()) && !jsonObj.get("plan_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_note").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreatePlanRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreatePlanRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if (!jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if (!jsonObj.get("plan_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_type").toString()));
      }
      if ((jsonObj.get("plan_currency") != null && !jsonObj.get("plan_currency").isJsonNull()) && !jsonObj.get("plan_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_currency").toString()));
      }
      if ((jsonObj.get("plan_interval_type") != null && !jsonObj.get("plan_interval_type").isJsonNull()) && !jsonObj.get("plan_interval_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_interval_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_interval_type").toString()));
      }
      if ((jsonObj.get("plan_note") != null && !jsonObj.get("plan_note").isJsonNull()) && !jsonObj.get("plan_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_note").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePlanRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePlanRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePlanRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePlanRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePlanRequest>() {
           @Override
           public void write(JsonWriter out, CreatePlanRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePlanRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatePlanRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatePlanRequest
  * @throws IOException if the JSON string is invalid with respect to CreatePlanRequest
  */
  public static CreatePlanRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePlanRequest.class);
  }

 /**
  * Convert an instance of CreatePlanRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


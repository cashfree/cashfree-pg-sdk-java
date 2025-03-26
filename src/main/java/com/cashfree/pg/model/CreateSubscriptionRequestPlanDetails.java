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
 * CreateSubscriptionRequestPlanDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T12:53:05.189649Z[Etc/UTC]")
public class CreateSubscriptionRequestPlanDetails {
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

  public static final String SERIALIZED_NAME_PLAN_AMOUNT = "plan_amount";
  @SerializedName(SERIALIZED_NAME_PLAN_AMOUNT)
  private BigDecimal planAmount;

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

  public CreateSubscriptionRequestPlanDetails() {
  }

  public CreateSubscriptionRequestPlanDetails planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * The unique identifier used to create plan. You only need to pass this field if you had already created plan. Otherwise use the other fields here to define the plan.
   * @return planId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The unique identifier used to create plan. You only need to pass this field if you had already created plan. Otherwise use the other fields here to define the plan.")
  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public CreateSubscriptionRequestPlanDetails planName(String planName) {
    
    this.planName = planName;
    return this;
  }

   /**
   * Specify plan name for easy reference.
   * @return planName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Specify plan name for easy reference.")
  public String getPlanName() {
    return planName;
  }


  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public CreateSubscriptionRequestPlanDetails planType(String planType) {
    
    this.planType = planType;
    return this;
  }

   /**
   * Possible values ON_DEMAND or PERIODIC. PERIODIC - Payments are triggered automatically at fixed intervals defined by the merchant. ON_DEMAND - Merchant needs to trigger/charge the customer explicitly with the required amount.
   * @return planType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Possible values ON_DEMAND or PERIODIC. PERIODIC - Payments are triggered automatically at fixed intervals defined by the merchant. ON_DEMAND - Merchant needs to trigger/charge the customer explicitly with the required amount.")
  public String getPlanType() {
    return planType;
  }


  public void setPlanType(String planType) {
    this.planType = planType;
  }


  public CreateSubscriptionRequestPlanDetails planCurrency(String planCurrency) {
    
    this.planCurrency = planCurrency;
    return this;
  }

   /**
   * INR by default.
   * @return planCurrency
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "INR by default.")
  public String getPlanCurrency() {
    return planCurrency;
  }


  public void setPlanCurrency(String planCurrency) {
    this.planCurrency = planCurrency;
  }


  public CreateSubscriptionRequestPlanDetails planAmount(BigDecimal planAmount) {
    
    this.planAmount = planAmount;
    return this;
  }

   /**
   * The amount to be charged for PERIODIC plan. This is a conditional parameter, only required for PERIODIC plans.
   * @return planAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The amount to be charged for PERIODIC plan. This is a conditional parameter, only required for PERIODIC plans.")
  public BigDecimal getPlanAmount() {
    return planAmount;
  }


  public void setPlanAmount(BigDecimal planAmount) {
    this.planAmount = planAmount;
  }


  public CreateSubscriptionRequestPlanDetails planMaxAmount(BigDecimal planMaxAmount) {
    
    this.planMaxAmount = planMaxAmount;
    return this;
  }

   /**
   * This is the maximum amount that can be charged on a subscription.
   * @return planMaxAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "This is the maximum amount that can be charged on a subscription.")
  public BigDecimal getPlanMaxAmount() {
    return planMaxAmount;
  }


  public void setPlanMaxAmount(BigDecimal planMaxAmount) {
    this.planMaxAmount = planMaxAmount;
  }


  public CreateSubscriptionRequestPlanDetails planMaxCycles(Integer planMaxCycles) {
    
    this.planMaxCycles = planMaxCycles;
    return this;
  }

   /**
   * Maximum number of debits set for the plan. The subscription will automatically change to COMPLETED status once this limit is reached.
   * @return planMaxCycles
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Maximum number of debits set for the plan. The subscription will automatically change to COMPLETED status once this limit is reached.")
  public Integer getPlanMaxCycles() {
    return planMaxCycles;
  }


  public void setPlanMaxCycles(Integer planMaxCycles) {
    this.planMaxCycles = planMaxCycles;
  }


  public CreateSubscriptionRequestPlanDetails planIntervals(Integer planIntervals) {
    
    this.planIntervals = planIntervals;
    return this;
  }

   /**
   * Number of intervals of intervalType between every subscription payment. For example, to charge a customer bi-weekly use intervalType as “week” and intervals as 2. Required for PERIODIC plan. The default value is 1.
   * @return planIntervals
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Number of intervals of intervalType between every subscription payment. For example, to charge a customer bi-weekly use intervalType as “week” and intervals as 2. Required for PERIODIC plan. The default value is 1.")
  public Integer getPlanIntervals() {
    return planIntervals;
  }


  public void setPlanIntervals(Integer planIntervals) {
    this.planIntervals = planIntervals;
  }


  public CreateSubscriptionRequestPlanDetails planIntervalType(String planIntervalType) {
    
    this.planIntervalType = planIntervalType;
    return this;
  }

   /**
   * The type of interval for a PERIODIC plan like DAY, WEEK, MONTH, or YEAR. This is a conditional parameter only applicable for PERIODIC plans.
   * @return planIntervalType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "The type of interval for a PERIODIC plan like DAY, WEEK, MONTH, or YEAR. This is a conditional parameter only applicable for PERIODIC plans.")
  public String getPlanIntervalType() {
    return planIntervalType;
  }


  public void setPlanIntervalType(String planIntervalType) {
    this.planIntervalType = planIntervalType;
  }


  public CreateSubscriptionRequestPlanDetails planNote(String planNote) {
    
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
    CreateSubscriptionRequestPlanDetails createSubscriptionRequestPlanDetails = (CreateSubscriptionRequestPlanDetails) o;
    return Objects.equals(this.planId, createSubscriptionRequestPlanDetails.planId) &&
        Objects.equals(this.planName, createSubscriptionRequestPlanDetails.planName) &&
        Objects.equals(this.planType, createSubscriptionRequestPlanDetails.planType) &&
        Objects.equals(this.planCurrency, createSubscriptionRequestPlanDetails.planCurrency) &&
        Objects.equals(this.planAmount, createSubscriptionRequestPlanDetails.planAmount) &&
        Objects.equals(this.planMaxAmount, createSubscriptionRequestPlanDetails.planMaxAmount) &&
        Objects.equals(this.planMaxCycles, createSubscriptionRequestPlanDetails.planMaxCycles) &&
        Objects.equals(this.planIntervals, createSubscriptionRequestPlanDetails.planIntervals) &&
        Objects.equals(this.planIntervalType, createSubscriptionRequestPlanDetails.planIntervalType) &&
        Objects.equals(this.planNote, createSubscriptionRequestPlanDetails.planNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, planType, planCurrency, planAmount, planMaxAmount, planMaxCycles, planIntervals, planIntervalType, planNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequestPlanDetails {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    planCurrency: ").append(toIndentedString(planCurrency)).append("\n");
    sb.append("    planAmount: ").append(toIndentedString(planAmount)).append("\n");
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
    openapiFields.add("plan_amount");
    openapiFields.add("plan_max_amount");
    openapiFields.add("plan_max_cycles");
    openapiFields.add("plan_intervals");
    openapiFields.add("plan_interval_type");
    openapiFields.add("plan_note");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequestPlanDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonNull()) && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if ((jsonObj.get("plan_type") != null && !jsonObj.get("plan_type").isJsonNull()) && !jsonObj.get("plan_type").isJsonPrimitive()) {
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
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequestPlanDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plan_id") != null && !jsonObj.get("plan_id").isJsonNull()) && !jsonObj.get("plan_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_id").toString()));
      }
      if ((jsonObj.get("plan_name") != null && !jsonObj.get("plan_name").isJsonNull()) && !jsonObj.get("plan_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_name").toString()));
      }
      if ((jsonObj.get("plan_type") != null && !jsonObj.get("plan_type").isJsonNull()) && !jsonObj.get("plan_type").isJsonPrimitive()) {
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
       if (!CreateSubscriptionRequestPlanDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionRequestPlanDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionRequestPlanDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionRequestPlanDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionRequestPlanDetails>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionRequestPlanDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionRequestPlanDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionRequestPlanDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionRequestPlanDetails
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionRequestPlanDetails
  */
  public static CreateSubscriptionRequestPlanDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionRequestPlanDetails.class);
  }

 /**
  * Convert an instance of CreateSubscriptionRequestPlanDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.model.AuthorizationDetails;
import com.cashfree.model.PlanEntity;
import com.cashfree.model.SubscriptionCustomerDetails;
import com.cashfree.model.SubscriptionEntitySubscriptionMeta;
import com.cashfree.model.SubscriptionPaymentSplitItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
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
 * The response returned for Get, Create or Manage Subscription APIs.
 */
@Schema(description = "The response returned for Get, Create or Manage Subscription APIs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-09T12:52:07.742309Z[Etc/UTC]")
public class SubscriptionEntity {
  public static final String SERIALIZED_NAME_AUTHORISATION_DETAILS = "authorisation_details";
  @SerializedName(SERIALIZED_NAME_AUTHORISATION_DETAILS)
  private AuthorizationDetails authorisationDetails;

  public static final String SERIALIZED_NAME_CF_SUBSCRIPTION_ID = "cf_subscription_id";
  @SerializedName(SERIALIZED_NAME_CF_SUBSCRIPTION_ID)
  private String cfSubscriptionId;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private SubscriptionCustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_PLAN_DETAILS = "plan_details";
  @SerializedName(SERIALIZED_NAME_PLAN_DETAILS)
  private PlanEntity planDetails;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRY_TIME = "subscription_expiry_time";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRY_TIME)
  private String subscriptionExpiryTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_FIRST_CHARGE_TIME = "subscription_first_charge_time";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_FIRST_CHARGE_TIME)
  private String subscriptionFirstChargeTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_META = "subscription_meta";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_META)
  private SubscriptionEntitySubscriptionMeta subscriptionMeta;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_NOTE = "subscription_note";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_NOTE)
  private String subscriptionNote;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_SESSION_ID = "subscription_session_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_SESSION_ID)
  private String subscriptionSessionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PAYMENT_SPLITS = "subscription_payment_splits";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PAYMENT_SPLITS)
  private List<SubscriptionPaymentSplitItem> subscriptionPaymentSplits;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_STATUS = "subscription_status";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_STATUS)
  private String subscriptionStatus;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TAGS = "subscription_tags";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TAGS)
  private Object subscriptionTags;

  public SubscriptionEntity() {
  }

  public SubscriptionEntity authorisationDetails(AuthorizationDetails authorisationDetails) {
    
    this.authorisationDetails = authorisationDetails;
    return this;
  }

   /**
   * Get authorisationDetails
   * @return authorisationDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public AuthorizationDetails getAuthorisationDetails() {
    return authorisationDetails;
  }


  public void setAuthorisationDetails(AuthorizationDetails authorisationDetails) {
    this.authorisationDetails = authorisationDetails;
  }


  public SubscriptionEntity cfSubscriptionId(String cfSubscriptionId) {
    
    this.cfSubscriptionId = cfSubscriptionId;
    return this;
  }

   /**
   * Cashfree subscription reference number
   * @return cfSubscriptionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Cashfree subscription reference number")
  public String getCfSubscriptionId() {
    return cfSubscriptionId;
  }


  public void setCfSubscriptionId(String cfSubscriptionId) {
    this.cfSubscriptionId = cfSubscriptionId;
  }


  public SubscriptionEntity customerDetails(SubscriptionCustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SubscriptionCustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(SubscriptionCustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public SubscriptionEntity planDetails(PlanEntity planDetails) {
    
    this.planDetails = planDetails;
    return this;
  }

   /**
   * Get planDetails
   * @return planDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public PlanEntity getPlanDetails() {
    return planDetails;
  }


  public void setPlanDetails(PlanEntity planDetails) {
    this.planDetails = planDetails;
  }


  public SubscriptionEntity subscriptionExpiryTime(String subscriptionExpiryTime) {
    
    this.subscriptionExpiryTime = subscriptionExpiryTime;
    return this;
  }

   /**
   * Time at which the subscription will expire.
   * @return subscriptionExpiryTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time at which the subscription will expire.")
  public String getSubscriptionExpiryTime() {
    return subscriptionExpiryTime;
  }


  public void setSubscriptionExpiryTime(String subscriptionExpiryTime) {
    this.subscriptionExpiryTime = subscriptionExpiryTime;
  }


  public SubscriptionEntity subscriptionFirstChargeTime(String subscriptionFirstChargeTime) {
    
    this.subscriptionFirstChargeTime = subscriptionFirstChargeTime;
    return this;
  }

   /**
   * Time at which the first charge will be made for the subscription. Applicable only for PERIODIC plans.
   * @return subscriptionFirstChargeTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time at which the first charge will be made for the subscription. Applicable only for PERIODIC plans.")
  public String getSubscriptionFirstChargeTime() {
    return subscriptionFirstChargeTime;
  }


  public void setSubscriptionFirstChargeTime(String subscriptionFirstChargeTime) {
    this.subscriptionFirstChargeTime = subscriptionFirstChargeTime;
  }


  public SubscriptionEntity subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * A unique ID passed by merchant for identifying the subscription.
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "A unique ID passed by merchant for identifying the subscription.")
  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public SubscriptionEntity subscriptionMeta(SubscriptionEntitySubscriptionMeta subscriptionMeta) {
    
    this.subscriptionMeta = subscriptionMeta;
    return this;
  }

   /**
   * Get subscriptionMeta
   * @return subscriptionMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SubscriptionEntitySubscriptionMeta getSubscriptionMeta() {
    return subscriptionMeta;
  }


  public void setSubscriptionMeta(SubscriptionEntitySubscriptionMeta subscriptionMeta) {
    this.subscriptionMeta = subscriptionMeta;
  }


  public SubscriptionEntity subscriptionNote(String subscriptionNote) {
    
    this.subscriptionNote = subscriptionNote;
    return this;
  }

   /**
   * Note for the subscription.
   * @return subscriptionNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Note for the subscription.")
  public String getSubscriptionNote() {
    return subscriptionNote;
  }


  public void setSubscriptionNote(String subscriptionNote) {
    this.subscriptionNote = subscriptionNote;
  }


  public SubscriptionEntity subscriptionSessionId(String subscriptionSessionId) {
    
    this.subscriptionSessionId = subscriptionSessionId;
    return this;
  }

   /**
   * Subscription Session Id.
   * @return subscriptionSessionId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Subscription Session Id.")
  public String getSubscriptionSessionId() {
    return subscriptionSessionId;
  }


  public void setSubscriptionSessionId(String subscriptionSessionId) {
    this.subscriptionSessionId = subscriptionSessionId;
  }


  public SubscriptionEntity subscriptionPaymentSplits(List<SubscriptionPaymentSplitItem> subscriptionPaymentSplits) {
    
    this.subscriptionPaymentSplits = subscriptionPaymentSplits;
    return this;
  }

  public SubscriptionEntity addSubscriptionPaymentSplitsItem(SubscriptionPaymentSplitItem subscriptionPaymentSplitsItem) {
    if (this.subscriptionPaymentSplits == null) {
      this.subscriptionPaymentSplits = new ArrayList<>();
    }
    this.subscriptionPaymentSplits.add(subscriptionPaymentSplitsItem);
    return this;
  }

   /**
   * Payment splits for the subscription.
   * @return subscriptionPaymentSplits
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment splits for the subscription.")
  public List<SubscriptionPaymentSplitItem> getSubscriptionPaymentSplits() {
    return subscriptionPaymentSplits;
  }


  public void setSubscriptionPaymentSplits(List<SubscriptionPaymentSplitItem> subscriptionPaymentSplits) {
    this.subscriptionPaymentSplits = subscriptionPaymentSplits;
  }


  public SubscriptionEntity subscriptionStatus(String subscriptionStatus) {
    
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * Status of the subscription.
   * @return subscriptionStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the subscription.")
  public String getSubscriptionStatus() {
    return subscriptionStatus;
  }


  public void setSubscriptionStatus(String subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  public SubscriptionEntity subscriptionTags(Object subscriptionTags) {
    
    this.subscriptionTags = subscriptionTags;
    return this;
  }

   /**
   * Tags for the subscription.
   * @return subscriptionTags
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Tags for the subscription.")
  public Object getSubscriptionTags() {
    return subscriptionTags;
  }


  public void setSubscriptionTags(Object subscriptionTags) {
    this.subscriptionTags = subscriptionTags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEntity subscriptionEntity = (SubscriptionEntity) o;
    return Objects.equals(this.authorisationDetails, subscriptionEntity.authorisationDetails) &&
        Objects.equals(this.cfSubscriptionId, subscriptionEntity.cfSubscriptionId) &&
        Objects.equals(this.customerDetails, subscriptionEntity.customerDetails) &&
        Objects.equals(this.planDetails, subscriptionEntity.planDetails) &&
        Objects.equals(this.subscriptionExpiryTime, subscriptionEntity.subscriptionExpiryTime) &&
        Objects.equals(this.subscriptionFirstChargeTime, subscriptionEntity.subscriptionFirstChargeTime) &&
        Objects.equals(this.subscriptionId, subscriptionEntity.subscriptionId) &&
        Objects.equals(this.subscriptionMeta, subscriptionEntity.subscriptionMeta) &&
        Objects.equals(this.subscriptionNote, subscriptionEntity.subscriptionNote) &&
        Objects.equals(this.subscriptionSessionId, subscriptionEntity.subscriptionSessionId) &&
        Objects.equals(this.subscriptionPaymentSplits, subscriptionEntity.subscriptionPaymentSplits) &&
        Objects.equals(this.subscriptionStatus, subscriptionEntity.subscriptionStatus) &&
        Objects.equals(this.subscriptionTags, subscriptionEntity.subscriptionTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorisationDetails, cfSubscriptionId, customerDetails, planDetails, subscriptionExpiryTime, subscriptionFirstChargeTime, subscriptionId, subscriptionMeta, subscriptionNote, subscriptionSessionId, subscriptionPaymentSplits, subscriptionStatus, subscriptionTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEntity {\n");
    sb.append("    authorisationDetails: ").append(toIndentedString(authorisationDetails)).append("\n");
    sb.append("    cfSubscriptionId: ").append(toIndentedString(cfSubscriptionId)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    planDetails: ").append(toIndentedString(planDetails)).append("\n");
    sb.append("    subscriptionExpiryTime: ").append(toIndentedString(subscriptionExpiryTime)).append("\n");
    sb.append("    subscriptionFirstChargeTime: ").append(toIndentedString(subscriptionFirstChargeTime)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionMeta: ").append(toIndentedString(subscriptionMeta)).append("\n");
    sb.append("    subscriptionNote: ").append(toIndentedString(subscriptionNote)).append("\n");
    sb.append("    subscriptionSessionId: ").append(toIndentedString(subscriptionSessionId)).append("\n");
    sb.append("    subscriptionPaymentSplits: ").append(toIndentedString(subscriptionPaymentSplits)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
    sb.append("    subscriptionTags: ").append(toIndentedString(subscriptionTags)).append("\n");
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
    openapiFields.add("authorisation_details");
    openapiFields.add("cf_subscription_id");
    openapiFields.add("customer_details");
    openapiFields.add("plan_details");
    openapiFields.add("subscription_expiry_time");
    openapiFields.add("subscription_first_charge_time");
    openapiFields.add("subscription_id");
    openapiFields.add("subscription_meta");
    openapiFields.add("subscription_note");
    openapiFields.add("subscription_session_id");
    openapiFields.add("subscription_payment_splits");
    openapiFields.add("subscription_status");
    openapiFields.add("subscription_tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `authorisation_details`
      if (jsonObj.get("authorisation_details") != null && !jsonObj.get("authorisation_details").isJsonNull()) {
        AuthorizationDetails.validateJsonElement(jsonObj.get("authorisation_details"));
      }
      if ((jsonObj.get("cf_subscription_id") != null && !jsonObj.get("cf_subscription_id").isJsonNull()) && !jsonObj.get("cf_subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_subscription_id").toString()));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        SubscriptionCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      }
      // validate the optional field `plan_details`
      if (jsonObj.get("plan_details") != null && !jsonObj.get("plan_details").isJsonNull()) {
        PlanEntity.validateJsonElement(jsonObj.get("plan_details"));
      }
      if ((jsonObj.get("subscription_expiry_time") != null && !jsonObj.get("subscription_expiry_time").isJsonNull()) && !jsonObj.get("subscription_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_expiry_time").toString()));
      }
      if ((jsonObj.get("subscription_first_charge_time") != null && !jsonObj.get("subscription_first_charge_time").isJsonNull()) && !jsonObj.get("subscription_first_charge_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_first_charge_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_first_charge_time").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      // validate the optional field `subscription_meta`
      if (jsonObj.get("subscription_meta") != null && !jsonObj.get("subscription_meta").isJsonNull()) {
        SubscriptionEntitySubscriptionMeta.validateJsonElement(jsonObj.get("subscription_meta"));
      }
      if ((jsonObj.get("subscription_note") != null && !jsonObj.get("subscription_note").isJsonNull()) && !jsonObj.get("subscription_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_note").toString()));
      }
      if ((jsonObj.get("subscription_session_id") != null && !jsonObj.get("subscription_session_id").isJsonNull()) && !jsonObj.get("subscription_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_session_id").toString()));
      }
      if (jsonObj.get("subscription_payment_splits") != null && !jsonObj.get("subscription_payment_splits").isJsonNull()) {
        JsonArray jsonArraysubscriptionPaymentSplits = jsonObj.getAsJsonArray("subscription_payment_splits");
        if (jsonArraysubscriptionPaymentSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscription_payment_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscription_payment_splits` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_payment_splits").toString()));
          }

          // validate the optional field `subscription_payment_splits` (array)
          for (int i = 0; i < jsonArraysubscriptionPaymentSplits.size(); i++) {
            SubscriptionPaymentSplitItem.validateJsonElement(jsonArraysubscriptionPaymentSplits.get(i));
          };
        }
      }
      if ((jsonObj.get("subscription_status") != null && !jsonObj.get("subscription_status").isJsonNull()) && !jsonObj.get("subscription_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_status").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `authorisation_details`
      if (jsonObj.get("authorisation_details") != null && !jsonObj.get("authorisation_details").isJsonNull()) {
        AuthorizationDetails.validateJsonElement(jsonObj.get("authorisation_details"));
        return true;
      }
      if ((jsonObj.get("cf_subscription_id") != null && !jsonObj.get("cf_subscription_id").isJsonNull()) && !jsonObj.get("cf_subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_subscription_id").toString()));
      }
      // validate the optional field `customer_details`
      if (jsonObj.get("customer_details") != null && !jsonObj.get("customer_details").isJsonNull()) {
        SubscriptionCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
        return true;
      }
      // validate the optional field `plan_details`
      if (jsonObj.get("plan_details") != null && !jsonObj.get("plan_details").isJsonNull()) {
        PlanEntity.validateJsonElement(jsonObj.get("plan_details"));
        return true;
      }
      if ((jsonObj.get("subscription_expiry_time") != null && !jsonObj.get("subscription_expiry_time").isJsonNull()) && !jsonObj.get("subscription_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_expiry_time").toString()));
      }
      if ((jsonObj.get("subscription_first_charge_time") != null && !jsonObj.get("subscription_first_charge_time").isJsonNull()) && !jsonObj.get("subscription_first_charge_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_first_charge_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_first_charge_time").toString()));
      }
      if ((jsonObj.get("subscription_id") != null && !jsonObj.get("subscription_id").isJsonNull()) && !jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      // validate the optional field `subscription_meta`
      if (jsonObj.get("subscription_meta") != null && !jsonObj.get("subscription_meta").isJsonNull()) {
        SubscriptionEntitySubscriptionMeta.validateJsonElement(jsonObj.get("subscription_meta"));
        return true;
      }
      if ((jsonObj.get("subscription_note") != null && !jsonObj.get("subscription_note").isJsonNull()) && !jsonObj.get("subscription_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_note").toString()));
      }
      if ((jsonObj.get("subscription_session_id") != null && !jsonObj.get("subscription_session_id").isJsonNull()) && !jsonObj.get("subscription_session_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_session_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_session_id").toString()));
      }
      if (jsonObj.get("subscription_payment_splits") != null && !jsonObj.get("subscription_payment_splits").isJsonNull()) {
        JsonArray jsonArraysubscriptionPaymentSplits = jsonObj.getAsJsonArray("subscription_payment_splits");
        if (jsonArraysubscriptionPaymentSplits != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscription_payment_splits").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscription_payment_splits` to be an array in the JSON string but got `%s`", jsonObj.get("subscription_payment_splits").toString()));
          }

          // validate the optional field `subscription_payment_splits` (array)
          for (int i = 0; i < jsonArraysubscriptionPaymentSplits.size(); i++) {
            SubscriptionPaymentSplitItem.validateJsonElement(jsonArraysubscriptionPaymentSplits.get(i));
          };
        }
      }
      if ((jsonObj.get("subscription_status") != null && !jsonObj.get("subscription_status").isJsonNull()) && !jsonObj.get("subscription_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_status").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEntity>() {
           @Override
           public void write(JsonWriter out, SubscriptionEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEntity
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEntity
  */
  public static SubscriptionEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEntity.class);
  }

 /**
  * Convert an instance of SubscriptionEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


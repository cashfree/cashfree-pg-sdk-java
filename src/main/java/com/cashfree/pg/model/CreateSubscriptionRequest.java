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
import com.cashfree.pg.model.CreateSubscriptionRequestAuthorizationDetails;
import com.cashfree.pg.model.CreateSubscriptionRequestPlanDetails;
import com.cashfree.pg.model.CreateSubscriptionRequestSubscriptionMeta;
import com.cashfree.pg.model.SubscriptionCustomerDetails;
import com.cashfree.pg.model.SubscriptionPaymentSplitItem;
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

import com.cashfree.pg.JSON;

/**
 * Request body to create a new subscription.
 */
@Schema(description = "Request body to create a new subscription.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-24T05:12:29.162122Z[Etc/UTC]")
public class CreateSubscriptionRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscription_id";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private SubscriptionCustomerDetails customerDetails;

  public static final String SERIALIZED_NAME_PLAN_DETAILS = "plan_details";
  @SerializedName(SERIALIZED_NAME_PLAN_DETAILS)
  private CreateSubscriptionRequestPlanDetails planDetails;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DETAILS = "authorization_details";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DETAILS)
  private CreateSubscriptionRequestAuthorizationDetails authorizationDetails;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_META = "subscription_meta";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_META)
  private CreateSubscriptionRequestSubscriptionMeta subscriptionMeta;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_EXPIRY_TIME = "subscription_expiry_time";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_EXPIRY_TIME)
  private String subscriptionExpiryTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_FIRST_CHARGE_TIME = "subscription_first_charge_time";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_FIRST_CHARGE_TIME)
  private String subscriptionFirstChargeTime;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_NOTE = "subscription_note";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_NOTE)
  private String subscriptionNote;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TAGS = "subscription_tags";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TAGS)
  private Object subscriptionTags;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PAYMENT_SPLITS = "subscription_payment_splits";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PAYMENT_SPLITS)
  private List<SubscriptionPaymentSplitItem> subscriptionPaymentSplits;

  public CreateSubscriptionRequest() {
  }

  public CreateSubscriptionRequest subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * A unique ID for the subscription. It can include alphanumeric characters, underscore, dot, hyphen, and space. Maximum characters allowed is 250.
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A unique ID for the subscription. It can include alphanumeric characters, underscore, dot, hyphen, and space. Maximum characters allowed is 250.")
  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public CreateSubscriptionRequest customerDetails(SubscriptionCustomerDetails customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public SubscriptionCustomerDetails getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(SubscriptionCustomerDetails customerDetails) {
    this.customerDetails = customerDetails;
  }


  public CreateSubscriptionRequest planDetails(CreateSubscriptionRequestPlanDetails planDetails) {
    
    this.planDetails = planDetails;
    return this;
  }

   /**
   * Get planDetails
   * @return planDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public CreateSubscriptionRequestPlanDetails getPlanDetails() {
    return planDetails;
  }


  public void setPlanDetails(CreateSubscriptionRequestPlanDetails planDetails) {
    this.planDetails = planDetails;
  }


  public CreateSubscriptionRequest authorizationDetails(CreateSubscriptionRequestAuthorizationDetails authorizationDetails) {
    
    this.authorizationDetails = authorizationDetails;
    return this;
  }

   /**
   * Get authorizationDetails
   * @return authorizationDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateSubscriptionRequestAuthorizationDetails getAuthorizationDetails() {
    return authorizationDetails;
  }


  public void setAuthorizationDetails(CreateSubscriptionRequestAuthorizationDetails authorizationDetails) {
    this.authorizationDetails = authorizationDetails;
  }


  public CreateSubscriptionRequest subscriptionMeta(CreateSubscriptionRequestSubscriptionMeta subscriptionMeta) {
    
    this.subscriptionMeta = subscriptionMeta;
    return this;
  }

   /**
   * Get subscriptionMeta
   * @return subscriptionMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CreateSubscriptionRequestSubscriptionMeta getSubscriptionMeta() {
    return subscriptionMeta;
  }


  public void setSubscriptionMeta(CreateSubscriptionRequestSubscriptionMeta subscriptionMeta) {
    this.subscriptionMeta = subscriptionMeta;
  }


  public CreateSubscriptionRequest subscriptionExpiryTime(String subscriptionExpiryTime) {
    
    this.subscriptionExpiryTime = subscriptionExpiryTime;
    return this;
  }

   /**
   * Expiry date for the subscription.
   * @return subscriptionExpiryTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Expiry date for the subscription.")
  public String getSubscriptionExpiryTime() {
    return subscriptionExpiryTime;
  }


  public void setSubscriptionExpiryTime(String subscriptionExpiryTime) {
    this.subscriptionExpiryTime = subscriptionExpiryTime;
  }


  public CreateSubscriptionRequest subscriptionFirstChargeTime(String subscriptionFirstChargeTime) {
    
    this.subscriptionFirstChargeTime = subscriptionFirstChargeTime;
    return this;
  }

   /**
   * Time at which the first charge will be made for the subscription after authorization. Applicable only for PERIODIC plans.
   * @return subscriptionFirstChargeTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time at which the first charge will be made for the subscription after authorization. Applicable only for PERIODIC plans.")
  public String getSubscriptionFirstChargeTime() {
    return subscriptionFirstChargeTime;
  }


  public void setSubscriptionFirstChargeTime(String subscriptionFirstChargeTime) {
    this.subscriptionFirstChargeTime = subscriptionFirstChargeTime;
  }


  public CreateSubscriptionRequest subscriptionNote(String subscriptionNote) {
    
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


  public CreateSubscriptionRequest subscriptionTags(Object subscriptionTags) {
    
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


  public CreateSubscriptionRequest subscriptionPaymentSplits(List<SubscriptionPaymentSplitItem> subscriptionPaymentSplits) {
    
    this.subscriptionPaymentSplits = subscriptionPaymentSplits;
    return this;
  }

  public CreateSubscriptionRequest addSubscriptionPaymentSplitsItem(SubscriptionPaymentSplitItem subscriptionPaymentSplitsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest) o;
    return Objects.equals(this.subscriptionId, createSubscriptionRequest.subscriptionId) &&
        Objects.equals(this.customerDetails, createSubscriptionRequest.customerDetails) &&
        Objects.equals(this.planDetails, createSubscriptionRequest.planDetails) &&
        Objects.equals(this.authorizationDetails, createSubscriptionRequest.authorizationDetails) &&
        Objects.equals(this.subscriptionMeta, createSubscriptionRequest.subscriptionMeta) &&
        Objects.equals(this.subscriptionExpiryTime, createSubscriptionRequest.subscriptionExpiryTime) &&
        Objects.equals(this.subscriptionFirstChargeTime, createSubscriptionRequest.subscriptionFirstChargeTime) &&
        Objects.equals(this.subscriptionNote, createSubscriptionRequest.subscriptionNote) &&
        Objects.equals(this.subscriptionTags, createSubscriptionRequest.subscriptionTags) &&
        Objects.equals(this.subscriptionPaymentSplits, createSubscriptionRequest.subscriptionPaymentSplits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, customerDetails, planDetails, authorizationDetails, subscriptionMeta, subscriptionExpiryTime, subscriptionFirstChargeTime, subscriptionNote, subscriptionTags, subscriptionPaymentSplits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    planDetails: ").append(toIndentedString(planDetails)).append("\n");
    sb.append("    authorizationDetails: ").append(toIndentedString(authorizationDetails)).append("\n");
    sb.append("    subscriptionMeta: ").append(toIndentedString(subscriptionMeta)).append("\n");
    sb.append("    subscriptionExpiryTime: ").append(toIndentedString(subscriptionExpiryTime)).append("\n");
    sb.append("    subscriptionFirstChargeTime: ").append(toIndentedString(subscriptionFirstChargeTime)).append("\n");
    sb.append("    subscriptionNote: ").append(toIndentedString(subscriptionNote)).append("\n");
    sb.append("    subscriptionTags: ").append(toIndentedString(subscriptionTags)).append("\n");
    sb.append("    subscriptionPaymentSplits: ").append(toIndentedString(subscriptionPaymentSplits)).append("\n");
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
    openapiFields.add("subscription_id");
    openapiFields.add("customer_details");
    openapiFields.add("plan_details");
    openapiFields.add("authorization_details");
    openapiFields.add("subscription_meta");
    openapiFields.add("subscription_expiry_time");
    openapiFields.add("subscription_first_charge_time");
    openapiFields.add("subscription_note");
    openapiFields.add("subscription_tags");
    openapiFields.add("subscription_payment_splits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscription_id");
    openapiRequiredFields.add("customer_details");
    openapiRequiredFields.add("plan_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      // validate the required field `customer_details`
      SubscriptionCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      // validate the required field `plan_details`
      CreateSubscriptionRequestPlanDetails.validateJsonElement(jsonObj.get("plan_details"));
      // validate the optional field `authorization_details`
      if (jsonObj.get("authorization_details") != null && !jsonObj.get("authorization_details").isJsonNull()) {
        CreateSubscriptionRequestAuthorizationDetails.validateJsonElement(jsonObj.get("authorization_details"));
      }
      // validate the optional field `subscription_meta`
      if (jsonObj.get("subscription_meta") != null && !jsonObj.get("subscription_meta").isJsonNull()) {
        CreateSubscriptionRequestSubscriptionMeta.validateJsonElement(jsonObj.get("subscription_meta"));
      }
      if ((jsonObj.get("subscription_expiry_time") != null && !jsonObj.get("subscription_expiry_time").isJsonNull()) && !jsonObj.get("subscription_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_expiry_time").toString()));
      }
      if ((jsonObj.get("subscription_first_charge_time") != null && !jsonObj.get("subscription_first_charge_time").isJsonNull()) && !jsonObj.get("subscription_first_charge_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_first_charge_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_first_charge_time").toString()));
      }
      if ((jsonObj.get("subscription_note") != null && !jsonObj.get("subscription_note").isJsonNull()) && !jsonObj.get("subscription_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_note").toString()));
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
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("subscription_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_id").toString()));
      }
      // validate the required field `customer_details`
      SubscriptionCustomerDetails.validateJsonElement(jsonObj.get("customer_details"));
      // validate the required field `plan_details`
      CreateSubscriptionRequestPlanDetails.validateJsonElement(jsonObj.get("plan_details"));
      // validate the optional field `authorization_details`
      if (jsonObj.get("authorization_details") != null && !jsonObj.get("authorization_details").isJsonNull()) {
        CreateSubscriptionRequestAuthorizationDetails.validateJsonElement(jsonObj.get("authorization_details"));
        return true;
      }
      // validate the optional field `subscription_meta`
      if (jsonObj.get("subscription_meta") != null && !jsonObj.get("subscription_meta").isJsonNull()) {
        CreateSubscriptionRequestSubscriptionMeta.validateJsonElement(jsonObj.get("subscription_meta"));
        return true;
      }
      if ((jsonObj.get("subscription_expiry_time") != null && !jsonObj.get("subscription_expiry_time").isJsonNull()) && !jsonObj.get("subscription_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_expiry_time").toString()));
      }
      if ((jsonObj.get("subscription_first_charge_time") != null && !jsonObj.get("subscription_first_charge_time").isJsonNull()) && !jsonObj.get("subscription_first_charge_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_first_charge_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_first_charge_time").toString()));
      }
      if ((jsonObj.get("subscription_note") != null && !jsonObj.get("subscription_note").isJsonNull()) && !jsonObj.get("subscription_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_note").toString()));
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
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionRequest
  */
  public static CreateSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


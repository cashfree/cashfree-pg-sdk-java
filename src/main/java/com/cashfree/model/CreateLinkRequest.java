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
import com.cashfree.model.LinkCustomerDetailsEntity;
import com.cashfree.model.LinkMetaResponseEntity;
import com.cashfree.model.LinkNotifyEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Request paramenters for link creation
 */
@Schema(description = "Request paramenters for link creation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T10:54:45.822625Z[Etc/UTC]")
public class CreateLinkRequest {
  public static final String SERIALIZED_NAME_LINK_ID = "link_id";
  @SerializedName(SERIALIZED_NAME_LINK_ID)
  private String linkId;

  public static final String SERIALIZED_NAME_LINK_AMOUNT = "link_amount";
  @SerializedName(SERIALIZED_NAME_LINK_AMOUNT)
  private Double linkAmount;

  public static final String SERIALIZED_NAME_LINK_CURRENCY = "link_currency";
  @SerializedName(SERIALIZED_NAME_LINK_CURRENCY)
  private String linkCurrency;

  public static final String SERIALIZED_NAME_LINK_PURPOSE = "link_purpose";
  @SerializedName(SERIALIZED_NAME_LINK_PURPOSE)
  private String linkPurpose;

  public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
  private LinkCustomerDetailsEntity customerDetails;

  public static final String SERIALIZED_NAME_LINK_PARTIAL_PAYMENTS = "link_partial_payments";
  @SerializedName(SERIALIZED_NAME_LINK_PARTIAL_PAYMENTS)
  private Boolean linkPartialPayments;

  public static final String SERIALIZED_NAME_LINK_MINIMUM_PARTIAL_AMOUNT = "link_minimum_partial_amount";
  @SerializedName(SERIALIZED_NAME_LINK_MINIMUM_PARTIAL_AMOUNT)
  private Double linkMinimumPartialAmount;

  public static final String SERIALIZED_NAME_LINK_EXPIRY_TIME = "link_expiry_time";
  @SerializedName(SERIALIZED_NAME_LINK_EXPIRY_TIME)
  private String linkExpiryTime;

  public static final String SERIALIZED_NAME_LINK_NOTIFY = "link_notify";
  @SerializedName(SERIALIZED_NAME_LINK_NOTIFY)
  private LinkNotifyEntity linkNotify;

  public static final String SERIALIZED_NAME_LINK_AUTO_REMINDERS = "link_auto_reminders";
  @SerializedName(SERIALIZED_NAME_LINK_AUTO_REMINDERS)
  private Boolean linkAutoReminders;

  public static final String SERIALIZED_NAME_LINK_NOTES = "link_notes";
  @SerializedName(SERIALIZED_NAME_LINK_NOTES)
  private Map<String, String> linkNotes = new HashMap<>();

  public static final String SERIALIZED_NAME_LINK_META = "link_meta";
  @SerializedName(SERIALIZED_NAME_LINK_META)
  private LinkMetaResponseEntity linkMeta;

  public CreateLinkRequest() {
  }

  public CreateLinkRequest linkId(String linkId) {
    
    this.linkId = linkId;
    return this;
  }

   /**
   * Unique Identifier (provided by merchant) for the Link. Alphanumeric and only - and _ allowed (50 character limit). Use this for other link-related APIs.
   * @return linkId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Unique Identifier (provided by merchant) for the Link. Alphanumeric and only - and _ allowed (50 character limit). Use this for other link-related APIs.")
  public String getLinkId() {
    return linkId;
  }


  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  public CreateLinkRequest linkAmount(Double linkAmount) {
    
    this.linkAmount = linkAmount;
    return this;
  }

   /**
   * Amount to be collected using this link. Provide upto two decimals for paise.
   * @return linkAmount
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Amount to be collected using this link. Provide upto two decimals for paise.")
  public Double getLinkAmount() {
    return linkAmount;
  }


  public void setLinkAmount(Double linkAmount) {
    this.linkAmount = linkAmount;
  }


  public CreateLinkRequest linkCurrency(String linkCurrency) {
    
    this.linkCurrency = linkCurrency;
    return this;
  }

   /**
   * Currency for the payment link. Default is INR. Contact care@cashfree.com to enable new currencies.
   * @return linkCurrency
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Currency for the payment link. Default is INR. Contact care@cashfree.com to enable new currencies.")
  public String getLinkCurrency() {
    return linkCurrency;
  }


  public void setLinkCurrency(String linkCurrency) {
    this.linkCurrency = linkCurrency;
  }


  public CreateLinkRequest linkPurpose(String linkPurpose) {
    
    this.linkPurpose = linkPurpose;
    return this;
  }

   /**
   * A brief description for which payment must be collected. This is shown to the customer.
   * @return linkPurpose
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "A brief description for which payment must be collected. This is shown to the customer.")
  public String getLinkPurpose() {
    return linkPurpose;
  }


  public void setLinkPurpose(String linkPurpose) {
    this.linkPurpose = linkPurpose;
  }


  public CreateLinkRequest customerDetails(LinkCustomerDetailsEntity customerDetails) {
    
    this.customerDetails = customerDetails;
    return this;
  }

   /**
   * Get customerDetails
   * @return customerDetails
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public LinkCustomerDetailsEntity getCustomerDetails() {
    return customerDetails;
  }


  public void setCustomerDetails(LinkCustomerDetailsEntity customerDetails) {
    this.customerDetails = customerDetails;
  }


  public CreateLinkRequest linkPartialPayments(Boolean linkPartialPayments) {
    
    this.linkPartialPayments = linkPartialPayments;
    return this;
  }

   /**
   * If \&quot;true\&quot;, customer can make partial payments for the link.
   * @return linkPartialPayments
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If \"true\", customer can make partial payments for the link.")
  public Boolean getLinkPartialPayments() {
    return linkPartialPayments;
  }


  public void setLinkPartialPayments(Boolean linkPartialPayments) {
    this.linkPartialPayments = linkPartialPayments;
  }


  public CreateLinkRequest linkMinimumPartialAmount(Double linkMinimumPartialAmount) {
    
    this.linkMinimumPartialAmount = linkMinimumPartialAmount;
    return this;
  }

   /**
   * Minimum amount in first installment that needs to be paid by the customer if partial payments are enabled. This should be less than the link_amount.
   * @return linkMinimumPartialAmount
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Minimum amount in first installment that needs to be paid by the customer if partial payments are enabled. This should be less than the link_amount.")
  public Double getLinkMinimumPartialAmount() {
    return linkMinimumPartialAmount;
  }


  public void setLinkMinimumPartialAmount(Double linkMinimumPartialAmount) {
    this.linkMinimumPartialAmount = linkMinimumPartialAmount;
  }


  public CreateLinkRequest linkExpiryTime(String linkExpiryTime) {
    
    this.linkExpiryTime = linkExpiryTime;
    return this;
  }

   /**
   * Time after which the link expires. Customers will not be able to make the payment beyond the time specified here. You can provide them in a valid ISO 8601 time format. Default is 30 days.
   * @return linkExpiryTime
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Time after which the link expires. Customers will not be able to make the payment beyond the time specified here. You can provide them in a valid ISO 8601 time format. Default is 30 days.")
  public String getLinkExpiryTime() {
    return linkExpiryTime;
  }


  public void setLinkExpiryTime(String linkExpiryTime) {
    this.linkExpiryTime = linkExpiryTime;
  }


  public CreateLinkRequest linkNotify(LinkNotifyEntity linkNotify) {
    
    this.linkNotify = linkNotify;
    return this;
  }

   /**
   * Get linkNotify
   * @return linkNotify
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public LinkNotifyEntity getLinkNotify() {
    return linkNotify;
  }


  public void setLinkNotify(LinkNotifyEntity linkNotify) {
    this.linkNotify = linkNotify;
  }


  public CreateLinkRequest linkAutoReminders(Boolean linkAutoReminders) {
    
    this.linkAutoReminders = linkAutoReminders;
    return this;
  }

   /**
   * If \&quot;true\&quot;, reminders will be sent to customers for collecting payments.
   * @return linkAutoReminders
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "If \"true\", reminders will be sent to customers for collecting payments.")
  public Boolean getLinkAutoReminders() {
    return linkAutoReminders;
  }


  public void setLinkAutoReminders(Boolean linkAutoReminders) {
    this.linkAutoReminders = linkAutoReminders;
  }


  public CreateLinkRequest linkNotes(Map<String, String> linkNotes) {
    
    this.linkNotes = linkNotes;
    return this;
  }

  public CreateLinkRequest putLinkNotesItem(String key, String linkNotesItem) {
    if (this.linkNotes == null) {
      this.linkNotes = new HashMap<>();
    }
    this.linkNotes.put(key, linkNotesItem);
    return this;
  }

   /**
   * Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs
   * @return linkNotes
  **/
  @javax.annotation.Nullable
  @Schema(example = "{\"key_1\":\"value_1\",\"key_2\":\"value_2\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Key-value pair that can be used to store additional information about the entity. Maximum 5 key-value pairs")
  public Map<String, String> getLinkNotes() {
    return linkNotes;
  }


  public void setLinkNotes(Map<String, String> linkNotes) {
    this.linkNotes = linkNotes;
  }


  public CreateLinkRequest linkMeta(LinkMetaResponseEntity linkMeta) {
    
    this.linkMeta = linkMeta;
    return this;
  }

   /**
   * Get linkMeta
   * @return linkMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public LinkMetaResponseEntity getLinkMeta() {
    return linkMeta;
  }


  public void setLinkMeta(LinkMetaResponseEntity linkMeta) {
    this.linkMeta = linkMeta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLinkRequest createLinkRequest = (CreateLinkRequest) o;
    return Objects.equals(this.linkId, createLinkRequest.linkId) &&
        Objects.equals(this.linkAmount, createLinkRequest.linkAmount) &&
        Objects.equals(this.linkCurrency, createLinkRequest.linkCurrency) &&
        Objects.equals(this.linkPurpose, createLinkRequest.linkPurpose) &&
        Objects.equals(this.customerDetails, createLinkRequest.customerDetails) &&
        Objects.equals(this.linkPartialPayments, createLinkRequest.linkPartialPayments) &&
        Objects.equals(this.linkMinimumPartialAmount, createLinkRequest.linkMinimumPartialAmount) &&
        Objects.equals(this.linkExpiryTime, createLinkRequest.linkExpiryTime) &&
        Objects.equals(this.linkNotify, createLinkRequest.linkNotify) &&
        Objects.equals(this.linkAutoReminders, createLinkRequest.linkAutoReminders) &&
        Objects.equals(this.linkNotes, createLinkRequest.linkNotes) &&
        Objects.equals(this.linkMeta, createLinkRequest.linkMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkId, linkAmount, linkCurrency, linkPurpose, customerDetails, linkPartialPayments, linkMinimumPartialAmount, linkExpiryTime, linkNotify, linkAutoReminders, linkNotes, linkMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLinkRequest {\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    linkAmount: ").append(toIndentedString(linkAmount)).append("\n");
    sb.append("    linkCurrency: ").append(toIndentedString(linkCurrency)).append("\n");
    sb.append("    linkPurpose: ").append(toIndentedString(linkPurpose)).append("\n");
    sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
    sb.append("    linkPartialPayments: ").append(toIndentedString(linkPartialPayments)).append("\n");
    sb.append("    linkMinimumPartialAmount: ").append(toIndentedString(linkMinimumPartialAmount)).append("\n");
    sb.append("    linkExpiryTime: ").append(toIndentedString(linkExpiryTime)).append("\n");
    sb.append("    linkNotify: ").append(toIndentedString(linkNotify)).append("\n");
    sb.append("    linkAutoReminders: ").append(toIndentedString(linkAutoReminders)).append("\n");
    sb.append("    linkNotes: ").append(toIndentedString(linkNotes)).append("\n");
    sb.append("    linkMeta: ").append(toIndentedString(linkMeta)).append("\n");
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
    openapiFields.add("link_id");
    openapiFields.add("link_amount");
    openapiFields.add("link_currency");
    openapiFields.add("link_purpose");
    openapiFields.add("customer_details");
    openapiFields.add("link_partial_payments");
    openapiFields.add("link_minimum_partial_amount");
    openapiFields.add("link_expiry_time");
    openapiFields.add("link_notify");
    openapiFields.add("link_auto_reminders");
    openapiFields.add("link_notes");
    openapiFields.add("link_meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("link_id");
    openapiRequiredFields.add("link_amount");
    openapiRequiredFields.add("link_currency");
    openapiRequiredFields.add("link_purpose");
    openapiRequiredFields.add("customer_details");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLinkRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("link_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_id").toString()));
      }
      if (!jsonObj.get("link_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_currency").toString()));
      }
      if (!jsonObj.get("link_purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_purpose").toString()));
      }
      // validate the required field `customer_details`
      LinkCustomerDetailsEntity.validateJsonElement(jsonObj.get("customer_details"));
      if ((jsonObj.get("link_expiry_time") != null && !jsonObj.get("link_expiry_time").isJsonNull()) && !jsonObj.get("link_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_expiry_time").toString()));
      }
      // validate the optional field `link_notify`
      if (jsonObj.get("link_notify") != null && !jsonObj.get("link_notify").isJsonNull()) {
        LinkNotifyEntity.validateJsonElement(jsonObj.get("link_notify"));
      }
      // validate the optional field `link_meta`
      if (jsonObj.get("link_meta") != null && !jsonObj.get("link_meta").isJsonNull()) {
        LinkMetaResponseEntity.validateJsonElement(jsonObj.get("link_meta"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateLinkRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLinkRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("link_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_id").toString()));
      }
      if (!jsonObj.get("link_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_currency").toString()));
      }
      if (!jsonObj.get("link_purpose").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_purpose` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_purpose").toString()));
      }
      // validate the required field `customer_details`
      LinkCustomerDetailsEntity.validateJsonElement(jsonObj.get("customer_details"));
      if ((jsonObj.get("link_expiry_time") != null && !jsonObj.get("link_expiry_time").isJsonNull()) && !jsonObj.get("link_expiry_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_expiry_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_expiry_time").toString()));
      }
      // validate the optional field `link_notify`
      if (jsonObj.get("link_notify") != null && !jsonObj.get("link_notify").isJsonNull()) {
        LinkNotifyEntity.validateJsonElement(jsonObj.get("link_notify"));
        return true;
      }
      // validate the optional field `link_meta`
      if (jsonObj.get("link_meta") != null && !jsonObj.get("link_meta").isJsonNull()) {
        LinkMetaResponseEntity.validateJsonElement(jsonObj.get("link_meta"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLinkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLinkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLinkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLinkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLinkRequest>() {
           @Override
           public void write(JsonWriter out, CreateLinkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLinkRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLinkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLinkRequest
  * @throws IOException if the JSON string is invalid with respect to CreateLinkRequest
  */
  public static CreateLinkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLinkRequest.class);
  }

 /**
  * Convert an instance of CreateLinkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


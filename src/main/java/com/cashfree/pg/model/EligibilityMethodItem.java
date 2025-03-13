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
import com.cashfree.pg.model.EligibilityMethodItemEntityDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
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
 * Eligibile payment method object
 */
@Schema(description = "Eligibile payment method object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class EligibilityMethodItem {
  public static final String SERIALIZED_NAME_ELIGIBILITY = "eligibility";
  @SerializedName(SERIALIZED_NAME_ELIGIBILITY)
  private Boolean eligibility;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_ENTITY_VALUE = "entity_value";
  @SerializedName(SERIALIZED_NAME_ENTITY_VALUE)
  private String entityValue;

  public static final String SERIALIZED_NAME_ENTITY_DETAILS = "entity_details";
  @SerializedName(SERIALIZED_NAME_ENTITY_DETAILS)
  private EligibilityMethodItemEntityDetails entityDetails;

  public EligibilityMethodItem() {
  }

  public EligibilityMethodItem eligibility(Boolean eligibility) {
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * Indicates whether the payment method is eligible.
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Indicates whether the payment method is eligible.")
  public Boolean getEligibility() {
    return eligibility;
  }


  public void setEligibility(Boolean eligibility) {
    this.eligibility = eligibility;
  }


  public EligibilityMethodItem entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Type of entity (e.g., \&quot;payment_methods\&quot;).
   * @return entityType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of entity (e.g., \"payment_methods\").")
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public EligibilityMethodItem entityValue(String entityValue) {
    
    this.entityValue = entityValue;
    return this;
  }

   /**
   * Payment method (e.g., enach, pnach, upi, card).
   * @return entityValue
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Payment method (e.g., enach, pnach, upi, card).")
  public String getEntityValue() {
    return entityValue;
  }


  public void setEntityValue(String entityValue) {
    this.entityValue = entityValue;
  }


  public EligibilityMethodItem entityDetails(EligibilityMethodItemEntityDetails entityDetails) {
    
    this.entityDetails = entityDetails;
    return this;
  }

   /**
   * Get entityDetails
   * @return entityDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public EligibilityMethodItemEntityDetails getEntityDetails() {
    return entityDetails;
  }


  public void setEntityDetails(EligibilityMethodItemEntityDetails entityDetails) {
    this.entityDetails = entityDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityMethodItem eligibilityMethodItem = (EligibilityMethodItem) o;
    return Objects.equals(this.eligibility, eligibilityMethodItem.eligibility) &&
        Objects.equals(this.entityType, eligibilityMethodItem.entityType) &&
        Objects.equals(this.entityValue, eligibilityMethodItem.entityValue) &&
        Objects.equals(this.entityDetails, eligibilityMethodItem.entityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibility, entityType, entityValue, entityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityMethodItem {\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    entityValue: ").append(toIndentedString(entityValue)).append("\n");
    sb.append("    entityDetails: ").append(toIndentedString(entityDetails)).append("\n");
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
    openapiFields.add("eligibility");
    openapiFields.add("entity_type");
    openapiFields.add("entity_value");
    openapiFields.add("entity_details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityMethodItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("entity_value") != null && !jsonObj.get("entity_value").isJsonNull()) && !jsonObj.get("entity_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_value").toString()));
      }
      // validate the optional field `entity_details`
      if (jsonObj.get("entity_details") != null && !jsonObj.get("entity_details").isJsonNull()) {
        EligibilityMethodItemEntityDetails.validateJsonElement(jsonObj.get("entity_details"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityMethodItem
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("entity_type") != null && !jsonObj.get("entity_type").isJsonNull()) && !jsonObj.get("entity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_type").toString()));
      }
      if ((jsonObj.get("entity_value") != null && !jsonObj.get("entity_value").isJsonNull()) && !jsonObj.get("entity_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_value").toString()));
      }
      // validate the optional field `entity_details`
      if (jsonObj.get("entity_details") != null && !jsonObj.get("entity_details").isJsonNull()) {
        EligibilityMethodItemEntityDetails.validateJsonElement(jsonObj.get("entity_details"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityMethodItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityMethodItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityMethodItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityMethodItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityMethodItem>() {
           @Override
           public void write(JsonWriter out, EligibilityMethodItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityMethodItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityMethodItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityMethodItem
  * @throws IOException if the JSON string is invalid with respect to EligibilityMethodItem
  */
  public static EligibilityMethodItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityMethodItem.class);
  }

 /**
  * Convert an instance of EligibilityMethodItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.model.CardlessEMIEntity;
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

import com.cashfree.JSON;

/**
 * Carless EMI eligible entity
 */
@Schema(description = "Carless EMI eligible entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T13:03:12.873082Z[Etc/UTC]")
public class EligibilityCardlessEMIEntity {
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
  private CardlessEMIEntity entityDetails;

  public EligibilityCardlessEMIEntity() {
  }

  public EligibilityCardlessEMIEntity eligibility(Boolean eligibility) {
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * Get eligibility
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @Schema(example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getEligibility() {
    return eligibility;
  }


  public void setEligibility(Boolean eligibility) {
    this.eligibility = eligibility;
  }


  public EligibilityCardlessEMIEntity entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @Schema(example = "cardlessemi", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public EligibilityCardlessEMIEntity entityValue(String entityValue) {
    
    this.entityValue = entityValue;
    return this;
  }

   /**
   * Get entityValue
   * @return entityValue
  **/
  @javax.annotation.Nullable
  @Schema(example = "idfc", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntityValue() {
    return entityValue;
  }


  public void setEntityValue(String entityValue) {
    this.entityValue = entityValue;
  }


  public EligibilityCardlessEMIEntity entityDetails(CardlessEMIEntity entityDetails) {
    
    this.entityDetails = entityDetails;
    return this;
  }

   /**
   * Get entityDetails
   * @return entityDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public CardlessEMIEntity getEntityDetails() {
    return entityDetails;
  }


  public void setEntityDetails(CardlessEMIEntity entityDetails) {
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
    EligibilityCardlessEMIEntity eligibilityCardlessEMIEntity = (EligibilityCardlessEMIEntity) o;
    return Objects.equals(this.eligibility, eligibilityCardlessEMIEntity.eligibility) &&
        Objects.equals(this.entityType, eligibilityCardlessEMIEntity.entityType) &&
        Objects.equals(this.entityValue, eligibilityCardlessEMIEntity.entityValue) &&
        Objects.equals(this.entityDetails, eligibilityCardlessEMIEntity.entityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibility, entityType, entityValue, entityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityCardlessEMIEntity {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to EligibilityCardlessEMIEntity
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
        CardlessEMIEntity.validateJsonElement(jsonObj.get("entity_details"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityCardlessEMIEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityCardlessEMIEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityCardlessEMIEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityCardlessEMIEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityCardlessEMIEntity>() {
           @Override
           public void write(JsonWriter out, EligibilityCardlessEMIEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityCardlessEMIEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityCardlessEMIEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityCardlessEMIEntity
  * @throws IOException if the JSON string is invalid with respect to EligibilityCardlessEMIEntity
  */
  public static EligibilityCardlessEMIEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityCardlessEMIEntity.class);
  }

 /**
  * Convert an instance of EligibilityCardlessEMIEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


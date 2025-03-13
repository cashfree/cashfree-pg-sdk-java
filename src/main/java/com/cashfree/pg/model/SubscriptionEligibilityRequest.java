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
import com.cashfree.pg.model.SubscriptionEligibilityRequestFilters;
import com.cashfree.pg.model.SubscriptionEligibilityRequestQueries;
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
 * Request body to fetch subscription eligibile payment method details.
 */
@Schema(description = "Request body to fetch subscription eligibile payment method details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-13T09:38:52.601894Z[Etc/UTC]")
public class SubscriptionEligibilityRequest {
  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private SubscriptionEligibilityRequestQueries queries;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private SubscriptionEligibilityRequestFilters filters;

  public SubscriptionEligibilityRequest() {
  }

  public SubscriptionEligibilityRequest queries(SubscriptionEligibilityRequestQueries queries) {
    
    this.queries = queries;
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public SubscriptionEligibilityRequestQueries getQueries() {
    return queries;
  }


  public void setQueries(SubscriptionEligibilityRequestQueries queries) {
    this.queries = queries;
  }


  public SubscriptionEligibilityRequest filters(SubscriptionEligibilityRequestFilters filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SubscriptionEligibilityRequestFilters getFilters() {
    return filters;
  }


  public void setFilters(SubscriptionEligibilityRequestFilters filters) {
    this.filters = filters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEligibilityRequest subscriptionEligibilityRequest = (SubscriptionEligibilityRequest) o;
    return Objects.equals(this.queries, subscriptionEligibilityRequest.queries) &&
        Objects.equals(this.filters, subscriptionEligibilityRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEligibilityRequest {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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
    openapiFields.add("queries");
    openapiFields.add("filters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queries");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEligibilityRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionEligibilityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `queries`
      SubscriptionEligibilityRequestQueries.validateJsonElement(jsonObj.get("queries"));
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        SubscriptionEligibilityRequestFilters.validateJsonElement(jsonObj.get("filters"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEligibilityRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubscriptionEligibilityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `queries`
      SubscriptionEligibilityRequestQueries.validateJsonElement(jsonObj.get("queries"));
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        SubscriptionEligibilityRequestFilters.validateJsonElement(jsonObj.get("filters"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEligibilityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEligibilityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEligibilityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEligibilityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEligibilityRequest>() {
           @Override
           public void write(JsonWriter out, SubscriptionEligibilityRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEligibilityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEligibilityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEligibilityRequest
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEligibilityRequest
  */
  public static SubscriptionEligibilityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEligibilityRequest.class);
  }

 /**
  * Convert an instance of SubscriptionEligibilityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


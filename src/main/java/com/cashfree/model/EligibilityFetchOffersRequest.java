/*
 * Cashfree Payment Gateway APIs
 * Cashfree's Payment Gateway APIs provide developers with a streamlined pathway to integrate advanced payment processing capabilities into their applications, platforms and websites.
 *
 * The version of the OpenAPI document: 2022-09-01
 * Contact: developers@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cashfree.model;

import java.util.Objects;
import com.cashfree.model.OfferFilters;
import com.cashfree.model.OfferQueries;
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
 * Eligiblty API request
 */
@Schema(description = "Eligiblty API request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-14T10:44:30.379726Z[Etc/UTC]")
public class EligibilityFetchOffersRequest {
  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private OfferQueries queries;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private OfferFilters filters;

  public EligibilityFetchOffersRequest() {
  }

  public EligibilityFetchOffersRequest queries(OfferQueries queries) {
    
    this.queries = queries;
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public OfferQueries getQueries() {
    return queries;
  }


  public void setQueries(OfferQueries queries) {
    this.queries = queries;
  }


  public EligibilityFetchOffersRequest filters(OfferFilters filters) {
    
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public OfferFilters getFilters() {
    return filters;
  }


  public void setFilters(OfferFilters filters) {
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
    EligibilityFetchOffersRequest eligibilityFetchOffersRequest = (EligibilityFetchOffersRequest) o;
    return Objects.equals(this.queries, eligibilityFetchOffersRequest.queries) &&
        Objects.equals(this.filters, eligibilityFetchOffersRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityFetchOffersRequest {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to EligibilityFetchOffersRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EligibilityFetchOffersRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `queries`
      OfferQueries.validateJsonElement(jsonObj.get("queries"));
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        OfferFilters.validateJsonElement(jsonObj.get("filters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityFetchOffersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityFetchOffersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityFetchOffersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityFetchOffersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityFetchOffersRequest>() {
           @Override
           public void write(JsonWriter out, EligibilityFetchOffersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityFetchOffersRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityFetchOffersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityFetchOffersRequest
  * @throws IOException if the JSON string is invalid with respect to EligibilityFetchOffersRequest
  */
  public static EligibilityFetchOffersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityFetchOffersRequest.class);
  }

 /**
  * Convert an instance of EligibilityFetchOffersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


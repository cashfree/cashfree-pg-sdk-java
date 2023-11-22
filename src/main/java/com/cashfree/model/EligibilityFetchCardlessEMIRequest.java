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
import com.cashfree.model.CardlessEMIQueries;
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
 * eligibilty request for cardless
 */
@Schema(description = "eligibilty request for cardless")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T09:13:46.373979Z[Etc/UTC]")
public class EligibilityFetchCardlessEMIRequest {
  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private CardlessEMIQueries queries;

  public EligibilityFetchCardlessEMIRequest() {
  }

  public EligibilityFetchCardlessEMIRequest queries(CardlessEMIQueries queries) {
    
    this.queries = queries;
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public CardlessEMIQueries getQueries() {
    return queries;
  }


  public void setQueries(CardlessEMIQueries queries) {
    this.queries = queries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityFetchCardlessEMIRequest eligibilityFetchCardlessEMIRequest = (EligibilityFetchCardlessEMIRequest) o;
    return Objects.equals(this.queries, eligibilityFetchCardlessEMIRequest.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityFetchCardlessEMIRequest {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queries");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EligibilityFetchCardlessEMIRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EligibilityFetchCardlessEMIRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `queries`
      CardlessEMIQueries.validateJsonElement(jsonObj.get("queries"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EligibilityFetchCardlessEMIRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EligibilityFetchCardlessEMIRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EligibilityFetchCardlessEMIRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EligibilityFetchCardlessEMIRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EligibilityFetchCardlessEMIRequest>() {
           @Override
           public void write(JsonWriter out, EligibilityFetchCardlessEMIRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EligibilityFetchCardlessEMIRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EligibilityFetchCardlessEMIRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EligibilityFetchCardlessEMIRequest
  * @throws IOException if the JSON string is invalid with respect to EligibilityFetchCardlessEMIRequest
  */
  public static EligibilityFetchCardlessEMIRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EligibilityFetchCardlessEMIRequest.class);
  }

 /**
  * Convert an instance of EligibilityFetchCardlessEMIRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


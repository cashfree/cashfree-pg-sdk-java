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
import com.cashfree.model.EligibilityMethodItem;
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
 * Subscrition eligibility API response
 */
@Schema(description = "Subscrition eligibility API response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T09:19:49.697679Z[Etc/UTC]")
public class SubscriptionEligibilityResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private List<EligibilityMethodItem> type;

  public SubscriptionEligibilityResponse() {
  }

  public SubscriptionEligibilityResponse type(List<EligibilityMethodItem> type) {
    
    this.type = type;
    return this;
  }

  public SubscriptionEligibilityResponse addTypeItem(EligibilityMethodItem typeItem) {
    if (this.type == null) {
      this.type = new ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * List of eligibile payment methods for the subscription.
   * @return type
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "List of eligibile payment methods for the subscription.")
  public List<EligibilityMethodItem> getType() {
    return type;
  }


  public void setType(List<EligibilityMethodItem> type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionEligibilityResponse subscriptionEligibilityResponse = (SubscriptionEligibilityResponse) o;
    return Objects.equals(this.type, subscriptionEligibilityResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionEligibilityResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEligibilityResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        JsonArray jsonArraytype = jsonObj.getAsJsonArray("type");
        if (jsonArraytype != null) {
          // ensure the json data is an array
          if (!jsonObj.get("type").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
          }

          // validate the optional field `type` (array)
          for (int i = 0; i < jsonArraytype.size(); i++) {
            EligibilityMethodItem.validateJsonElement(jsonArraytype.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubscriptionEligibilityResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        JsonArray jsonArraytype = jsonObj.getAsJsonArray("type");
        if (jsonArraytype != null) {
          // ensure the json data is an array
          if (!jsonObj.get("type").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `type` to be an array in the JSON string but got `%s`", jsonObj.get("type").toString()));
          }

          // validate the optional field `type` (array)
          for (int i = 0; i < jsonArraytype.size(); i++) {
            EligibilityMethodItem.validateJsonElement(jsonArraytype.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscriptionEligibilityResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscriptionEligibilityResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscriptionEligibilityResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscriptionEligibilityResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscriptionEligibilityResponse>() {
           @Override
           public void write(JsonWriter out, SubscriptionEligibilityResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscriptionEligibilityResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscriptionEligibilityResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscriptionEligibilityResponse
  * @throws IOException if the JSON string is invalid with respect to SubscriptionEligibilityResponse
  */
  public static SubscriptionEligibilityResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscriptionEligibilityResponse.class);
  }

 /**
  * Convert an instance of SubscriptionEligibilityResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.pg.model.EMIPlansArray;
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
 * cardless EMI object
 */
@Schema(description = "cardless EMI object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-24T12:25:27.382365Z[Etc/UTC]")
public class CardlessEMIEntity {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "payment_method";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private String paymentMethod;

  public static final String SERIALIZED_NAME_EMI_PLANS = "emi_plans";
  @SerializedName(SERIALIZED_NAME_EMI_PLANS)
  private List<EMIPlansArray> emiPlans;

  public CardlessEMIEntity() {
  }

  public CardlessEMIEntity paymentMethod(String paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @Schema(example = "idfc", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public CardlessEMIEntity emiPlans(List<EMIPlansArray> emiPlans) {
    
    this.emiPlans = emiPlans;
    return this;
  }

  public CardlessEMIEntity addEmiPlansItem(EMIPlansArray emiPlansItem) {
    if (this.emiPlans == null) {
      this.emiPlans = new ArrayList<>();
    }
    this.emiPlans.add(emiPlansItem);
    return this;
  }

   /**
   * Get emiPlans
   * @return emiPlans
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<EMIPlansArray> getEmiPlans() {
    return emiPlans;
  }


  public void setEmiPlans(List<EMIPlansArray> emiPlans) {
    this.emiPlans = emiPlans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardlessEMIEntity cardlessEMIEntity = (CardlessEMIEntity) o;
    return Objects.equals(this.paymentMethod, cardlessEMIEntity.paymentMethod) &&
        Objects.equals(this.emiPlans, cardlessEMIEntity.emiPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, emiPlans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardlessEMIEntity {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    emiPlans: ").append(toIndentedString(emiPlans)).append("\n");
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
    openapiFields.add("payment_method");
    openapiFields.add("emi_plans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardlessEMIEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if (jsonObj.get("emi_plans") != null && !jsonObj.get("emi_plans").isJsonNull()) {
        JsonArray jsonArrayemiPlans = jsonObj.getAsJsonArray("emi_plans");
        if (jsonArrayemiPlans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emi_plans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emi_plans` to be an array in the JSON string but got `%s`", jsonObj.get("emi_plans").toString()));
          }

          // validate the optional field `emi_plans` (array)
          for (int i = 0; i < jsonArrayemiPlans.size(); i++) {
            EMIPlansArray.validateJsonElement(jsonArrayemiPlans.get(i));
          };
        }
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CardlessEMIEntity
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payment_method") != null && !jsonObj.get("payment_method").isJsonNull()) && !jsonObj.get("payment_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method").toString()));
      }
      if (jsonObj.get("emi_plans") != null && !jsonObj.get("emi_plans").isJsonNull()) {
        JsonArray jsonArrayemiPlans = jsonObj.getAsJsonArray("emi_plans");
        if (jsonArrayemiPlans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("emi_plans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `emi_plans` to be an array in the JSON string but got `%s`", jsonObj.get("emi_plans").toString()));
          }

          // validate the optional field `emi_plans` (array)
          for (int i = 0; i < jsonArrayemiPlans.size(); i++) {
            EMIPlansArray.validateJsonElement(jsonArrayemiPlans.get(i));
          };
        }
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardlessEMIEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardlessEMIEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardlessEMIEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardlessEMIEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<CardlessEMIEntity>() {
           @Override
           public void write(JsonWriter out, CardlessEMIEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardlessEMIEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardlessEMIEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardlessEMIEntity
  * @throws IOException if the JSON string is invalid with respect to CardlessEMIEntity
  */
  public static CardlessEMIEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardlessEMIEntity.class);
  }

 /**
  * Convert an instance of CardlessEMIEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import com.cashfree.model.StaticSplitRequestSchemeInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Static Split Request
 */
@Schema(description = "Static Split Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T08:35:35.237610Z[Etc/UTC]")
public class StaticSplitRequest {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminal_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_TERMINAL_REFERENCE_ID = "terminal_reference_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_REFERENCE_ID)
  private BigDecimal terminalReferenceId;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "product_type";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private String productType;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private List<StaticSplitRequestSchemeInner> scheme = new ArrayList<>();

  public StaticSplitRequest() {
  }

  public StaticSplitRequest active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Specify if the split is to be active or not. Possible values: true/false
   * @return active
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify if the split is to be active or not. Possible values: true/false")
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public StaticSplitRequest terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * For Subscription payments, the subscription reference ID is to be shared as the terminal ID. Incase for Payment Gateway terminal ID is non-mandatory. Mention as 0 if not applicable.
   * @return terminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "For Subscription payments, the subscription reference ID is to be shared as the terminal ID. Incase for Payment Gateway terminal ID is non-mandatory. Mention as 0 if not applicable.")
  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public StaticSplitRequest terminalReferenceId(BigDecimal terminalReferenceId) {
    
    this.terminalReferenceId = terminalReferenceId;
    return this;
  }

   /**
   * You can share additional information using the reference ID.
   * @return terminalReferenceId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "You can share additional information using the reference ID.")
  public BigDecimal getTerminalReferenceId() {
    return terminalReferenceId;
  }


  public void setTerminalReferenceId(BigDecimal terminalReferenceId) {
    this.terminalReferenceId = terminalReferenceId;
  }


  public StaticSplitRequest productType(String productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Specify the product for which the split should be created. If you want split to be created for Payment Gateway pass value as \&quot;PG\&quot;. If you want split to be created for Subscription, pass value as \&quot;SBC\&quot;. Accepted values - \&quot;STATIC_QR\&quot;, \&quot;SBC\&quot;, \&quot;PG\&quot;, \&quot;EPOS\&quot;.
   * @return productType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Specify the product for which the split should be created. If you want split to be created for Payment Gateway pass value as \"PG\". If you want split to be created for Subscription, pass value as \"SBC\". Accepted values - \"STATIC_QR\", \"SBC\", \"PG\", \"EPOS\".")
  public String getProductType() {
    return productType;
  }


  public void setProductType(String productType) {
    this.productType = productType;
  }


  public StaticSplitRequest scheme(List<StaticSplitRequestSchemeInner> scheme) {
    
    this.scheme = scheme;
    return this;
  }

  public StaticSplitRequest addSchemeItem(StaticSplitRequestSchemeInner schemeItem) {
    if (this.scheme == null) {
      this.scheme = new ArrayList<>();
    }
    this.scheme.add(schemeItem);
    return this;
  }

   /**
   * Provide the split scheme details.
   * @return scheme
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Provide the split scheme details.")
  public List<StaticSplitRequestSchemeInner> getScheme() {
    return scheme;
  }


  public void setScheme(List<StaticSplitRequestSchemeInner> scheme) {
    this.scheme = scheme;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticSplitRequest staticSplitRequest = (StaticSplitRequest) o;
    return Objects.equals(this.active, staticSplitRequest.active) &&
        Objects.equals(this.terminalId, staticSplitRequest.terminalId) &&
        Objects.equals(this.terminalReferenceId, staticSplitRequest.terminalReferenceId) &&
        Objects.equals(this.productType, staticSplitRequest.productType) &&
        Objects.equals(this.scheme, staticSplitRequest.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, terminalId, terminalReferenceId, productType, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticSplitRequest {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalReferenceId: ").append(toIndentedString(terminalReferenceId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("terminal_id");
    openapiFields.add("terminal_reference_id");
    openapiFields.add("product_type");
    openapiFields.add("scheme");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("product_type");
    openapiRequiredFields.add("scheme");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StaticSplitRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonNull()) && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (!jsonObj.get("product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("scheme").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be an array in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }

      JsonArray jsonArrayscheme = jsonObj.getAsJsonArray("scheme");
      // validate the required field `scheme` (array)
      for (int i = 0; i < jsonArrayscheme.size(); i++) {
        StaticSplitRequestSchemeInner.validateJsonElement(jsonArrayscheme.get(i));
      };
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StaticSplitRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonNull()) && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if (!jsonObj.get("product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_type").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("scheme").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheme` to be an array in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
      }

      JsonArray jsonArrayscheme = jsonObj.getAsJsonArray("scheme");
      // validate the required field `scheme` (array)
      for (int i = 0; i < jsonArrayscheme.size(); i++) {
        StaticSplitRequestSchemeInner.validateJsonElement(jsonArrayscheme.get(i));
      };
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaticSplitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaticSplitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaticSplitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaticSplitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StaticSplitRequest>() {
           @Override
           public void write(JsonWriter out, StaticSplitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaticSplitRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaticSplitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaticSplitRequest
  * @throws IOException if the JSON string is invalid with respect to StaticSplitRequest
  */
  public static StaticSplitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaticSplitRequest.class);
  }

 /**
  * Convert an instance of StaticSplitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


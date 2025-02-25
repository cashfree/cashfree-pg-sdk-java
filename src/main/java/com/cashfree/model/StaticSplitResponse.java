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
import com.cashfree.model.StaticSplitResponseSchemeInner;
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
 * Static Split Response
 */
@Schema(description = "Static Split Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-25T11:57:22.771207Z[Etc/UTC]")
public class StaticSplitResponse {
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
  private List<StaticSplitResponseSchemeInner> scheme;

  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public StaticSplitResponse() {
  }

  public StaticSplitResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public StaticSplitResponse terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Get terminalId
   * @return terminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public StaticSplitResponse terminalReferenceId(BigDecimal terminalReferenceId) {
    
    this.terminalReferenceId = terminalReferenceId;
    return this;
  }

   /**
   * Get terminalReferenceId
   * @return terminalReferenceId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getTerminalReferenceId() {
    return terminalReferenceId;
  }


  public void setTerminalReferenceId(BigDecimal terminalReferenceId) {
    this.terminalReferenceId = terminalReferenceId;
  }


  public StaticSplitResponse productType(String productType) {
    
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getProductType() {
    return productType;
  }


  public void setProductType(String productType) {
    this.productType = productType;
  }


  public StaticSplitResponse scheme(List<StaticSplitResponseSchemeInner> scheme) {
    
    this.scheme = scheme;
    return this;
  }

  public StaticSplitResponse addSchemeItem(StaticSplitResponseSchemeInner schemeItem) {
    if (this.scheme == null) {
      this.scheme = new ArrayList<>();
    }
    this.scheme.add(schemeItem);
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public List<StaticSplitResponseSchemeInner> getScheme() {
    return scheme;
  }


  public void setScheme(List<StaticSplitResponseSchemeInner> scheme) {
    this.scheme = scheme;
  }


  public StaticSplitResponse addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * Get addedOn
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticSplitResponse staticSplitResponse = (StaticSplitResponse) o;
    return Objects.equals(this.active, staticSplitResponse.active) &&
        Objects.equals(this.terminalId, staticSplitResponse.terminalId) &&
        Objects.equals(this.terminalReferenceId, staticSplitResponse.terminalReferenceId) &&
        Objects.equals(this.productType, staticSplitResponse.productType) &&
        Objects.equals(this.scheme, staticSplitResponse.scheme) &&
        Objects.equals(this.addedOn, staticSplitResponse.addedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, terminalId, terminalReferenceId, productType, scheme, addedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticSplitResponse {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalReferenceId: ").append(toIndentedString(terminalReferenceId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
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
    openapiFields.add("added_on");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonNull()) && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if ((jsonObj.get("product_type") != null && !jsonObj.get("product_type").isJsonNull()) && !jsonObj.get("product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_type").toString()));
      }
      if (jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) {
        JsonArray jsonArrayscheme = jsonObj.getAsJsonArray("scheme");
        if (jsonArrayscheme != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scheme").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scheme` to be an array in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
          }

          // validate the optional field `scheme` (array)
          for (int i = 0; i < jsonArrayscheme.size(); i++) {
            StaticSplitResponseSchemeInner.validateJsonElement(jsonArrayscheme.get(i));
          };
        }
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StaticSplitResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("terminal_id") != null && !jsonObj.get("terminal_id").isJsonNull()) && !jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if ((jsonObj.get("product_type") != null && !jsonObj.get("product_type").isJsonNull()) && !jsonObj.get("product_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_type").toString()));
      }
      if (jsonObj.get("scheme") != null && !jsonObj.get("scheme").isJsonNull()) {
        JsonArray jsonArrayscheme = jsonObj.getAsJsonArray("scheme");
        if (jsonArrayscheme != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scheme").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scheme` to be an array in the JSON string but got `%s`", jsonObj.get("scheme").toString()));
          }

          // validate the optional field `scheme` (array)
          for (int i = 0; i < jsonArrayscheme.size(); i++) {
            StaticSplitResponseSchemeInner.validateJsonElement(jsonArrayscheme.get(i));
          };
        }
      }
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StaticSplitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StaticSplitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StaticSplitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StaticSplitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<StaticSplitResponse>() {
           @Override
           public void write(JsonWriter out, StaticSplitResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StaticSplitResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StaticSplitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StaticSplitResponse
  * @throws IOException if the JSON string is invalid with respect to StaticSplitResponse
  */
  public static StaticSplitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StaticSplitResponse.class);
  }

 /**
  * Convert an instance of StaticSplitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


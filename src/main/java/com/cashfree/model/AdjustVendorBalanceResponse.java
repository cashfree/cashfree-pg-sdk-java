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
import com.cashfree.model.BalanceDetails;
import com.cashfree.model.ChargesDetails;
import com.cashfree.model.TransferDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Adjust Vendor Balance Response
 */
@Schema(description = "Adjust Vendor Balance Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class AdjustVendorBalanceResponse {
  public static final String SERIALIZED_NAME_SETTLEMENT_ID = "settlement_id";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_ID)
  private BigDecimal settlementId;

  public static final String SERIALIZED_NAME_TRANSFER_DETAILS = "transfer_details";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DETAILS)
  private TransferDetails transferDetails;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private BalanceDetails balances;

  public static final String SERIALIZED_NAME_CHARGES = "charges";
  @SerializedName(SERIALIZED_NAME_CHARGES)
  private ChargesDetails charges;

  public AdjustVendorBalanceResponse() {
  }

  public AdjustVendorBalanceResponse settlementId(BigDecimal settlementId) {
    
    this.settlementId = settlementId;
    return this;
  }

   /**
   * Get settlementId
   * @return settlementId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BigDecimal getSettlementId() {
    return settlementId;
  }


  public void setSettlementId(BigDecimal settlementId) {
    this.settlementId = settlementId;
  }


  public AdjustVendorBalanceResponse transferDetails(TransferDetails transferDetails) {
    
    this.transferDetails = transferDetails;
    return this;
  }

   /**
   * Get transferDetails
   * @return transferDetails
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public TransferDetails getTransferDetails() {
    return transferDetails;
  }


  public void setTransferDetails(TransferDetails transferDetails) {
    this.transferDetails = transferDetails;
  }


  public AdjustVendorBalanceResponse balances(BalanceDetails balances) {
    
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public BalanceDetails getBalances() {
    return balances;
  }


  public void setBalances(BalanceDetails balances) {
    this.balances = balances;
  }


  public AdjustVendorBalanceResponse charges(ChargesDetails charges) {
    
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * @return charges
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public ChargesDetails getCharges() {
    return charges;
  }


  public void setCharges(ChargesDetails charges) {
    this.charges = charges;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdjustVendorBalanceResponse adjustVendorBalanceResponse = (AdjustVendorBalanceResponse) o;
    return Objects.equals(this.settlementId, adjustVendorBalanceResponse.settlementId) &&
        Objects.equals(this.transferDetails, adjustVendorBalanceResponse.transferDetails) &&
        Objects.equals(this.balances, adjustVendorBalanceResponse.balances) &&
        Objects.equals(this.charges, adjustVendorBalanceResponse.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementId, transferDetails, balances, charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdjustVendorBalanceResponse {\n");
    sb.append("    settlementId: ").append(toIndentedString(settlementId)).append("\n");
    sb.append("    transferDetails: ").append(toIndentedString(transferDetails)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
    openapiFields.add("settlement_id");
    openapiFields.add("transfer_details");
    openapiFields.add("balances");
    openapiFields.add("charges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdjustVendorBalanceResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `transfer_details`
      if (jsonObj.get("transfer_details") != null && !jsonObj.get("transfer_details").isJsonNull()) {
        TransferDetails.validateJsonElement(jsonObj.get("transfer_details"));
      }
      // validate the optional field `balances`
      if (jsonObj.get("balances") != null && !jsonObj.get("balances").isJsonNull()) {
        BalanceDetails.validateJsonElement(jsonObj.get("balances"));
      }
      // validate the optional field `charges`
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        ChargesDetails.validateJsonElement(jsonObj.get("charges"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AdjustVendorBalanceResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `transfer_details`
      if (jsonObj.get("transfer_details") != null && !jsonObj.get("transfer_details").isJsonNull()) {
        TransferDetails.validateJsonElement(jsonObj.get("transfer_details"));
        return true;
      }
      // validate the optional field `balances`
      if (jsonObj.get("balances") != null && !jsonObj.get("balances").isJsonNull()) {
        BalanceDetails.validateJsonElement(jsonObj.get("balances"));
        return true;
      }
      // validate the optional field `charges`
      if (jsonObj.get("charges") != null && !jsonObj.get("charges").isJsonNull()) {
        ChargesDetails.validateJsonElement(jsonObj.get("charges"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdjustVendorBalanceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdjustVendorBalanceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdjustVendorBalanceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdjustVendorBalanceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AdjustVendorBalanceResponse>() {
           @Override
           public void write(JsonWriter out, AdjustVendorBalanceResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdjustVendorBalanceResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdjustVendorBalanceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdjustVendorBalanceResponse
  * @throws IOException if the JSON string is invalid with respect to AdjustVendorBalanceResponse
  */
  public static AdjustVendorBalanceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdjustVendorBalanceResponse.class);
  }

 /**
  * Convert an instance of AdjustVendorBalanceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


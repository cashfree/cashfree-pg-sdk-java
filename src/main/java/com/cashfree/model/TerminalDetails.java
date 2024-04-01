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
 * Use this if you are creating an order for cashfree&#39;s softPOS
 */
@Schema(description = "Use this if you are creating an order for cashfree's softPOS")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-01T10:13:36.975496Z[Etc/UTC]")
public class TerminalDetails {
  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private String cfTerminalId;

  public static final String SERIALIZED_NAME_LAST_UPDATED_ON = "last_updated_on";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_ON)
  private String lastUpdatedOn;

  public static final String SERIALIZED_NAME_TERMINAL_ADDRESS = "terminal_address";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ADDRESS)
  private String terminalAddress;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminal_id";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public static final String SERIALIZED_NAME_TERMINAL_NAME = "terminal_name";
  @SerializedName(SERIALIZED_NAME_TERMINAL_NAME)
  private String terminalName;

  public static final String SERIALIZED_NAME_TERMINAL_NOTE = "terminal_note";
  @SerializedName(SERIALIZED_NAME_TERMINAL_NOTE)
  private String terminalNote;

  public static final String SERIALIZED_NAME_TERMINAL_PHONE_NO = "terminal_phone_no";
  @SerializedName(SERIALIZED_NAME_TERMINAL_PHONE_NO)
  private String terminalPhoneNo;

  public static final String SERIALIZED_NAME_TERMINAL_STATUS = "terminal_status";
  @SerializedName(SERIALIZED_NAME_TERMINAL_STATUS)
  private String terminalStatus;

  public static final String SERIALIZED_NAME_TERMINAL_TYPE = "terminal_type";
  @SerializedName(SERIALIZED_NAME_TERMINAL_TYPE)
  private String terminalType;

  public TerminalDetails() {
  }

  public TerminalDetails addedOn(String addedOn) {
    
    this.addedOn = addedOn;
    return this;
  }

   /**
   * date time at which terminal is added
   * @return addedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "date time at which terminal is added")
  public String getAddedOn() {
    return addedOn;
  }


  public void setAddedOn(String addedOn) {
    this.addedOn = addedOn;
  }


  public TerminalDetails cfTerminalId(String cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * cashfree terminal id
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "cashfree terminal id")
  public String getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(String cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public TerminalDetails lastUpdatedOn(String lastUpdatedOn) {
    
    this.lastUpdatedOn = lastUpdatedOn;
    return this;
  }

   /**
   * last instant when this terminal was updated
   * @return lastUpdatedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "last instant when this terminal was updated")
  public String getLastUpdatedOn() {
    return lastUpdatedOn;
  }


  public void setLastUpdatedOn(String lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
  }


  public TerminalDetails terminalAddress(String terminalAddress) {
    
    this.terminalAddress = terminalAddress;
    return this;
  }

   /**
   * location of terminal
   * @return terminalAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "location of terminal")
  public String getTerminalAddress() {
    return terminalAddress;
  }


  public void setTerminalAddress(String terminalAddress) {
    this.terminalAddress = terminalAddress;
  }


  public TerminalDetails terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * terminal id for merchant reference
   * @return terminalId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "terminal id for merchant reference")
  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }


  public TerminalDetails terminalName(String terminalName) {
    
    this.terminalName = terminalName;
    return this;
  }

   /**
   * name of terminal/agent/storefront
   * @return terminalName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "name of terminal/agent/storefront")
  public String getTerminalName() {
    return terminalName;
  }


  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }


  public TerminalDetails terminalNote(String terminalNote) {
    
    this.terminalNote = terminalNote;
    return this;
  }

   /**
   * note given by merchant while creating the terminal
   * @return terminalNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "note given by merchant while creating the terminal")
  public String getTerminalNote() {
    return terminalNote;
  }


  public void setTerminalNote(String terminalNote) {
    this.terminalNote = terminalNote;
  }


  public TerminalDetails terminalPhoneNo(String terminalPhoneNo) {
    
    this.terminalPhoneNo = terminalPhoneNo;
    return this;
  }

   /**
   * mobile num of the terminal/agent/storefront
   * @return terminalPhoneNo
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "mobile num of the terminal/agent/storefront")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }


  public void setTerminalPhoneNo(String terminalPhoneNo) {
    this.terminalPhoneNo = terminalPhoneNo;
  }


  public TerminalDetails terminalStatus(String terminalStatus) {
    
    this.terminalStatus = terminalStatus;
    return this;
  }

   /**
   * status of terminal active/inactive
   * @return terminalStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "status of terminal active/inactive")
  public String getTerminalStatus() {
    return terminalStatus;
  }


  public void setTerminalStatus(String terminalStatus) {
    this.terminalStatus = terminalStatus;
  }


  public TerminalDetails terminalType(String terminalType) {
    
    this.terminalType = terminalType;
    return this;
  }

   /**
   * To identify the type of terminal product in use, in this case it is SPOS.
   * @return terminalType
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "To identify the type of terminal product in use, in this case it is SPOS.")
  public String getTerminalType() {
    return terminalType;
  }


  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalDetails terminalDetails = (TerminalDetails) o;
    return Objects.equals(this.addedOn, terminalDetails.addedOn) &&
        Objects.equals(this.cfTerminalId, terminalDetails.cfTerminalId) &&
        Objects.equals(this.lastUpdatedOn, terminalDetails.lastUpdatedOn) &&
        Objects.equals(this.terminalAddress, terminalDetails.terminalAddress) &&
        Objects.equals(this.terminalId, terminalDetails.terminalId) &&
        Objects.equals(this.terminalName, terminalDetails.terminalName) &&
        Objects.equals(this.terminalNote, terminalDetails.terminalNote) &&
        Objects.equals(this.terminalPhoneNo, terminalDetails.terminalPhoneNo) &&
        Objects.equals(this.terminalStatus, terminalDetails.terminalStatus) &&
        Objects.equals(this.terminalType, terminalDetails.terminalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedOn, cfTerminalId, lastUpdatedOn, terminalAddress, terminalId, terminalName, terminalNote, terminalPhoneNo, terminalStatus, terminalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalDetails {\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    lastUpdatedOn: ").append(toIndentedString(lastUpdatedOn)).append("\n");
    sb.append("    terminalAddress: ").append(toIndentedString(terminalAddress)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
    sb.append("    terminalNote: ").append(toIndentedString(terminalNote)).append("\n");
    sb.append("    terminalPhoneNo: ").append(toIndentedString(terminalPhoneNo)).append("\n");
    sb.append("    terminalStatus: ").append(toIndentedString(terminalStatus)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
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
    openapiFields.add("added_on");
    openapiFields.add("cf_terminal_id");
    openapiFields.add("last_updated_on");
    openapiFields.add("terminal_address");
    openapiFields.add("terminal_id");
    openapiFields.add("terminal_name");
    openapiFields.add("terminal_note");
    openapiFields.add("terminal_phone_no");
    openapiFields.add("terminal_status");
    openapiFields.add("terminal_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("terminal_id");
    openapiRequiredFields.add("terminal_phone_no");
    openapiRequiredFields.add("terminal_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerminalDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if ((jsonObj.get("last_updated_on") != null && !jsonObj.get("last_updated_on").isJsonNull()) && !jsonObj.get("last_updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_on").toString()));
      }
      if ((jsonObj.get("terminal_address") != null && !jsonObj.get("terminal_address").isJsonNull()) && !jsonObj.get("terminal_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_address").toString()));
      }
      if (!jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if ((jsonObj.get("terminal_name") != null && !jsonObj.get("terminal_name").isJsonNull()) && !jsonObj.get("terminal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_name").toString()));
      }
      if ((jsonObj.get("terminal_note") != null && !jsonObj.get("terminal_note").isJsonNull()) && !jsonObj.get("terminal_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_note").toString()));
      }
      if (!jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      if ((jsonObj.get("terminal_status") != null && !jsonObj.get("terminal_status").isJsonNull()) && !jsonObj.get("terminal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_status").toString()));
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalDetails
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerminalDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("cf_terminal_id") != null && !jsonObj.get("cf_terminal_id").isJsonNull()) && !jsonObj.get("cf_terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cf_terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cf_terminal_id").toString()));
      }
      if ((jsonObj.get("last_updated_on") != null && !jsonObj.get("last_updated_on").isJsonNull()) && !jsonObj.get("last_updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_on").toString()));
      }
      if ((jsonObj.get("terminal_address") != null && !jsonObj.get("terminal_address").isJsonNull()) && !jsonObj.get("terminal_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_address").toString()));
      }
      if (!jsonObj.get("terminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_id").toString()));
      }
      if ((jsonObj.get("terminal_name") != null && !jsonObj.get("terminal_name").isJsonNull()) && !jsonObj.get("terminal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_name").toString()));
      }
      if ((jsonObj.get("terminal_note") != null && !jsonObj.get("terminal_note").isJsonNull()) && !jsonObj.get("terminal_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_note").toString()));
      }
      if (!jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      if ((jsonObj.get("terminal_status") != null && !jsonObj.get("terminal_status").isJsonNull()) && !jsonObj.get("terminal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_status").toString()));
      }
      if (!jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalDetails>() {
           @Override
           public void write(JsonWriter out, TerminalDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalDetails
  * @throws IOException if the JSON string is invalid with respect to TerminalDetails
  */
  public static TerminalDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalDetails.class);
  }

 /**
  * Convert an instance of TerminalDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


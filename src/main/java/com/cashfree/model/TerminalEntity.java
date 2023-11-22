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
 * Create terminal response object
 */
@Schema(description = "Create terminal response object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T09:11:22.353637Z[Etc/UTC]")
public class TerminalEntity {
  public static final String SERIALIZED_NAME_ADDED_ON = "added_on";
  @SerializedName(SERIALIZED_NAME_ADDED_ON)
  private String addedOn;

  public static final String SERIALIZED_NAME_CF_TERMINAL_ID = "cf_terminal_id";
  @SerializedName(SERIALIZED_NAME_CF_TERMINAL_ID)
  private Integer cfTerminalId;

  public static final String SERIALIZED_NAME_LAST_UPDATED_ON = "last_updated_on";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_ON)
  private String lastUpdatedOn;

  public static final String SERIALIZED_NAME_TERMINAL_ADDRESS = "terminal_address";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ADDRESS)
  private String terminalAddress;

  public static final String SERIALIZED_NAME_TERMINAL_EMAIL = "terminal_email";
  @SerializedName(SERIALIZED_NAME_TERMINAL_EMAIL)
  private String terminalEmail;

  public static final String SERIALIZED_NAME_TERMINAL_TYPE = "terminal_type";
  @SerializedName(SERIALIZED_NAME_TERMINAL_TYPE)
  private String terminalType;

  public static final String SERIALIZED_NAME_TEMINAL_ID = "teminal_id";
  @SerializedName(SERIALIZED_NAME_TEMINAL_ID)
  private String teminalId;

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

  public static final String SERIALIZED_NAME_TERMINAL_META = "terminal_meta";
  @SerializedName(SERIALIZED_NAME_TERMINAL_META)
  private String terminalMeta;

  public TerminalEntity() {
  }

  public TerminalEntity addedOn(String addedOn) {
    
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


  public TerminalEntity cfTerminalId(Integer cfTerminalId) {
    
    this.cfTerminalId = cfTerminalId;
    return this;
  }

   /**
   * Get cfTerminalId
   * @return cfTerminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public Integer getCfTerminalId() {
    return cfTerminalId;
  }


  public void setCfTerminalId(Integer cfTerminalId) {
    this.cfTerminalId = cfTerminalId;
  }


  public TerminalEntity lastUpdatedOn(String lastUpdatedOn) {
    
    this.lastUpdatedOn = lastUpdatedOn;
    return this;
  }

   /**
   * Get lastUpdatedOn
   * @return lastUpdatedOn
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getLastUpdatedOn() {
    return lastUpdatedOn;
  }


  public void setLastUpdatedOn(String lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
  }


  public TerminalEntity terminalAddress(String terminalAddress) {
    
    this.terminalAddress = terminalAddress;
    return this;
  }

   /**
   * Get terminalAddress
   * @return terminalAddress
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalAddress() {
    return terminalAddress;
  }


  public void setTerminalAddress(String terminalAddress) {
    this.terminalAddress = terminalAddress;
  }


  public TerminalEntity terminalEmail(String terminalEmail) {
    
    this.terminalEmail = terminalEmail;
    return this;
  }

   /**
   * Get terminalEmail
   * @return terminalEmail
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalEmail() {
    return terminalEmail;
  }


  public void setTerminalEmail(String terminalEmail) {
    this.terminalEmail = terminalEmail;
  }


  public TerminalEntity terminalType(String terminalType) {
    
    this.terminalType = terminalType;
    return this;
  }

   /**
   * Get terminalType
   * @return terminalType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalType() {
    return terminalType;
  }


  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }


  public TerminalEntity teminalId(String teminalId) {
    
    this.teminalId = teminalId;
    return this;
  }

   /**
   * Get teminalId
   * @return teminalId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTeminalId() {
    return teminalId;
  }


  public void setTeminalId(String teminalId) {
    this.teminalId = teminalId;
  }


  public TerminalEntity terminalName(String terminalName) {
    
    this.terminalName = terminalName;
    return this;
  }

   /**
   * Get terminalName
   * @return terminalName
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalName() {
    return terminalName;
  }


  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }


  public TerminalEntity terminalNote(String terminalNote) {
    
    this.terminalNote = terminalNote;
    return this;
  }

   /**
   * Get terminalNote
   * @return terminalNote
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalNote() {
    return terminalNote;
  }


  public void setTerminalNote(String terminalNote) {
    this.terminalNote = terminalNote;
  }


  public TerminalEntity terminalPhoneNo(String terminalPhoneNo) {
    
    this.terminalPhoneNo = terminalPhoneNo;
    return this;
  }

   /**
   * Get terminalPhoneNo
   * @return terminalPhoneNo
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalPhoneNo() {
    return terminalPhoneNo;
  }


  public void setTerminalPhoneNo(String terminalPhoneNo) {
    this.terminalPhoneNo = terminalPhoneNo;
  }


  public TerminalEntity terminalStatus(String terminalStatus) {
    
    this.terminalStatus = terminalStatus;
    return this;
  }

   /**
   * Get terminalStatus
   * @return terminalStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalStatus() {
    return terminalStatus;
  }


  public void setTerminalStatus(String terminalStatus) {
    this.terminalStatus = terminalStatus;
  }


  public TerminalEntity terminalMeta(String terminalMeta) {
    
    this.terminalMeta = terminalMeta;
    return this;
  }

   /**
   * Get terminalMeta
   * @return terminalMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getTerminalMeta() {
    return terminalMeta;
  }


  public void setTerminalMeta(String terminalMeta) {
    this.terminalMeta = terminalMeta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerminalEntity terminalEntity = (TerminalEntity) o;
    return Objects.equals(this.addedOn, terminalEntity.addedOn) &&
        Objects.equals(this.cfTerminalId, terminalEntity.cfTerminalId) &&
        Objects.equals(this.lastUpdatedOn, terminalEntity.lastUpdatedOn) &&
        Objects.equals(this.terminalAddress, terminalEntity.terminalAddress) &&
        Objects.equals(this.terminalEmail, terminalEntity.terminalEmail) &&
        Objects.equals(this.terminalType, terminalEntity.terminalType) &&
        Objects.equals(this.teminalId, terminalEntity.teminalId) &&
        Objects.equals(this.terminalName, terminalEntity.terminalName) &&
        Objects.equals(this.terminalNote, terminalEntity.terminalNote) &&
        Objects.equals(this.terminalPhoneNo, terminalEntity.terminalPhoneNo) &&
        Objects.equals(this.terminalStatus, terminalEntity.terminalStatus) &&
        Objects.equals(this.terminalMeta, terminalEntity.terminalMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedOn, cfTerminalId, lastUpdatedOn, terminalAddress, terminalEmail, terminalType, teminalId, terminalName, terminalNote, terminalPhoneNo, terminalStatus, terminalMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalEntity {\n");
    sb.append("    addedOn: ").append(toIndentedString(addedOn)).append("\n");
    sb.append("    cfTerminalId: ").append(toIndentedString(cfTerminalId)).append("\n");
    sb.append("    lastUpdatedOn: ").append(toIndentedString(lastUpdatedOn)).append("\n");
    sb.append("    terminalAddress: ").append(toIndentedString(terminalAddress)).append("\n");
    sb.append("    terminalEmail: ").append(toIndentedString(terminalEmail)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
    sb.append("    teminalId: ").append(toIndentedString(teminalId)).append("\n");
    sb.append("    terminalName: ").append(toIndentedString(terminalName)).append("\n");
    sb.append("    terminalNote: ").append(toIndentedString(terminalNote)).append("\n");
    sb.append("    terminalPhoneNo: ").append(toIndentedString(terminalPhoneNo)).append("\n");
    sb.append("    terminalStatus: ").append(toIndentedString(terminalStatus)).append("\n");
    sb.append("    terminalMeta: ").append(toIndentedString(terminalMeta)).append("\n");
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
    openapiFields.add("terminal_email");
    openapiFields.add("terminal_type");
    openapiFields.add("teminal_id");
    openapiFields.add("terminal_name");
    openapiFields.add("terminal_note");
    openapiFields.add("terminal_phone_no");
    openapiFields.add("terminal_status");
    openapiFields.add("terminal_meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerminalEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("added_on") != null && !jsonObj.get("added_on").isJsonNull()) && !jsonObj.get("added_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `added_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("added_on").toString()));
      }
      if ((jsonObj.get("last_updated_on") != null && !jsonObj.get("last_updated_on").isJsonNull()) && !jsonObj.get("last_updated_on").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_updated_on` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_updated_on").toString()));
      }
      if ((jsonObj.get("terminal_address") != null && !jsonObj.get("terminal_address").isJsonNull()) && !jsonObj.get("terminal_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_address").toString()));
      }
      if ((jsonObj.get("terminal_email") != null && !jsonObj.get("terminal_email").isJsonNull()) && !jsonObj.get("terminal_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_email").toString()));
      }
      if ((jsonObj.get("terminal_type") != null && !jsonObj.get("terminal_type").isJsonNull()) && !jsonObj.get("terminal_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_type").toString()));
      }
      if ((jsonObj.get("teminal_id") != null && !jsonObj.get("teminal_id").isJsonNull()) && !jsonObj.get("teminal_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `teminal_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("teminal_id").toString()));
      }
      if ((jsonObj.get("terminal_name") != null && !jsonObj.get("terminal_name").isJsonNull()) && !jsonObj.get("terminal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_name").toString()));
      }
      if ((jsonObj.get("terminal_note") != null && !jsonObj.get("terminal_note").isJsonNull()) && !jsonObj.get("terminal_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_note").toString()));
      }
      if ((jsonObj.get("terminal_phone_no") != null && !jsonObj.get("terminal_phone_no").isJsonNull()) && !jsonObj.get("terminal_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_phone_no").toString()));
      }
      if ((jsonObj.get("terminal_status") != null && !jsonObj.get("terminal_status").isJsonNull()) && !jsonObj.get("terminal_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_status").toString()));
      }
      if ((jsonObj.get("terminal_meta") != null && !jsonObj.get("terminal_meta").isJsonNull()) && !jsonObj.get("terminal_meta").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminal_meta` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminal_meta").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerminalEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerminalEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerminalEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerminalEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<TerminalEntity>() {
           @Override
           public void write(JsonWriter out, TerminalEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerminalEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerminalEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerminalEntity
  * @throws IOException if the JSON string is invalid with respect to TerminalEntity
  */
  public static TerminalEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerminalEntity.class);
  }

 /**
  * Convert an instance of TerminalEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


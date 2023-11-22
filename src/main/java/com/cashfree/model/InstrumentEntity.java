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
import com.cashfree.model.SavedInstrumentMeta;
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
 * Saved card instrument object
 */
@Schema(description = "Saved card instrument object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:16:03.269971Z[Etc/UTC]")
public class InstrumentEntity {
  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customer_id";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private String customerId;

  public static final String SERIALIZED_NAME_AFA_REFERENCE = "afa_reference";
  @SerializedName(SERIALIZED_NAME_AFA_REFERENCE)
  private String afaReference;

  public static final String SERIALIZED_NAME_INSTRUMENT_ID = "instrument_id";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_ID)
  private String instrumentId;

  /**
   * Type of the saved instrument
   */
  @JsonAdapter(InstrumentTypeEnum.Adapter.class)
  public enum InstrumentTypeEnum {
    CARD("card"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    InstrumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentTypeEnum fromValue(String value) {
      for (InstrumentTypeEnum b : InstrumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<InstrumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private InstrumentTypeEnum instrumentType;

  public static final String SERIALIZED_NAME_INSTRUMENT_UID = "instrument_uid";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_UID)
  private String instrumentUid;

  public static final String SERIALIZED_NAME_INSTRUMENT_DISPLAY = "instrument_display";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_DISPLAY)
  private String instrumentDisplay;

  /**
   * Status of the saved instrument.
   */
  @JsonAdapter(InstrumentStatusEnum.Adapter.class)
  public enum InstrumentStatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    InstrumentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InstrumentStatusEnum fromValue(String value) {
      for (InstrumentStatusEnum b : InstrumentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<InstrumentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InstrumentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InstrumentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return InstrumentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_INSTRUMENT_STATUS = "instrument_status";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_STATUS)
  private InstrumentStatusEnum instrumentStatus;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_INSTRUMENT_META = "instrument_meta";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_META)
  private SavedInstrumentMeta instrumentMeta;

  public InstrumentEntity() {
  }

  public InstrumentEntity customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
  }

   /**
   * customer_id for which the instrument was saved
   * @return customerId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "customer_id for which the instrument was saved")
  public String getCustomerId() {
    return customerId;
  }


  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  public InstrumentEntity afaReference(String afaReference) {
    
    this.afaReference = afaReference;
    return this;
  }

   /**
   * cf_payment_id of the successful transaction done while saving instrument
   * @return afaReference
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "cf_payment_id of the successful transaction done while saving instrument")
  public String getAfaReference() {
    return afaReference;
  }


  public void setAfaReference(String afaReference) {
    this.afaReference = afaReference;
  }


  public InstrumentEntity instrumentId(String instrumentId) {
    
    this.instrumentId = instrumentId;
    return this;
  }

   /**
   * saved instrument id
   * @return instrumentId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "saved instrument id")
  public String getInstrumentId() {
    return instrumentId;
  }


  public void setInstrumentId(String instrumentId) {
    this.instrumentId = instrumentId;
  }


  public InstrumentEntity instrumentType(InstrumentTypeEnum instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * Type of the saved instrument
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Type of the saved instrument")
  public InstrumentTypeEnum getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(InstrumentTypeEnum instrumentType) {
    this.instrumentType = instrumentType;
  }


  public InstrumentEntity instrumentUid(String instrumentUid) {
    
    this.instrumentUid = instrumentUid;
    return this;
  }

   /**
   * Unique id for the saved instrument
   * @return instrumentUid
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Unique id for the saved instrument")
  public String getInstrumentUid() {
    return instrumentUid;
  }


  public void setInstrumentUid(String instrumentUid) {
    this.instrumentUid = instrumentUid;
  }


  public InstrumentEntity instrumentDisplay(String instrumentDisplay) {
    
    this.instrumentDisplay = instrumentDisplay;
    return this;
  }

   /**
   * masked card number displayed to the customer
   * @return instrumentDisplay
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "masked card number displayed to the customer")
  public String getInstrumentDisplay() {
    return instrumentDisplay;
  }


  public void setInstrumentDisplay(String instrumentDisplay) {
    this.instrumentDisplay = instrumentDisplay;
  }


  public InstrumentEntity instrumentStatus(InstrumentStatusEnum instrumentStatus) {
    
    this.instrumentStatus = instrumentStatus;
    return this;
  }

   /**
   * Status of the saved instrument.
   * @return instrumentStatus
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Status of the saved instrument.")
  public InstrumentStatusEnum getInstrumentStatus() {
    return instrumentStatus;
  }


  public void setInstrumentStatus(InstrumentStatusEnum instrumentStatus) {
    this.instrumentStatus = instrumentStatus;
  }


  public InstrumentEntity createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp at which instrument was saved.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Timestamp at which instrument was saved.")
  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public InstrumentEntity instrumentMeta(SavedInstrumentMeta instrumentMeta) {
    
    this.instrumentMeta = instrumentMeta;
    return this;
  }

   /**
   * Get instrumentMeta
   * @return instrumentMeta
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public SavedInstrumentMeta getInstrumentMeta() {
    return instrumentMeta;
  }


  public void setInstrumentMeta(SavedInstrumentMeta instrumentMeta) {
    this.instrumentMeta = instrumentMeta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstrumentEntity instrumentEntity = (InstrumentEntity) o;
    return Objects.equals(this.customerId, instrumentEntity.customerId) &&
        Objects.equals(this.afaReference, instrumentEntity.afaReference) &&
        Objects.equals(this.instrumentId, instrumentEntity.instrumentId) &&
        Objects.equals(this.instrumentType, instrumentEntity.instrumentType) &&
        Objects.equals(this.instrumentUid, instrumentEntity.instrumentUid) &&
        Objects.equals(this.instrumentDisplay, instrumentEntity.instrumentDisplay) &&
        Objects.equals(this.instrumentStatus, instrumentEntity.instrumentStatus) &&
        Objects.equals(this.createdAt, instrumentEntity.createdAt) &&
        Objects.equals(this.instrumentMeta, instrumentEntity.instrumentMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, afaReference, instrumentId, instrumentType, instrumentUid, instrumentDisplay, instrumentStatus, createdAt, instrumentMeta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstrumentEntity {\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    afaReference: ").append(toIndentedString(afaReference)).append("\n");
    sb.append("    instrumentId: ").append(toIndentedString(instrumentId)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    instrumentUid: ").append(toIndentedString(instrumentUid)).append("\n");
    sb.append("    instrumentDisplay: ").append(toIndentedString(instrumentDisplay)).append("\n");
    sb.append("    instrumentStatus: ").append(toIndentedString(instrumentStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    instrumentMeta: ").append(toIndentedString(instrumentMeta)).append("\n");
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
    openapiFields.add("customer_id");
    openapiFields.add("afa_reference");
    openapiFields.add("instrument_id");
    openapiFields.add("instrument_type");
    openapiFields.add("instrument_uid");
    openapiFields.add("instrument_display");
    openapiFields.add("instrument_status");
    openapiFields.add("created_at");
    openapiFields.add("instrument_meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InstrumentEntity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customer_id") != null && !jsonObj.get("customer_id").isJsonNull()) && !jsonObj.get("customer_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_id").toString()));
      }
      if ((jsonObj.get("afa_reference") != null && !jsonObj.get("afa_reference").isJsonNull()) && !jsonObj.get("afa_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `afa_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("afa_reference").toString()));
      }
      if ((jsonObj.get("instrument_id") != null && !jsonObj.get("instrument_id").isJsonNull()) && !jsonObj.get("instrument_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_id").toString()));
      }
      if ((jsonObj.get("instrument_type") != null && !jsonObj.get("instrument_type").isJsonNull()) && !jsonObj.get("instrument_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_type").toString()));
      }
      if ((jsonObj.get("instrument_uid") != null && !jsonObj.get("instrument_uid").isJsonNull()) && !jsonObj.get("instrument_uid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_uid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_uid").toString()));
      }
      if ((jsonObj.get("instrument_display") != null && !jsonObj.get("instrument_display").isJsonNull()) && !jsonObj.get("instrument_display").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_display` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_display").toString()));
      }
      if ((jsonObj.get("instrument_status") != null && !jsonObj.get("instrument_status").isJsonNull()) && !jsonObj.get("instrument_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instrument_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instrument_status").toString()));
      }
      if ((jsonObj.get("created_at") != null && !jsonObj.get("created_at").isJsonNull()) && !jsonObj.get("created_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_at").toString()));
      }
      // validate the optional field `instrument_meta`
      if (jsonObj.get("instrument_meta") != null && !jsonObj.get("instrument_meta").isJsonNull()) {
        SavedInstrumentMeta.validateJsonElement(jsonObj.get("instrument_meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstrumentEntity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstrumentEntity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstrumentEntity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstrumentEntity.class));

       return (TypeAdapter<T>) new TypeAdapter<InstrumentEntity>() {
           @Override
           public void write(JsonWriter out, InstrumentEntity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstrumentEntity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstrumentEntity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstrumentEntity
  * @throws IOException if the JSON string is invalid with respect to InstrumentEntity
  */
  public static InstrumentEntity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstrumentEntity.class);
  }

 /**
  * Convert an instance of InstrumentEntity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


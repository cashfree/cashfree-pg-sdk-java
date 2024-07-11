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
import com.cashfree.model.EntitySimulationRequest;
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
 * simulate payment request object
 */
@Schema(description = "simulate payment request object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-11T13:19:53.679604Z[Etc/UTC]")
public class SimulateRequest {
  /**
   * Entity type should be PAYMENTS only.
   */
  @JsonAdapter(EntityEnum.Adapter.class)
  public enum EntityEnum {
    PAYMENTS("PAYMENTS"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    EntityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityEnum fromValue(String value) {
      for (EntityEnum b : EntityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }

    public static class Adapter extends TypeAdapter<EntityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private EntityEnum entity;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_ENTITY_SIMULATION = "entity_simulation";
  @SerializedName(SERIALIZED_NAME_ENTITY_SIMULATION)
  private EntitySimulationRequest entitySimulation;

  public SimulateRequest() {
  }

  public SimulateRequest entity(EntityEnum entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Entity type should be PAYMENTS only.
   * @return entity
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "Entity type should be PAYMENTS only.")
  public EntityEnum getEntity() {
    return entity;
  }


  public void setEntity(EntityEnum entity) {
    this.entity = entity;
  }


  public SimulateRequest entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * In case of Entity type is PAYMENTS, entity_id will be transactionId
   * @return entityId
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "In case of Entity type is PAYMENTS, entity_id will be transactionId")
  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SimulateRequest entitySimulation(EntitySimulationRequest entitySimulation) {
    
    this.entitySimulation = entitySimulation;
    return this;
  }

   /**
   * Get entitySimulation
   * @return entitySimulation
  **/
  @javax.annotation.Nonnull
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "")
  public EntitySimulationRequest getEntitySimulation() {
    return entitySimulation;
  }


  public void setEntitySimulation(EntitySimulationRequest entitySimulation) {
    this.entitySimulation = entitySimulation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateRequest simulateRequest = (SimulateRequest) o;
    return Objects.equals(this.entity, simulateRequest.entity) &&
        Objects.equals(this.entityId, simulateRequest.entityId) &&
        Objects.equals(this.entitySimulation, simulateRequest.entitySimulation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, entityId, entitySimulation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateRequest {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entitySimulation: ").append(toIndentedString(entitySimulation)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("entity_id");
    openapiFields.add("entity_simulation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entity");
    openapiRequiredFields.add("entity_id");
    openapiRequiredFields.add("entity_simulation");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimulateRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimulateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if (!jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      // validate the required field `entity_simulation`
      EntitySimulationRequest.validateJsonElement(jsonObj.get("entity_simulation"));
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimulateRequest
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimulateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if (!jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      // validate the required field `entity_simulation`
      EntitySimulationRequest.validateJsonElement(jsonObj.get("entity_simulation"));
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimulateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimulateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimulateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimulateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SimulateRequest>() {
           @Override
           public void write(JsonWriter out, SimulateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimulateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimulateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimulateRequest
  * @throws IOException if the JSON string is invalid with respect to SimulateRequest
  */
  public static SimulateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimulateRequest.class);
  }

 /**
  * Convert an instance of SimulateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


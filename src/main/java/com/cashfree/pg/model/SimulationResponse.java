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
import com.cashfree.pg.model.EntitySimulationResponse;
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

import com.cashfree.pg.JSON;

/**
 * Simulation response object
 */
@Schema(description = "Simulation response object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-23T14:00:34.323462Z[Etc/UTC]")
public class SimulationResponse {
  public static final String SERIALIZED_NAME_SIMULATION_ID = "simulation_id";
  @SerializedName(SERIALIZED_NAME_SIMULATION_ID)
  private String simulationId;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entity_id";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private String entityId;

  public static final String SERIALIZED_NAME_ENTITY_SIMULATION = "entity_simulation";
  @SerializedName(SERIALIZED_NAME_ENTITY_SIMULATION)
  private EntitySimulationResponse entitySimulation;

  public SimulationResponse() {
  }

  public SimulationResponse simulationId(String simulationId) {
    
    this.simulationId = simulationId;
    return this;
  }

   /**
   * Get simulationId
   * @return simulationId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getSimulationId() {
    return simulationId;
  }


  public void setSimulationId(String simulationId) {
    this.simulationId = simulationId;
  }


  public SimulationResponse entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public SimulationResponse entityId(String entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public String getEntityId() {
    return entityId;
  }


  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public SimulationResponse entitySimulation(EntitySimulationResponse entitySimulation) {
    
    this.entitySimulation = entitySimulation;
    return this;
  }

   /**
   * Get entitySimulation
   * @return entitySimulation
  **/
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  public EntitySimulationResponse getEntitySimulation() {
    return entitySimulation;
  }


  public void setEntitySimulation(EntitySimulationResponse entitySimulation) {
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
    SimulationResponse simulationResponse = (SimulationResponse) o;
    return Objects.equals(this.simulationId, simulationResponse.simulationId) &&
        Objects.equals(this.entity, simulationResponse.entity) &&
        Objects.equals(this.entityId, simulationResponse.entityId) &&
        Objects.equals(this.entitySimulation, simulationResponse.entitySimulation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulationId, entity, entityId, entitySimulation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulationResponse {\n");
    sb.append("    simulationId: ").append(toIndentedString(simulationId)).append("\n");
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
    openapiFields.add("simulation_id");
    openapiFields.add("entity");
    openapiFields.add("entity_id");
    openapiFields.add("entity_simulation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimulationResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("simulation_id") != null && !jsonObj.get("simulation_id").isJsonNull()) && !jsonObj.get("simulation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `simulation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("simulation_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      // validate the optional field `entity_simulation`
      if (jsonObj.get("entity_simulation") != null && !jsonObj.get("entity_simulation").isJsonNull()) {
        EntitySimulationResponse.validateJsonElement(jsonObj.get("entity_simulation"));
      }
  }


  /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SimulationResponse
  */
  public static boolean validateJsonElementForOneOf(JsonElement jsonElement) throws IOException {

        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("simulation_id") != null && !jsonObj.get("simulation_id").isJsonNull()) && !jsonObj.get("simulation_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `simulation_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("simulation_id").toString()));
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("entity_id") != null && !jsonObj.get("entity_id").isJsonNull()) && !jsonObj.get("entity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity_id").toString()));
      }
      // validate the optional field `entity_simulation`
      if (jsonObj.get("entity_simulation") != null && !jsonObj.get("entity_simulation").isJsonNull()) {
        EntitySimulationResponse.validateJsonElement(jsonObj.get("entity_simulation"));
        return true;
      }
      return false;
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimulationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimulationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimulationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimulationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SimulationResponse>() {
           @Override
           public void write(JsonWriter out, SimulationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimulationResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimulationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimulationResponse
  * @throws IOException if the JSON string is invalid with respect to SimulationResponse
  */
  public static SimulationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimulationResponse.class);
  }

 /**
  * Convert an instance of SimulationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


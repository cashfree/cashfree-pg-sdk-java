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
import com.cashfree.pg.model.CreateSubscriptionPaymentRequestCard;
import com.cashfree.pg.model.CreateSubscriptionPaymentRequestEnach;
import com.cashfree.pg.model.CreateSubscriptionPaymentRequestPnach;
import com.cashfree.pg.model.CreateSubscriptonPaymentRequestUpi;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cashfree.pg.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-26T12:53:05.189649Z[Etc/UTC]")
public class CreateSubscriptionPaymentRequestPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateSubscriptionPaymentRequestPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSubscriptionPaymentRequestPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSubscriptionPaymentRequestPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSubscriptonPaymentRequestUpi> adapterCreateSubscriptonPaymentRequestUpi = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptonPaymentRequestUpi.class));
            final TypeAdapter<CreateSubscriptionPaymentRequestEnach> adapterCreateSubscriptionPaymentRequestEnach = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequestEnach.class));
            final TypeAdapter<CreateSubscriptionPaymentRequestPnach> adapterCreateSubscriptionPaymentRequestPnach = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequestPnach.class));
            final TypeAdapter<CreateSubscriptionPaymentRequestCard> adapterCreateSubscriptionPaymentRequestCard = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentRequestCard.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionPaymentRequestPaymentMethod>() {
                @Override
                public void write(JsonWriter out, CreateSubscriptionPaymentRequestPaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateSubscriptonPaymentRequestUpi`
                    if (value.getActualInstance() instanceof CreateSubscriptonPaymentRequestUpi) {
                      JsonElement element = adapterCreateSubscriptonPaymentRequestUpi.toJsonTree((CreateSubscriptonPaymentRequestUpi)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateSubscriptionPaymentRequestEnach`
                    if (value.getActualInstance() instanceof CreateSubscriptionPaymentRequestEnach) {
                      JsonElement element = adapterCreateSubscriptionPaymentRequestEnach.toJsonTree((CreateSubscriptionPaymentRequestEnach)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateSubscriptionPaymentRequestPnach`
                    if (value.getActualInstance() instanceof CreateSubscriptionPaymentRequestPnach) {
                      JsonElement element = adapterCreateSubscriptionPaymentRequestPnach.toJsonTree((CreateSubscriptionPaymentRequestPnach)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateSubscriptionPaymentRequestCard`
                    if (value.getActualInstance() instanceof CreateSubscriptionPaymentRequestCard) {
                      JsonElement element = adapterCreateSubscriptionPaymentRequestCard.toJsonTree((CreateSubscriptionPaymentRequestCard)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi");
                }

                @Override
                public CreateSubscriptionPaymentRequestPaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateSubscriptonPaymentRequestUpi
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptonPaymentRequestUpi.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptonPaymentRequestUpi;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptonPaymentRequestUpi'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptonPaymentRequestUpi failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptonPaymentRequestUpi'", e);
                    }
                    // deserialize CreateSubscriptionPaymentRequestEnach
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptionPaymentRequestEnach.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptionPaymentRequestEnach;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptionPaymentRequestEnach'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestEnach failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptionPaymentRequestEnach'", e);
                    }
                    // deserialize CreateSubscriptionPaymentRequestPnach
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptionPaymentRequestPnach.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptionPaymentRequestPnach;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptionPaymentRequestPnach'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestPnach failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptionPaymentRequestPnach'", e);
                    }
                    // deserialize CreateSubscriptionPaymentRequestCard
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptionPaymentRequestCard.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptionPaymentRequestCard;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptionPaymentRequestCard'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestCard failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptionPaymentRequestCard'", e);
                    }

                    // if (match == 1) {
                        CreateSubscriptionPaymentRequestPaymentMethod ret = new CreateSubscriptionPaymentRequestPaymentMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    // }

                    // throw new IOException(String.format("Failed deserialization for CreateSubscriptionPaymentRequestPaymentMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateSubscriptionPaymentRequestPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateSubscriptionPaymentRequestPaymentMethod(CreateSubscriptionPaymentRequestCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSubscriptionPaymentRequestPaymentMethod(CreateSubscriptionPaymentRequestEnach o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSubscriptionPaymentRequestPaymentMethod(CreateSubscriptionPaymentRequestPnach o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSubscriptionPaymentRequestPaymentMethod(CreateSubscriptonPaymentRequestUpi o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateSubscriptonPaymentRequestUpi", CreateSubscriptonPaymentRequestUpi.class);
        schemas.put("CreateSubscriptionPaymentRequestEnach", CreateSubscriptionPaymentRequestEnach.class);
        schemas.put("CreateSubscriptionPaymentRequestPnach", CreateSubscriptionPaymentRequestPnach.class);
        schemas.put("CreateSubscriptionPaymentRequestCard", CreateSubscriptionPaymentRequestCard.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateSubscriptionPaymentRequestPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateSubscriptonPaymentRequestUpi) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateSubscriptionPaymentRequestEnach) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateSubscriptionPaymentRequestPnach) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateSubscriptionPaymentRequestCard) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi
     *
     * @return The actual instance (CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateSubscriptonPaymentRequestUpi`. If the actual instance is not `CreateSubscriptonPaymentRequestUpi`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptonPaymentRequestUpi`
     * @throws ClassCastException if the instance is not `CreateSubscriptonPaymentRequestUpi`
     */
    public CreateSubscriptonPaymentRequestUpi getCreateSubscriptonPaymentRequestUpi() throws ClassCastException {
        return (CreateSubscriptonPaymentRequestUpi)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateSubscriptionPaymentRequestEnach`. If the actual instance is not `CreateSubscriptionPaymentRequestEnach`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptionPaymentRequestEnach`
     * @throws ClassCastException if the instance is not `CreateSubscriptionPaymentRequestEnach`
     */
    public CreateSubscriptionPaymentRequestEnach getCreateSubscriptionPaymentRequestEnach() throws ClassCastException {
        return (CreateSubscriptionPaymentRequestEnach)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateSubscriptionPaymentRequestPnach`. If the actual instance is not `CreateSubscriptionPaymentRequestPnach`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptionPaymentRequestPnach`
     * @throws ClassCastException if the instance is not `CreateSubscriptionPaymentRequestPnach`
     */
    public CreateSubscriptionPaymentRequestPnach getCreateSubscriptionPaymentRequestPnach() throws ClassCastException {
        return (CreateSubscriptionPaymentRequestPnach)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateSubscriptionPaymentRequestCard`. If the actual instance is not `CreateSubscriptionPaymentRequestCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptionPaymentRequestCard`
     * @throws ClassCastException if the instance is not `CreateSubscriptionPaymentRequestCard`
     */
    public CreateSubscriptionPaymentRequestCard getCreateSubscriptionPaymentRequestCard() throws ClassCastException {
        return (CreateSubscriptionPaymentRequestCard)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSubscriptionPaymentRequestPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateSubscriptonPaymentRequestUpi
    try {
      CreateSubscriptonPaymentRequestUpi.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptonPaymentRequestUpi failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateSubscriptionPaymentRequestEnach
    try {
      CreateSubscriptionPaymentRequestEnach.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestEnach failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateSubscriptionPaymentRequestPnach
    try {
      CreateSubscriptionPaymentRequestPnach.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestPnach failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateSubscriptionPaymentRequestCard
    try {
      CreateSubscriptionPaymentRequestCard.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentRequestCard failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // if (validCount != 1) {
    //  throw new IOException(String.format("The JSON string is invalid for CreateSubscriptionPaymentRequestPaymentMethod with oneOf schemas: CreateSubscriptionPaymentRequestCard, CreateSubscriptionPaymentRequestEnach, CreateSubscriptionPaymentRequestPnach, CreateSubscriptonPaymentRequestUpi. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    // }
  }

 /**
  * Create an instance of CreateSubscriptionPaymentRequestPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionPaymentRequestPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionPaymentRequestPaymentMethod
  */
  public static CreateSubscriptionPaymentRequestPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionPaymentRequestPaymentMethod.class);
  }

 /**
  * Convert an instance of CreateSubscriptionPaymentRequestPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


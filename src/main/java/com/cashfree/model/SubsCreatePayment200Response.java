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
import com.cashfree.model.CreateSubscriptionPaymentAuthResponse;
import com.cashfree.model.CreateSubscriptionPaymentAuthResponseFailureDetails;
import com.cashfree.model.CreateSubscriptionPaymentChargeResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
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

import com.cashfree.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T08:43:25.672141Z[Etc/UTC]")
public class SubsCreatePayment200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SubsCreatePayment200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubsCreatePayment200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubsCreatePayment200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSubscriptionPaymentAuthResponse> adapterCreateSubscriptionPaymentAuthResponse = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentAuthResponse.class));
            final TypeAdapter<CreateSubscriptionPaymentChargeResponse> adapterCreateSubscriptionPaymentChargeResponse = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionPaymentChargeResponse.class));

            return (TypeAdapter<T>) new TypeAdapter<SubsCreatePayment200Response>() {
                @Override
                public void write(JsonWriter out, SubsCreatePayment200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateSubscriptionPaymentAuthResponse`
                    if (value.getActualInstance() instanceof CreateSubscriptionPaymentAuthResponse) {
                      JsonElement element = adapterCreateSubscriptionPaymentAuthResponse.toJsonTree((CreateSubscriptionPaymentAuthResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `CreateSubscriptionPaymentChargeResponse`
                    if (value.getActualInstance() instanceof CreateSubscriptionPaymentChargeResponse) {
                      JsonElement element = adapterCreateSubscriptionPaymentChargeResponse.toJsonTree((CreateSubscriptionPaymentChargeResponse)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse");
                }

                @Override
                public SubsCreatePayment200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateSubscriptionPaymentAuthResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptionPaymentAuthResponse.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptionPaymentAuthResponse;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptionPaymentAuthResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentAuthResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptionPaymentAuthResponse'", e);
                    }
                    // deserialize CreateSubscriptionPaymentChargeResponse
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(CreateSubscriptionPaymentChargeResponse.validateJsonElementForOneOf(jsonElement)) {
                          actualAdapter = adapterCreateSubscriptionPaymentChargeResponse;
                      }
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'CreateSubscriptionPaymentChargeResponse'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentChargeResponse failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'CreateSubscriptionPaymentChargeResponse'", e);
                    }

                    // if (match == 1) {
                        SubsCreatePayment200Response ret = new SubsCreatePayment200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    // }

                    // throw new IOException(String.format("Failed deserialization for SubsCreatePayment200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SubsCreatePayment200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public SubsCreatePayment200Response(CreateSubscriptionPaymentAuthResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SubsCreatePayment200Response(CreateSubscriptionPaymentChargeResponse o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateSubscriptionPaymentAuthResponse", CreateSubscriptionPaymentAuthResponse.class);
        schemas.put("CreateSubscriptionPaymentChargeResponse", CreateSubscriptionPaymentChargeResponse.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SubsCreatePayment200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateSubscriptionPaymentAuthResponse) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateSubscriptionPaymentChargeResponse) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse
     *
     * @return The actual instance (CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateSubscriptionPaymentAuthResponse`. If the actual instance is not `CreateSubscriptionPaymentAuthResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptionPaymentAuthResponse`
     * @throws ClassCastException if the instance is not `CreateSubscriptionPaymentAuthResponse`
     */
    public CreateSubscriptionPaymentAuthResponse getCreateSubscriptionPaymentAuthResponse() throws ClassCastException {
        return (CreateSubscriptionPaymentAuthResponse)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateSubscriptionPaymentChargeResponse`. If the actual instance is not `CreateSubscriptionPaymentChargeResponse`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateSubscriptionPaymentChargeResponse`
     * @throws ClassCastException if the instance is not `CreateSubscriptionPaymentChargeResponse`
     */
    public CreateSubscriptionPaymentChargeResponse getCreateSubscriptionPaymentChargeResponse() throws ClassCastException {
        return (CreateSubscriptionPaymentChargeResponse)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SubsCreatePayment200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with CreateSubscriptionPaymentAuthResponse
    try {
      CreateSubscriptionPaymentAuthResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentAuthResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with CreateSubscriptionPaymentChargeResponse
    try {
      CreateSubscriptionPaymentChargeResponse.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for CreateSubscriptionPaymentChargeResponse failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // if (validCount != 1) {
    //  throw new IOException(String.format("The JSON string is invalid for SubsCreatePayment200Response with oneOf schemas: CreateSubscriptionPaymentAuthResponse, CreateSubscriptionPaymentChargeResponse. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    // }
  }

 /**
  * Create an instance of SubsCreatePayment200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubsCreatePayment200Response
  * @throws IOException if the JSON string is invalid with respect to SubsCreatePayment200Response
  */
  public static SubsCreatePayment200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubsCreatePayment200Response.class);
  }

 /**
  * Convert an instance of SubsCreatePayment200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


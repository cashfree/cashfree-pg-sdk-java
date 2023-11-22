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
import com.cashfree.model.PaymentMethodAppInPaymentsEntity;
import com.cashfree.model.PaymentMethodCardInPaymentsEntity;
import com.cashfree.model.PaymentMethodCardlessEMIInPaymentsEntity;
import com.cashfree.model.PaymentMethodNetBankingInPaymentsEntity;
import com.cashfree.model.PaymentMethodPaylaterInPaymentsEntity;
import com.cashfree.model.PaymentMethodUPIInPaymentsEntity;
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

import com.cashfree.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-22T08:56:39.020570Z[Etc/UTC]")
public class PaymentMethodInPaymentsEntityPaymentMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PaymentMethodInPaymentsEntityPaymentMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PaymentMethodInPaymentsEntityPaymentMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PaymentMethodInPaymentsEntityPaymentMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PaymentMethodCardInPaymentsEntity> adapterPaymentMethodCardInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardInPaymentsEntity.class));
            final TypeAdapter<PaymentMethodNetBankingInPaymentsEntity> adapterPaymentMethodNetBankingInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodNetBankingInPaymentsEntity.class));
            final TypeAdapter<PaymentMethodUPIInPaymentsEntity> adapterPaymentMethodUPIInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodUPIInPaymentsEntity.class));
            final TypeAdapter<PaymentMethodAppInPaymentsEntity> adapterPaymentMethodAppInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodAppInPaymentsEntity.class));
            final TypeAdapter<PaymentMethodCardlessEMIInPaymentsEntity> adapterPaymentMethodCardlessEMIInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodCardlessEMIInPaymentsEntity.class));
            final TypeAdapter<PaymentMethodPaylaterInPaymentsEntity> adapterPaymentMethodPaylaterInPaymentsEntity = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethodPaylaterInPaymentsEntity.class));

            return (TypeAdapter<T>) new TypeAdapter<PaymentMethodInPaymentsEntityPaymentMethod>() {
                @Override
                public void write(JsonWriter out, PaymentMethodInPaymentsEntityPaymentMethod value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PaymentMethodCardInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodCardInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodCardInPaymentsEntity.toJsonTree((PaymentMethodCardInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaymentMethodNetBankingInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodNetBankingInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodNetBankingInPaymentsEntity.toJsonTree((PaymentMethodNetBankingInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaymentMethodUPIInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodUPIInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodUPIInPaymentsEntity.toJsonTree((PaymentMethodUPIInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaymentMethodAppInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodAppInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodAppInPaymentsEntity.toJsonTree((PaymentMethodAppInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaymentMethodCardlessEMIInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodCardlessEMIInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodCardlessEMIInPaymentsEntity.toJsonTree((PaymentMethodCardlessEMIInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `PaymentMethodPaylaterInPaymentsEntity`
                    if (value.getActualInstance() instanceof PaymentMethodPaylaterInPaymentsEntity) {
                      JsonElement element = adapterPaymentMethodPaylaterInPaymentsEntity.toJsonTree((PaymentMethodPaylaterInPaymentsEntity)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity");
                }

                @Override
                public PaymentMethodInPaymentsEntityPaymentMethod read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PaymentMethodCardInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodCardInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodCardInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodCardInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodCardInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCardInPaymentsEntity'", e);
                    }
                    // deserialize PaymentMethodNetBankingInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodNetBankingInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodNetBankingInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodNetBankingInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodNetBankingInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodNetBankingInPaymentsEntity'", e);
                    }
                    // deserialize PaymentMethodUPIInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodUPIInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodUPIInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodUPIInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodUPIInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodUPIInPaymentsEntity'", e);
                    }
                    // deserialize PaymentMethodAppInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodAppInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodAppInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodAppInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodAppInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodAppInPaymentsEntity'", e);
                    }
                    // deserialize PaymentMethodCardlessEMIInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodCardlessEMIInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodCardlessEMIInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodCardlessEMIInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodCardlessEMIInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodCardlessEMIInPaymentsEntity'", e);
                    }
                    // deserialize PaymentMethodPaylaterInPaymentsEntity
                    try {
                      // validate the JSON object to see if any exception is thrown
                      PaymentMethodPaylaterInPaymentsEntity.validateJsonElement(jsonElement);
                      actualAdapter = adapterPaymentMethodPaylaterInPaymentsEntity;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'PaymentMethodPaylaterInPaymentsEntity'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for PaymentMethodPaylaterInPaymentsEntity failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'PaymentMethodPaylaterInPaymentsEntity'", e);
                    }

                    if (match == 1) {
                        PaymentMethodInPaymentsEntityPaymentMethod ret = new PaymentMethodInPaymentsEntityPaymentMethod();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PaymentMethodInPaymentsEntityPaymentMethod: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PaymentMethodInPaymentsEntityPaymentMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodAppInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodCardInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodCardlessEMIInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodNetBankingInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodPaylaterInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PaymentMethodInPaymentsEntityPaymentMethod(PaymentMethodUPIInPaymentsEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PaymentMethodCardInPaymentsEntity", PaymentMethodCardInPaymentsEntity.class);
        schemas.put("PaymentMethodNetBankingInPaymentsEntity", PaymentMethodNetBankingInPaymentsEntity.class);
        schemas.put("PaymentMethodUPIInPaymentsEntity", PaymentMethodUPIInPaymentsEntity.class);
        schemas.put("PaymentMethodAppInPaymentsEntity", PaymentMethodAppInPaymentsEntity.class);
        schemas.put("PaymentMethodCardlessEMIInPaymentsEntity", PaymentMethodCardlessEMIInPaymentsEntity.class);
        schemas.put("PaymentMethodPaylaterInPaymentsEntity", PaymentMethodPaylaterInPaymentsEntity.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PaymentMethodInPaymentsEntityPaymentMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PaymentMethodCardInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodNetBankingInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodUPIInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodAppInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodCardlessEMIInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PaymentMethodPaylaterInPaymentsEntity) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity");
    }

    /**
     * Get the actual instance, which can be the following:
     * PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity
     *
     * @return The actual instance (PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PaymentMethodCardInPaymentsEntity`. If the actual instance is not `PaymentMethodCardInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCardInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodCardInPaymentsEntity`
     */
    public PaymentMethodCardInPaymentsEntity getPaymentMethodCardInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodCardInPaymentsEntity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaymentMethodNetBankingInPaymentsEntity`. If the actual instance is not `PaymentMethodNetBankingInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodNetBankingInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodNetBankingInPaymentsEntity`
     */
    public PaymentMethodNetBankingInPaymentsEntity getPaymentMethodNetBankingInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodNetBankingInPaymentsEntity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaymentMethodUPIInPaymentsEntity`. If the actual instance is not `PaymentMethodUPIInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodUPIInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodUPIInPaymentsEntity`
     */
    public PaymentMethodUPIInPaymentsEntity getPaymentMethodUPIInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodUPIInPaymentsEntity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaymentMethodAppInPaymentsEntity`. If the actual instance is not `PaymentMethodAppInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodAppInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodAppInPaymentsEntity`
     */
    public PaymentMethodAppInPaymentsEntity getPaymentMethodAppInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodAppInPaymentsEntity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaymentMethodCardlessEMIInPaymentsEntity`. If the actual instance is not `PaymentMethodCardlessEMIInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodCardlessEMIInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodCardlessEMIInPaymentsEntity`
     */
    public PaymentMethodCardlessEMIInPaymentsEntity getPaymentMethodCardlessEMIInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodCardlessEMIInPaymentsEntity)super.getActualInstance();
    }
    /**
     * Get the actual instance of `PaymentMethodPaylaterInPaymentsEntity`. If the actual instance is not `PaymentMethodPaylaterInPaymentsEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PaymentMethodPaylaterInPaymentsEntity`
     * @throws ClassCastException if the instance is not `PaymentMethodPaylaterInPaymentsEntity`
     */
    public PaymentMethodPaylaterInPaymentsEntity getPaymentMethodPaylaterInPaymentsEntity() throws ClassCastException {
        return (PaymentMethodPaylaterInPaymentsEntity)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PaymentMethodInPaymentsEntityPaymentMethod
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PaymentMethodCardInPaymentsEntity
    try {
      PaymentMethodCardInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodCardInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodNetBankingInPaymentsEntity
    try {
      PaymentMethodNetBankingInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodNetBankingInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodUPIInPaymentsEntity
    try {
      PaymentMethodUPIInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodUPIInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodAppInPaymentsEntity
    try {
      PaymentMethodAppInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodAppInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodCardlessEMIInPaymentsEntity
    try {
      PaymentMethodCardlessEMIInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodCardlessEMIInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PaymentMethodPaylaterInPaymentsEntity
    try {
      PaymentMethodPaylaterInPaymentsEntity.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PaymentMethodPaylaterInPaymentsEntity failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PaymentMethodInPaymentsEntityPaymentMethod with oneOf schemas: PaymentMethodAppInPaymentsEntity, PaymentMethodCardInPaymentsEntity, PaymentMethodCardlessEMIInPaymentsEntity, PaymentMethodNetBankingInPaymentsEntity, PaymentMethodPaylaterInPaymentsEntity, PaymentMethodUPIInPaymentsEntity. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of PaymentMethodInPaymentsEntityPaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethodInPaymentsEntityPaymentMethod
  * @throws IOException if the JSON string is invalid with respect to PaymentMethodInPaymentsEntityPaymentMethod
  */
  public static PaymentMethodInPaymentsEntityPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethodInPaymentsEntityPaymentMethod.class);
  }

 /**
  * Convert an instance of PaymentMethodInPaymentsEntityPaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


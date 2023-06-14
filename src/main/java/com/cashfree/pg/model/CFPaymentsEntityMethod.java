/*
 * New Payment Gateway APIs
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2022-01-01
 * Contact: nextgenapi@cashfree.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.cashfree.pg.model;


import com.cashfree.pg.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFPaymentsEntityMethod extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CFPaymentsEntityMethod.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFPaymentsEntityMethod.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFPaymentsEntityMethod' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFPaymentsEntityAppPayment> adapterCFPaymentsEntityAppPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaymentsEntityAppPayment.class));
            final TypeAdapter<CFPaymentsEntityCardPayment> adapterCFPaymentsEntityCardPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaymentsEntityCardPayment.class));
            final TypeAdapter<CFPaymentsEntityCardlessEMIPayment>
                    adapterCFPaymentsEntityCardlessEMIPayment =
                            gson.getDelegateAdapter(
                                    this, TypeToken.get(CFPaymentsEntityCardlessEMIPayment.class));
            final TypeAdapter<CFPaymentsEntityNetbankingPayment>
                    adapterCFPaymentsEntityNetbankingPayment =
                            gson.getDelegateAdapter(
                                    this, TypeToken.get(CFPaymentsEntityNetbankingPayment.class));
            final TypeAdapter<CFPaymentsEntityPaylaterPayment>
                    adapterCFPaymentsEntityPaylaterPayment =
                            gson.getDelegateAdapter(
                                    this, TypeToken.get(CFPaymentsEntityPaylaterPayment.class));
            final TypeAdapter<CFPaymentsEntityUPIPayment> adapterCFPaymentsEntityUPIPayment =
                    gson.getDelegateAdapter(this, TypeToken.get(CFPaymentsEntityUPIPayment.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFPaymentsEntityMethod>() {
                        @Override
                        public void write(JsonWriter out, CFPaymentsEntityMethod value)
                                throws IOException {
                            if (value == null || value.getActualInstance() == null) {
                                elementAdapter.write(out, null);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityAppPayment`
                            if (value.getActualInstance() instanceof CFPaymentsEntityAppPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityAppPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityAppPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityCardPayment`
                            if (value.getActualInstance() instanceof CFPaymentsEntityCardPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityCardPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityCardPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityCardlessEMIPayment`
                            if (value.getActualInstance()
                                    instanceof CFPaymentsEntityCardlessEMIPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityCardlessEMIPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityCardlessEMIPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityNetbankingPayment`
                            if (value.getActualInstance()
                                    instanceof CFPaymentsEntityNetbankingPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityNetbankingPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityNetbankingPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityPaylaterPayment`
                            if (value.getActualInstance()
                                    instanceof CFPaymentsEntityPaylaterPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityPaylaterPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityPaylaterPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `CFPaymentsEntityUPIPayment`
                            if (value.getActualInstance() instanceof CFPaymentsEntityUPIPayment) {
                                JsonObject obj =
                                        adapterCFPaymentsEntityUPIPayment
                                                .toJsonTree(
                                                        (CFPaymentsEntityUPIPayment)
                                                                value.getActualInstance())
                                                .getAsJsonObject();
                                elementAdapter.write(out, obj);
                                return;
                            }

                            throw new IOException(
                                    "Failed to serialize as the type doesn't match oneOf schemas:"
                                            + " CFPaymentsEntityAppPayment,"
                                            + " CFPaymentsEntityCardPayment,"
                                            + " CFPaymentsEntityCardlessEMIPayment,"
                                            + " CFPaymentsEntityNetbankingPayment,"
                                            + " CFPaymentsEntityPaylaterPayment,"
                                            + " CFPaymentsEntityUPIPayment");
                        }

                        @Override
                        public CFPaymentsEntityMethod read(JsonReader in) throws IOException {
                            Object deserialized = null;
                            JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                            int match = 0;
                            ArrayList<String> errorMessages = new ArrayList<>();
                            TypeAdapter actualAdapter = elementAdapter;

                            // deserialize CFPaymentsEntityAppPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityAppPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityAppPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFPaymentsEntityAppPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFPaymentsEntityAppPayment"
                                                        + " failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityAppPayment'",
                                        e);
                            }

                            // deserialize CFPaymentsEntityCardPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityCardPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityCardPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFPaymentsEntityCardPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFPaymentsEntityCardPayment"
                                                        + " failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityCardPayment'",
                                        e);
                            }

                            // deserialize CFPaymentsEntityCardlessEMIPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityCardlessEMIPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityCardlessEMIPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema"
                                                + " 'CFPaymentsEntityCardlessEMIPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for"
                                                    + " CFPaymentsEntityCardlessEMIPayment failed"
                                                    + " with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityCardlessEMIPayment'",
                                        e);
                            }

                            // deserialize CFPaymentsEntityNetbankingPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityNetbankingPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityNetbankingPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema"
                                                + " 'CFPaymentsEntityNetbankingPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for"
                                                    + " CFPaymentsEntityNetbankingPayment failed"
                                                    + " with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityNetbankingPayment'",
                                        e);
                            }

                            // deserialize CFPaymentsEntityPaylaterPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityPaylaterPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityPaylaterPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema"
                                                + " 'CFPaymentsEntityPaylaterPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for"
                                                        + " CFPaymentsEntityPaylaterPayment failed"
                                                        + " with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityPaylaterPayment'",
                                        e);
                            }

                            // deserialize CFPaymentsEntityUPIPayment
                            try {
                                // validate the JSON object to see if any exception is thrown
                                CFPaymentsEntityUPIPayment.validateJsonObject(jsonObject);
                                actualAdapter = adapterCFPaymentsEntityUPIPayment;
                                match++;
                                log.log(
                                        Level.FINER,
                                        "Input data matches schema 'CFPaymentsEntityUPIPayment'");
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for CFPaymentsEntityUPIPayment"
                                                        + " failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'CFPaymentsEntityUPIPayment'",
                                        e);
                            }

                            if (match == 1) {
                                CFPaymentsEntityMethod ret = new CFPaymentsEntityMethod();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                                return ret;
                            }

                            throw new IOException(
                                    String.format(
                                            "Failed deserialization for CFPaymentsEntityMethod: %d"
                                                + " classes match result, expected 1. Detailed"
                                                + " failure message for oneOf schemas: %s. JSON:"
                                                + " %s",
                                            match, errorMessages, jsonObject.toString()));
                        }
                    }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CFPaymentsEntityMethod() {
        super("oneOf", Boolean.FALSE);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityAppPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityCardPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityCardlessEMIPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityNetbankingPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityPaylaterPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CFPaymentsEntityMethod(CFPaymentsEntityUPIPayment o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CFPaymentsEntityAppPayment", new GenericType<CFPaymentsEntityAppPayment>() {});
        schemas.put(
                "CFPaymentsEntityCardPayment", new GenericType<CFPaymentsEntityCardPayment>() {});
        schemas.put(
                "CFPaymentsEntityCardlessEMIPayment",
                new GenericType<CFPaymentsEntityCardlessEMIPayment>() {});
        schemas.put(
                "CFPaymentsEntityNetbankingPayment",
                new GenericType<CFPaymentsEntityNetbankingPayment>() {});
        schemas.put(
                "CFPaymentsEntityPaylaterPayment",
                new GenericType<CFPaymentsEntityPaylaterPayment>() {});
        schemas.put("CFPaymentsEntityUPIPayment", new GenericType<CFPaymentsEntityUPIPayment>() {});
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CFPaymentsEntityMethod.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check the instance parameter is valid
     * against the oneOf child schemas: CFPaymentsEntityAppPayment, CFPaymentsEntityCardPayment,
     * CFPaymentsEntityCardlessEMIPayment, CFPaymentsEntityNetbankingPayment,
     * CFPaymentsEntityPaylaterPayment, CFPaymentsEntityUPIPayment
     *
     * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be
     * a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CFPaymentsEntityAppPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaymentsEntityCardPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaymentsEntityCardlessEMIPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaymentsEntityNetbankingPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaymentsEntityPaylaterPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CFPaymentsEntityUPIPayment) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be CFPaymentsEntityAppPayment,"
                        + " CFPaymentsEntityCardPayment, CFPaymentsEntityCardlessEMIPayment,"
                        + " CFPaymentsEntityNetbankingPayment, CFPaymentsEntityPaylaterPayment,"
                        + " CFPaymentsEntityUPIPayment");
    }

    /**
     * Get the actual instance, which can be the following: CFPaymentsEntityAppPayment,
     * CFPaymentsEntityCardPayment, CFPaymentsEntityCardlessEMIPayment,
     * CFPaymentsEntityNetbankingPayment, CFPaymentsEntityPaylaterPayment,
     * CFPaymentsEntityUPIPayment
     *
     * @return The actual instance (CFPaymentsEntityAppPayment, CFPaymentsEntityCardPayment,
     *     CFPaymentsEntityCardlessEMIPayment, CFPaymentsEntityNetbankingPayment,
     *     CFPaymentsEntityPaylaterPayment, CFPaymentsEntityUPIPayment)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityAppPayment`. If the actual instance is not
     * `CFPaymentsEntityAppPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityAppPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityAppPayment`
     */
    public CFPaymentsEntityAppPayment getCFPaymentsEntityAppPayment() throws ClassCastException {
        return (CFPaymentsEntityAppPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityCardPayment`. If the actual instance is not
     * `CFPaymentsEntityCardPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityCardPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityCardPayment`
     */
    public CFPaymentsEntityCardPayment getCFPaymentsEntityCardPayment() throws ClassCastException {
        return (CFPaymentsEntityCardPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityCardlessEMIPayment`. If the actual instance is
     * not `CFPaymentsEntityCardlessEMIPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityCardlessEMIPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityCardlessEMIPayment`
     */
    public CFPaymentsEntityCardlessEMIPayment getCFPaymentsEntityCardlessEMIPayment()
            throws ClassCastException {
        return (CFPaymentsEntityCardlessEMIPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityNetbankingPayment`. If the actual instance is not
     * `CFPaymentsEntityNetbankingPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityNetbankingPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityNetbankingPayment`
     */
    public CFPaymentsEntityNetbankingPayment getCFPaymentsEntityNetbankingPayment()
            throws ClassCastException {
        return (CFPaymentsEntityNetbankingPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityPaylaterPayment`. If the actual instance is not
     * `CFPaymentsEntityPaylaterPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityPaylaterPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityPaylaterPayment`
     */
    public CFPaymentsEntityPaylaterPayment getCFPaymentsEntityPaylaterPayment()
            throws ClassCastException {
        return (CFPaymentsEntityPaylaterPayment) super.getActualInstance();
    }

    /**
     * Get the actual instance of `CFPaymentsEntityUPIPayment`. If the actual instance is not
     * `CFPaymentsEntityUPIPayment`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `CFPaymentsEntityUPIPayment`
     * @throws ClassCastException if the instance is not `CFPaymentsEntityUPIPayment`
     */
    public CFPaymentsEntityUPIPayment getCFPaymentsEntityUPIPayment() throws ClassCastException {
        return (CFPaymentsEntityUPIPayment) super.getActualInstance();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFPaymentsEntityMethod
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CFPaymentsEntityAppPayment
        try {
            CFPaymentsEntityAppPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityAppPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaymentsEntityCardPayment
        try {
            CFPaymentsEntityCardPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityCardPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaymentsEntityCardlessEMIPayment
        try {
            CFPaymentsEntityCardlessEMIPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityCardlessEMIPayment failed with"
                                    + " `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaymentsEntityNetbankingPayment
        try {
            CFPaymentsEntityNetbankingPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityNetbankingPayment failed with"
                                    + " `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaymentsEntityPaylaterPayment
        try {
            CFPaymentsEntityPaylaterPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityPaylaterPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CFPaymentsEntityUPIPayment
        try {
            CFPaymentsEntityUPIPayment.validateJsonObject(jsonObj);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for CFPaymentsEntityUPIPayment failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(
                    String.format(
                            "The JSON string is invalid for CFPaymentsEntityMethod with oneOf"
                                + " schemas: CFPaymentsEntityAppPayment,"
                                + " CFPaymentsEntityCardPayment,"
                                + " CFPaymentsEntityCardlessEMIPayment,"
                                + " CFPaymentsEntityNetbankingPayment,"
                                + " CFPaymentsEntityPaylaterPayment, CFPaymentsEntityUPIPayment."
                                + " %d class(es) match the result, expected 1. Detailed failure"
                                + " message for oneOf schemas: %s. JSON: %s",
                            validCount, errorMessages, jsonObj.toString()));
        }
    }

    /**
     * Create an instance of CFPaymentsEntityMethod given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFPaymentsEntityMethod
     * @throws IOException if the JSON string is invalid with respect to CFPaymentsEntityMethod
     */
    public static CFPaymentsEntityMethod fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFPaymentsEntityMethod.class);
    }

    /**
     * Convert an instance of CFPaymentsEntityMethod to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
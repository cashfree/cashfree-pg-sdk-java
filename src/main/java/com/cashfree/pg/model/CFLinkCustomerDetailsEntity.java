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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CFLinkCustomerDetailsEntity */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFLinkCustomerDetailsEntity {
    public static final String SERIALIZED_NAME_CUSTOMER_PHONE = "customer_phone";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_PHONE)
    private String customerPhone;

    public static final String SERIALIZED_NAME_CUSTOMER_EMAIL = "customer_email";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_EMAIL)
    private String customerEmail;

    public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customer_name";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
    private String customerName;

    public CFLinkCustomerDetailsEntity() {}

    public CFLinkCustomerDetailsEntity customerPhone(String customerPhone) {

        this.customerPhone = customerPhone;
        return this;
    }

    /**
     * Customer phone number
     *
     * @return customerPhone
     */
    @javax.annotation.Nonnull
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public CFLinkCustomerDetailsEntity customerEmail(String customerEmail) {

        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Customer email address
     *
     * @return customerEmail
     */
    @javax.annotation.Nullable
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public CFLinkCustomerDetailsEntity customerName(String customerName) {

        this.customerName = customerName;
        return this;
    }

    /**
     * Customer name
     *
     * @return customerName
     */
    @javax.annotation.Nullable
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFLinkCustomerDetailsEntity cfLinkCustomerDetailsEntity = (CFLinkCustomerDetailsEntity) o;
        return Objects.equals(this.customerPhone, cfLinkCustomerDetailsEntity.customerPhone)
                && Objects.equals(this.customerEmail, cfLinkCustomerDetailsEntity.customerEmail)
                && Objects.equals(this.customerName, cfLinkCustomerDetailsEntity.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerPhone, customerEmail, customerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFLinkCustomerDetailsEntity {\n");
        sb.append("    customerPhone: ").append(toIndentedString(customerPhone)).append("\n");
        sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("customer_phone");
        openapiFields.add("customer_email");
        openapiFields.add("customer_name");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("customer_phone");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFLinkCustomerDetailsEntity
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFLinkCustomerDetailsEntity.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFLinkCustomerDetailsEntity is not"
                                        + " found in the empty JSON string",
                                CFLinkCustomerDetailsEntity.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFLinkCustomerDetailsEntity.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CFLinkCustomerDetailsEntity` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CFLinkCustomerDetailsEntity.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("customer_phone").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `customer_phone` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("customer_phone").toString()));
        }
        if ((jsonObj.get("customer_email") != null && !jsonObj.get("customer_email").isJsonNull())
                && !jsonObj.get("customer_email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `customer_email` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("customer_email").toString()));
        }
        if ((jsonObj.get("customer_name") != null && !jsonObj.get("customer_name").isJsonNull())
                && !jsonObj.get("customer_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `customer_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("customer_name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFLinkCustomerDetailsEntity.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFLinkCustomerDetailsEntity' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFLinkCustomerDetailsEntity> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFLinkCustomerDetailsEntity.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFLinkCustomerDetailsEntity>() {
                        @Override
                        public void write(JsonWriter out, CFLinkCustomerDetailsEntity value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFLinkCustomerDetailsEntity read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFLinkCustomerDetailsEntity given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFLinkCustomerDetailsEntity
     * @throws IOException if the JSON string is invalid with respect to CFLinkCustomerDetailsEntity
     */
    public static CFLinkCustomerDetailsEntity fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFLinkCustomerDetailsEntity.class);
    }

    /**
     * Convert an instance of CFLinkCustomerDetailsEntity to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
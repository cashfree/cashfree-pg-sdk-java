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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CFLink */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2023-03-16T14:01:52.135917+05:30[Asia/Kolkata]")
public class CFLink {
    public static final String SERIALIZED_NAME_CF_LINK_ID = "cf_link_id";

    @SerializedName(SERIALIZED_NAME_CF_LINK_ID)
    private long cfLinkId;

    public static final String SERIALIZED_NAME_LINK_ID = "link_id";

    @SerializedName(SERIALIZED_NAME_LINK_ID)
    private String linkId;

    public static final String SERIALIZED_NAME_LINK_STATUS = "link_status";

    @SerializedName(SERIALIZED_NAME_LINK_STATUS)
    private String linkStatus;

    public static final String SERIALIZED_NAME_LINK_CURRENCY = "link_currency";

    @SerializedName(SERIALIZED_NAME_LINK_CURRENCY)
    private String linkCurrency;

    public static final String SERIALIZED_NAME_LINK_AMOUNT = "link_amount";

    @SerializedName(SERIALIZED_NAME_LINK_AMOUNT)
    private BigDecimal linkAmount;

    public static final String SERIALIZED_NAME_LINK_AMOUNT_PAID = "link_amount_paid";

    @SerializedName(SERIALIZED_NAME_LINK_AMOUNT_PAID)
    private BigDecimal linkAmountPaid;

    public static final String SERIALIZED_NAME_LINK_PARTIAL_PAYMENTS = "link_partial_payments";

    @SerializedName(SERIALIZED_NAME_LINK_PARTIAL_PAYMENTS)
    private Boolean linkPartialPayments;

    public static final String SERIALIZED_NAME_LINK_MINIMUM_PARTIAL_AMOUNT =
            "link_minimum_partial_amount";

    @SerializedName(SERIALIZED_NAME_LINK_MINIMUM_PARTIAL_AMOUNT)
    private BigDecimal linkMinimumPartialAmount;

    public static final String SERIALIZED_NAME_LINK_PURPOSE = "link_purpose";

    @SerializedName(SERIALIZED_NAME_LINK_PURPOSE)
    private String linkPurpose;

    public static final String SERIALIZED_NAME_LINK_CREATED_AT = "link_created_at";

    @SerializedName(SERIALIZED_NAME_LINK_CREATED_AT)
    private String linkCreatedAt;

    public static final String SERIALIZED_NAME_CUSTOMER_DETAILS = "customer_details";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_DETAILS)
    private CFLinkCustomerDetailsEntity customerDetails;

    public static final String SERIALIZED_NAME_LINK_META = "link_meta";

    @SerializedName(SERIALIZED_NAME_LINK_META)
    private CFLinkMetaEntity linkMeta;

    public static final String SERIALIZED_NAME_LINK_URL = "link_url";

    @SerializedName(SERIALIZED_NAME_LINK_URL)
    private String linkUrl;

    public static final String SERIALIZED_NAME_LINK_EXPIRY_TIME = "link_expiry_time";

    @SerializedName(SERIALIZED_NAME_LINK_EXPIRY_TIME)
    private String linkExpiryTime;

    public static final String SERIALIZED_NAME_LINK_NOTES = "link_notes";

    @SerializedName(SERIALIZED_NAME_LINK_NOTES)
    private Map<String, String> linkNotes = new HashMap<>();

    public static final String SERIALIZED_NAME_LINK_AUTO_REMINDERS = "link_auto_reminders";

    @SerializedName(SERIALIZED_NAME_LINK_AUTO_REMINDERS)
    private Boolean linkAutoReminders;

    public static final String SERIALIZED_NAME_LINK_NOTIFY = "link_notify";

    @SerializedName(SERIALIZED_NAME_LINK_NOTIFY)
    private CFLinkNotifyEntity linkNotify;

    public CFLink() {}

    public CFLink cfLinkId(long cfLinkId) {

        this.cfLinkId = cfLinkId;
        return this;
    }

    /**
     * Get cfLinkId
     *
     * @return cfLinkId
     */
    @javax.annotation.Nullable
    public long getCfLinkId() {
        return cfLinkId;
    }

    public void setCfLinkId(long cfLinkId) {
        this.cfLinkId = cfLinkId;
    }

    public CFLink linkId(String linkId) {

        this.linkId = linkId;
        return this;
    }

    /**
     * Get linkId
     *
     * @return linkId
     */
    @javax.annotation.Nullable
    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public CFLink linkStatus(String linkStatus) {

        this.linkStatus = linkStatus;
        return this;
    }

    /**
     * Get linkStatus
     *
     * @return linkStatus
     */
    @javax.annotation.Nullable
    public String getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(String linkStatus) {
        this.linkStatus = linkStatus;
    }

    public CFLink linkCurrency(String linkCurrency) {

        this.linkCurrency = linkCurrency;
        return this;
    }

    /**
     * Get linkCurrency
     *
     * @return linkCurrency
     */
    @javax.annotation.Nullable
    public String getLinkCurrency() {
        return linkCurrency;
    }

    public void setLinkCurrency(String linkCurrency) {
        this.linkCurrency = linkCurrency;
    }

    public CFLink linkAmount(BigDecimal linkAmount) {

        this.linkAmount = linkAmount;
        return this;
    }

    /**
     * Get linkAmount
     *
     * @return linkAmount
     */
    @javax.annotation.Nullable
    public BigDecimal getLinkAmount() {
        return linkAmount;
    }

    public void setLinkAmount(BigDecimal linkAmount) {
        this.linkAmount = linkAmount;
    }

    public CFLink linkAmountPaid(BigDecimal linkAmountPaid) {

        this.linkAmountPaid = linkAmountPaid;
        return this;
    }

    /**
     * Get linkAmountPaid
     *
     * @return linkAmountPaid
     */
    @javax.annotation.Nullable
    public BigDecimal getLinkAmountPaid() {
        return linkAmountPaid;
    }

    public void setLinkAmountPaid(BigDecimal linkAmountPaid) {
        this.linkAmountPaid = linkAmountPaid;
    }

    public CFLink linkPartialPayments(Boolean linkPartialPayments) {

        this.linkPartialPayments = linkPartialPayments;
        return this;
    }

    /**
     * Get linkPartialPayments
     *
     * @return linkPartialPayments
     */
    @javax.annotation.Nullable
    public Boolean getLinkPartialPayments() {
        return linkPartialPayments;
    }

    public void setLinkPartialPayments(Boolean linkPartialPayments) {
        this.linkPartialPayments = linkPartialPayments;
    }

    public CFLink linkMinimumPartialAmount(BigDecimal linkMinimumPartialAmount) {

        this.linkMinimumPartialAmount = linkMinimumPartialAmount;
        return this;
    }

    /**
     * Get linkMinimumPartialAmount
     *
     * @return linkMinimumPartialAmount
     */
    @javax.annotation.Nullable
    public BigDecimal getLinkMinimumPartialAmount() {
        return linkMinimumPartialAmount;
    }

    public void setLinkMinimumPartialAmount(BigDecimal linkMinimumPartialAmount) {
        this.linkMinimumPartialAmount = linkMinimumPartialAmount;
    }

    public CFLink linkPurpose(String linkPurpose) {

        this.linkPurpose = linkPurpose;
        return this;
    }

    /**
     * Get linkPurpose
     *
     * @return linkPurpose
     */
    @javax.annotation.Nullable
    public String getLinkPurpose() {
        return linkPurpose;
    }

    public void setLinkPurpose(String linkPurpose) {
        this.linkPurpose = linkPurpose;
    }

    public CFLink linkCreatedAt(String linkCreatedAt) {

        this.linkCreatedAt = linkCreatedAt;
        return this;
    }

    /**
     * Get linkCreatedAt
     *
     * @return linkCreatedAt
     */
    @javax.annotation.Nullable
    public String getLinkCreatedAt() {
        return linkCreatedAt;
    }

    public void setLinkCreatedAt(String linkCreatedAt) {
        this.linkCreatedAt = linkCreatedAt;
    }

    public CFLink customerDetails(CFLinkCustomerDetailsEntity customerDetails) {

        this.customerDetails = customerDetails;
        return this;
    }

    /**
     * Get customerDetails
     *
     * @return customerDetails
     */
    @javax.annotation.Nullable
    public CFLinkCustomerDetailsEntity getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CFLinkCustomerDetailsEntity customerDetails) {
        this.customerDetails = customerDetails;
    }

    public CFLink linkMeta(CFLinkMetaEntity linkMeta) {

        this.linkMeta = linkMeta;
        return this;
    }

    /**
     * Get linkMeta
     *
     * @return linkMeta
     */
    @javax.annotation.Nullable
    public CFLinkMetaEntity getLinkMeta() {
        return linkMeta;
    }

    public void setLinkMeta(CFLinkMetaEntity linkMeta) {
        this.linkMeta = linkMeta;
    }

    public CFLink linkUrl(String linkUrl) {

        this.linkUrl = linkUrl;
        return this;
    }

    /**
     * Get linkUrl
     *
     * @return linkUrl
     */
    @javax.annotation.Nullable
    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public CFLink linkExpiryTime(String linkExpiryTime) {

        this.linkExpiryTime = linkExpiryTime;
        return this;
    }

    /**
     * Get linkExpiryTime
     *
     * @return linkExpiryTime
     */
    @javax.annotation.Nullable
    public String getLinkExpiryTime() {
        return linkExpiryTime;
    }

    public void setLinkExpiryTime(String linkExpiryTime) {
        this.linkExpiryTime = linkExpiryTime;
    }

    public CFLink linkNotes(Map<String, String> linkNotes) {

        this.linkNotes = linkNotes;
        return this;
    }

    public CFLink putLinkNotesItem(String key, String linkNotesItem) {
        if (this.linkNotes == null) {
            this.linkNotes = new HashMap<>();
        }
        this.linkNotes.put(key, linkNotesItem);
        return this;
    }

    /**
     * Key-value pair that can be used to store additional information about the entity. Maximum 5
     * key-value pairs
     *
     * @return linkNotes
     */
    @javax.annotation.Nullable
    public Map<String, String> getLinkNotes() {
        return linkNotes;
    }

    public void setLinkNotes(Map<String, String> linkNotes) {
        this.linkNotes = linkNotes;
    }

    public CFLink linkAutoReminders(Boolean linkAutoReminders) {

        this.linkAutoReminders = linkAutoReminders;
        return this;
    }

    /**
     * Get linkAutoReminders
     *
     * @return linkAutoReminders
     */
    @javax.annotation.Nullable
    public Boolean getLinkAutoReminders() {
        return linkAutoReminders;
    }

    public void setLinkAutoReminders(Boolean linkAutoReminders) {
        this.linkAutoReminders = linkAutoReminders;
    }

    public CFLink linkNotify(CFLinkNotifyEntity linkNotify) {

        this.linkNotify = linkNotify;
        return this;
    }

    /**
     * Get linkNotify
     *
     * @return linkNotify
     */
    @javax.annotation.Nullable
    public CFLinkNotifyEntity getLinkNotify() {
        return linkNotify;
    }

    public void setLinkNotify(CFLinkNotifyEntity linkNotify) {
        this.linkNotify = linkNotify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CFLink cfLink = (CFLink) o;
        return Objects.equals(this.cfLinkId, cfLink.cfLinkId)
                && Objects.equals(this.linkId, cfLink.linkId)
                && Objects.equals(this.linkStatus, cfLink.linkStatus)
                && Objects.equals(this.linkCurrency, cfLink.linkCurrency)
                && Objects.equals(this.linkAmount, cfLink.linkAmount)
                && Objects.equals(this.linkAmountPaid, cfLink.linkAmountPaid)
                && Objects.equals(this.linkPartialPayments, cfLink.linkPartialPayments)
                && Objects.equals(this.linkMinimumPartialAmount, cfLink.linkMinimumPartialAmount)
                && Objects.equals(this.linkPurpose, cfLink.linkPurpose)
                && Objects.equals(this.linkCreatedAt, cfLink.linkCreatedAt)
                && Objects.equals(this.customerDetails, cfLink.customerDetails)
                && Objects.equals(this.linkMeta, cfLink.linkMeta)
                && Objects.equals(this.linkUrl, cfLink.linkUrl)
                && Objects.equals(this.linkExpiryTime, cfLink.linkExpiryTime)
                && Objects.equals(this.linkNotes, cfLink.linkNotes)
                && Objects.equals(this.linkAutoReminders, cfLink.linkAutoReminders)
                && Objects.equals(this.linkNotify, cfLink.linkNotify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cfLinkId,
                linkId,
                linkStatus,
                linkCurrency,
                linkAmount,
                linkAmountPaid,
                linkPartialPayments,
                linkMinimumPartialAmount,
                linkPurpose,
                linkCreatedAt,
                customerDetails,
                linkMeta,
                linkUrl,
                linkExpiryTime,
                linkNotes,
                linkAutoReminders,
                linkNotify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CFLink {\n");
        sb.append("    cfLinkId: ").append(toIndentedString(cfLinkId)).append("\n");
        sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
        sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
        sb.append("    linkCurrency: ").append(toIndentedString(linkCurrency)).append("\n");
        sb.append("    linkAmount: ").append(toIndentedString(linkAmount)).append("\n");
        sb.append("    linkAmountPaid: ").append(toIndentedString(linkAmountPaid)).append("\n");
        sb.append("    linkPartialPayments: ")
                .append(toIndentedString(linkPartialPayments))
                .append("\n");
        sb.append("    linkMinimumPartialAmount: ")
                .append(toIndentedString(linkMinimumPartialAmount))
                .append("\n");
        sb.append("    linkPurpose: ").append(toIndentedString(linkPurpose)).append("\n");
        sb.append("    linkCreatedAt: ").append(toIndentedString(linkCreatedAt)).append("\n");
        sb.append("    customerDetails: ").append(toIndentedString(customerDetails)).append("\n");
        sb.append("    linkMeta: ").append(toIndentedString(linkMeta)).append("\n");
        sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
        sb.append("    linkExpiryTime: ").append(toIndentedString(linkExpiryTime)).append("\n");
        sb.append("    linkNotes: ").append(toIndentedString(linkNotes)).append("\n");
        sb.append("    linkAutoReminders: ")
                .append(toIndentedString(linkAutoReminders))
                .append("\n");
        sb.append("    linkNotify: ").append(toIndentedString(linkNotify)).append("\n");
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
        openapiFields.add("cf_link_id");
        openapiFields.add("link_id");
        openapiFields.add("link_status");
        openapiFields.add("link_currency");
        openapiFields.add("link_amount");
        openapiFields.add("link_amount_paid");
        openapiFields.add("link_partial_payments");
        openapiFields.add("link_minimum_partial_amount");
        openapiFields.add("link_purpose");
        openapiFields.add("link_created_at");
        openapiFields.add("customer_details");
        openapiFields.add("link_meta");
        openapiFields.add("link_url");
        openapiFields.add("link_expiry_time");
        openapiFields.add("link_notes");
        openapiFields.add("link_auto_reminders");
        openapiFields.add("link_notify");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CFLink
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CFLink.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CFLink is not found in the empty JSON"
                                        + " string",
                                CFLink.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CFLink.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `CFLink`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("link_id") != null && !jsonObj.get("link_id").isJsonNull())
                && !jsonObj.get("link_id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_id` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("link_id").toString()));
        }
        if ((jsonObj.get("link_status") != null && !jsonObj.get("link_status").isJsonNull())
                && !jsonObj.get("link_status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_status` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("link_status").toString()));
        }
        if ((jsonObj.get("link_currency") != null && !jsonObj.get("link_currency").isJsonNull())
                && !jsonObj.get("link_currency").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_currency` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("link_currency").toString()));
        }
        if ((jsonObj.get("link_purpose") != null && !jsonObj.get("link_purpose").isJsonNull())
                && !jsonObj.get("link_purpose").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_purpose` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("link_purpose").toString()));
        }
        if ((jsonObj.get("link_created_at") != null && !jsonObj.get("link_created_at").isJsonNull())
                && !jsonObj.get("link_created_at").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_created_at` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("link_created_at").toString()));
        }
        // validate the optional field `customer_details`
        if (jsonObj.get("customer_details") != null
                && !jsonObj.get("customer_details").isJsonNull()) {
            CFLinkCustomerDetailsEntity.validateJsonObject(
                    jsonObj.getAsJsonObject("customer_details"));
        }
        // validate the optional field `link_meta`
        if (jsonObj.get("link_meta") != null && !jsonObj.get("link_meta").isJsonNull()) {
            CFLinkMetaEntity.validateJsonObject(jsonObj.getAsJsonObject("link_meta"));
        }
        if ((jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonNull())
                && !jsonObj.get("link_url").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_url` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("link_url").toString()));
        }
        if ((jsonObj.get("link_expiry_time") != null
                        && !jsonObj.get("link_expiry_time").isJsonNull())
                && !jsonObj.get("link_expiry_time").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `link_expiry_time` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("link_expiry_time").toString()));
        }
        // validate the optional field `link_notify`
        if (jsonObj.get("link_notify") != null && !jsonObj.get("link_notify").isJsonNull()) {
            CFLinkNotifyEntity.validateJsonObject(jsonObj.getAsJsonObject("link_notify"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CFLink.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CFLink' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CFLink> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CFLink.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CFLink>() {
                        @Override
                        public void write(JsonWriter out, CFLink value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CFLink read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CFLink given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CFLink
     * @throws IOException if the JSON string is invalid with respect to CFLink
     */
    public static CFLink fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CFLink.class);
    }

    /**
     * Convert an instance of CFLink to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
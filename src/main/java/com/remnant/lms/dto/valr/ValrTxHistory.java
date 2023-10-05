
package com.remnant.lms.dto.valr;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "transactionType",
    "creditCurrency",
    "creditValue",
    "eventAt",
    "additionalInfo",
    "id"
})
public class ValrTxHistory {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    private TransactionType transactionType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCurrency")
    private String creditCurrency;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditValue")
    private String creditValue;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventAt")
    private Date eventAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transactionType")
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCurrency")
    public String getCreditCurrency() {
        return creditCurrency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditCurrency")
    public void setCreditCurrency(String creditCurrency) {
        this.creditCurrency = creditCurrency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditValue")
    public String getCreditValue() {
        return creditValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("creditValue")
    public void setCreditValue(String creditValue) {
        this.creditValue = creditValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventAt")
    public Date getEventAt() {
        return eventAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventAt")
    public void setEventAt(Date eventAt) {
        this.eventAt = eventAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValrTxHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("transactionType");
        sb.append('=');
        sb.append(((this.transactionType == null)?"<null>":this.transactionType));
        sb.append(',');
        sb.append("creditCurrency");
        sb.append('=');
        sb.append(((this.creditCurrency == null)?"<null>":this.creditCurrency));
        sb.append(',');
        sb.append("creditValue");
        sb.append('=');
        sb.append(((this.creditValue == null)?"<null>":this.creditValue));
        sb.append(',');
        sb.append("eventAt");
        sb.append('=');
        sb.append(((this.eventAt == null)?"<null>":this.eventAt));
        sb.append(',');
        sb.append("additionalInfo");
        sb.append('=');
        sb.append(((this.additionalInfo == null)?"<null>":this.additionalInfo));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.transactionType == null)? 0 :this.transactionType.hashCode()));
        result = ((result* 31)+((this.additionalInfo == null)? 0 :this.additionalInfo.hashCode()));
        result = ((result* 31)+((this.eventAt == null)? 0 :this.eventAt.hashCode()));
        result = ((result* 31)+((this.creditCurrency == null)? 0 :this.creditCurrency.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.creditValue == null)? 0 :this.creditValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValrTxHistory) == false) {
            return false;
        }
        ValrTxHistory rhs = ((ValrTxHistory) other);
        return ((((((((this.transactionType == rhs.transactionType)||((this.transactionType!= null)&&this.transactionType.equals(rhs.transactionType)))&&((this.additionalInfo == rhs.additionalInfo)||((this.additionalInfo!= null)&&this.additionalInfo.equals(rhs.additionalInfo))))&&((this.eventAt == rhs.eventAt)||((this.eventAt!= null)&&this.eventAt.equals(rhs.eventAt))))&&((this.creditCurrency == rhs.creditCurrency)||((this.creditCurrency!= null)&&this.creditCurrency.equals(rhs.creditCurrency))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.creditValue == rhs.creditValue)||((this.creditValue!= null)&&this.creditValue.equals(rhs.creditValue))));
    }

}

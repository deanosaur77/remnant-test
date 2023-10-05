
package com.remnant.lms.dto.valr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fromId",
    "toId",
    "currencyCode",
    "amount"
})
public class ValrAccountTransfer {

    /**
     * The sender's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("fromId")
    @JsonPropertyDescription("The sender's ID as a string of 18 digits.")
    private String fromId;
    /**
     * The recipient's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("toId")
    @JsonPropertyDescription("The recipient's ID as a string of 18 digits.")
    private String toId;
    /**
     * The currency code as a three-letter string.
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    @JsonPropertyDescription("The currency code as a three-letter string.")
    private String currencyCode;
    /**
     * The amount as a string representing a positive number with up to two decimal places.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The amount as a string representing a positive number with up to two decimal places.")
    private String amount;

    /**
     * The sender's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("fromId")
    public String getFromId() {
        return fromId;
    }

    /**
     * The sender's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("fromId")
    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    /**
     * The recipient's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("toId")
    public String getToId() {
        return toId;
    }

    /**
     * The recipient's ID as a string of 18 digits.
     * (Required)
     * 
     */
    @JsonProperty("toId")
    public void setToId(String toId) {
        this.toId = toId;
    }

    /**
     * The currency code as a three-letter string.
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * The currency code as a three-letter string.
     * (Required)
     * 
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * The amount as a string representing a positive number with up to two decimal places.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * The amount as a string representing a positive number with up to two decimal places.
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValrAccountTransfer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fromId");
        sb.append('=');
        sb.append(((this.fromId == null)?"<null>":this.fromId));
        sb.append(',');
        sb.append("toId");
        sb.append('=');
        sb.append(((this.toId == null)?"<null>":this.toId));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
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
        result = ((result* 31)+((this.toId == null)? 0 :this.toId.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.fromId == null)? 0 :this.fromId.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValrAccountTransfer) == false) {
            return false;
        }
        ValrAccountTransfer rhs = ((ValrAccountTransfer) other);
        return (((((this.toId == rhs.toId)||((this.toId!= null)&&this.toId.equals(rhs.toId)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.fromId == rhs.fromId)||((this.fromId!= null)&&this.fromId.equals(rhs.fromId))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }

}

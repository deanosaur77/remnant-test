
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
    "currency",
    "available",
    "reserved",
    "total",
    "updatedAt",
    "lendReserved",
    "borrowReserved",
    "borrowedAmount"
})
public class Balance {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    private String available;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reserved")
    private String reserved;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total")
    private String total;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    private Date updatedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lendReserved")
    private String lendReserved;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowReserved")
    private String borrowReserved;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowedAmount")
    private String borrowedAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    public String getAvailable() {
        return available;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("available")
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reserved")
    public String getReserved() {
        return reserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reserved")
    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total")
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lendReserved")
    public String getLendReserved() {
        return lendReserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("lendReserved")
    public void setLendReserved(String lendReserved) {
        this.lendReserved = lendReserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowReserved")
    public String getBorrowReserved() {
        return borrowReserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowReserved")
    public void setBorrowReserved(String borrowReserved) {
        this.borrowReserved = borrowReserved;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowedAmount")
    public String getBorrowedAmount() {
        return borrowedAmount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("borrowedAmount")
    public void setBorrowedAmount(String borrowedAmount) {
        this.borrowedAmount = borrowedAmount;
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
        sb.append(Balance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("available");
        sb.append('=');
        sb.append(((this.available == null)?"<null>":this.available));
        sb.append(',');
        sb.append("reserved");
        sb.append('=');
        sb.append(((this.reserved == null)?"<null>":this.reserved));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("lendReserved");
        sb.append('=');
        sb.append(((this.lendReserved == null)?"<null>":this.lendReserved));
        sb.append(',');
        sb.append("borrowReserved");
        sb.append('=');
        sb.append(((this.borrowReserved == null)?"<null>":this.borrowReserved));
        sb.append(',');
        sb.append("borrowedAmount");
        sb.append('=');
        sb.append(((this.borrowedAmount == null)?"<null>":this.borrowedAmount));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.borrowReserved == null)? 0 :this.borrowReserved.hashCode()));
        result = ((result* 31)+((this.reserved == null)? 0 :this.reserved.hashCode()));
        result = ((result* 31)+((this.available == null)? 0 :this.available.hashCode()));
        result = ((result* 31)+((this.lendReserved == null)? 0 :this.lendReserved.hashCode()));
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        result = ((result* 31)+((this.borrowedAmount == null)? 0 :this.borrowedAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Balance) == false) {
            return false;
        }
        Balance rhs = ((Balance) other);
        return ((((((((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.borrowReserved == rhs.borrowReserved)||((this.borrowReserved!= null)&&this.borrowReserved.equals(rhs.borrowReserved))))&&((this.reserved == rhs.reserved)||((this.reserved!= null)&&this.reserved.equals(rhs.reserved))))&&((this.available == rhs.available)||((this.available!= null)&&this.available.equals(rhs.available))))&&((this.lendReserved == rhs.lendReserved)||((this.lendReserved!= null)&&this.lendReserved.equals(rhs.lendReserved))))&&((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency))))&&((this.borrowedAmount == rhs.borrowedAmount)||((this.borrowedAmount!= null)&&this.borrowedAmount.equals(rhs.borrowedAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}

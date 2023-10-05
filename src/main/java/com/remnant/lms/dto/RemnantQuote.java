
package com.remnant.lms.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "btc_address",
    "base_repayment_amount",
    "scheduleDetails"
})
public class RemnantQuote {

    @JsonProperty("btc_address")
    private String btcAddress;
    @JsonProperty("base_repayment_amount")
    private Double baseRepaymentAmount;
    @JsonProperty("scheduleDetails")
    private List<ScheduleDetail> scheduleDetails = new ArrayList<ScheduleDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("btc_address")
    public String getBtcAddress() {
        return btcAddress;
    }

    @JsonProperty("btc_address")
    public void setBtcAddress(String btcAddress) {
        this.btcAddress = btcAddress;
    }

    @JsonProperty("base_repayment_amount")
    public Double getBaseRepaymentAmount() {
        return baseRepaymentAmount;
    }

    @JsonProperty("base_repayment_amount")
    public void setBaseRepaymentAmount(Double baseRepaymentAmount) {
        this.baseRepaymentAmount = baseRepaymentAmount;
    }

    @JsonProperty("scheduleDetails")
    public List<ScheduleDetail> getScheduleDetails() {
        return scheduleDetails;
    }

    @JsonProperty("scheduleDetails")
    public void setScheduleDetails(List<ScheduleDetail> scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
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
        sb.append(RemnantQuote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("btcAddress");
        sb.append('=');
        sb.append(((this.btcAddress == null)?"<null>":this.btcAddress));
        sb.append(',');
        sb.append("baseRepaymentAmount");
        sb.append('=');
        sb.append(((this.baseRepaymentAmount == null)?"<null>":this.baseRepaymentAmount));
        sb.append(',');
        sb.append("scheduleDetails");
        sb.append('=');
        sb.append(((this.scheduleDetails == null)?"<null>":this.scheduleDetails));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.baseRepaymentAmount == null)? 0 :this.baseRepaymentAmount.hashCode()));
        result = ((result* 31)+((this.btcAddress == null)? 0 :this.btcAddress.hashCode()));
        result = ((result* 31)+((this.scheduleDetails == null)? 0 :this.scheduleDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemnantQuote) == false) {
            return false;
        }
        RemnantQuote rhs = ((RemnantQuote) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.baseRepaymentAmount == rhs.baseRepaymentAmount)||((this.baseRepaymentAmount!= null)&&this.baseRepaymentAmount.equals(rhs.baseRepaymentAmount))))&&((this.btcAddress == rhs.btcAddress)||((this.btcAddress!= null)&&this.btcAddress.equals(rhs.btcAddress))))&&((this.scheduleDetails == rhs.scheduleDetails)||((this.scheduleDetails!= null)&&this.scheduleDetails.equals(rhs.scheduleDetails))));
    }

}

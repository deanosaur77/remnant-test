
package com.remnant.lms.dto.valr;

import java.util.ArrayList;
import java.util.Date;
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
    "Asks",
    "Bids",
    "LastChange",
    "SequenceNumber"
})
public class ValrOrderbook {

    @JsonProperty("Asks")
    private List<Ask> asks = new ArrayList<Ask>();
    @JsonProperty("Bids")
    private List<Bid> bids = new ArrayList<Bid>();
    @JsonProperty("LastChange")
    private Date lastChange;
    @JsonProperty("SequenceNumber")
    private Integer sequenceNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Asks")
    public List<Ask> getAsks() {
        return asks;
    }

    @JsonProperty("Asks")
    public void setAsks(List<Ask> asks) {
        this.asks = asks;
    }

    @JsonProperty("Bids")
    public List<Bid> getBids() {
        return bids;
    }

    @JsonProperty("Bids")
    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    @JsonProperty("LastChange")
    public Date getLastChange() {
        return lastChange;
    }

    @JsonProperty("LastChange")
    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;
    }

    @JsonProperty("SequenceNumber")
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("SequenceNumber")
    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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
        sb.append(ValrOrderbook.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("asks");
        sb.append('=');
        sb.append(((this.asks == null)?"<null>":this.asks));
        sb.append(',');
        sb.append("bids");
        sb.append('=');
        sb.append(((this.bids == null)?"<null>":this.bids));
        sb.append(',');
        sb.append("lastChange");
        sb.append('=');
        sb.append(((this.lastChange == null)?"<null>":this.lastChange));
        sb.append(',');
        sb.append("sequenceNumber");
        sb.append('=');
        sb.append(((this.sequenceNumber == null)?"<null>":this.sequenceNumber));
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
        result = ((result* 31)+((this.bids == null)? 0 :this.bids.hashCode()));
        result = ((result* 31)+((this.lastChange == null)? 0 :this.lastChange.hashCode()));
        result = ((result* 31)+((this.sequenceNumber == null)? 0 :this.sequenceNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.asks == null)? 0 :this.asks.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValrOrderbook) == false) {
            return false;
        }
        ValrOrderbook rhs = ((ValrOrderbook) other);
        return ((((((this.bids == rhs.bids)||((this.bids!= null)&&this.bids.equals(rhs.bids)))&&((this.lastChange == rhs.lastChange)||((this.lastChange!= null)&&this.lastChange.equals(rhs.lastChange))))&&((this.sequenceNumber == rhs.sequenceNumber)||((this.sequenceNumber!= null)&&this.sequenceNumber.equals(rhs.sequenceNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.asks == rhs.asks)||((this.asks!= null)&&this.asks.equals(rhs.asks))));
    }

}

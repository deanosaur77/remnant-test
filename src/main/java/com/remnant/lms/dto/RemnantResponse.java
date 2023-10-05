
package com.remnant.lms.dto;

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
    "message",
    "error",
    "btcAddress",
    "subAccountId"
})
public class RemnantResponse {

    @JsonProperty("message")
    private String message;
    @JsonProperty("error")
    private String error;
    @JsonProperty("btcAddress")
    private String btcAddress;
    @JsonProperty("subAccountId")
    private String subAccountId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    @JsonProperty("btcAddress")
    public String getBtcAddress() {
        return btcAddress;
    }

    @JsonProperty("btcAddress")
    public void setBtcAddress(String btcAddress) {
        this.btcAddress = btcAddress;
    }

    @JsonProperty("subAccountId")
    public String getSubAccountId() {
        return subAccountId;
    }

    @JsonProperty("subAccountId")
    public void setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
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
        sb.append(RemnantResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("btcAddress");
        sb.append('=');
        sb.append(((this.btcAddress == null)?"<null>":this.btcAddress));
        sb.append(',');
        sb.append("subAccountId");
        sb.append('=');
        sb.append(((this.subAccountId == null)?"<null>":this.subAccountId));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.subAccountId == null)? 0 :this.subAccountId.hashCode()));
        result = ((result* 31)+((this.btcAddress == null)? 0 :this.btcAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemnantResponse) == false) {
            return false;
        }
        RemnantResponse rhs = ((RemnantResponse) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.subAccountId == rhs.subAccountId)||((this.subAccountId!= null)&&this.subAccountId.equals(rhs.subAccountId))))&&((this.btcAddress == rhs.btcAddress)||((this.btcAddress!= null)&&this.btcAddress.equals(rhs.btcAddress))));
    }

}


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
    "clientDetails",
    "applicationDetails",
    "addressDetails"
})
public class RemnantRequest {

    @JsonProperty("clientDetails")
    private ClientDetails clientDetails;
    @JsonProperty("applicationDetails")
    private ApplicationDetails applicationDetails;
    @JsonProperty("addressDetails")
    private AddressDetails addressDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("clientDetails")
    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    @JsonProperty("clientDetails")
    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;
    }

    @JsonProperty("applicationDetails")
    public ApplicationDetails getApplicationDetails() {
        return applicationDetails;
    }

    @JsonProperty("applicationDetails")
    public void setApplicationDetails(ApplicationDetails applicationDetails) {
        this.applicationDetails = applicationDetails;
    }

    @JsonProperty("addressDetails")
    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    @JsonProperty("addressDetails")
    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
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
        sb.append(RemnantRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientDetails");
        sb.append('=');
        sb.append(((this.clientDetails == null)?"<null>":this.clientDetails));
        sb.append(',');
        sb.append("applicationDetails");
        sb.append('=');
        sb.append(((this.applicationDetails == null)?"<null>":this.applicationDetails));
        sb.append(',');
        sb.append("addressDetails");
        sb.append('=');
        sb.append(((this.addressDetails == null)?"<null>":this.addressDetails));
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
        result = ((result* 31)+((this.applicationDetails == null)? 0 :this.applicationDetails.hashCode()));
        result = ((result* 31)+((this.clientDetails == null)? 0 :this.clientDetails.hashCode()));
        result = ((result* 31)+((this.addressDetails == null)? 0 :this.addressDetails.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemnantRequest) == false) {
            return false;
        }
        RemnantRequest rhs = ((RemnantRequest) other);
        return (((((this.applicationDetails == rhs.applicationDetails)||((this.applicationDetails!= null)&&this.applicationDetails.equals(rhs.applicationDetails)))&&((this.clientDetails == rhs.clientDetails)||((this.clientDetails!= null)&&this.clientDetails.equals(rhs.clientDetails))))&&((this.addressDetails == rhs.addressDetails)||((this.addressDetails!= null)&&this.addressDetails.equals(rhs.addressDetails))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}

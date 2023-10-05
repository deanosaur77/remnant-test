
package com.remnant.lms.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "suburb",
    "street",
    "city",
    "province"
})
public class AddressDetails {

    /**
     * Suburb of the applicant's address
     * 
     */
    @JsonProperty("suburb")
    @JsonPropertyDescription("Suburb of the applicant's address")
    private String suburb;
    /**
     * Street name of the applicant's address
     * 
     */
    @JsonProperty("street")
    @JsonPropertyDescription("Street name of the applicant's address")
    private String street;
    /**
     * City of the applicant's address
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City of the applicant's address")
    private String city;
    /**
     * Province of the applicant's address
     * 
     */
    @JsonProperty("province")
    @JsonPropertyDescription("Province of the applicant's address")
    private String province;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Suburb of the applicant's address
     * 
     */
    @JsonProperty("suburb")
    public String getSuburb() {
        return suburb;
    }

    /**
     * Suburb of the applicant's address
     * 
     */
    @JsonProperty("suburb")
    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    /**
     * Street name of the applicant's address
     * 
     */
    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    /**
     * Street name of the applicant's address
     * 
     */
    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * City of the applicant's address
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City of the applicant's address
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Province of the applicant's address
     * 
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * Province of the applicant's address
     * 
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
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
        sb.append(AddressDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("suburb");
        sb.append('=');
        sb.append(((this.suburb == null)?"<null>":this.suburb));
        sb.append(',');
        sb.append("street");
        sb.append('=');
        sb.append(((this.street == null)?"<null>":this.street));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("province");
        sb.append('=');
        sb.append(((this.province == null)?"<null>":this.province));
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
        result = ((result* 31)+((this.suburb == null)? 0 :this.suburb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.province == null)? 0 :this.province.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        result = ((result* 31)+((this.street == null)? 0 :this.street.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddressDetails) == false) {
            return false;
        }
        AddressDetails rhs = ((AddressDetails) other);
        return ((((((this.suburb == rhs.suburb)||((this.suburb!= null)&&this.suburb.equals(rhs.suburb)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.province == rhs.province)||((this.province!= null)&&this.province.equals(rhs.province))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))))&&((this.street == rhs.street)||((this.street!= null)&&this.street.equals(rhs.street))));
    }

}

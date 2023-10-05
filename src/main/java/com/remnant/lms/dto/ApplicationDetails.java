
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
    "term",
    "credit_limit",
    "btc_price",
    "btc_collateral"
})
public class ApplicationDetails {

    /**
     * The term of the application
     * 
     */
    @JsonProperty("term")
    @JsonPropertyDescription("The term of the application")
    private String term;
    /**
     * The credit limit applied for
     * 
     */
    @JsonProperty("credit_limit")
    @JsonPropertyDescription("The credit limit applied for")
    private String creditLimit;
    /**
     * The price of BTC at the time of application
     * 
     */
    @JsonProperty("btc_price")
    @JsonPropertyDescription("The price of BTC at the time of application")
    private Double btcPrice;
    /**
     * The amount of BTC offered as collateral at the time of application
     * 
     */
    @JsonProperty("btc_collateral")
    @JsonPropertyDescription("The amount of BTC offered as collateral at the time of application")
    private Double btcCollateral;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The term of the application
     * 
     */
    @JsonProperty("term")
    public String getTerm() {
        return term;
    }

    /**
     * The term of the application
     * 
     */
    @JsonProperty("term")
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * The credit limit applied for
     * 
     */
    @JsonProperty("credit_limit")
    public String getCreditLimit() {
        return creditLimit;
    }

    /**
     * The credit limit applied for
     * 
     */
    @JsonProperty("credit_limit")
    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * The price of BTC at the time of application
     * 
     */
    @JsonProperty("btc_price")
    public Double getBtcPrice() {
        return btcPrice;
    }

    /**
     * The price of BTC at the time of application
     * 
     */
    @JsonProperty("btc_price")
    public void setBtcPrice(Double btcPrice) {
        this.btcPrice = btcPrice;
    }

    /**
     * The amount of BTC offered as collateral at the time of application
     * 
     */
    @JsonProperty("btc_collateral")
    public Double getBtcCollateral() {
        return btcCollateral;
    }

    /**
     * The amount of BTC offered as collateral at the time of application
     * 
     */
    @JsonProperty("btc_collateral")
    public void setBtcCollateral(Double btcCollateral) {
        this.btcCollateral = btcCollateral;
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
        sb.append(ApplicationDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("term");
        sb.append('=');
        sb.append(((this.term == null)?"<null>":this.term));
        sb.append(',');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null)?"<null>":this.creditLimit));
        sb.append(',');
        sb.append("btcPrice");
        sb.append('=');
        sb.append(((this.btcPrice == null)?"<null>":this.btcPrice));
        sb.append(',');
        sb.append("btcCollateral");
        sb.append('=');
        sb.append(((this.btcCollateral == null)?"<null>":this.btcCollateral));
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
        result = ((result* 31)+((this.creditLimit == null)? 0 :this.creditLimit.hashCode()));
        result = ((result* 31)+((this.term == null)? 0 :this.term.hashCode()));
        result = ((result* 31)+((this.btcPrice == null)? 0 :this.btcPrice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.btcCollateral == null)? 0 :this.btcCollateral.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationDetails) == false) {
            return false;
        }
        ApplicationDetails rhs = ((ApplicationDetails) other);
        return ((((((this.creditLimit == rhs.creditLimit)||((this.creditLimit!= null)&&this.creditLimit.equals(rhs.creditLimit)))&&((this.term == rhs.term)||((this.term!= null)&&this.term.equals(rhs.term))))&&((this.btcPrice == rhs.btcPrice)||((this.btcPrice!= null)&&this.btcPrice.equals(rhs.btcPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.btcCollateral == rhs.btcCollateral)||((this.btcCollateral!= null)&&this.btcCollateral.equals(rhs.btcCollateral))));
    }

}

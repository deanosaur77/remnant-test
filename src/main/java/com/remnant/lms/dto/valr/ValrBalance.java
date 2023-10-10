
package com.remnant.lms.dto.valr;

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
    "account",
    "balances"
})
public class ValrBalance {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account")
    private Account account;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("balances")
    private List<Balance> balances = new ArrayList<Balance>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account")
    public Account getAccount() {
        return account;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("account")
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("balances")
    public List<Balance> getBalances() {
        return balances;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("balances")
    public void setBalances(List<Balance> balances) {
        this.balances = balances;
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
        sb.append(ValrBalance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
        sb.append(',');
        sb.append("balances");
        sb.append('=');
        sb.append(((this.balances == null)?"<null>":this.balances));
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
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.balances == null)? 0 :this.balances.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValrBalance) == false) {
            return false;
        }
        ValrBalance rhs = ((ValrBalance) other);
        return ((((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account)))&&((this.balances == rhs.balances)||((this.balances!= null)&&this.balances.equals(rhs.balances))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}


package com.remnant.lms.dto.valr;

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
    "side",
    "quantity",
    "price",
    "currencyPair",
    "orderCount"
})
public class Bid {

    @JsonProperty("side")
    private String side;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("price")
    private String price;
    @JsonProperty("currencyPair")
    private String currencyPair;
    @JsonProperty("orderCount")
    private Integer orderCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("side")
    public String getSide() {
        return side;
    }

    @JsonProperty("side")
    public void setSide(String side) {
        this.side = side;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("currencyPair")
    public String getCurrencyPair() {
        return currencyPair;
    }

    @JsonProperty("currencyPair")
    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    @JsonProperty("orderCount")
    public Integer getOrderCount() {
        return orderCount;
    }

    @JsonProperty("orderCount")
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
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
        sb.append(Bid.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("currencyPair");
        sb.append('=');
        sb.append(((this.currencyPair == null)?"<null>":this.currencyPair));
        sb.append(',');
        sb.append("orderCount");
        sb.append('=');
        sb.append(((this.orderCount == null)?"<null>":this.orderCount));
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
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.currencyPair == null)? 0 :this.currencyPair.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.orderCount == null)? 0 :this.orderCount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bid) == false) {
            return false;
        }
        Bid rhs = ((Bid) other);
        return (((((((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side)))&&((this.currencyPair == rhs.currencyPair)||((this.currencyPair!= null)&&this.currencyPair.equals(rhs.currencyPair))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.orderCount == rhs.orderCount)||((this.orderCount!= null)&&this.orderCount.equals(rhs.orderCount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}


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
    "currencyPair",
    "askPrice",
    "bidPrice",
    "lastTradedPrice",
    "previousClosePrice",
    "baseVolume",
    "quoteVolume",
    "highPrice",
    "lowPrice",
    "created",
    "changeFromPrevious",
    "markPrice"
})
public class ValrMarketSummary {

    @JsonProperty("currencyPair")
    private String currencyPair;
    @JsonProperty("askPrice")
    private String askPrice;
    @JsonProperty("bidPrice")
    private String bidPrice;
    @JsonProperty("lastTradedPrice")
    private String lastTradedPrice;
    @JsonProperty("previousClosePrice")
    private String previousClosePrice;
    @JsonProperty("baseVolume")
    private String baseVolume;
    @JsonProperty("quoteVolume")
    private String quoteVolume;
    @JsonProperty("highPrice")
    private String highPrice;
    @JsonProperty("lowPrice")
    private String lowPrice;
    @JsonProperty("created")
    private Date created;
    @JsonProperty("changeFromPrevious")
    private String changeFromPrevious;
    @JsonProperty("markPrice")
    private String markPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currencyPair")
    public String getCurrencyPair() {
        return currencyPair;
    }

    @JsonProperty("currencyPair")
    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    @JsonProperty("askPrice")
    public String getAskPrice() {
        return askPrice;
    }

    @JsonProperty("askPrice")
    public void setAskPrice(String askPrice) {
        this.askPrice = askPrice;
    }

    @JsonProperty("bidPrice")
    public String getBidPrice() {
        return bidPrice;
    }

    @JsonProperty("bidPrice")
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    @JsonProperty("lastTradedPrice")
    public String getLastTradedPrice() {
        return lastTradedPrice;
    }

    @JsonProperty("lastTradedPrice")
    public void setLastTradedPrice(String lastTradedPrice) {
        this.lastTradedPrice = lastTradedPrice;
    }

    @JsonProperty("previousClosePrice")
    public String getPreviousClosePrice() {
        return previousClosePrice;
    }

    @JsonProperty("previousClosePrice")
    public void setPreviousClosePrice(String previousClosePrice) {
        this.previousClosePrice = previousClosePrice;
    }

    @JsonProperty("baseVolume")
    public String getBaseVolume() {
        return baseVolume;
    }

    @JsonProperty("baseVolume")
    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("quoteVolume")
    public String getQuoteVolume() {
        return quoteVolume;
    }

    @JsonProperty("quoteVolume")
    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    @JsonProperty("highPrice")
    public String getHighPrice() {
        return highPrice;
    }

    @JsonProperty("highPrice")
    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    @JsonProperty("lowPrice")
    public String getLowPrice() {
        return lowPrice;
    }

    @JsonProperty("lowPrice")
    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    @JsonProperty("created")
    public Date getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Date created) {
        this.created = created;
    }

    @JsonProperty("changeFromPrevious")
    public String getChangeFromPrevious() {
        return changeFromPrevious;
    }

    @JsonProperty("changeFromPrevious")
    public void setChangeFromPrevious(String changeFromPrevious) {
        this.changeFromPrevious = changeFromPrevious;
    }

    @JsonProperty("markPrice")
    public String getMarkPrice() {
        return markPrice;
    }

    @JsonProperty("markPrice")
    public void setMarkPrice(String markPrice) {
        this.markPrice = markPrice;
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
        sb.append(ValrMarketSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currencyPair");
        sb.append('=');
        sb.append(((this.currencyPair == null)?"<null>":this.currencyPair));
        sb.append(',');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
        sb.append(',');
        sb.append("lastTradedPrice");
        sb.append('=');
        sb.append(((this.lastTradedPrice == null)?"<null>":this.lastTradedPrice));
        sb.append(',');
        sb.append("previousClosePrice");
        sb.append('=');
        sb.append(((this.previousClosePrice == null)?"<null>":this.previousClosePrice));
        sb.append(',');
        sb.append("baseVolume");
        sb.append('=');
        sb.append(((this.baseVolume == null)?"<null>":this.baseVolume));
        sb.append(',');
        sb.append("quoteVolume");
        sb.append('=');
        sb.append(((this.quoteVolume == null)?"<null>":this.quoteVolume));
        sb.append(',');
        sb.append("highPrice");
        sb.append('=');
        sb.append(((this.highPrice == null)?"<null>":this.highPrice));
        sb.append(',');
        sb.append("lowPrice");
        sb.append('=');
        sb.append(((this.lowPrice == null)?"<null>":this.lowPrice));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("changeFromPrevious");
        sb.append('=');
        sb.append(((this.changeFromPrevious == null)?"<null>":this.changeFromPrevious));
        sb.append(',');
        sb.append("markPrice");
        sb.append('=');
        sb.append(((this.markPrice == null)?"<null>":this.markPrice));
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
        result = ((result* 31)+((this.askPrice == null)? 0 :this.askPrice.hashCode()));
        result = ((result* 31)+((this.currencyPair == null)? 0 :this.currencyPair.hashCode()));
        result = ((result* 31)+((this.created == null)? 0 :this.created.hashCode()));
        result = ((result* 31)+((this.changeFromPrevious == null)? 0 :this.changeFromPrevious.hashCode()));
        result = ((result* 31)+((this.quoteVolume == null)? 0 :this.quoteVolume.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.previousClosePrice == null)? 0 :this.previousClosePrice.hashCode()));
        result = ((result* 31)+((this.markPrice == null)? 0 :this.markPrice.hashCode()));
        result = ((result* 31)+((this.lowPrice == null)? 0 :this.lowPrice.hashCode()));
        result = ((result* 31)+((this.highPrice == null)? 0 :this.highPrice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.baseVolume == null)? 0 :this.baseVolume.hashCode()));
        result = ((result* 31)+((this.lastTradedPrice == null)? 0 :this.lastTradedPrice.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValrMarketSummary) == false) {
            return false;
        }
        ValrMarketSummary rhs = ((ValrMarketSummary) other);
        return ((((((((((((((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice)))&&((this.currencyPair == rhs.currencyPair)||((this.currencyPair!= null)&&this.currencyPair.equals(rhs.currencyPair))))&&((this.created == rhs.created)||((this.created!= null)&&this.created.equals(rhs.created))))&&((this.changeFromPrevious == rhs.changeFromPrevious)||((this.changeFromPrevious!= null)&&this.changeFromPrevious.equals(rhs.changeFromPrevious))))&&((this.quoteVolume == rhs.quoteVolume)||((this.quoteVolume!= null)&&this.quoteVolume.equals(rhs.quoteVolume))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.previousClosePrice == rhs.previousClosePrice)||((this.previousClosePrice!= null)&&this.previousClosePrice.equals(rhs.previousClosePrice))))&&((this.markPrice == rhs.markPrice)||((this.markPrice!= null)&&this.markPrice.equals(rhs.markPrice))))&&((this.lowPrice == rhs.lowPrice)||((this.lowPrice!= null)&&this.lowPrice.equals(rhs.lowPrice))))&&((this.highPrice == rhs.highPrice)||((this.highPrice!= null)&&this.highPrice.equals(rhs.highPrice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.baseVolume == rhs.baseVolume)||((this.baseVolume!= null)&&this.baseVolume.equals(rhs.baseVolume))))&&((this.lastTradedPrice == rhs.lastTradedPrice)||((this.lastTradedPrice!= null)&&this.lastTradedPrice.equals(rhs.lastTradedPrice))));
    }

}

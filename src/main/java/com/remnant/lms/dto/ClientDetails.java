
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
    "first_name",
    "last_name",
    "id_number",
    "marital_status",
    "income",
    "source_of_income",
    "email",
    "mobile_number"
})
public class ClientDetails {

    /**
     * First name of the applicant
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name of the applicant")
    private String firstName;
    /**
     * Last name of the applicant
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name of the applicant")
    private String lastName;
    /**
     * ID number of the applicant
     * 
     */
    @JsonProperty("id_number")
    @JsonPropertyDescription("ID number of the applicant")
    private String idNumber;
    /**
     * Marital status of the applicant
     * 
     */
    @JsonProperty("marital_status")
    @JsonPropertyDescription("Marital status of the applicant")
    private String maritalStatus;
    /**
     * Income of the applicant
     * 
     */
    @JsonProperty("income")
    @JsonPropertyDescription("Income of the applicant")
    private Double income;
    /**
     * Source of income for the applicant
     * 
     */
    @JsonProperty("source_of_income")
    @JsonPropertyDescription("Source of income for the applicant")
    private String sourceOfIncome;
    /**
     * Email address of the applicant
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("Email address of the applicant")
    private String email;
    /**
     * Mobile number of the applicant
     * 
     */
    @JsonProperty("mobile_number")
    @JsonPropertyDescription("Mobile number of the applicant")
    private String mobileNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First name of the applicant
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name of the applicant
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name of the applicant
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name of the applicant
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * ID number of the applicant
     * 
     */
    @JsonProperty("id_number")
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * ID number of the applicant
     * 
     */
    @JsonProperty("id_number")
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Marital status of the applicant
     * 
     */
    @JsonProperty("marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Marital status of the applicant
     * 
     */
    @JsonProperty("marital_status")
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * Income of the applicant
     * 
     */
    @JsonProperty("income")
    public Double getIncome() {
        return income;
    }

    /**
     * Income of the applicant
     * 
     */
    @JsonProperty("income")
    public void setIncome(Double income) {
        this.income = income;
    }

    /**
     * Source of income for the applicant
     * 
     */
    @JsonProperty("source_of_income")
    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    /**
     * Source of income for the applicant
     * 
     */
    @JsonProperty("source_of_income")
    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    /**
     * Email address of the applicant
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email address of the applicant
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Mobile number of the applicant
     * 
     */
    @JsonProperty("mobile_number")
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Mobile number of the applicant
     * 
     */
    @JsonProperty("mobile_number")
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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
        sb.append(ClientDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("idNumber");
        sb.append('=');
        sb.append(((this.idNumber == null)?"<null>":this.idNumber));
        sb.append(',');
        sb.append("maritalStatus");
        sb.append('=');
        sb.append(((this.maritalStatus == null)?"<null>":this.maritalStatus));
        sb.append(',');
        sb.append("income");
        sb.append('=');
        sb.append(((this.income == null)?"<null>":this.income));
        sb.append(',');
        sb.append("sourceOfIncome");
        sb.append('=');
        sb.append(((this.sourceOfIncome == null)?"<null>":this.sourceOfIncome));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("mobileNumber");
        sb.append('=');
        sb.append(((this.mobileNumber == null)?"<null>":this.mobileNumber));
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
        result = ((result* 31)+((this.income == null)? 0 :this.income.hashCode()));
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.mobileNumber == null)? 0 :this.mobileNumber.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idNumber == null)? 0 :this.idNumber.hashCode()));
        result = ((result* 31)+((this.sourceOfIncome == null)? 0 :this.sourceOfIncome.hashCode()));
        result = ((result* 31)+((this.maritalStatus == null)? 0 :this.maritalStatus.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientDetails) == false) {
            return false;
        }
        ClientDetails rhs = ((ClientDetails) other);
        return ((((((((((this.income == rhs.income)||((this.income!= null)&&this.income.equals(rhs.income)))&&((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName))))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.mobileNumber == rhs.mobileNumber)||((this.mobileNumber!= null)&&this.mobileNumber.equals(rhs.mobileNumber))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idNumber == rhs.idNumber)||((this.idNumber!= null)&&this.idNumber.equals(rhs.idNumber))))&&((this.sourceOfIncome == rhs.sourceOfIncome)||((this.sourceOfIncome!= null)&&this.sourceOfIncome.equals(rhs.sourceOfIncome))))&&((this.maritalStatus == rhs.maritalStatus)||((this.maritalStatus!= null)&&this.maritalStatus.equals(rhs.maritalStatus))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}

package com.fs.investments.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Investment Request object
 */
@ApiModel(description = "Investment Request object")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-30T16:53:04.569+05:30")

public class InvestmentRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("investmentIn")
  private String investmentIn = null;

  @JsonProperty("investmentType")
  private String investmentType = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("remarks")
  private String remarks = null;

  @JsonProperty("poc")
  private String poc = null;

  @JsonProperty("investmentStartDate")
  private String investmentStartDate = null;

  @JsonProperty("investmentEndDate")
  private String investmentEndDate = null;

  public InvestmentRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * investment Id
   * @return id
  **/
  @ApiModelProperty(value = "investment Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InvestmentRequest investmentIn(String investmentIn) {
    this.investmentIn = investmentIn;
    return this;
  }

  /**
   * investment in
   * @return investmentIn
  **/
  @ApiModelProperty(value = "investment in")


  public String getInvestmentIn() {
    return investmentIn;
  }

  public void setInvestmentIn(String investmentIn) {
    this.investmentIn = investmentIn;
  }

  public InvestmentRequest investmentType(String investmentType) {
    this.investmentType = investmentType;
    return this;
  }

  /**
   * investment Type
   * @return investmentType
  **/
  @ApiModelProperty(value = "investment Type")


  public String getInvestmentType() {
    return investmentType;
  }

  public void setInvestmentType(String investmentType) {
    this.investmentType = investmentType;
  }

  public InvestmentRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * investment amount
   * @return amount
  **/
  @ApiModelProperty(value = "investment amount")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public InvestmentRequest remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * investment remarks
   * @return remarks
  **/
  @ApiModelProperty(value = "investment remarks")


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public InvestmentRequest poc(String poc) {
    this.poc = poc;
    return this;
  }

  /**
   * investment poc
   * @return poc
  **/
  @ApiModelProperty(value = "investment poc")


  public String getPoc() {
    return poc;
  }

  public void setPoc(String poc) {
    this.poc = poc;
  }

  public InvestmentRequest investmentStartDate(String investmentStartDate) {
    this.investmentStartDate = investmentStartDate;
    return this;
  }

  /**
   * investment start date
   * @return investmentStartDate
  **/
  @ApiModelProperty(value = "investment start date")


  public String getInvestmentStartDate() {
    return investmentStartDate;
  }

  public void setInvestmentStartDate(String investmentStartDate) {
    this.investmentStartDate = investmentStartDate;
  }

  public InvestmentRequest investmentEndDate(String investmentEndDate) {
    this.investmentEndDate = investmentEndDate;
    return this;
  }

  /**
   * investment end date
   * @return investmentEndDate
  **/
  @ApiModelProperty(value = "investment end date")


  public String getInvestmentEndDate() {
    return investmentEndDate;
  }

  public void setInvestmentEndDate(String investmentEndDate) {
    this.investmentEndDate = investmentEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentRequest investmentRequest = (InvestmentRequest) o;
    return Objects.equals(this.id, investmentRequest.id) &&
        Objects.equals(this.investmentIn, investmentRequest.investmentIn) &&
        Objects.equals(this.investmentType, investmentRequest.investmentType) &&
        Objects.equals(this.amount, investmentRequest.amount) &&
        Objects.equals(this.remarks, investmentRequest.remarks) &&
        Objects.equals(this.poc, investmentRequest.poc) &&
        Objects.equals(this.investmentStartDate, investmentRequest.investmentStartDate) &&
        Objects.equals(this.investmentEndDate, investmentRequest.investmentEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, investmentIn, investmentType, amount, remarks, poc, investmentStartDate, investmentEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investmentIn: ").append(toIndentedString(investmentIn)).append("\n");
    sb.append("    investmentType: ").append(toIndentedString(investmentType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    poc: ").append(toIndentedString(poc)).append("\n");
    sb.append("    investmentStartDate: ").append(toIndentedString(investmentStartDate)).append("\n");
    sb.append("    investmentEndDate: ").append(toIndentedString(investmentEndDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.fs.investments.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Investment {

	@Id
	private String investmentId;
	
	private String investmentIn;
	
	private String investmentType;
	
	private String amount;
	
	private String remarks;
	
	private String poc;
	
	private String investmentStartDate;
	
	private String investmentEndDate;

	public String getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(String investmentId) {
		this.investmentId = investmentId;
	}

	public String getInvestmentIn() {
		return investmentIn;
	}

	public void setInvestmentIn(String investmentIn) {
		this.investmentIn = investmentIn;
	}

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPoc() {
		return poc;
	}

	public void setPoc(String poc) {
		this.poc = poc;
	}

	public String getInvestmentStartDate() {
		return investmentStartDate;
	}

	public void setInvestmentStartDate(String investmentStartDate) {
		this.investmentStartDate = investmentStartDate;
	}

	public String getInvestmentEndDate() {
		return investmentEndDate;
	}

	public void setInvestmentEndDate(String investmentEndDate) {
		this.investmentEndDate = investmentEndDate;
	}
}

package com.fs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {

	private String firstName;
	private String surName;
	private Date dob;
	private int votes;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public Candidate(String fName, String sName, String dob, int votes) throws ParseException {
		this.firstName = fName;
		this.surName = sName;
		this.dob = formatter.parse(dob);
		this.votes = votes;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}

package com.fs.investments.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fs.investments.model.Investment;


@Repository
public class InvestmentServiceDaoBean {

	@Autowired
	private InvestmentRepository investmentRepository;

	@PostConstruct
	public void init() {
		// createInvestments();
	}

	public void createInvestments() {

		Investment myInvestment = new Investment();
		myInvestment.setInvestmentId("1");
		myInvestment.setInvestmentIn("RR Foundation");
		myInvestment.setInvestmentType("CAPEX");
		myInvestment.setAmount("1700000");

		investmentRepository.insert(myInvestment);
	}

	public List<Investment> retrieveAllInvestments() {

		return investmentRepository.findAll();

	}

	public Investment retrieveInvestment(String investmentId) {

		return investmentRepository.findByInvestmentId(investmentId);

	}

}

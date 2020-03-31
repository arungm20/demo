package com.fs.investments.dao;

import org.springframework.stereotype.Repository;

import com.fs.investments.model.Investment;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface InvestmentRepository extends MongoRepository<Investment, String>{

	Investment findByInvestmentId(String investmentId);
}

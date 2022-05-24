package com.gb.service;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.repo.TransactionRepo;

@Service("transactionService")
public class TransactionsServiceImpl {
	
	@Autowired
	private TransactionRepo trRepo;
	
	public JSONArray getPendingData() {
		JSONArray pendingTransactions = trRepo.getPendingTransactions();
		return pendingTransactions;
	}
	
	public JSONArray getCompletedData() {
		JSONArray completedTransactions = trRepo.getCompletedTransactions();
		return completedTransactions;
	}

}

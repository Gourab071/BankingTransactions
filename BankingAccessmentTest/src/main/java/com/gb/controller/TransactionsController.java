package com.gb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gb.service.TransactionsServiceImpl;

@RestController("transactionController")
public class TransactionsController {

	@Autowired
	private TransactionsServiceImpl trService;

	@GetMapping("/admin/transactions")
	public String getPendingTransactions(@RequestParam String type) {
		if (type.equalsIgnoreCase("pending")) {
			return trService.getPendingData().toString();
		} else if (type.equalsIgnoreCase("settled")) {
			return trService.getCompletedData().toString();
		}
		return trService.getPendingData().toString();

	}

}

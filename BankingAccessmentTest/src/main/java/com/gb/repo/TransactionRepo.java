package com.gb.repo;

import org.json.JSONArray;
import org.springframework.stereotype.Repository;

@Repository("transactionRepo")
public class TransactionRepo {

	public JSONArray getPendingTransactions() {
		String pending_transactions = "[\r\n" + "\r\n"
				+ " {transaction_id: 1, status: 'pending', type: 'credit', epoch: 1652001675, amount: 1200.00, currency: usd, to_account_number: 30221490342, from_account_number: 123456789},\r\n"
				+ "\r\n"
				+ " {transaction_id: 2, status: 'pending', type: 'debit', epoch: 1652001685, amount: 1225.00, currency: gbp, to_account_number: 30221490352, from_account_number: 123456788},\r\n"
				+ "\r\n"
				+ " {transaction_id: 3, status: 'pending', type: 'credit', epoch: 1652001695, amount: 1250.00, currency: gbp, to_account_number: 30221490362, from_account_number: 123456787},\r\n"
				+ "\r\n"
				+ " {transaction_id: 4, status: 'pending', type: 'credit', epoch: 1652001705, amount: 1275.00, currency: usd, to_account_number: 30221490372, from_account_number: 123456786},\r\n"
				+ "\r\n"
				+ " {transaction_id: 5, status: 'pending', type: 'debit', epoch: 1652001715, amount: 1300.00, currency: gbp, to_account_number: 30221490382, from_account_number: 123456785},\r\n"
				+ "\r\n"
				+ " {transaction_id: 6, status: 'pending', type: 'credit', epoch: 1652001725, amount: 1325.00, currency: usd, to_account_number: 30221490392, from_account_number: 123456784},\r\n"
				+ "\r\n"
				+ " {transaction_id: 7, status: 'pending', type: 'debit', epoch: 1652001735, amount: 1350.00, currency: gbp, to_account_number: 30221490402, from_account_number: 123456783},\r\n"
				+ "\r\n"
				+ " {transaction_id: 8, status: 'pending', type: 'credit', epoch: 1652001745, amount: 1375.00, currency: gbp, to_account_number: 30221490412, from_account_number: 123456782},\r\n"
				+ "\r\n"
				+ " {transaction_id: 9, status: 'pending', type: 'credit', epoch: 1652001755, amount: 1400.00, currency: usd, to_account_number: 30221490422, from_account_number: 123456781},\r\n"
				+ "\r\n"
				+ " {transaction_id: 10, status: 'pending', type: 'debit', epoch: 1652001765, amount: 1425.00, currency: gbp, to_account_number: 30221490432, from_account_number: 123456780}\r\n"
				+ "\r\n" + "]";
		JSONArray array = new JSONArray(pending_transactions);
		return array;
	}

	public JSONArray getCompletedTransactions() {
		String completed_transactions = " [\r\n" + "\r\n"
				+ " {transaction_id: 1, status: 'settled', type: 'credit', epoch: 1652001675, amount: 1200.00, currency: usd, to_account_number: 30221490342, from_account_number: 123456789},\r\n"
				+ "\r\n"
				+ " {transaction_id: 2, status: 'declined', type: 'debit', epoch: 1652001685, amount: 1225.00, currency: gbp, to_account_number: 30221490352, from_account_number: 123456788},\r\n"
				+ "\r\n"
				+ " {transaction_id: 3, status: 'reversed', type: 'credit', epoch: 1652001695, amount: 1250.00, currency: gbp, to_account_number: 30221490362, from_account_number: 123456787},\r\n"
				+ "\r\n"
				+ " {transaction_id: 4, status: 'settled', type: 'credit', epoch: 1652001705, amount: 1275.00, currency: usd, to_account_number: 30221490372, from_account_number: 123456786},\r\n"
				+ "\r\n"
				+ " {transaction_id: 7, status: 'settled', type: 'debit', epoch: 1652001735, amount: 1350.00, currency: gbp, to_account_number: 30221490402, from_account_number: 123456783},\r\n"
				+ "\r\n"
				+ " {transaction_id: 10, status: 'settled', type: 'debit', epoch: 1652001765, amount: 1425.00, currency: gbp, to_account_number: 30221490432, from_account_number: 123456780}\r\n"
				+ "\r\n" + "]";
		JSONArray array = new JSONArray(completed_transactions);
		return array;
	}

}

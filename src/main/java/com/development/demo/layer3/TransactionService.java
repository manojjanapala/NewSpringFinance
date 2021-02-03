package com.development.demo.layer3;

import java.util.List;

import com.development.demo.layer1.Transaction;

public interface TransactionService  {
	public String addTransactionService(Transaction transaction);
	public Transaction getTransactionService(int TransactionId);
	public List<Transaction> getAllTransactionsService();
}

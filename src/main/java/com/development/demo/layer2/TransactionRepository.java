package com.development.demo.layer2;
import com.development.demo.layer1.*;
import java.util.List;

public interface TransactionRepository {
    public String addTransaction(Transaction transaction);
    Transaction getTransaction(int TransactionId);
    public List<Transaction> getAllTransactions();
 }

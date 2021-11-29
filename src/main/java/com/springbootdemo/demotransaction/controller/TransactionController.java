package com.springbootdemo.demotransaction.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.springbootdemo.demotransaction.model.Transaction;
import com.springbootdemo.demotransaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TransactionController {
    
    @Autowired
    TransactionRepository transactionRepo;

    @GetMapping(value="/{accId}/transactions", produces = "application/json")
    public List<Transaction> getTransactions(@PathVariable("accId") String accountNumber) {
        return transactionRepo.findByAccountNumber(accountNumber);
    }
    
}

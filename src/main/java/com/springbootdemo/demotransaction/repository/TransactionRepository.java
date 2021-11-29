package com.springbootdemo.demotransaction.repository;

import java.util.List;
import com.springbootdemo.demotransaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByAccountNumber(String accountNumber);
}

package com.temimo.bootyourselfspringiscoming.dao;

import com.temimo.bootyourselfspringiscoming.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyDao extends JpaRepository<Bank, String> {
}

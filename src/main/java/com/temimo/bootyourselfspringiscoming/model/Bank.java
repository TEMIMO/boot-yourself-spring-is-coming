package com.temimo.bootyourselfspringiscoming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bank {
    private long TotalAmount;
    @Id
    private Long id;
}

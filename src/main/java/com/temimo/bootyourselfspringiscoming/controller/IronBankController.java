package com.temimo.bootyourselfspringiscoming.controller;

import com.temimo.bootyourselfspringiscoming.dao.MoneyDao;
import com.temimo.bootyourselfspringiscoming.service.TransferMoneyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IronBankController {
    private final TransferMoneyService transferMoneyService;
    private final MoneyDao moneyDao;

    @GetMapping("/credit")
    public String credit(@RequestParam String name, @RequestParam long amount) {
        long resultDeposit = transferMoneyService.transfer(name, amount);

        if (resultDeposit == - 1) {
            return "Rejected: " + name + " will not survive this winter";
        }

        return "Operation approved for " + name + ". Current deposit: " + resultDeposit;

    }

    @GetMapping("/state")
    public long getState() {
        return moneyDao.findAll().get(0).getTotalAmount();
    }




}

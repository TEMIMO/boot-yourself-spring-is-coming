package com.temimo.bootyourselfspringiscoming.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TransferMoneyServiceImpl implements TransferMoneyService{
    private final HashMap<String, Long> map = new HashMap<>();

    @Override
    public long transfer(String name, long amount) {
        if (!map.containsKey(name)) {
            map.put(name, amount);
            return amount;
        }
        Long aLong = map.get(name);
        long l = aLong + amount;
        map.put(name, l);
        return l;
    }
}

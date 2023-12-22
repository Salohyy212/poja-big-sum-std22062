package com.poja.base.endpoint.rest.controller.health;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class BigSumCalculationService {
    public BigInteger add(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        return bigA.add(bigB);
    }
}

package com.kitabisa.application;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechnicalImp implements Technical {

    private static final Logger log = LoggerFactory
            .getLogger(TechnicalImp.class);

    @Override
    public BigDecimal sum(BigDecimal x, BigDecimal y) {
        BigDecimal sum = x.add(y);
        log.info("Sum : {}", sum);
        return sum;
    }

    @Override
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        BigDecimal multiply = x.multiply(y);
        log.info("multiply : {}", multiply);
        return multiply;
    }

    @Override
    public String prime(int n) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        int number = Integer.MAX_VALUE;
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                result.append(i).append(" ");
                count++;
            }

            if (count == n) {
                break;
            }
        }
        log.info("Prime Numbers : {} ", result);
        return result.toString();
    }

    @Override
    public String fibonacci(int n) {
        StringBuilder result = new StringBuilder();
        int one = 0;
        int two = 1;
        for (int i = 0; i <n ; i++) {
            result.append(one).append(" ");
            int temp = one + two;
            one = two;
            two = temp;
        }
        log.info("fibonacci : {} ", result);
        return result.toString();
    }

}

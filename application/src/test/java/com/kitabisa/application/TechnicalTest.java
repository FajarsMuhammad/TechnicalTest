package com.kitabisa.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import com.kitabisa.application.Technical;
import com.kitabisa.application.TechnicalImp;

public class TechnicalTest {

    private Technical technical;

    @BeforeEach
    void init() {
        MockitoAnnotations.initMocks(this);
        this.technical = new TechnicalImp();
    }

    @Test
    void sumTest() {
        BigDecimal result = technical.sum(new BigDecimal(1), new BigDecimal(2));
        assertEquals(new BigDecimal(3), result);
    }

    @Test
    void multiplyTest() {
        BigDecimal result = technical.multiply(new BigDecimal(1),
                new BigDecimal(2));
        assertEquals(new BigDecimal(2), result);
    }

    @Test
    void primeNumberTest() {
        int n = 4;
        technical.prime(n);
    }
    
    @Test
    void fibonacciTest() {
        int n = 4;
        technical.fibonacci(n);
    }

}

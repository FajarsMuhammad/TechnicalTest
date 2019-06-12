package com.kitabisa.application;

import java.math.BigDecimal;

public interface Technical {

    public BigDecimal sum(BigDecimal x, BigDecimal y);
    
    public BigDecimal multiply(BigDecimal x, BigDecimal y);
    
    public String prime(int n);

    public String fibonacci(int n);
}

package org.example.task1;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public class Operation {
    private Operation() {}
    public static final BiFunction<BigDecimal, BigDecimal, BigDecimal> ADDITION = BigDecimal::add;
}
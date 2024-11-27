package org.example.task1;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.BiFunction;

public class Calculator {
    public static BigDecimal calculate(BiFunction<BigDecimal, BigDecimal, BigDecimal> function, List<BigDecimal> values) {
        return values.stream()
                .reduce(function::apply)
                .orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
}
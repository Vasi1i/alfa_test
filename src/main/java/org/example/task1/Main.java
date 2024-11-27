package org.example.task1;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int numbersToInput = 2;

        List<BigDecimal> values = Inputter.getUserNumbers(numbersToInput);
        System.out.println(Calculator.calculate(Operation.ADDITION, values));
    }
}
package org.example.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputter {
    public static List<BigDecimal> getUserNumbers(int numbersToInput) {
        List<BigDecimal> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (values.size() < numbersToInput) {
                String input = scanner.nextLine();
                while (!isValidDigit(input)) {
                    System.out.println("Please make valid input");
                    input = scanner.nextLine();
                }
                values.add(new BigDecimal(input));
            }
        }
        return values;
    }

    private static boolean isValidDigit(String s) {
        try {
            new BigDecimal(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
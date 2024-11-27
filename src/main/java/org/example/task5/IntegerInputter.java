package org.example.task5;

import java.util.Scanner;

public class IntegerInputter implements Inputter {
    @Override
    public void getInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            Integer.parseInt(scanner.nextLine());
            System.out.println("You entered an integer");
        } catch (Exception e) {
            System.out.printf("An input error occurred: " + e.getMessage());
        }
    }
}
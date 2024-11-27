package org.example.task3;

import java.util.Random;

public class TenNumbersFiler implements Filer {
    @Override
    public int[] getArray() {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(Integer.MAX_VALUE);
        }
        return numbers;
    }
}
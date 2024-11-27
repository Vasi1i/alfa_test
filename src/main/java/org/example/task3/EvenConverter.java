package org.example.task3;

import java.util.Arrays;

public class EvenConverter implements Converter {
    private final int[] array;

    public EvenConverter(int[] array) {
        this.array = array;
    }

    @Override
    public int[] convert() {
        return Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .toArray();
    }
}
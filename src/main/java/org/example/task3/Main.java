package org.example.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Filer tenNumbersFiler = new TenNumbersFiler();
        Converter evenConverter = new EvenConverter(tenNumbersFiler.getArray());
        System.out.println(Arrays.toString(evenConverter.convert()));
    }
}
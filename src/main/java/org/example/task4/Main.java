package org.example.task4;

import org.example.task3.Converter;
import org.example.task3.EvenConverter;
import org.example.task3.Filer;
import org.example.task3.TenNumbersFiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "cherry");
        char filterFirstLetter = 'a';
        list.stream()
                .filter(s -> s.startsWith(String.valueOf(filterFirstLetter)))
                .forEach(System.out::println);
    }
}
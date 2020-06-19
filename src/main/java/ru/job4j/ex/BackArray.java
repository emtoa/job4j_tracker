package ru.job4j.ex;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        int end = names.length - 1;
        for (int index = 0; index < middle; index++) {
            String temp = names[index];
            names[index] = names[end - index];
            names[end - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
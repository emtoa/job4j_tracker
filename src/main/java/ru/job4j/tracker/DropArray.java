package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        //String[] names = {"Petr 1", "Senya 2", "Ivan 3", "Stepan 4", "Fedor 5"};
        String[] names = { null, "Petr"};
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        //System.arraycopy(names, 1, names, 0, 0);

        System.arraycopy(names, 0+1, names, 0, 1);
        System.out.println(Arrays.toString(names));
    }
}
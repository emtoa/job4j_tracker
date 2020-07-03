package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,2,1,6,3);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}

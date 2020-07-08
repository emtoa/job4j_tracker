package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("aaaaa"),
                new Item("ddddd"),
                new Item("bbbbb"),
                new Item("ccccc")
        );

        for (Item list :items) {
            System.out.println(list.getId() + " " + list.getName());
        }
        System.out.println("####################################");
        Collections.sort(items, new SortByNameItemAsc());
        for (Item list :items) {
            System.out.println(list.getId() + " " + list.getName());
        }
        System.out.println("####################################");

        System.out.println(items);

        Collections.sort(items, new SortByNameItemDesc());
        for (Item list :items) {
            System.out.println(list.getId() + " " + list.getName());
        }
    }
}
package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private int size = 0;

    private final Item[] items = new Item[100];

    public Item add(Item item) {
        item.setId(generateId());
        this.items[size++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong()+System.currentTimeMillis());
    }

    public Item[] findByName(String name) {
        Item[] rsl = new Item[size];
        int i = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl[i] = item;
                i++;
            }
        }
        return Arrays.copyOf(rsl, i);
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }
}
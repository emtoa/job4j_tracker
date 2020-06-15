package ru.job4j.tracker;

import java.util.Random;

public class Tracker {

    private int position = 0;

    private final Item[] items = new Item[100];

    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong()+System.currentTimeMillis());
    }

    public Item[] findAll() {
        return items;
    }

    public Item findByName(String name) {
        Item rsl = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(name)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        Item rsl = null;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getId().equals(id)) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}
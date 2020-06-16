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
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
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
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = this.indexOf(id);
        if (index != -1) {
            item.setId(id);
            this.items[index] = item;
        }
        return index != -1;
    }
}
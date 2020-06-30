package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Tracker {

    private int size = 0;

    private final List<Item> items = new ArrayList<Item>();

    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findByName(String name) {
        List<Item> rsl = new ArrayList<Item>();

        for (Item item : this.items) {
            if (item.getName().equals(name)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items.get(index)  : null;
    }

    public List<Item> findAll() {
        return this.items;
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < this.items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        int index = this.indexOf(id);
        if (index != -1) {
            item.setId(id);
            this.items.add(item);
        }
        return index != -1;
    }

    public boolean delete(String id) {
        int index = this.indexOf(id);
        if (index != -1) {
            items.remove(index);
        }
        return index != -1;
    }
}
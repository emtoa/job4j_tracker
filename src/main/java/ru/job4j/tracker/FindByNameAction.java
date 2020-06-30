package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out){
        this.out = out;
    }
    @Override
    public String name() {
        return "=== Find by Name ticket ====";
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Find ticket by Name. Enter Name: ");
        List<Item> item = tracker.findByName(name);
        if (item.size() == 0) {
            out.println("Not found !!!");
        } else {
            for (Item value : item) {
                out.println(value.getId() + " | " + value.getName());
            }
        }
        return true;
    }
}
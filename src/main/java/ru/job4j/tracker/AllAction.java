package ru.job4j.tracker;

import java.util.List;
import java.util.ArrayList;

public class AllAction implements UserAction {
    private final Output out;

    public AllAction(Output out){
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Show all ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("All ticket:");
        List<Item> item  = tracker.findAll();

        if (item.size() == 0){
            out.println("Not found ticket !!!");
        } else {
            for (Item value : item) {
                out.println(value.getId() + " | " + value.getName());
            }
        }
        return true;
    }
}
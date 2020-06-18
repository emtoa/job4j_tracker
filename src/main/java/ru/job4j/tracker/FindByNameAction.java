package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find by Name ticket ====";
    }

    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Find ticket by Name. Enter Name: ");
        Item[] item = tracker.findByName(name);
        if (item.length == 0) {
            System.out.println("Not found !!!");
        } else {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i].getId() + " | " + item[i].getName());
            }
        }
        return true;
    }
}
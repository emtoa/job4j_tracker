package ru.job4j.tracker;

public class AllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("All ticket:");
        Item[] item  = tracker.findAll();

        if (item.length == 0){
            System.out.println("Not found ticket !!!");
        } else {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i].getId() + " | " + item[i].getName());
            }
        }
        return true;
    }
}
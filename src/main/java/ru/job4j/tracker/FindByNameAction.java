package ru.job4j.tracker;

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
        Item[] item = tracker.findByName(name);
        if (item.length == 0) {
            out.println("Not found !!!");
        } else {
            for (int i = 0; i < item.length; i++) {
                out.println(item[i].getId() + " | " + item[i].getName());
            }
        }
        return true;
    }
}
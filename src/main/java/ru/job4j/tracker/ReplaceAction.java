package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Replace ID: ");
        String name = input.askStr("New Name: ");
        Item item = new Item(name);
        if (tracker.replace (id, item)){
            System.out.println("Replaced: "+id);
        }
        else{
            System.out.println("Do not replaced !!!");
        }
        return true;
    }
}
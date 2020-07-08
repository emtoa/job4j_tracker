package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Replace ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Replace ID: ");
        String name = input.askStr("New Name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Replaced: " + id);
        } else {
            out.println("Do not replaced !!!");
        }
        return true;
    }
}
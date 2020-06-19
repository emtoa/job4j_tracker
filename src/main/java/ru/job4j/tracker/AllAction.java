package ru.job4j.tracker;

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
        Item[] item  = tracker.findAll();

        if (item.length == 0){
            out.println("Not found ticket !!!");
        } else {
            for (int i = 0; i < item.length; i++) {
                out.println(item[i].getId() + " | " + item[i].getName());
            }
        }
        return true;
    }
}
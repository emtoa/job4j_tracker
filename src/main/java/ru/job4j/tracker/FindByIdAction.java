package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction (Output out){
        this.out = out;
    }

    @Override
    public String name(){
        return "=== Find by ID ticket ====";
    }

    public boolean execute (Input input, Tracker tracker){
        String name = input.askStr("Find ticket by ID: ");
        Item item  = tracker.findById (name);
        if (item != null){
            out.println("Ticket:"+item.getId()+" | "+item.getName());
        }else{
            out.println("Not found !!!");
        }
        return true;
    }
}

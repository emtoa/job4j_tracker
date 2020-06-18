package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name(){
        return "=== Delete ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Delete ticket by ID: ");
        if (tracker.delete(id)){
            System.out.println("Deleted: "+id);
        }
        else{
            System.out.println("Do not deleted !!!");
        }
        return true;
    }
}

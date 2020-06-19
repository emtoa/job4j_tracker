package ru.job4j.tracker;

public class DeleteAction implements UserAction {

    private final Output out;

    public DeleteAction(Output out){
        this.out = out;
    }

    @Override
    public String name(){
        return "=== Delete ticket ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Delete ticket by ID: ");
        if (tracker.delete(id)){
            out.println("Deleted: "+id);
        }
        else{
            out.println("Do not deleted !!!");
        }
        return true;
    }
}

package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Added: "+item.getId()+" "+item.getName());
    }

    public static void replaceItem(Input input, Tracker tracker) {
        String id = input.askStr("Replace ID: ");
        String name = input.askStr("New Name: ");
        Item item = new Item(name);
        if (tracker.replace (id, item)){
            System.out.println("Replaced: "+id);
        }
        else{
            System.out.println("Do not replaced !!!");
        }
    }

    public static void deteleItem(Input input, Tracker tracker){
        String id = input.askStr("Delete ticket by ID: ");
        if (tracker.delete(id)){
            System.out.println("Deleted: "+id);
        }
        else{
            System.out.println("Do not deleted !!!");
        }
    }

    public static void allItem(Tracker tracker){
        System.out.println("All ticket:");
        Item[] item  = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i].getId() + " | " + item[i].getName());
        }
        if (item.length == 0){
            System.out.println("Not found ticket !!!");
        }
    }

    public static void findByIdItem(Input input, Tracker tracker){
        String name = input.askStr("Find ticket by ID: ");
        Item item  = tracker.findById (name);
        if (item != null){
            System.out.println("Ticket:"+item.getId()+" | "+item.getName());
        }else{
            System.out.println("Not found !!!");
        }
    }
    public static void findByNameItem(Input input, Tracker tracker){
        String name = input.askStr("Find ticket by Name. Enter Name: ");
        Item[] item  = tracker.findByName (name);
        for (int i = 0; i < item.length; i++){
            System.out.println(item[i].getId()+" | "+item[i].getName());
        }
        if (item.length == 0){
            System.out.println("Not found !!!");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItem(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deteleItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Added: "+item.getId()+" "+item.getName());
            } else if (select == 1) {
                System.out.println("All ticket:");
                Item[] item  = tracker.findAll();
                for (int i = 0; i < item.length; i++) {
                    System.out.println(item[i].getId() + " | " + item[i].getName());
                }
                if (item.length == 0){
                    System.out.println("Not found ticket !!!");
                }
            } else if (select == 2) {
                System.out.print("Replace ID: ");
                String id = scanner.nextLine();
                System.out.print("New Name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace (id, item)){
                    System.out.println("Replaced: "+id);
                }
                else{
                    System.out.println("Do not replaced !!!");
                }
            } else if (select == 3) {
                System.out.print("Delete ticket by ID: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)){
                    System.out.println("Deleted: "+id);
                }
                else{
                    System.out.println("Do not deleted !!!");
                }
            } else if (select == 4) {
                System.out.print("Find ticket by ID: ");
                String name = scanner.nextLine();
                Item item  = tracker.findById (name);
                if (item != null){
                    System.out.println("Ticket:"+item.getId()+" | "+item.getName());
                }else{
                    System.out.println("Not found !!!");
                }

            } else if (select == 5) {
                System.out.print("Find ticket by Name. Enter Name: ");
                String name = scanner.nextLine();
                Item[] item  = tracker.findByName (name);
                for (int i = 0; i < item.length; i++){
                    System.out.println(item[i].getId()+" | "+item[i].getName());
                }
                if (item.length == 0){
                    System.out.println("Not found !!!");
                }
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
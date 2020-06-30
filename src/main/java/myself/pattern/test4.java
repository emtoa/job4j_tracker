package myself.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.job4j.search.*;
import ru.job4j.tracker.Item;

public class test4 {

    public static void main(String[] args) {

        List<Item> lst1 = new ArrayList<Item>();
            lst1.add(new Item("Sasha"));
            lst1.add(new Item("Masha"));
            lst1.add(new Item("Glash"));

//        List<Item> lst = Arrays.asList(new Item("Sasha"));
//        System.out.println(lst.get(0).getName());

        for (Item value : lst1) {
            System.out.println(value.getName());
        }

        lst1.remove(0);
        System.out.println("##########################");
        for (Item value : lst1) {
            System.out.println(value.getName());
        }
        System.out.println("##########################");
        System.out.println(lst1.indexOf(0));
    }
}

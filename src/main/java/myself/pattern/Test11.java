package myself.pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        List<String> arr = new LinkedList<>();

        arr.add("one");
        arr.add("two");
        arr.add("three");

        for (String value: arr) {
            System.out.println(value);
        }

        arr.remove(1);
        System.out.println("####################################################");
        for (String value: arr) {
            System.out.println(value);
        }

    }
}

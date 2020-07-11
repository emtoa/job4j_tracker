package myself.pattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        HashSet<String> arr = new HashSet<>();

        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("one1");

        for (String value: arr) {
            System.out.println(value);
        }

        System.out.println("####################################################");
        for (String value: arr) {
            System.out.println(value);
        }

    }
}

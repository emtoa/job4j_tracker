package myself.pattern;

import java.util.*;
import java.lang.reflect.*;

public class test1 {
    public static void main(String[] arguments) {
        List<String> list = new ArrayList<>();
        List<String> decorated = Collections.checkedList(list, String.class);
        decorated.add("2");
        list.add("3");
        System.out.println(decorated);
    }
}

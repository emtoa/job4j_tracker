package myself.pattern;

import ru.job4j.collection.Departments;

import java.util.Arrays;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        String o1 = "a6/ask6/assk6";
        int indx = (o1.indexOf("/") != -1) ? o1.indexOf("/") : -1;

//        String ileft = o1.substring(0, o1.indexOf("/"));
//        String iright = o2.substring(0, o2.indexOf("/"));


        System.out.println(o1.substring(0, indx));
    }
}

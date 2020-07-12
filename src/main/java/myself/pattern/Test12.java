package myself.pattern;


import java.util.Arrays;
import java.util.Comparator;

public class Test12 {
    public static void main(String[] args) {
        String[] names = {
                "Petr",
                "Ivan"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);

        for (String str: names) {
            System.out.println(str);
        }
    }
}

package myself.pattern;

import java.util.function.Predicate;

public class Test13 {
    public static void main(String[] args) {
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));
    }
}

package myself.pattern;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Set;

public class test8 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

            numbers.add(4);
            numbers.add(1);
            numbers.add(2);

            System.out.println(numbers);

        Set<Integer> numbers1 = new TreeSet<>(Collections.reverseOrder());

        numbers1.add(4);
        numbers1.add(1);
        numbers1.add(2);

        System.out.println(numbers1);
    }
}

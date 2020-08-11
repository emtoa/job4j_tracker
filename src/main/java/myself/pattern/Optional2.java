package myself.pattern;

import java.util.Optional;
import java.util.stream.Stream;

public class Optional2 {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        Integer rsl = stream.filter(e -> e == 2).findFirst().get();
/*
        if (rsl.isPresent()) {
            System.out.println(rsl.get());
        } else {
            System.out.println("Element not found.");

        }

 */
    }
}
package myself.pattern;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterator3 {
    public static void main(String[] args) {

        Iterator<Integer> matrix = List.of(1, 2, 3, 4, 5, 6, 7).iterator();

        Stream.generate(() -> matrix)
                .takeWhile(x -> x.hasNext())
                .flatMap(n -> Stream.of(n.next()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

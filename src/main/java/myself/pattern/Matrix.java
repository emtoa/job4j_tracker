package myself.pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(3, 4, 8)
        );

        Stream.of(matrix)
                .flatMap(e -> e.stream()
                        .flatMap(e1 -> e1.stream()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

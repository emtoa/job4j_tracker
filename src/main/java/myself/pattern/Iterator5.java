package myself.pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Iterator5 {
    public static void main(String[] args) {

        Iterator<Iterator<Integer>> matrix = List.of(
                List.of(2, 4, 6).iterator(),
                List.of(1, 3, 5).iterator()
        ).iterator();

        StreamSupport.stream(Spliterators.spliteratorUnknownSize(matrix, 0), false)
                .flatMap(row -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(row, 0), false))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

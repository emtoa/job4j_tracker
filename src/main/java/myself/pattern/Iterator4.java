package myself.pattern;

import ru.job4j.tracker.StubOutput;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Iterator4 {
    public static void main(String[] args) {
/*
        Iterator<Integer> it = List.of(9,1,2,3,4,5,6).iterator();

        Stream.generate(() -> it)
                .takeWhile(x -> x.hasNext())
                .map(n -> n.next())
                .collect(Collectors.toList())
                .forEach(System.out::println);

*/
/*
        Iterator<Iterator<Integer>> it = List.of(
                List.of(1, 4).iterator(),
                List.of(2, 3).iterator()
        ).iterator();

        Stream.generate(() -> it)
                .takeWhile(x -> x.hasNext())
                .map(n -> n.next())
                .collect(Collectors.toList())
                .forEach(System.out::println);
*/

        Iterator<Iterator<Integer>> matrix = List.of(
                List.of(1, 2).iterator(),
                List.of(3, 4).iterator()
        ).iterator();

        System.out.println(
                Stream.of(matrix).flatMap(e -> Stream.of(e.next())).collect(Collectors.toList())
                //matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList())
        );
    }
}
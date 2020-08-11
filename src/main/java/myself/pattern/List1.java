package myself.pattern;

import java.util.List;
import java.util.stream.Collectors;

public class List1 {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        System.out.println(
                matrix.stream().flatMap(e -> e.stream()).collect(Collectors.toList())
        );
    }
}

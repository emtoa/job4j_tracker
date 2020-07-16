package myself.pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test17 {

    public static List<Integer> matrixToList(Integer[][] matrix) {

        return Stream.of(matrix)
                .flatMap(e -> Arrays.stream(e)).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Integer[][] matrix = new Integer[2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        System.out.println(matrixToList(matrix));
    }
}

package myself.pattern;

import java.util.List;

public class Test20 {
    public static void main(String[] args) {
        List.of(1,2,3,4,5,6).stream()
                .takeWhile(l -> l < 4)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
        System.out.println("");
        System.out.println("##########################################");
        List.of(1,2,3,4,5,6).stream()
                .dropWhile(l -> l < 4)
                .map(v -> String.format(" %s", v))
                .forEach(System.out::print);
    }
}

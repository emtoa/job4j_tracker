package myself.pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator2 {
    public static void main(String[] args) {

        Iterator<Integer> it = List.of(1, 2, 3, 4, 5, 6).iterator();

        while (it.hasNext()) {

            System.out.println(" = "+it.next());

        }
    }
}

package myself.pattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {

        Iterator<Iterator<Integer>> it = List.of(
                List.of(1, 4).iterator(),
                List.of(8, 2, 3).iterator()
        ).iterator();


        while (it.hasNext()) {

            Iterator<Integer> itt = it.next();

            while (itt.hasNext()) {
                System.out.println(" = "+itt.next());
            }
// = java.util.ImmutableCollections$ListItr@2f4d3709
        }
    }
}

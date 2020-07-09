package myself.pattern;

import ru.job4j.collection.Departments;

import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a6/ask6/assk6", "k6/sk6/ssk6", "k2/sk2/ssk2");
        //List<String> expect = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);

        for (String str: result) {
            System.out.println(str);
        }

        System.out.println("##########################################");

        Departments.sortAsc(result);

        for (String str: result) {
            System.out.println(str);
        }
    }
}

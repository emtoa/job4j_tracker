package myself.pattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test16 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "Mohan"));
        list.add(new Person(100, "Sohan"));
        list.add(new Person(300, "Mahesh"));
        LinkedHashMap<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName,
                        (x, y) -> x+", "+ y, LinkedHashMap::new));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
    }
}

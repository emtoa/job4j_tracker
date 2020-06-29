package myself.pattern;

import java.util.ArrayList;
import ru.job4j.search.*;

public class test4 {

    public static void main(String[] args) {


        ArrayList<Person> lPerson = new ArrayList<Person>();

        Person piople = new Person("Alex","Kharitonov","783423","v jope");

        lPerson.add(piople);

        System.out.println(lPerson.get(0).getName());
    }
}

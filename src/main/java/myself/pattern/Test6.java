package myself.pattern;

import  ru.job4j.collection.*;
import java.util.HashSet;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        HashSet<Account> rsl = new HashSet<>();

        rsl.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        rsl.add(new Account("123", "Petr Arsentev", "eDer3432f"));
    }
}

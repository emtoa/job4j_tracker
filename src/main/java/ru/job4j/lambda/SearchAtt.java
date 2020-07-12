package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;


public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>()  {
            @Override
            public boolean test(Attachment att) {
                return (att.getSize() > 100) ? true : false;
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<Attachment>() {
            @Override
            public boolean test(Attachment att) {
                return (att.getName().contains("bug")) ? true : false;
            }
        };
        return filter(list, func);
    }


    private static List<Attachment> filter(List<Attachment> lst, Predicate<Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : lst) {
            if (func.test(att)) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}
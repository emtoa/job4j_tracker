package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class SearchAtt {

    public static List<Attachment> filterSize(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment att) {
                return (att.getSize() > 100) ? att : null;
            }
        };
        return filter(list, func);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Function<Attachment, Attachment> func = new Function<Attachment, Attachment>() {
            @Override
            public Attachment apply(Attachment att) {
                return (att.getName().contains("bug")) ? att : null;
            }
        };
        return filter(list, func);
    }


    private static List<Attachment> filter(List<Attachment> lst, Function<Attachment, Attachment> func) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : lst) {
            if (func.apply(att) != null) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}
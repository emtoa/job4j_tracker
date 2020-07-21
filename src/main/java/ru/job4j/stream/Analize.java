package ru.job4j.stream;

import java.util.List;

public class Analize {
    public static Info diff(List<User> previous, List<User> current) {
        Info info = new Info();
        info.added = (int) current.stream()
                .dropWhile(previous::contains)
                .count();

        info.deleted = (int) previous.stream()
                .filter(o -> !current.contains(o))
                .count();

        info.changed = (int) previous.stream().
                filter(current::contains).
                filter(o -> !o.getName()
                        .equals(current.get(current.indexOf(o))
                                .getName()))
                                .count();
        return info;
    }
}
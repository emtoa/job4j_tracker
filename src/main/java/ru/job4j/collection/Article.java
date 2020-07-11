package ru.job4j.collection;

import java.util.HashSet;


public class Article {
    public static boolean generateBy(String origin, String line) {

        String[] fnd = line.split(" ");
        String[] org = origin.split(" ");
        HashSet<String> str = new HashSet<>();

        for (String original : org) {
            str.add(original);
        }

        for (String value : fnd) {
            if (!str.contains(value)) {
                return false;
            }
        }
        return fnd.length >= 0 ? true : false;
    }
}
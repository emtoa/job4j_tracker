package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class Article {
    public static boolean generateBy(String origin, String line) {

        String[] fnd = line.split(" ");
        String[] org = origin.split(" ");
        ArrayList<String> str = new ArrayList<>();

        for (String original : org) {
            str.add(original);
        }

        for (String value : fnd) {
            if (!str.toString().contains(value)) {
                return false;
            }
        }
        return fnd.length >= 0 ? true : false;
    }
}
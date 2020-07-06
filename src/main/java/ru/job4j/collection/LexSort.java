package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int ileft = Integer.parseInt (left.substring(0, left.indexOf(".")));
        int iright = Integer.parseInt (right.substring(0, right.indexOf(".")));
        return Integer.compare(ileft, iright);
    }
}
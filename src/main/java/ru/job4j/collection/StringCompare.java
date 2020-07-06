package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare (String left, String right){

        int size = (left.length() <= right.length()) ? left.length() : right.length();
        int result = left.length() - right.length();

        for (int i = 0; i < size; i++) {
            result += Character.compare(left.charAt(i), right.charAt(i));
        }
        return result;
    }
}

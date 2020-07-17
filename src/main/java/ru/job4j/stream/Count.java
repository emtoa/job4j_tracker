package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;

public class Count {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new LinkedList<>();
        for (int i = start; i < end; i++) {
            result.add(func.apply((double) i));
        }
    return result;
    }

}

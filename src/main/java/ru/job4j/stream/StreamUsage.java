package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        List<Integer> tasks = List.of(100, -200, 300, -400);

        List<Integer> result = tasks.stream().filter(task -> task >= 0).collect(Collectors.toList());

        result.stream().map(t -> t).forEach(System.out::println);
    }
}

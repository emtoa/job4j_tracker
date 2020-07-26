package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {

        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false)
                .flatMap(row -> StreamSupport.stream(Spliterators.spliteratorUnknownSize(row, 0), false))
                .collect(Collectors.toList());
    }
}

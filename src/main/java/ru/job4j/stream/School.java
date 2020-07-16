package ru.job4j.stream;

import myself.pattern.Person;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {

       return students.stream()
                 .filter(predict)
                 .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Student> stud = List.of(
                new Student("Ivanov", 40),
                new Student("Petrov", 50),
                new Student("Sidorov", 71),
                new Student("Ilin", 49),
                new Student("Sidorov", 82),
                new Student("Popov", 69),
                new Student("Smirnov", 100)
        );

       LinkedHashMap<String, Student> map = stud.stream()
                .collect(Collectors.toMap(s -> s.getSurname(), s -> s,
                        (x, y) -> x, LinkedHashMap::new));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y.getScore()));
    }
}
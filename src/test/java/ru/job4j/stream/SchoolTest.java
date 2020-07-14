package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenLess50() {
        List<Student> stud = List.of(
                new Student("Ivanov", 40),
                new Student("Petrov", 50),
                new Student("Sidorov", 71),
                new Student("Ilin", 49),
                new Student("Popov", 69),
                new Student("Smirnov", 100)
        );

        List<Student> expect = List.of(
                new Student("Ivanov", 40),
                new Student("Ilin", 49)
        );

        Predicate<Student> predic = p -> p.getScore() >= 0 && p.getScore() < 50;
        List<Student> result = School.collect(stud, predic);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMore50AndLess70() {
        List<Student> stud = List.of(
                new Student("Ivanov", 40),
                new Student("Petrov", 50),
                new Student("Sidorov", 71),
                new Student("Ilin", 49),
                new Student("Popov", 69),
                new Student("Smirnov", 100)
        );

        List<Student> expect = List.of(
                new Student("Petrov", 50),
                new Student("Popov", 69)
        );

        Predicate<Student> predic = p -> p.getScore() >= 50 && p.getScore() < 70;
        List<Student> result = School.collect(stud, predic);
        assertThat(result, is(expect));
    }

    @Test
    public void whenMore70AndLess100() {
        List<Student> stud = List.of(
                new Student("Ivanov", 40),
                new Student("Petrov", 50),
                new Student("Sidorov", 71),
                new Student("Ilin", 49),
                new Student("Popov", 69),
                new Student("Smirnov", 100)
        );

        List<Student> expect = List.of(
                new Student("Sidorov", 71),
                new Student("Smirnov", 100)
        );

        Predicate<Student> predic = p -> p.getScore() >= 70 && p.getScore() <= 100;
        List<Student> result = School.collect(stud, predic);
        assertThat(result, is(expect));
    }
}
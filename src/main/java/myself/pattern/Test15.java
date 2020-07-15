package myself.pattern;

import ru.job4j.stream.*;
import ru.job4j.stream.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Test15 {
    public static List<Student> collect(List<Student> students){
        return students.stream()
                .filter(task -> task.getScore() <= 50)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Student> stud = List.of(
                new Student("Sasha", 40),
                new Student("Sasha", 51),
                new Student("Sasha", 71)
        );

        List<Student> list = collect(stud);

        list.stream().map(t -> t.getSurname()).forEach(System.out::println);
    }
}
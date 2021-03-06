package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {

        Predicate<Person> name = t -> t.getName().contains(key);
        Predicate<Person> surname = t -> t.getSurname().contains(key);
        Predicate<Person> address = t -> t.getAddress().contains(key);
        Predicate<Person> phone = t -> t.getPhone().contains(key);

        var combine = name.or(surname).or(address).or(phone);

        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
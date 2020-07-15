package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {

        Comparator<Address> city = Comparator.comparing(Address::getCity);
        Comparator<Address> street = Comparator.comparing(Address::getStreet);
        Comparator<Address> home = Comparator.comparingInt(Address::getHome);
        Comparator<Address> apartment = Comparator.comparingInt(Address::getApartment);

        Comparator<Address> addr = city.thenComparing(street)
                .thenComparing(home)
                .thenComparing(apartment);

        return profiles.stream()
                .map(t -> t.getAddress())
                .sorted(addr)
                .distinct()
                .collect(Collectors.toList());
    }
}

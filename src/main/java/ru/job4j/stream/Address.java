package ru.job4j.stream;

import java.util.Objects;

public class Address {
    private String city;
    private String street;

    private int home;

    private int apartment;

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public int getHome() {
        return this.home;
    }

    public int getApartment() {
        return this.apartment;
    }

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return city.equals(address.city) &&
               street.equals(address.street) &&
               home == address.home &&
               apartment == address.apartment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}
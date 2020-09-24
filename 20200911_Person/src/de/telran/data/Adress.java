package de.telran.data;

import java.util.Objects;

public class Adress {
    private String city, street;
    private int houseNumber;

    public Adress(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;

    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return houseNumber == adress.houseNumber &&
                Objects.equals(city, adress.city) &&
                Objects.equals(street, adress.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, houseNumber);
    }

    @Override
    public String toString() {
        return "Адрес: " + city +
                " " + street + houseNumber;
    }
}

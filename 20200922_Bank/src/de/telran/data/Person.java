package de.telran.data;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private Date birthday;
    private String address;
    private Sex sex;

    public Person(String firstName, String lastName, Date birthday, String address, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public Sex getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getBirthday().equals(person.getBirthday()) &&
                getAddress().equals(person.getAddress()) &&
                getSex() == person.getSex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthday(), getAddress(), getSex());
    }

    @Override
    public String toString() {
        return "Client: " + firstName + " "+ lastName + ", " +
                birthday +
                ", address: '" + address + '\'' +
                ", sex: " + sex;
    }
    public String toStringName(){
        return "Client: " + firstName + " " + lastName;
    }

}

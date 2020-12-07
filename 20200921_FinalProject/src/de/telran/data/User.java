package de.telran.data;

public class User {
    private String name;
    private static int idNumber = 000;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int userID() {
        idNumber++;
        return idNumber;
    }
}

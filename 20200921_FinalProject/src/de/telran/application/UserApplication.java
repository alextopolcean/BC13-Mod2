package de.telran.application;

import de.telran.data.User;

public class UserApplication {
    public static void main(String[] args) {
        User user1 = new User("Вася");
        User user2 = new User("Петя");
        User user3 = new User("Дима");
        User user4 = new User("Коля");


        System.out.printf("Имя: " + user1.getName() + ", ID : " + "%03d%n", User.userID());
        System.out.printf("Имя: " + user2.getName() + ", ID : " + "%03d%n", User.userID());
        System.out.printf("Имя: " + user3.getName() + ", ID : " + "%03d%n", User.userID());
        System.out.printf("Имя: " + user4.getName() + ", ID : " + "%03d%n", User.userID());

    }
}

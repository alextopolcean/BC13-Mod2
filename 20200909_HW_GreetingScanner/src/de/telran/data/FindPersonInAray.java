package de.telran.data;


import java.util.Arrays;
import java.util.Scanner;

public class FindPersonInAray {
    public static void findName(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]= array[i].toLowerCase();
        }
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите Ваше имя: ");
        name = scanner.nextLine();
        name = name.toLowerCase();
        if (Arrays.asList(array).contains(name)) {
            System.out.println("Добро пожаловать, " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!");
        } else {
            System.out.println("Простите, мы не знакомы!");
        }
    }
}


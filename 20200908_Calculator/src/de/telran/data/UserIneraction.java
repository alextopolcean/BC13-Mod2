package de.telran.data;

import java.util.Scanner;

public class UserIneraction {

    private static Scanner scanner = new Scanner(System.in);

    public static double getParameter() {
        System.out.println("Введите цифру, пожалуйста ");
        return scanner.nextDouble();
    }

    public static char operation() {
        System.out.println("Введите знак операции (+, -, *, /)");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Неправильный знак операции! Попробуй другой знак");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static double getRightDelimiter(double num) {
        while (num == 0) {
            System.out.println("Ошибка! Введите другую цифру ");
            num = scanner.nextDouble();
        }
        return num;
    }

    public static void closeScanner() {
        scanner.close();
    }
}

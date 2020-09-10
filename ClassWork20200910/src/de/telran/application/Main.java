package de.telran.application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

       /* System.out.println("Укажите длину массива, пожалуйста ");
        int arraySize = scanner.nextInt();

        int[] myArray = new int[arraySize];
        fillArray(myArray);

        System.out.println("введите число для удаления");
        int deleteNumber = scanner.nextInt();
        boolean checkNumber = isDeleteNumberInAray(myArray, deleteNumber);
        printResult(myArray, checkNumber, deleteNumber);

        scanner.close();
        */
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(myArray)));
    }

    private static int[] reverse(int[] a) {
        int[] output = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[a.length - 1 - i];

        }
        return a;
    }

    public static int[] fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("введите число, пожалуйста ");
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static boolean isDeleteNumberInAray(int[] array, int nubmer) {
        for (int num : array) {
            if (num == nubmer) {
                return true;
            }
        }
        return false;
    }

    public static int[] getArrayWithoutDeleteNumber(int[] array, int number) {
        int count = 0;
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (number != array[i]) {
                newArray[count] = array[i];
                count++;
            }

        }
        return newArray;
    }

    public static void printResult(int[] numbers, boolean check, int number) {
        if (check) {
            System.out.println("да!!!");
            System.out.println(Arrays.toString(getArrayWithoutDeleteNumber(numbers, number)));
        } else {
            System.out.println("нет(((");
            System.out.println("попробуйте ещё раз");
        }
    }
}

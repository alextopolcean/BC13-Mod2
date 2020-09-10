package de.alextop.data;
import java.util.Scanner;
import java.util.Arrays;


public class ScannerData {
    static Scanner scanner = new Scanner(System.in);
    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число, пожалуйста");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static boolean isDeleteNumberInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
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
            System.out.println("Удаляю ... ");
            System.out.println("Ваш новый массив => "+ Arrays.toString(getArrayWithoutDeleteNumber(numbers, number)));
        } else {
            System.out.println("Нет такого числа");
            System.out.println("Попробуйте ещё");
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}

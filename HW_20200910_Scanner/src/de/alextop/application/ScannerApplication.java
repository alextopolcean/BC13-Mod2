package de.alextop.application;
import de.alextop.data.ScannerData;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите размер массива, пожалуйста");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        ScannerData.fillArray(myArray);
        System.out.println("Ваш массив чисел =>  " + Arrays.toString(myArray));
        System.out.println("Какое из данных чисел Вы хотите удалить ?");
        int deleteNumber = scanner.nextInt();
        boolean checkNumber = ScannerData.isDeleteNumberInArray(myArray, deleteNumber);
        ScannerData.printResult(myArray, checkNumber, deleteNumber);
        ScannerData.closeScanner();
    }
}

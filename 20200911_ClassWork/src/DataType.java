import java.util.Arrays;

public class DataType {

    public static void main(String[] args) {
        int a1 = 50;
        int a2 = 50;

        Integer b1 = 128;
        Integer b2 = 128;

        Integer d1 = 127; // byte => до 127
        Integer d2 = 127;

        String s1 = "Vasja";
        String s2 = "Vasja";

        System.out.println(a1 == a2);
        System.out.println(b1 == b2);
        System.out.println(d1 == d2);
        System.out.println(s1 == s2);

        System.out.println("------------");

        int[] numbers = {1, 2, 3, 4};


        System.out.println(changeNumber(a1));
        System.out.println(a1);

        System.out.println(Arrays.toString(numbers));

        changeArraysNumber(numbers);
        System.out.println(Arrays.toString(numbers));

        changeArrays(numbers);
        System.out.println(Arrays.toString(numbers));


    }

    public static int changeNumber(int num) {
        return num * 2;
    }

    public static void changeArraysNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;

        }
    }

    public static void changeArrays(int[] numbers) {
        for (int num : numbers) {
            num = num * 2;
        }
    }

}

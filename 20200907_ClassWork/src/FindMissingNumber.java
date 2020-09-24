public class FindMissingNumber {

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4, 5, 6, 8}));
        System.out.println(findMissingNumber(new int[]{1, 2, 4, 5 }));
        System.out.println(findMissingNumber(new int[]{1, 2, 3, 5 }));
        System.out.println(findMissingNumber(new int[]{ 2, 3, 4, 5 }));
    }

    private static int findMissingNumber(int[] arr) {
        int sum = 0, sumI = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumI += (i + 1);

        }
        sumI += (arr.length + 1);

        return sumI - sum;
    }
}

package java_lecture.day5;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += arr[i-1];    // 18
        }

        System.out.println("sum = " + sum);
    }
}

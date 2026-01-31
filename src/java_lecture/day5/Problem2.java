package java_lecture.day5;

public class Problem2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        int result1 = x/y;
        double result2 = x/y;
        double result3 = (double) x / y;

        System.out.println("result1 = " + result1); //3
        System.out.println("result2 = " + result2); //3.0
        System.out.println("result3 = " + result3); //3.5
    }
}

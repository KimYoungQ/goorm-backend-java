package day5;

public class Ploblem5 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original;

        copy[0] = 100;

        int[] another = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            another[i] = original[i];
        }

        another[1] = 200;

        System.out.println("original[0] = " + original[0]); // 100
        System.out.println("original[1] = " + original[1]); // 2
        System.out.println("copy[0] = " + copy[0]); // 100
        System.out.println("another[1] = " + another[1]); // 100

        System.out.println("original == copy : " + (original == copy)); // true
        System.out.println("original == another : " + (original == another)); // false
    }
}

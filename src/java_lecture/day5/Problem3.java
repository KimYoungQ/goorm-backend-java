package java_lecture.day5;

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;
        if ( n > 3 || ++n > 10) {
            System.out.println("조건 만족");    // 출력
        }
        System.out.println("n = " + n);

        int m = 5;

        if (m < 3 || ++m > 10) {
            System.out.println("조건 만족");    // 출력 되지 않음
        }
        System.out.println("m = " + m);
    }
}

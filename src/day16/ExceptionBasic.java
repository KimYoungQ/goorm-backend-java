package day16;

public class ExceptionBasic {
    public static void main(String[] args) {
        System.out.println("=== 0으로 나누기 ===");
        try {
            int result = 10 / 0;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나눌 수 없습니다.");
            System.out.println("메시지: " + e.getMessage());
        }

        // ArrayIndexOutOfBoundsException
        System.out.println("\n=== 배열 인덱스 오류 ====");
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("오류: 배열 범위 초가");
            System.out.println("메시지: " + e.getMessage());
        }

        // NullPointerException
        System.out.println("\n=== Null 참조 ===");
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("오류: null을 참조했습니다");
            System.out.println("메시지: " + e.getMessage());
        }

        System.out.println("\n프로그램 정상 종료");
    }
}

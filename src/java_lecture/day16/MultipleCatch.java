package java_lecture.day16;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("첫 번째 숫자: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("두 번째 숫자: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int result = num1 / num2;
            System.out.println("결과: " + result);

            int[] arr = {result};
            System.out.println("배열 값: " + arr[1]);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위 초과");
        } catch (Exception e) {
            System.out.println("예상치 못한 오류: " + e.getMessage());
        } finally {
            System.out.println("\n=== 정리 작업 ===");
            scanner.close();
            System.out.println("Scanner 종료됨");
        }
    }
}

package java_lecture.day4;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("1 ~ 100 소수 찾기");

        int count = 0;

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // 루트 이하 나눠지면 소수아님
                }
            }

            // 소수면 출력
            if (isPrime) {
                System.out.printf("%4d", num);
                count ++;

                // 10개마다 줄바꿈
                if (count % 10 ==0) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n\n총 " + count + "개의 소수가 있습니다.");
    }
}

package day16;

public class CustomExceptionTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동", 10000);

        /**
         * InsufficientBalanceException는 단순히 에러가아닌 메시지 말고도 현재잔액, 요청금액이 추가정보가 필요해서
         * 생성자에 도메인 정보를 받는 형식으로 처리
         * InvaildAgeException는 단순히 메시지 하나면 충분하기 때문
         */
        try {
            account.deposit(5000);
            account.withdraw(20000); // 예외 발생
        } catch (InsufficientBalanceException e) {
            System.out.println("오류: " + e.getMessage());
            System.out.println("부족 금액: " + e.getShortage() + "원");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }

        System.out.println("\n=== 나이 설정 ===");
        Member member = new Member();
        try {
            member.setAge(-5);
        } catch (InvaildAgeException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}

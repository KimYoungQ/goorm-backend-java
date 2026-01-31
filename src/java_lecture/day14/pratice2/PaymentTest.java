package java_lecture.day14.pratice2;

public class PaymentTest {
    public static void main(String[] args) {
        //다형성
        Payment[] payments = {
                new CardPayment(50000, "1234-5678-9012-3456"),
                new CashPayment(30000, 5000)
        };

        System.out.println("======== 결재 처리 시스템 =======");

        for (Payment payment : payments) {
            System.out.println("=== 결재처리 ===");

            if (payment.process()) {
                payment.printReceipt();
            }
            System.out.println();
        }
    }
}

package day14.pratice2;

public class CashPayment extends Payment {
    private int receivedAmount;

    public CashPayment(int amount, int receivedAmount) {
        super(amount);
        this.receivedAmount = receivedAmount;
    }

    @Override
    public boolean process() {
        System.out.println("현금결재");

        if (receivedAmount < amount) {
            System.out.println("금액이 부족합니다.");
            System.out.println("부족액: " + (amount - receivedAmount) + "원");
            return false;
        }

        System.out.println("받은 금액: " + String.format("%,d", receivedAmount) + "원");
        System.out.println("거스름돈: " + String.format("%,d", receivedAmount - amount) + "원");

        return true;
    }
}

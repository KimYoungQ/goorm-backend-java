package java_lecture.day16;

public class InsufficientBalanceException extends Exception {
    private int currentBalance;
    private int requestAmount;

    public InsufficientBalanceException(int balance, int amount) {
        super("잔액 부족: 현재 " + balance + "원, 요청" + amount + "원");
        this.currentBalance = balance;
        this.requestAmount = amount;
    }

    public int getShortage() {
        return requestAmount - currentBalance;
    }
}

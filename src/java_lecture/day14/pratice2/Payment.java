package java_lecture.day14.pratice2;

public abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public abstract boolean process();

    public void printReceipt() {
        System.out.println("-----------------");
        System.out.println("결재 금액: " + String.format("%,d", amount) + "원");
        System.out.println("-----------------");
    }
}

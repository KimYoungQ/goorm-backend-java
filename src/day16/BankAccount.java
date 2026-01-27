package day16;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("입금액은 0보다 커야 합니다.");
        }
    }

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println(amount + "원 출금. 잔액: " + balance + "원");
    }

    public int getBalance() {
        return balance;
    }
}

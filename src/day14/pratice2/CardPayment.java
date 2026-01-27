package day14.pratice2;

public class CardPayment extends Payment {
    private String cardNumber;

    // 부모클래스에 기본 생성자가 없으면 , super(...)로 명시적으로 호출해야한다.
    // 부모클래스에 amount를 사용한 생성자가 있기때문에 명시적으로 써줘야함
    public CardPayment(int amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean process() {
        System.out.println("카드결재");
        System.out.println("카드번호: " + maskCardNumber());
        System.out.println(String.format("%,d", amount) + "원 결재 완료!");
        return true;
    }

    private String maskCardNumber() {
        return cardNumber.substring(0, 4) + "-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}

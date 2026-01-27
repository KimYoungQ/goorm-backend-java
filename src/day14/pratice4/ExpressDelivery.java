package day14.pratice4;

public class ExpressDelivery extends Delivery {
    public ExpressDelivery(String item, String address) {
        super(item, address);
    }

    @Override
    public int calculateFee() {
        return 5000;
    }

    @Override
    public int estimateDays() {
        return 1;
    }
}

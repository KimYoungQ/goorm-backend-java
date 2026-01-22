package day13;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("현대", 4);
        Motorcycle moto = new Motorcycle("할리데이비슨", false);

        System.out.println("차량 테스트");

        car.showInfo();
        car.accelerate(50);
        car.hook();

        System.out.println();

        moto.showInfo();
        moto.accelerate(40);
        moto.wheelie();
        moto.stop();
    }
}

package day14.pratice1;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": 짹짹!");
    }

    public void fly() {
        System.out.println(name + "이(가) 날아갑니다.");
    }
}

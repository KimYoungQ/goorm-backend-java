package java_lecture.day14.pratice1;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": 멍멍!");
    }

    public void fetch() {
        System.out.println(name + "이(가) 공을 가져옵니다.");
    }
}

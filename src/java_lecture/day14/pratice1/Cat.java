package java_lecture.day14.pratice1;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + ": 야옹~");
    }

    public void scratch() {
        System.out.println(name + "이(가) 긁습니다.");
    }
}



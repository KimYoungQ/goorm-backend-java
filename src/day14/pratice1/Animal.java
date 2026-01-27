package day14.pratice1;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    //일반 메서드
    public void eat() {
        System.out.println(name + "이(가) 먹습니다.");
    }

    //추상 메서드
    public abstract void speak();

    public void showInfo() {
        System.out.println("이름: " + name);
    }
}

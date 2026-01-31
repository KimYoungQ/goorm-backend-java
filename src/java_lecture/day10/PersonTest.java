package java_lecture.day10;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 25;

        Person p2 = new Person("김영희", 30);
        Person p3 = new Person("이철수", 28, "개발자");

        System.out.println("=== 자기소개 ===");
        p1.introduce();
        System.out.println();
        p2.introduce();
        System.out.println();
        p3.introduce();
        System.out.println();

        System.out.println("\n=== 인사하기 ===");
        p1.greet(p2.name);
    }
}

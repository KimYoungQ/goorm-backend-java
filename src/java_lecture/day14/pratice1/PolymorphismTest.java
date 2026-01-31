package java_lecture.day14.pratice1;

public class PolymorphismTest {
    public static void main(String[] args) {
        //다형성
        Animal[] animals = {
                new Dog("바둑이"),
                new Cat("나비"),
                new Bird("쨱쨱이"),
                new Dog("멍멍이")
        };

        System.out.println("========= 모든 동물 소리 내기 =========");

        for(Animal animal : animals) {
            animal.speak();
        }

        System.out.println("========= 타입별 특수 동작 =========");

        for (Animal animal : animals) {
            animal.showInfo();

            if (animal instanceof Dog dog) {
                dog.fetch();
            } else if (animal instanceof Cat cat) {
                cat.scratch();
            } else if (animal instanceof Bird bird) {
                bird.fly();
            }
        }
    }
}

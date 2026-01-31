package java_lecture.day19.behaviorParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() { return color; }
    public int getWeight() { return weight; }

    @Override
    public String toString() {
        return color + " 사과" + weight + "g";
    }

    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple("빨강", 150),
                new Apple("초록", 120),
                new Apple("빨강", 170),
                new Apple("초록", 180),
                new Apple("노랑", 140)
        );

        // test를 오버라이드 한걸 람다로 표현 한거!
        List<Apple> redApples = filterApples(apples, apple -> "빨강".equals(apple.getColor()));

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isMultipleOf3 = n -> n % 3 == 0;

        Predicate<Integer> combined = isEven.and(isMultipleOf3);

        System.out.println(combined.test(6));
        System.out.println(combined.test(4));
    }
}

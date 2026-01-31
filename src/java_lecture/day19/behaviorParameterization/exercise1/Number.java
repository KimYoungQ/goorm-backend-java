package java_lecture.day19.behaviorParameterization.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Number {
    private Integer num;

    public Number(Integer num) {
        this.num = num;
    }
    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return num.toString();
    }

    public static List<Number> predicateNumber(List<Number> nums, Predicate<Integer> predicate) {
        List<Number> result = new ArrayList<>();
        for (Number n : nums) {
            if (predicate.test(n.getNum())) {
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(
                new Number(1),
                new Number(2),
                new Number(3),
                new Number(1),
                new Number(2),
                new Number(1)
        );

        System.out.println(Number.predicateNumber(numbers, n -> n == 1));
    }
}


package java_lecture.day19.behaviorParameterization.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Num {
    public Integer number;

    public Integer getNumber() { return number;}

    public static List<Num> predicateNums(List<Num> x, Predicate<Num> predicate) {
        List<Num> predicateNums = new ArrayList<>();
        for (Num i : x) {
            if (predicate.test(i)) {
                predicateNums.add(i);
            }
        }
        return predicateNums;
    }

    public static void main(String[] args) {
        List<Num> testNums = Arrays.asList();

//        System.out.println(predicateNums(testNums, integer -> Integer.valueOf(3).equals(testNums.getNum())));
    }

}

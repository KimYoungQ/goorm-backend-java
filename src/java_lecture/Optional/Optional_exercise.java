package java_lecture.Optional;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Optional_exercise {

    private static String Optional_test(String string) {
        return Optional.ofNullable(string)
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .orElse(string == null ? "NULL" : "SHORT");
    }

    // 1. 문자열을 받아서 길이가 5 이상이면 대문자로 변환, 아니면 "SHORT" 반환
    // 2. null이 들어오면 "NULL" 반환
    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "hi";
        String input3 = null;

        System.out.println(Optional_test(input1));
        System.out.println(Optional_test(input2));
        System.out.println(Optional_test(input3));
    }
}

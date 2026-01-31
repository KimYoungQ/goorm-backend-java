package java_lecture.day19.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 필터링
        System.out.println("=== 짝수 필터 ===");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n + " "));

        // 제곱 변환
        System.out.println("\n\n=== 제곱 ===");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n-> System.out.println(n + " "));

        // 합계
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("\n\n합계: " + sum);

        //짝수의 합
        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("짝수 합: " + evenSum);

        // 리스트로 수집
        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + evenList);

        // 문자열
        List<String> names = Arrays.asList("홍길동", "김영희", "이철수", "박지민");

        System.out.println("\n=== 문자열 처리 ===");
        names.stream()
                .filter(n -> n.length() >= 3)
                .sorted()
                .forEach(System.out::println);
    }
}

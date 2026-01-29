package day18;

import java.util.*;

public class Grouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 1),
                new Student("김영희", 2),
                new Student("이철수", 1),
                new Student("박지민", 2),
                new Student("최수진", 3)
        );

        Map<Integer, List<Student>> byGrade = new HashMap<>();

        for (Student s : students) {
            byGrade.computeIfAbsent(s.grade, k-> new ArrayList<>()).add(s);
        }

        System.out.println(byGrade);
    }
}

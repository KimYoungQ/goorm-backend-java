package java_lecture.day19.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int score;
    private String grade;

    public Student(String name, int score, String grade) {
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getScore() { return score; }
}

public class StreamStatistics {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("홍길동", 85, "A"),
                new Student("김영희", 92, "A"),
                new Student("이철수", 78, "B"),
                new Student("박지민", 95, "A"),
                new Student("최수현", 67, "C"),
                new Student("정민수", 88, "B")
        );

        // 통계
        IntSummaryStatistics stats = students.stream()
                .mapToInt(Student::getScore)
                .summaryStatistics();

        System.out.println("=== 성적 통계 ===");
        System.out.println("인원: " + stats.getCount());
        System.out.println("합계: " + stats.getSum());
        System.out.println("평균: " + String.format("%.1f", stats.getAverage()));
        System.out.println("최고: " + stats.getMax());
        System.out.println("최저: " + stats.getMin());

        // 80점이상 학생 수
        long count = students.stream()
                .filter(s -> s.getScore() >= 80)
                .count();
        System.out.println("\n80점 이상: " + count + "명");

        // 학년별 평균
        System.out.println("\n=== 학년별 평균 ===");
        Map<String, Double> avgByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.averagingInt(Student::getScore)
                ));

        avgByGrade.forEach((grade, avg) ->
                System.out.println(grade + "반: " + String.format("%.1f", avg)));

        // 이름 연결
        String allNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println("\n학생 명단: " + allNames);

        // 점수 상위 3명
        System.out.println("\n=== 점수 상위 3명===");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .limit(3)
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}

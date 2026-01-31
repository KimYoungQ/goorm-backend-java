package java_lecture.day19.behaviorParameterization.excercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static List<Student> filterScore(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (predicate.test(student)) {
                result.add(student);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("김영규", 70),
                new Student("이지은", 80),
                new Student("유명인", 90),
                new Student("이수진", 100)
        );

        List<Student> goodStudents = Student.filterScore(students, student -> student.getScore() > 80);
        System.out.println(goodStudents);
    }
}

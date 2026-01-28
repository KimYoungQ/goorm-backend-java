package day17.StudentManager;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int score) {
        students.add(new Student(name, score));
        System.out.println(name + " 학생 추가됨");
    }

    public void removeStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                System.out.println(name + " 학생 삭제됨");
                return;
            }
        }
        System.out.println(name + " 학생을 찾을 수 없습니다.");
    }

    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("=== 학생 목록 (" + students.size() + "명) ===");
        for (Student s : students) {
            System.out.println("- " + s);
        }
    }

    public double getAverage() {
        if (students.isEmpty()) return 0;

        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }

        return (double) sum / students.size();
    }

    public Student getTopStudent() {
        if (students.isEmpty()) return null;

        Student top = students.get(0);
        for (Student s : students) {
            if (s.getScore() > top.getScore()) {
                top = s;
            }
        }
        return  top;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("홍길동", 85);
        manager.addStudent("김영희", 92);
        manager.addStudent("이철수", 78);
        manager.addStudent("지노", 95);

        manager.printAll();

        System.out.println("\n평균 점수: " + String.format("%.1f", manager.getAverage()));
        System.out.println("1등: " + manager.getTopStudent());
        System.out.println("\n=== 검색 ===");
        Student found = manager.findStudent("김영희");
        if (found != null) {
            System.out.println("찾음: " + found);
        }

        manager.removeStudent("이철수");
        manager.printAll();
    }
}

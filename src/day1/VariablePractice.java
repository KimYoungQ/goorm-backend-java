package day1;

public class VariablePractice {
    public static void main(String[] args) {
        String name = "김영규";
        int age = 34;
        double height = 178;
        boolean isStudent = false;
        char grade = 'A';

        System.out.println("=== 학생정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "살");
        System.out.println("키: " + height + "cm");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학점: " + grade);

        age = 10;
        grade = 'B';

        System.out.println("\n=== 1년후 ===");
        System.out.println("나이: " + age + "살");
        System.out.println("학점: " + grade);
    }
}

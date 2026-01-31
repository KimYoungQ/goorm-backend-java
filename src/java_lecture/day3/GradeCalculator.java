package java_lecture.day3;

public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        char grade;
        String message;

        if (score >= 90) {
            grade = 'A';
            message = "우수합니다";
        } else if (score >= 80) {
            grade = 'B';
            message = "좋습니다";
        } else {
            grade = 'F';
            message = "재수강이 필요합니다";
        }

        System.out.println("점수: " + score + "점");
        System.out.println("학점: " + grade);
        System.out.println("평가: " + message);
    }
}

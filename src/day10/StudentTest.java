package day10;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("김영규", 1);
        student.setScores(90, 80, 100);

        student.printReport();
    }
}

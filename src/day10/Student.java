package day10;

public class Student {
    String name;
    int studentId;
    int[] scores;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.scores = new int[3];
    }

    // 성적 입력
    public void setScores(int korean, int english, int math) {
        this.scores[0] = korean;
        this.scores[1] = english;
        this.scores[2] = math;
    }

    // 총점 계산
    public int getTotal() {
        int sum = 0;
        for (int score : this.scores) {
            sum += score;
        }
        return sum;
    }

    // 평균 계산
    public double getAverage() {
        return (double) this.getTotal() / this.scores.length;
    }

    public void printReport() {
        System.out.println("=== 성적표 ===");
        System.out.println("학번: " + this.studentId);
        System.out.println("이름: " + this.name);
        System.out.println("국어: " + this.scores[0] + ", 영어: " + this.scores[1] + ", 수학: " + this.scores[2]);
        System.out.println("총점: " + this.getTotal() + ", 평균: " + String.format("%.1f", this.getAverage()));
    }
}

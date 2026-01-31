package java_lecture.day5;

public class GradeManagementSystem {
    public static void main(String[] args) {
        int[][] reportCard = {
                {85, 90, 78},
                {92, 88, 95},
                {76, 65, 70},
                {88, 82, 90},
                {55, 60, 58}
        };

        int[] scoreTotal = new int[5]; // 총점
        double[] scoreAVG = new double[5]; // 평균
        char[] scoreGrade = new char[5]; // 등급

        // 총점, 평균, 등급 계산
        for (int i = 0; i < reportCard.length; i++) {

            int total = 0;
            double avg = 0;
            int subjectCount = 0;

            for (int j = 0; j < reportCard[i].length; j++) {

                total += reportCard[i][j];
                subjectCount = reportCard[i].length;

                if (j == (reportCard[i].length - 1)) {
                    //System.out.println(total);
                    scoreTotal[i] = total;

                    //System.out.println(scoreAVG);
                    scoreAVG[i] = (double) total / subjectCount;

                    if (scoreAVG[i] >= 90.00) {
                        scoreGrade[i] = 'A';
                    } else if (scoreAVG[i] >= 80.00) {
                        scoreGrade[i] = 'B';
                    } else if (scoreAVG[i] >= 70.00) {
                        scoreGrade[i] = 'C';
                    } else if (scoreAVG[i] >= 60.00) {
                        scoreGrade[i] = 'D';
                    } else {
                        scoreGrade[i] = 'F';
                    }
                }
            }
        }

        System.out.println("성적 관리 시스템");
        System.out.println();
        System.out.println("[학생별 성적]");

        for (int i = 0; i < reportCard.length; i++) {
            System.out.printf("%d번 학생: 총점 = %d, 평균 = %.2f, 등급 = %c\n", i+1, scoreTotal[i], scoreAVG[i], scoreGrade[i]);
        }

        double maxAVG = scoreAVG[0];
        double minAVG = scoreAVG[0];

        for (double avg : scoreAVG) {
            if(maxAVG < avg) maxAVG = avg;
        }

        for (double avg : scoreAVG) {
            if(minAVG > avg) minAVG = avg;
        }

        System.out.println();
        System.out.println("[전체 통계]");
        System.out.printf("최고 평균: %.2f\n", maxAVG);
        System.out.printf("최저 평균: %.2f\n", minAVG);
    }
}

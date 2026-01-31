package java_lecture.day5;

import java.util.Arrays;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] data = {3, 7, 1, 9, 4, 6, 8, 2, 5};
        int target = 7;

        int[] sortData = new int[data.length];

        // 복사
        for (int i = 0; i < data.length; i++) {
            sortData[i] = data[i];
        }

        // 정렬된 배열
        for (int i = sortData.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sortData[j] > sortData[j + 1]) {
                    int temp = sortData[j];
                    sortData[j] = sortData[j + 1];
                    sortData[j + 1] = temp;
                }
            }
        }

        int max = data[0];
        int min = data[0];
        int total = 0;
        double avg = 0;

        // 최대
        for (int value : data) {
            if (value > max) max = value;
        }

        // 최소
        for (int value : data) {
            if (value < min) min = value;
        }

        // 합계
        for (int value : data) {
            total += value;
        }

        // 평균
        avg = (double)total / data.length;

        // 짝수의 개수, 홀수
        int evenCount = 0;
        int oddCount = 0;

        for (int value : data) {
            if (value % 2 == 0) {
                evenCount++;
            } else if (value % 2 == 1) {
                oddCount++;
            }
        }

        //검색 결과
        int searchNumber = 7;
        int findIndex = 0;

        for (int i = 0; i < data.length; i++) {
            if (searchNumber == data[i]) {
                findIndex = i;
            }
        }

        System.out.println("배열 분석기");
        System.out.println("원본 배열: " + Arrays.toString(data));
        System.out.println("정렬된 배열: " + Arrays.toString(sortData));
        System.out.println();
        System.out.println("[기본 통계]");
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
        System.out.println("합계 : " + total);
        System.out.printf("평균: %.2f\n", avg);
        System.out.println();
        System.out.println("[짝수/홀수 분석]");
        System.out.printf("짝수 개수: %d개\n", evenCount);
        System.out.printf("홀수 개수: %d개\n", oddCount);
        System.out.println();
        System.out.println("[검색 결과]");
        System.out.printf("%d 검색 결과: 인덱스 %d에서 발견", searchNumber, findIndex);

    }
}

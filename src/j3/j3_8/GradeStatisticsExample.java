package j3.j3_8;

import java.util.Scanner;

public class GradeStatisticsExample {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final int MAX_SCORES = 50;
        double[] scores = new double[MAX_SCORES];
        int scoreCount = 0;

        System.out.println("=== 성적 통계 계산기 ===");
        System.out.println("점수를 입력하세요 (0 이하로 종료):");

        // 점수 입력
        while (scoreCount < MAX_SCORES) {
            System.out.print("점수 " + (scoreCount + 1) + ": ");
            double score = sc.nextDouble();

            if (score <= 0) {
                break;
            }

            if (score > 100) {
                System.out.println("❌ 100점을 초과할 수 없습니다.");
                continue;
            }

            scores[scoreCount] = score;
            scoreCount++;
        }

        if (scoreCount == 0) {
            System.out.println("입력된 점수가 없습니다.");
            return;
        }

        // TODO: 통계 계산 (합계, 최대, 최소, 평균, 표준편차)
        // 힌트: 누적과 표준편차 공식

        // 여기에 코드를 작성하세요
        double sum = 0;
        double max = scores[0];
        double min = scores[0];

        for (int i = 0; i < scoreCount; i++) {
            sum += scores[i];
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }

        double average = sum / scoreCount;

        double varianceSum = 0;
        for (int i = 0; i < scoreCount; i++) {
            varianceSum += (scores[i] - average) * (scores[i] - average);
        }
        double standardDeviation = Math.sqrt(varianceSum / (scoreCount - 1));

        // TODO: 등급별 분포 계산
        // 힌트: else-if 체인

        // 여기에 코드를 작성하세요
        int[] gradeCount = new int[5];

        for (int i = 0; i < scoreCount; i++) {
            double s = scores[i];
            if (s >= 90) gradeCount[0]++;
            else if (s >= 80) gradeCount[1]++;
            else if (s >= 70) gradeCount[2]++;
            else if (s >= 60) gradeCount[3]++;
            else gradeCount[4]++;
        }

        // 결과 출력
        System.out.println("\n" + "=".repeat(40));
        System.out.println("📊 통계 결과");
        System.out.println("=".repeat(40));
        System.out.printf("입력된 점수 개수: %d개%n", scoreCount);
        System.out.printf("합계: %.2f점%n", sum);
        System.out.printf("평균: %.2f점%n", average);
        System.out.printf("최고점: %.2f점%n", max);
        System.out.printf("최저점: %.2f점%n", min);
        System.out.printf("표준편차: %.2f%n", standardDeviation);

        System.out.println("\n등급별 분포:");
        String[] grades = {"A (90-100)", "B (80-89)", "C (70-79)", "D (60-69)", "F (0-59)"};
        for (int i = 0; i < grades.length; i++) {
            double percentage = (gradeCount[i] * 100.0) / scoreCount;
            System.out.printf("%s: %d명 (%.1f%%)%n", grades[i], gradeCount[i], percentage);

            // 막대 그래프
            System.out.print("  ");
            int barLength = (int)(percentage / 2);  // 50% = 25개 문자
            for (int j = 0; j < barLength; j++) {
                System.out.print("█");
            }
            System.out.println();
        }
    }
}

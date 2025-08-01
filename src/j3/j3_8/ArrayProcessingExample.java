package j3.j3_8;

public class ArrayProcessingExample {
    public static void main(String[] args) {
        double[] temperatures = {23.5, 25.0, 22.8, 26.3, 24.1, 25.5, 23.9};
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.println("=== 주간 온도 데이터 ===");

        // 1. 데이터 출력
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("%s요일: %.1f°C%n", days[i], temperatures[i]);
        }

        // TODO: 합계와 평균 계산
        // 힌트: for 루프와 누적

        // 여기에 코드를 작성하세요
        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        System.out.printf("\n주간 온도 합계: %.1f°C%n", sum);
        double average = sum / temperatures.length;
        System.out.printf("주간 평균 온도: %.1f°C%n", average);

        // TODO: 최고 온도와 최저 온도 찾기
        // 힌트: 비교와 갱신

        // 여기에 코드를 작성하세요
        double max = temperatures[0], min = temperatures[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
                maxIndex = i;
            }
            if (temperatures[i] < min) {
                min = temperatures[i];
                minIndex = i;
            }
        }
        System.out.printf("\n최고 온도: %.1f°C (%s요일)%n", max, days[maxIndex]);
        System.out.printf("최저 온도: %.1f°C (%s요일)%n", min, days[minIndex]);

        // TODO: 평균보다 높은 날 찾기
        // 힌트: 조건문과 카운터
        System.out.println("\n평균보다 높은 온도의 날:");

        // 여기에 코드를 작성하세요
        int count = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                double diff = temperatures[i] - average;
                System.out.printf("  %s요일: %.1f°C (평균보다 +%.1f°C)%n", days[i], temperatures[i], diff);
                count++;
            }
        }
        System.out.printf("총 %d일%n", count);
    }
}

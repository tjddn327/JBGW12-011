package j7.J7_1;

public class MixedParameters {
    // TODO: 일반 매개변수와 가변 인수를 혼합한 메서드를 작성하세요
    // 메서드명: formatMessage
    // 매개변수: String prefix, String... items
    // 반환값: "prefix: item1, item2, item3" 형태의 문자열
    public static String formatMessage(String prefix, String... items) {
        if (items.length == 0) {
            return prefix + ": ";
        }
        // String.join()을 사용하여 간단하게 구현
        return prefix + ": " + String.join(", ", items);
    }

    // TODO: 다양한 타입의 매개변수를 가진 메서드를 작성하세요
    // 메서드명: printReport
    // 매개변수: String title, int year, double... values
    // 출력: 제목, 각 월의 값, 연간 총계, 월 평균
    public static void printReport(String title, int year, double... values) {
        System.out.printf("=== %s (%d년) ===\n", title, year);
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d월: %.1f\n", i + 1, values[i]);
            total += values[i];
        }
        System.out.printf("연간 총계: %.1f\n", total);
        if (values.length > 0) {
            System.out.printf("월 평균: %.1f\n", total / values.length);
        }
    }

    public static void main(String[] args) {
        // formatMessage 사용
        System.out.println(formatMessage("과일", "사과", "바나나", "오렌지"));
        System.out.println(formatMessage("색상", "빨강", "파랑"));
        System.out.println(formatMessage("숫자"));  // 가변 인수 0개

        System.out.println();

        // printReport 사용
        printReport("월별 매출", 2024,
                150.5, 180.3, 165.7, 195.2, 210.5, 188.9);
    }
}
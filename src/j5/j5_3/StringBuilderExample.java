package j5.j5_3;

import java.util.Random;

/**
 * StringBuilder를 활용한 효율적인 문자열 처리 예제
 */
public class StringBuilderExample {

    // TODO 1: 비효율적인 방법 - String 연결 메서드 구현하기
    public static String createStringInefficient(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i + " ";
        }
        return result;
    }

    // TODO 2: 효율적인 방법 - StringBuilder 사용 메서드 구현하기
    public static String createStringEfficient(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(i).append(" ");
        }
        return builder.toString();
    }

    // TODO 3: HTML 테이블 생성 메서드 구현하기
    public static String createHtmlTable(String[][] data) {
        StringBuilder html = new StringBuilder();
        html.append("<table border='1'>\n");
        for (String[] row : data) {
            html.append("  <tr>\n");
            for (String cell : row) {
                html.append("    <td>").append(cell).append("</td>\n");
            }
            html.append("  </tr>\n");
        }
        html.append("</table>");
        return html.toString();
    }

    // TODO 4: 성능 비교 테스트 메서드 구현하기
    public static void performanceTest() {
        int count = 10000;

        long start1 = System.currentTimeMillis();
        createStringInefficient(count);
        long end1 = System.currentTimeMillis();
        long inefficientTime = end1 - start1;

        long start2 = System.currentTimeMillis();
        createStringEfficient(count);
        long end2 = System.currentTimeMillis();
        long efficientTime = end2 - start2;

        System.out.println("\n=== 성능 비교 (반복 " + count + "회) ===");
        System.out.println("String 연결: " + inefficientTime + "ms");
        System.out.println("StringBuilder: " + efficientTime + "ms");
        if (efficientTime != 0) {
            System.out.printf("성능 향상: %.1f배\n", (double) inefficientTime / efficientTime);
        } else {
            System.out.println("성능 향상: 매우 큼 (StringBuilder가 거의 0ms)");
        }
    }

    // TODO 5: 사용 예제 완성하기
    public static void main(String[] args) {
        System.out.println("=== StringBuilder 사용 예제 ===\n");

        // TODO 6: StringBuilder 기본 사용법 테스트하기
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb.toString());

        // TODO 7: HTML 테이블 생성 테스트하기
        System.out.println("\n=== 생성된 HTML 테이블 ===");
        String[][] tableData = {
                {"이름", "나이", "직업"},
                {"김철수", "25", "프로그래머"},
                {"이영희", "23", "디자이너"},
                {"박민수", "30", "기획자"}
        };
        String html = createHtmlTable(tableData);
        System.out.println(html);

        // TODO 8: 성능 테스트 실행하기
        performanceTest();
    }
}

package j3_4;

public class InterestCalculation {
    public static void main(String[] args) {
        double principal = 1000.0;  // 원금
        double rate = 0.05;         // 이자율 5%

        System.out.println("=== while 루프 버전 ===");
        double balance1 = principal;
        int year1 = 0;
        while (year1 < 5) {
            double interest = balance1 * rate;
            balance1 += interest;
            year1++;
            System.out.printf("%d년 후: $%.2f%n", year1, balance1);
        }

        System.out.println("\n=== for 루프 버전 ===");
        double balance2 = principal;

        // TODO: for 루프로 이자 계산
        // 힌트:
        // 1. year2를 1부터 5까지 반복
        // 2. 각 년도마다:
        //    - interest = balance2 * rate
        //    - balance2에 interest를 더하기
        //    - 결과 출력 (printf 사용)

        // 여기에 코드를 작성하세요
        for(int year2 = 1; year2 <= 5;year2++) {
            double interest = balance2 * rate;
            balance2 += interest;
            System.out.printf("%d년 후: $%.2f%n", year2, balance2);
        }
    }
}

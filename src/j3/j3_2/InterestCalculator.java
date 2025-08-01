package j3.j3_2;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;  // 원금
        double rate;       // 이자율
        int years;         // 기간

        // 사용자 입력
        System.out.print("초기 투자 금액: $");
        principal = sc.nextDouble();

        System.out.print("연간 이자율 (%): ");
        double percent = sc.nextDouble();
        rate = percent / 100.0;  // 백분율을 소수로 변환

        System.out.print("투자 기간 (년): ");
        years = sc.nextInt();

        System.out.println("\n년도   \t투자 가치");
        System.out.println("----\t----------");

        // TODO: 계산 및 출력
        // 힌트:
        // 1. year 변수를 0으로 초기화
        // 2. while 루프로 year < years 동안 반복
        // 3. 각 반복에서:
        //    - year를 1 증가
        //    - 이자 = 원금 * 이자율
        //    - 원금 = 원금 + 이자
        //    - 결과 출력 (printf 사용)

        // 여기에 코드를 작성하세요

        int year = 0;
        while(year < years){
            year++;
            double interest = principal * rate;
            principal += interest;
            System.out.printf("%d   \t$%,.2f\n", year, principal);

        }

        System.out.println("\n최종 투자 가치: $" +
                String.format("%,.2f", principal));
    }
}

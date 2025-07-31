package j3_5;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;
        String reason = "A";

        // TODO: 윤년 판별 로직
        // 힌트: 판별 순서가 중요함 (400 → 100 → 4)

        // 여기에 코드를 작성하세요

        // 결과 출력
        if(year%4==0 && year%100!=0){
            isLeapYear = true;
            reason = "4로 나누어떨어지고 100으로는 안 되므로";
        }else if(year%400==0){
            isLeapYear = true;
            reason = "400으로 나누어떨어지므로";
        }else if(year%100==0 && year%400!=0){
            isLeapYear = false;
            reason = "100으로 나누어떨어지지만 400으로는 안 되므로";
        }

        if (isLeapYear) {
            System.out.println(year + "년은 윤년입니다.");
        } else {
            System.out.println(year + "년은 평년입니다.");
        }
        System.out.println("이유: " + reason);

        // 2월의 일수
        int daysInFebruary = isLeapYear ? 29 : 28;
        System.out.println(year + "년 2월은 " + daysInFebruary + "일입니다.");
    }
}

package j3.j3_5;

import java.util.Scanner;

public class LengthConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 길이 단위 변환기 ===");
        System.out.println("사용법: 숫자와 단위를 입력 (예: 5.5 feet)");
        System.out.println("지원 단위: inch(in), feet(ft), yard(yd), mile(mi)");
        System.out.println("종료: 0 입력\n");

        while (true) {
            System.out.print("측정값 입력: ");
            double measurement = sc.nextDouble();

            if (measurement == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            String unit = sc.next().toLowerCase();

            // TODO: 인치로 변환
            double inches = 0.0;
            // 힌트: equals() 메서드 사용

            // 여기에 코드를 작성하세요

            if(unit.equals("in")){
                inches = measurement;
            }else if(unit.equals("ft")){
                inches = measurement*12;
            }else if(unit.equals("yd")){
                inches = measurement*36;
            }else if(unit.equals("mi")){
                inches = measurement*12*5280;
            }

            // 모든 단위로 변환
            double feet = inches / 12.0;
            double yards = inches / 36.0;
            double miles = inches / (12.0 * 5280.0);

            // 결과 출력
            System.out.println("\n변환 결과:");
            System.out.printf("  %,.2f inches%n", inches);
            System.out.printf("  %,.2f feet%n", feet);
            System.out.printf("  %,.2f yards%n", yards);
            System.out.printf("  %,.6f miles%n", miles);

            // TODO: 추가 정보
            // 힌트: if-else if 사용

            // 여기에 코드를 작성하세요

            if(yards > 1.0){
                System.out.println("팁: 1야드보다 큽니다.");
            }else if(miles > 1.0 && unit.equals("mi")){
                System.out.println("팁: 1마일 이상입니다!");
            }

            System.out.println();
        }
    }
}

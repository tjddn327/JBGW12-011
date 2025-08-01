package j3.j3_2;

import java.util.Scanner;

public class MenuValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== 계산기 메뉴 ===");

        do {
            System.out.println("\n1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 종료");
            System.out.print("\n선택 (1-5): ");

            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("\n⚠️  1부터 5 사이의 숫자를 선택해주세요!");
                continue;
            }

            if (choice == 5) {
                System.out.println("\n프로그램을 종료합니다.");
                break;
            }

            // 선택된 연산 수행
            System.out.print("첫 번째 숫자: ");
            double num1 = sc.nextDouble();
            System.out.print("두 번째 숫자: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean validOperation = true;

            // TODO: choice에 따라 연산 수행
            // 힌트:
            // 1. choice가 1이면 더하기
            // 2. choice가 2이면 빼기
            // 3. choice가 3이면 곱하기
            // 4. choice가 4이면 나누기
            //    - 주의: num2가 0이면 오류 메시지 출력
            //    - validOperation을 false로 설정

            // 여기에 코드를 작성하세요

            if(choice == 1){
                result = num1 + num2;
            }
            else if(choice == 2){
                result = num1 - num2;
            }
            else if(choice == 3){
                result = num1 * num2;
            }
            else if(choice == 4){
                if(num2 == 0){
                    validOperation = false;
                    System.out.println("0으로 나눌 수 없습니다!");
                }
                else
                    result = num1 / num2;
            }

            if (validOperation) {
                System.out.println("결과: " + result);
            }

        } while (choice != 5);
    }
}

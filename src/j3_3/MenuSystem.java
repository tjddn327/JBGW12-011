package j3_3;

import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== 간단한 계산기 ===");

        do {
            // 메뉴 표시
            System.out.println("\n메뉴:");
            System.out.println("1. 두 수의 합");
            System.out.println("2. 두 수의 차");
            System.out.println("3. 두 수의 곱");
            System.out.println("4. 두 수의 몫");
            System.out.println("0. 종료");

            System.out.print("\n선택: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("첫 번째 숫자: ");
                double num1 = sc.nextDouble();
                System.out.print("두 번째 숫자: ");
                double num2 = sc.nextDouble();

                double result = 0;
                String operation = "";

                // TODO: choice에 따른 계산 수행
                // 힌트:
                // 1. choice가 1: 덧셈 (result = num1 + num2, operation = "+")
                // 2. choice가 2: 뻔셈 (result = num1 - num2, operation = "-")
                // 3. choice가 3: 곱셈 (result = num1 * num2, operation = "×")
                // 4. choice가 4: 나눗셈
                //    - num2가 0이 아닌 경우: result = num1 / num2, operation = "÷"
                //    - num2가 0인 경우: 오류 메시지 출력 후 continue

                // 여기에 코드를 작성하세요

                if(choice == 1){
                    result = num1 + num2;
                }
                else if(choice == 2){
                    result = num1 - num2;
                }
                else if(choice == 3){
                    result = num2 * num1;
                }
                else if(choice == 4){
                    if(num2 == 0){
                        System.out.println("0으로 못나눔");
                        continue;
                    }
                    result = num1 / num2;
                }

                System.out.printf("%.2f %s %.2f = %.2f%n",
                        num1, operation, num2, result);
            } else if (choice != 0) {
                System.out.println("잘못된 선택입니다!");
            }

        } while (choice != 0);

        System.out.println("\n프로그램을 종료합니다.");
    }


}

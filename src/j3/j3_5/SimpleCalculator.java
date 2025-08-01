package j3.j3_5;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 간단한 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = sc.nextDouble();

        System.out.print("연산자 (+, -, *, /, %, ^): ");
        String operator = sc.next().trim();

        System.out.print("두 번째 숫자: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean validOperation = true;
        String operation = "";

        // TODO: 연산자별 계산
        // 힌트: if-else if 체인, equals() 사용

        // 여기에 코드를 작성하세요
        if(operator.equals("+")){
            operation = "+";
            result = num1 + num2;
        }
        else if(operator.equals("-")){
            operation = "-";
            result = num1 - num2;
        }
        else if(operator.equals("*")){
            operation = "*";
            result = num1 * num2;
        }
        else if(operator.equals("/") && num2 != 0){
            operation = "/";
            result = num1 / num2;
        }
        else if(operator.equals("/") && num2 == 0){
            System.out.println("0으로 나눌 수 없습니다!");
            return;
        }
        else if(operator.equals("^")){
            operation = "^";
            result = Math.pow(num1, num2);
        }

        if (validOperation) {
            System.out.println("\n=== 계산 결과 ===");
            System.out.println("연산: " + operation);
            System.out.printf("%.2f %s %.2f = %.2f%n", num1, operator, num2, result);

            // TODO: 추가 정보
            // 힌트: (int)result == result로 정수 확인

            // 여기에 코드를 작성하세요
            if((int)result == result){
                System.out.println("정수값: " + result);
            }
            if(result > 0){
                System.out.println("결과는 양수입니다.");
            }
            else if(result < 0){
                System.out.println("결과는 음수입니다.");
            }
            else{
                System.out.println("0입니다.");
            }
        }
    }
}

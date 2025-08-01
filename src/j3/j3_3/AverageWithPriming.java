package j3.j3_3;

import java.util.Scanner;

public class AverageWithPriming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("=== 평균 계산기 ===");
        System.out.println("양수를 입력하세요 (0 입력시 종료):");


        // 루프 준비 - 첫 번째 입력
        System.out.print("숫자: ");
        int number = sc.nextInt();
        if(number > 0){
            sum+=number;
            count++;
        }
        else if(number == 0){
            System.out.println("\n입력된 데이터가 없습니다!");
            return;
        }
        // TODO: 센티넬 값(0)이 아닐 때까지 반복
        // 힌트:
        // 1. number가 0이 아닌 동안 반복
        // 2. number가 양수이면:
        //    - sum에 더하기
        //    - count 증가
        // 3. 음수이면 오류 메시지
        // 4. 다음 입력을 받기

        // 여기에 코드를 작성하세요
        while(true){
            System.out.print("숫자: ");
            number = sc.nextInt();
            if(number < 0){
                System.out.println("양수만 입력해주세요!");
                continue;
            }
            sum+=number;
            count++;
            if(number==0){
                count--;
                break;
            }

        }


        // 결과 출력
        if (count == 0) {
            System.out.println("\n입력된 데이터가 없습니다!");
        } else {
            double average = (double) sum / count;
            System.out.println("\n=== 결과 ===");
            System.out.println("입력한 숫자: " + count + "개");
            System.out.println("합계: " + sum);
            System.out.printf("평균: %.2f%n", average);
        }
    }
}

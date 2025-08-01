package j3.j3_2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // 변수 초기화
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        System.out.println("=== 평균 계산기 ===");
        System.out.println("숫자를 입력하세요 (0 입력 시 종료):");

        // TODO: 입력 및 합계 계산
        // 힌트:
        // 1. while(true) 무한 루프를 사용
        // 2. 사용자로부터 숫자를 입력받기 (TextIO.getlnDouble())
        // 3. 입력값이 0이면 루프 종료 (break)
        // 4. 0이 아니면 sum과 count를 업데이트

        // 여기에 코드를 작성하세요
        while(true){
            System.out.print("숫자: ");
            double num = sc.nextDouble();
            sum += num;
            count++;
            if(num == 0){
                count--;
                break;
            }
        }

        // TODO: 평균 계산 및 출력
        // 힌트:
        // 1. count가 0보다 큰지 확인
        // 2. 평균 = sum / count
        // 3. 결과를 보기 좋게 출력
        // 4. count가 0이면 "입력된 숫자가 없습니다." 출력

        // 여기에 코드를 작성하세요
        System.out.println("=== 결과 ===");
        System.out.println("입력한 숫자: "+count+"개");
        System.out.println("합계: "+sum);
        System.out.println("평균: "+(sum/count));
    }
}

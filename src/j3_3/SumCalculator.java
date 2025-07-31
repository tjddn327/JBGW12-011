package j3_3;

public class SumCalculator {
    public static void main(String[] args) {
        // TODO: 1부터 100까지의 합 계산
        // 힌트:
        // 1. n을 1로, sum을 0으로 초기화
        // 2. n이 100 이하인 동안:
        //    - sum에 n을 더하기
        //    - n을 1 증가
        int n = 1;
        int sum = 0;

        // 여기에 코드를 작성하세요

        while (n <= 100){
            sum+=n;
            n++;
        }

        System.out.println("1부터 100까지의 합: " + sum);

        // TODO: 1부터 100까지 짝수의 합 계산
        // 힌트:
        // 1. n을 2로, sum을 0으로 초기화
        // 2. n이 100 이하인 동안:
        //    - sum에 n을 더하기
        //    - n을 2 증가 (짝수만)
        n = 2;
        sum = 0;
        while (n <= 100){
            sum+=n;
            n++;
            n++;
        }
        // 여기에 코드를 작성하세요

        System.out.println("1부터 100까지 짝수의 합: " + sum);
    }
}

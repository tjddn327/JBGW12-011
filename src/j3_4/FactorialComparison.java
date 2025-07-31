package j3_4;

public class FactorialComparison {
    public static void main(String[] args) {
        int n = 5;

        // while 루프 버전
        int factorial1 = 1;
        int i = 1;
        while (i <= n) {
            factorial1 *= i;
            i++;
        }
        System.out.println("while 루프: " + n + "! = " + factorial1);

        // TODO: for 루프 버전
        // 힌트:
        // 1. factorial2를 1로 초기화
        // 2. j를 1부터 n까지 반복
        // 3. factorial2에 j를 곱하기

        // 여기에 코드를 작성하세요
        int factorial2 = 1;
        for(int j = 1; j <= n; j++) {
            factorial2 *= j;
        }
        System.out.println("for 루프: 5! = " + factorial2);
        System.out.println();
        // TODO: 계산 과정 보여주기
        // 힌트:
        // 1. "계산 과정: 5! = " 출력
        // 2. k를 1부터 n까지 반복하며:
        //    - k 출력
        //    - k < n이면 " × " 출력
        // 3. 마지막에 " = " + factorial2 출력

        // 여기에 코드를 작성하세요
        System.out.print("계산 과정: ");
        for(int k = 1; k <= n; k++) {
            System.out.print(k);
            if(k < n){
                System.out.print(" x ");
            }
        }
        System.out.print(" = " + factorial2);
    }
}

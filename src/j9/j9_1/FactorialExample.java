package j9.j9_1;

public class FactorialExample {

    /**
     * 재귀를 사용한 팩토리얼 계산
     * n! = n × (n-1) × (n-2) × ... × 1
     */
    public static long factorial(int n) {
        // TODO 1: 입력 검증 - n이 음수인 경우 IllegalArgumentException 던지기

        // TODO 2: 기저 사례 구현
        // 힌트: 0! = 1, 1! = 1
        try{
            if(n == 0 || n == 1){
                return 1;
            }else if(n < 0){
                throw new IllegalArgumentException();
            }
            return n * factorial(n - 1);
        }catch(IllegalArgumentException e){
            System.out.println("음수 불가");
            return 0;
        }
        // TODO 3: 재귀 사례 구현
        // 힌트: n! = n × (n-1)!
    }

    /**
     * 재귀 과정을 시각화하는 팩토리얼
     */
    public static long factorialWithTrace(int n, String indent) {
        System.out.println(indent + "factorial(" + n + ") 계산 시작");

        // TODO: 기저 사례와 재귀 사례를 구현하면서 각 단계를 출력
        if(n == 1){
            indent = "기저 사례";
            return 1;
        }

        return 0; // 임시 반환값
    }

    public static void main(String[] args) {
        System.out.println("=== 팩토리얼 예제 ===");

        // 실행 결과:
        // 0! = 1
        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24
        // 5! = 120
        System.out.println("0! = " + factorial(0));
        System.out.println("1! = " + factorial(1));
        System.out.println("2! = " + factorial(2));
        System.out.println("3! = " + factorial(3));
        System.out.println("4! = " + factorial(4));
        System.out.println("5! = " + factorial(5));

        System.out.println("\n=== 재귀 과정 추적 ===");
        // factorial(4) 계산 시작
        //   factorial(3) 계산 시작
        //     factorial(2) 계산 시작
        //       factorial(1) 계산 시작
        //       기저 사례: factorial(1) = 1
        //     factorial(2) = 2 × 1 = 2
        //   factorial(3) = 3 × 2 = 6
        // factorial(4) = 4 × 6 = 24

    }
}
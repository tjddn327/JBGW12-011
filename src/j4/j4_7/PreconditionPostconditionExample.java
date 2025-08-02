package j4.j4_7;

public class PreconditionPostconditionExample {
    public static void main(String[] args) {
        System.out.println("=== 사전/사후 조건 예제 ===\n");

        // TODO 1: factorial 메서드 테스트하기
         System.out.println("5! = " + factorial(5));
         System.out.println("0! = " + factorial(0));

        // TODO 2: 예외 상황 테스트하기
         try {
             System.out.println("(-3)! = " + factorial(-3));
         } catch (IllegalArgumentException e) {
             System.out.println("오류: " + e.getMessage());
         }
    }

    // TODO 3: factorial 메서드 구현하기
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수의 팩토리얼은 정의되지 않습니다: " + n);
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

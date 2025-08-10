package j9.j9_1;

public class TailRecursion {

    /**
     * 일반 재귀 팩토리얼 (스택 프레임이 계속 쌓임)
     */
    public static long factorialNormal(int n) {
        if (n <= 1) {
            return 1;
        }
        // n과 재귀 호출의 결과를 곱하는 연산이 마지막에 수행됨
        return n * factorialNormal(n - 1);
    }

    /**
     * 꼬리 재귀 팩토리얼 (Java에서는 최적화되지 않음)
     */
    public static long factorialTail(int n) {
        // 도우미 함수에 초기 누적값 1을 전달하며 호출
        return factorialTailHelper(n, 1);
    }

    private static long factorialTailHelper(int n, long acc) {
        // TODO: 꼬리 재귀 구현
        // 힌트: 누적값(acc)을 사용하여 계산

        // 기저 사례: n이 1 이하면 누적된 결과를 반환
        if (n <= 1) {
            return acc;
        }

        // 재귀 호출이 함수의 마지막 동작임 (꼬리 호출)
        // 현재 단계의 계산(acc * n)을 다음 재귀 호출의 인자로 넘김
        return factorialTailHelper(n - 1, acc * n);
    }

    public static void main(String[] args) {
        System.out.println("=== 꼬리 재귀 예제 ===");

        int n = 5;
        System.out.println("일반 재귀: " + n + "! = " + factorialNormal(n));
        System.out.println("꼬리 재귀: " + n + "! = " + factorialTail(n));
        System.out.println("(Java는 꼬리 재귀 최적화를 지원하지 않지만, 패턴 이해용)");

        // 큰 수에 대한 테스트 (스택 오버플로우 발생 가능)
        try {
            // 매우 큰 n 값 (예: 20000)을 사용하면 StackOverflowError 발생
            // factorialNormal(20000);
        } catch (StackOverflowError e) {
            System.out.println("\n일반 재귀에서 StackOverflowError 발생!");
        }
    }
}
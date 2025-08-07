package j9.j9_1;

public class TailRecursion {

    /**
     * 일반 재귀 팩토리얼
     */
    public static long factorialNormal(int n) {
        if (n <= 1) return 1;
        return n * factorialNormal(n - 1);
    }

    /**
     * 꼬리 재귀 팩토리얼
     */
    public static long factorialTail(int n) {
        return factorialTailHelper(n, 1);
    }

    private static long factorialTailHelper(int n, long acc) {
        // TODO: 꼬리 재귀 구현
        // 힌트: 누적값(acc)을 사용하여 계산
        if (n == 1) return acc;

        return factorialTailHelper(n-1, n*acc); // 임시 반환값
    }

    public static void main(String[] args) {
        System.out.println("=== 꼬리 재귀 예제 ===");

        // 실행 결과:
        // 일반 재귀: 5! = 120
        // 꼬리 재귀: 5! = 120
        // (Java는 꼬리 재귀 최적화를 지원하지 않지만, 패턴 이해용)
        System.out.println(factorialNormal(5));
        System.out.println(factorialTail(5));
    }
}
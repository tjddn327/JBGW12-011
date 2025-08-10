package j9.j9_6;

import java.math.BigInteger;

public class RecursiveFunctions {

    /**
     * 팩토리얼 계산 (long 버전)
     */
    public static long factorial(int n) {
        // TODO 1: n이 음수인 경우 IllegalArgumentException 던지기
        if (n < 0) {
            throw new IllegalArgumentException("음수는 팩토리얼을 계산할 수 없습니다.");
        }
        // TODO 2: 기본 경우 - n이 0이면 1 반환
        if (n == 0) {
            return 1;
        }
        // TODO 3: 재귀 경우 - n * factorial(n-1) 반환
        return n * factorial(n - 1);
    }

    /**
     * 팩토리얼 계산 (BigInteger 버전)
     */
    public static BigInteger factorialBig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수는 팩토리얼을 계산할 수 없습니다.");
        }
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialBig(n - 1));
    }

    /**
     * 피보나치 계산 (비효율적인 재귀 버전)
     */
    public static long fibonacci(int n) {
        // TODO 1: n이 음수인 경우 IllegalArgumentException 던지기
        if (n < 0) {
            throw new IllegalArgumentException("음수는 피보나치를 계산할 수 없습니다.");
        }
        // TODO 2: 기본 경우 - n이 0 또는 1이면 1 반환
        if (n == 0 || n == 1) {
            return 1;
        }
        // TODO 3: 재귀 경우 - fibonacci(n-1) + fibonacci(n-2) 반환
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 피보나치 계산 (효율적인 반복 버전)
     */
    public static long fibonacciIterative(int n) {
        // TODO 1: n이 음수인 경우 예외 처리
        if (n < 0) {
            throw new IllegalArgumentException("음수는 피보나치를 계산할 수 없습니다.");
        }
        // TODO 2: n이 0 또는 1인 경우 1 반환
        if (n == 0 || n == 1) {
            return 1;
        }
        // TODO 3: 이전 두 값을 저장할 변수 초기화 (prev1=1, prev2=1)
        long prev1 = 1;
        long prev2 = 1;
        long current = 0;
        // TODO 4: 2부터 n까지 반복
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        // TODO 5: current 반환
        return current;
    }

    /**
     * 피보나치 계산 (메모이제이션 버전)
     */
    public static long fibonacciMemo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수는 피보나치를 계산할 수 없습니다.");
        }
        long[] memo = new long[n + 1];
        return fibonacciMemoHelper(n, memo);
    }

    private static long fibonacciMemoHelper(int n, long[] memo) {
        // TODO 1: 기본 경우 - n이 0 또는 1이면 1 반환
        if (n == 0 || n == 1) {
            return 1;
        }
        // TODO 2: 이미 계산된 값이 있는지 확인
        if (memo[n] != 0) {
            return memo[n];
        }
        // TODO 3: 계산하고 memo에 저장
        memo[n] = fibonacciMemoHelper(n - 1, memo) + fibonacciMemoHelper(n - 2, memo);
        // TODO 4: memo[n] 반환
        return memo[n];
    }

    public static void main(String[] args) {
        // 팩토리얼 테스트
        System.out.println("=== 팩토리얼 ===");
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d! = %d%n", i, factorial(i));
        }

        // 큰 수의 팩토리얼
        System.out.println("\n=== 큰 수의 팩토리얼 ===");
        for (int i = 25; i <= 100; i += 25) {
            System.out.printf("%d! = %s%n", i, factorialBig(i));
        }

        // 피보나치 비교
        System.out.println("\n=== 피보나치 성능 비교 ===");
        long start, end;

        int n = 40;

        start = System.currentTimeMillis();
        long result1 = fibonacci(n);
        end = System.currentTimeMillis();
        System.out.printf("재귀: F(%d) = %d, 시간: %dms%n", n, result1, end - start);

        start = System.currentTimeMillis();
        long result2 = fibonacciIterative(n);
        end = System.currentTimeMillis();
        System.out.printf("반복: F(%d) = %d, 시간: %dms%n", n, result2, end - start);

        start = System.currentTimeMillis();
        long result3 = fibonacciMemo(n);
        end = System.currentTimeMillis();
        System.out.printf("메모: F(%d) = %d, 시간: %dms%n", n, result3, end - start);
    }
}

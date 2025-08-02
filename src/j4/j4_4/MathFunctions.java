package j4.j4_4;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("=== 수학 함수 예제 ===\n");

        // TODO 20: 절댓값 함수 테스트하기
         System.out.println("|-5| = " + abs(-5));
         System.out.println("|3| = " + abs(3));

        // TODO 21: 최대값, 최소값 함수 테스트하기
         System.out.println("max(10, 7) = " + max(10, 7));
         System.out.println("min(10, 7) = " + min(10, 7));

        // TODO 22: 거듭제곱 함수 테스트하기
         System.out.println("2^10 = " + power(2, 10));
         System.out.println("3^4 = " + power(3, 4));

        // TODO 23: 팩토리얼 함수 테스트하기
         System.out.println("5! = " + factorial(5));
         System.out.println("0! = " + factorial(0));

        // TODO 24: 최대공약수 함수 테스트하기
         System.out.println("gcd(48, 18) = " + gcd(48, 18));

        // TODO 25: 최소공배수 함수 테스트하기
         System.out.println("lcm(12, 18) = " + lcm(12, 18));
    }

    // TODO 26: 절댓값 함수 구현하기
    static int abs(int n) {
        return (n < 0) ? -n : n;
    }

    // TODO 27: 최대값 함수 구현하기
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // TODO 28: 최소값 함수 구현하기
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // TODO 29: 거듭제곱 함수 구현하기
    static int power(int base, int exponent) {
        // base^exponent 계산
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // TODO 30: 팩토리얼 함수 구현하기
    static int factorial(int n) {
        // n! 계산
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // TODO 31: 최대공약수 함수 구현하기
    static int gcd(int a, int b) {
        // 최대공약수 계산
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // TODO 32: 최소공배수 함수 구현하기
    static int lcm(int a, int b) {
        // 최소공배수 계산
        return a * b / gcd(a, b);
    }
}
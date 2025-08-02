package j4.j4_6;

import static j4.j4_6.MathUtils.*;

// TODO 23: MathUtils 클래스 만들기
class MathUtils {
    // TODO 24: 황금비 상수 정의하기
    public static final double GOLDEN_RATIO = 1.618033988749895;

    // TODO 25: 평균 계산 메서드 구현하기
    public static double average(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return numbers.length == 0 ? 0 : sum / numbers.length;
    }

    // TODO 26: 팩토리얼 계산 메서드 구현하기
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("음수는 팩토리얼 계산 불가");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // TODO 27: 소수 판별 메서드 구현하기
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

// TODO 28: MathUtils 정적 import하기

public class CustomStaticImport {
    public static void main(String[] args) {
        // TODO 29: MathUtils. 없이 사용하기
        System.out.println("황금비: " + GOLDEN_RATIO);
        System.out.println("평균(1,2,3,4,5): " + average(1, 2, 3, 4, 5));
        System.out.println("5! = " + MathUtils.factorial(5));

        // TODO 30: 1-20 사이의 소수 출력하기
        System.out.println("\n1-20 사이의 소수:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

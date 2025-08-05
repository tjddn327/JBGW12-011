package j5.j5_7.calculator;

/**
 * 계산기 인터페이스 - 기본 연산과 확장 연산
 */
public interface Calculator {
    // 기본 연산 (추상 메서드)
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    // 확장 연산 (기본 메서드)
    default double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    default double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수의 제곱근은 계산할 수 없습니다.");
        }
        return Math.sqrt(number);
    }

    default double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum = add(sum, num);  // 추상 메서드 사용
        }
        return divide(sum, numbers.length);
    }

    default double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수의 팩토리얼은 정의되지 않습니다.");
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result = multiply(result, i);  // 추상 메서드 사용
        }
        return result;
    }
}
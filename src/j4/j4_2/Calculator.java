package j4.j4_2;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== 계산기 프로그램 ===\n");

        // TODO 21: 기본 연산 테스트하기
        int a = 15, b = 4;

        System.out.println(a + " + " + b + " = " + add(a, b));
        System.out.println(a + " - " + b + " = " + subtract(a, b));
         System.out.println(a + " × " + b + " = " + multiply(a, b));
         System.out.println(a + " ÷ " + b + " = " + divide(a, b));
         System.out.println(a + " % " + b + " = " + modulo(a, b));

        // TODO 22: 고급 연산 테스트하기
         System.out.println("\n고급 연산:");
         System.out.println(a + "의 " + b + "제곱 = " + power(a, b));
         System.out.println(a + "의 제곱근 = " + squareRoot(a));
         System.out.println(a + "과 " + b + "의 최대값 = " + max(a, b));
         System.out.println(a + "과 " + b + "의 최소값 = " + min(a, b));
    }

    // TODO 23: 기본 사칙연산 메서드들 구현하기
    public static int add(int x, int y) {
        // 덧셈 구현
        return x + y;
    }

    public static int subtract(int x, int y) {
        // 뺄셈 구현
        return x - y;
    }

    public static int multiply(int x, int y) {
        // 곱셈 구현
        return x * y;
    }

    public static double divide(int x, int y) {
        // 나눗셈 구현 (0으로 나누기 방지)
        // y가 0이면 경고 메시지 출력하고 0 반환
        if(y==0){
            System.out.println("0으로 나누지 말라고~~");
            return 0;
        }else{
            return (double)x / y;
        }
    }

    public static int modulo(int x, int y) {
        // 나머지 연산 구현
        return x % y;
    }

    // TODO 24: 고급 연산 메서드들 구현하기
    public static double power(int base, int exponent) {
        // 거듭제곱 구현 (Math.pow 사용)
        return Math.pow(base, exponent);
    }

    public static double squareRoot(int number) {
        // 제곱근 구현 (Math.sqrt 사용)
        return Math.sqrt(number);
    }

    public static int max(int a, int b) {
        // 최대값 구현 (삼항 연산자 또는 if문 사용)
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        // 최소값 구현
        return Math.min(a, b);
    }
}
package j5.j5_7.calculator;

// 기본 계산기 구현
public class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        // TODO 38: 덧셈 구현하기
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        // TODO 39: 뺄셈 구현하기
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        // TODO 40: 곱셈 구현하기
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        // TODO 41: 나눗셈 구현하기
        // b가 0이면 ArithmeticException 던지기
        if (b == 0) {
            throw new ArithmeticException("0으로 못나눈다고~~");
        }
        else{
            return a / b;
        }
    }
}
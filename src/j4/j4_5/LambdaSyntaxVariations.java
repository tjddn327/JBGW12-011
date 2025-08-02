package j4.j4_5;

// 함수형 인터페이스 정의 (이미 구현됨)
interface MathOperation {
    double operate(double a, double b);
}

public class LambdaSyntaxVariations {
    public static void main(String[] args) {
        System.out.println("=== 람다 표현식 문법 변형 ===\n");

        // TODO 6: 전체 문법으로 덧셈 람다 구현하기
        MathOperation op1 = (double a, double b) -> { return a + b; };
        System.out.println("전체 문법: " + op1.operate(10, 5));

        // TODO 7: 타입 추론을 사용한 덧셈 람다 구현하기
        MathOperation op2 = (a, b) -> { return a + b; };
        System.out.println("타입 추론: " + op2.operate(10, 5));

        // TODO 8: 간단한 형태의 덧셈 람다 구현하기
        MathOperation op3 = (a, b) -> a + b;
        System.out.println("간단한 형태: " + op3.operate(10, 5));

        // TODO 9: 복잡한 로직의 평균 람다 구현하기
        MathOperation op4 = (a, b) -> (a + b) / 2;
        System.out.println("평균: " + op4.operate(10, 5));
    }
}

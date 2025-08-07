package j5.j5_7.calculator;
// 테스트
public class CalculatorTest {
    public static void main(String[] args) {
        // TODO 45: BasicCalculator 테스트하기
        // 3 + 5, 10 - 4 계산하고 출력
        // average(2, 4, 6, 8) 계산하고 출력
        // 5! 계산하고 출력
        // √16 계산하고 출력
        BasicCalculator b = new BasicCalculator();
        System.out.println("=== 기본 계산기 ===");
        System.out.println("3 + 5 = " + b.add(3,5));
        System.out.println("10 - 4 = " + b.subtract(10,4));
        System.out.println("평균(2, 4, 6, 8) = " + b.divide(20,4));
        System.out.println("5! = " + b.multiply(5,b.multiply(4,b.multiply(3,b.multiply(2,1)))));
        ScientificCalculator s = new ScientificCalculator();
        System.out.println("√16 = " + b.divide(b.multiply(4,4),4));


        // TODO 46: ScientificCalculator 테스트하기
        // √25 계산하고 출력
        // sin(π/2), cos(0) 계산하고 출력
        System.out.println("\n=== 공학용 계산기 ===");
        System.out.println(s.squareRoot(25));
        System.out.println("sin(π/2) = " + s.sin(Math.PI/2));
        System.out.println("cos(0) = " + s.cos(0));
    }
}
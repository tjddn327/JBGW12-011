package j5.j5_7.calculator;

// 공학용 계산기 - 일부 기본 메서드 오버라이드
public class ScientificCalculator extends BasicCalculator {
    // 더 정확한 제곱근 계산 알고리즘 사용
    @Override
    public double squareRoot(double number) {
        // TODO 42: 개선된 제곱근 계산 구현하기
        // 음수 체크
        // Newton-Raphson 방법 구현 (또는 간단히 Math.sqrt 사용)
        // "개선된 알고리즘 사용" 출력 후 결과 반환
        if (number < 0) {
            throw new IllegalArgumentException("음수 안댄다고~~");
        }else{
            System.out.print("개선된 알고리즘 사용 √" + number + " = ");
            return Math.sqrt(number);
        }

    }

    // 추가 메서드
    public double sin(double angle) {
        // TODO 43: 사인 함수 구현하기
        return Math.sin(angle);
    }

    public double cos(double angle) {
        // TODO 44: 코사인 함수 구현하기
        return Math.cos(angle);
    }
}
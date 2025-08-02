package j4.j4_6;

/**
 * TODO 31: 클래스에 대한 Javadoc 주석 작성하기
 * Calculator 클래스는 기본적인 산술 연산 메서드를 제공합니다.
 *
 * @author 김성우
 * @version 1.0
 * @since 2025-08-02
 */
public class Calculator {

    /**
     * TODO 32: add 메서드에 Javadoc 주석 작성하기
     * 두 실수 a와 b의 합을 반환합니다.
     *
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return a와 b의 합
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * TODO 33: subtract 메서드에 Javadoc 주석 작성하기
     * 두 실수 a와 b의 차를 반환합니다.
     *
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return a에서 b를 뺀 값
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * TODO 34: divide 메서드에 Javadoc 주석 작성하기 (예외 포함)
     * 두 실수 dividend를 divisor로 나눈 값을 반환합니다.
     * divisor가 0이면 ArithmeticException을 발생시킵니다.
     *
     * @param dividend 나눌 숫자 (분자)
     * @param divisor 나누는 숫자 (분모)
     * @return dividend를 divisor로 나눈 값
     * @throws ArithmeticException divisor가 0일 경우 발생
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return dividend / divisor;
    }
}

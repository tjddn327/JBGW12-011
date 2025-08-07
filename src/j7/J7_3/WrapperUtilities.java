package j7.J7_3;

import java.util.ArrayList;

public class WrapperUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // TODO: 문자열 배열을 숫자로 변환하여 ArrayList에 추가하세요
        String[] strNumbers = {"100", "200", "300"};
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str));
        }

        // TODO: 래퍼 클래스의 상수들을 출력하세요
        System.out.println("최대 int 값: " + Integer.MAX_VALUE);
        System.out.println("최소 int 값: " + Integer.MIN_VALUE);

        // TODO: 진법 변환을 수행하세요
        int decimal = 42;
        System.out.println(decimal + "의 2진수: " + Integer.toBinaryString(decimal));
        System.out.println(decimal + "의 16진수: " + Integer.toHexString(decimal));

        // TODO: Double의 특수값들을 포함한 ArrayList를 생성하세요
        ArrayList<Double> measurements = new ArrayList<>();
        measurements.add(3.14);
        measurements.add(Double.POSITIVE_INFINITY);
        measurements.add(Double.NaN);

        // TODO: 각 값의 타입을 확인하여 출력하세요
        for (Double val : measurements) {
            if (Double.isInfinite(val)) {
                System.out.println("무한대 값 발견");
            } else if (Double.isNaN(val)) {
                System.out.println("NaN 값 발견");
            } else {
                System.out.println("정상 값: " + val);
            }
        }
    }
}
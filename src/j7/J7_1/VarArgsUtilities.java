package j7.J7_1;

import java.util.Arrays;

public class VarArgsUtilities {
    // TODO: 문자열 연결 메서드를 작성하세요
    // 메서드명: join
    // 매개변수: String delimiter, String... parts
    // 구분자로 문자열들을 연결하여 반환
    public static String join(String delimiter, String... parts) {
        return String.join(delimiter, parts);
    }

    // TODO: 조건을 만족하는 개수 세기 메서드를 작성하세요
    // 메서드명: countPositive
    // 매개변수: int... numbers
    // 양수의 개수를 반환
    public static int countPositive(int... numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    // TODO: 최소값과 최대값 동시에 찾기 메서드를 작성하세요
    // 메서드명: findMinMax
    // 매개변수: int... values
    // 반환값: int[] {최소값, 최대값}, 값이 없으면 null
    public static int[] findMinMax(int... values) {
        if (values.length == 0) {
            return null;
        }
        int min = values[0];
        int max = values[0];
        for (int val : values) {
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        return new int[]{min, max};
    }

    // TODO: 가변 인수로 배열 생성 메서드를 작성하세요
    // 메서드명: createArray
    // 매개변수: int... elements
    // 가변 인수의 복사본 배열을 반환
    public static int[] createArray(int... elements) {
        // 가변 인수는 내부적으로 배열이므로 복사해서 반환
        return Arrays.copyOf(elements, elements.length);
    }

    public static void main(String[] args) {
        // join 사용
        System.out.println(join("-", "2024", "11", "15"));  // 2024-11-15
        System.out.println(join(" | ", "Home", "About", "Contact"));

        // countPositive 사용
        System.out.println("\n양수 개수: " +
                countPositive(-5, 3, 0, -2, 7, 1, -8));  // 3

        // findMinMax 사용
        int[] minMax = findMinMax(45, 12, 78, 34, 90, 23);
        if (minMax != null) {
            System.out.println("최소값: " + minMax[0]);  // 12
            System.out.println("최대값: " + minMax[1]);  // 90
        }

        // createArray 사용
        int[] myArray = createArray(10, 20, 30, 40);
        System.out.print("\n생성된 배열: ");
        for (int val : myArray) {
            System.out.print(val + " ");
        }
    }
}
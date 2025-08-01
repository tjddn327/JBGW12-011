package j4.j4_3;

public class ArrayExceptions {
    public static void main(String[] args) {
        System.out.println("=== 배열 예외 처리 ===\n");

        // TODO 71: 정상적인 배열 처리하기
        int[] numbers = {10, 20, 30, 40, 50};
        calculateAverage(numbers);
        // TODO 72: 빈 배열 처리하기
        int[] empty = {};
        try {
            calculateAverage(empty);
        } catch (IllegalArgumentException e) {
            System.out.println("빈 배열 오류: " + e.getMessage());
        }

        // TODO 73: null 배열 처리하기
        try {

        } catch (NullPointerException e) {
            System.out.println("null 배열 오류: " + e.getMessage());
        }

        // TODO 74: 인덱스 범위 검사하기
        System.out.println("\n=== 인덱스 검사 ===");
        try {

        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 오류: " + e.getMessage());
        }

        // TODO 75: 배열 나누기 처리하기
        System.out.println("\n=== 배열 분할 ===");
        try {
            System.out.print("2로 나눈 결과: ");

        } catch (ArithmeticException e) {
            System.out.println("나누기 오류: " + e.getMessage());
        }
    }

    // TODO 76: 안전한 평균 계산 메서드 구현하기
    static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("정상 배열의 평균: " + sum/array.length);
        return sum / array.length;
    }

    // TODO 77: 안전한 요소 접근 메서드 구현하기
    static int getElement(int[] array, int index) {
        return 0;
    }

    // TODO 78: 안전한 배열 나누기 메서드 구현하기
    static int[] divideArray(int[] array, int divisor) {
        return null;
    }

    // TODO 79: 배열 출력 메서드 구현하기
    static void printArray(int[] array) {

    }
}
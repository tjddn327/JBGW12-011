package j7.J7_1;

import java.util.ArrayList;

public class ArrayReturningMethods {
    // TODO: 범위 내의 정수 배열 생성 메서드를 작성하세요
    // 메서드명: range, 매개변수: int start, int end
    // start부터 end까지의 숫자 배열 반환, start > end면 빈 배열
    public static int[] range(int start, int end) {
        if (start > end) {
            return new int[0]; // 빈 배열 반환
        }
        int[] result = new int[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }

    // TODO: 배열 필터링 메서드를 작성하세요
    // 메서드명: filterPositive, 매개변수: int[] input
    // 양수만 포함하는 새 배열 반환
    public static int[] filterPositive(int[] input) {
        ArrayList<Integer> positiveList = new ArrayList<>();
        for (int num : input) {
            if (num > 0) {
                positiveList.add(num);
            }
        }
        // ArrayList를 int[] 배열로 변환
        int[] result = new int[positiveList.size()];
        for (int i = 0; i < positiveList.size(); i++) {
            result[i] = positiveList.get(i);
        }
        return result;
    }

    // TODO: 두 배열 병합 메서드를 작성하세요
    // 메서드명: merge, 매개변수: int[] arr1, int[] arr2
    // 두 배열을 연결한 새 배열 반환
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }

    // TODO: 배열 뒤집기 메서드를 작성하세요
    // 메서드명: reverse, 매개변수: int[] input
    // 역순으로 된 새 배열 반환
    public static int[] reverse(int[] input) {
        int[] reversed = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            reversed[i] = input[input.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        // range 테스트
        int[] numbers = range(5, 10);
        System.out.print("range(5, 10): ");
        printArray(numbers);

        // filterPositive 테스트
        int[] mixed = {-3, 5, 0, -7, 12, -1, 8};
        int[] positive = filterPositive(mixed);
        System.out.print("\n양수만: ");
        printArray(positive);

        // merge 테스트
        int[] first = {1, 3, 5};
        int[] second = {2, 4, 6};
        int[] merged = merge(first, second);
        System.out.print("\n병합: ");
        printArray(merged);

        // reverse 테스트
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverse(original);
        System.out.print("\n뒤집기: ");
        printArray(reversed);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
package j7.J7_2;

import java.util.Arrays;

public class PracticalArraysUsage {
    // TODO: 배열 통계 계산 메서드를 작성하세요
    public static void arrayStatistics(int[] data) {
        if (data == null || data.length == 0) {
            System.out.println("데이터가 없습니다.");
            return;
        }
        int[] sortedData = Arrays.copyOf(data, data.length);
        Arrays.sort(sortedData);

        System.out.println("원본 데이터: " + Arrays.toString(data));
        System.out.println("정렬된 데이터: " + Arrays.toString(sortedData));
        System.out.println("최소값: " + sortedData[0]);
        System.out.println("최대값: " + sortedData[sortedData.length - 1]);

        double median;
        int mid = sortedData.length / 2;
        if (sortedData.length % 2 == 0) {
            median = (sortedData[mid - 1] + sortedData[mid]) / 2.0;
        } else {
            median = sortedData[mid];
        }
        System.out.println("중앙값: " + median);
    }

    // TODO: 배열에서 중복 제거 메서드를 작성하세요
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);

        int uniqueCount = 1;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i-1]) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        result[0] = sorted[0];
        int resultIndex = 1;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i-1]) {
                result[resultIndex++] = sorted[i];
            }
        }
        return result;
    }

    // TODO: 두 배열 병합 메서드를 작성하세요
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        return merged;
    }

    public static void main(String[] args) {
        int[] testData = {45, 23, 67, 89, 12, 34, 56, 78, 90, 23};
        arrayStatistics(testData);

        System.out.println("\n=== 중복 제거 ===");
        int[] withDuplicates = {5, 2, 8, 2, 9, 5, 1, 8, 3};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("원본: " + Arrays.toString(withDuplicates));
        System.out.println("중복 제거: " + Arrays.toString(unique));

        System.out.println("\n=== 배열 병합 ===");
        int[] first = {1, 3, 5, 7};
        int[] second = {2, 4, 6, 8};
        int[] merged = mergeArrays(first, second);
        System.out.println("병합 결과: " + Arrays.toString(merged));
        Arrays.sort(merged);
        System.out.println("정렬된 병합: " + Arrays.toString(merged));
    }
}
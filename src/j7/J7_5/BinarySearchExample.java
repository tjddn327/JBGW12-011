package j7.J7_5;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 34, 45, 56, 67, 78, 89, 90};  // 정렬된 배열

        System.out.println("배열: " + Arrays.toString(numbers));

        // 다양한 값 검색
        int[] targets = {45, 78, 12, 90, 100, 1};

        for (int target : targets) {
            int index = binarySearch(numbers, target);
            System.out.printf("%d의 위치: %d%s\n",
                    target, index, (index == -1 ? " (없음)" : ""));
        }

        // Java 내장 이진 검색과 비교
        System.out.println("\n=== Java 내장 메서드와 비교 ===");
        for (int target : targets) {
            int ourResult = binarySearchSilent(numbers, target);
            int javaResult = Arrays.binarySearch(numbers, target);
            System.out.printf("%d: 우리구현=%d, Java=%d\n",
                    target, ourResult, javaResult < 0 ? -1 : javaResult);
        }
    }

    // TODO: 이진 검색 메서드를 작성하세요
    // 메서드명: binarySearch, 매개변수: int[] array, int target
    // 전제조건: 배열이 정렬되어 있어야 함
    // 반환값: 찾은 요소의 인덱스, 없으면 -1
    public static int binarySearch(int[] array, int target) {
        // TODO: left와 right 변수를 초기화하세요
        int left = 0;
        int right = array.length - 1;

        // TODO: left가 right보다 작거나 같을 때까지 반복
        while (left <= right) {
            // TODO: 중간 인덱스를 계산하세요
            int middle = left + (right - left) / 2;

            System.out.printf("  검색 범위: [%d, %d], 중간값: %d\n",
                    left, right, array[middle]);

            // TODO: 중간값이 찾는 값과 같으면 middle 반환
            if (array[middle] == target) {
                return middle;
            }
            // TODO: 중간값이 찾는 값보다 크면 왼쪽 절반 검색
            else if (array[middle] > target) {
                right = middle - 1;
            }
            // TODO: 그렇지 않으면 오른쪽 절반 검색
            else {
                left = middle + 1;
            }
        }

        return -1;  // 찾지 못함
    }

    // 비교를 위한 상세 과정 출력이 없는 버전
    public static int binarySearchSilent(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == target) return middle;
            else if (array[middle] > target) right = middle - 1;
            else left = middle + 1;
        }
        return -1;
    }
}
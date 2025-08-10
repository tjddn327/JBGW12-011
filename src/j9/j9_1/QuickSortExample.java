package j9.j9_1;

import java.util.Arrays;

public class QuickSortExample {

    /**
     * 기본 퀵정렬
     */
    public static void quickSort(int[] arr, int low, int high) {
        // TODO 1: 재귀 조건 확인
        // 힌트: low < high인 경우에만 (배열에 2개 이상의 요소가 있을 때) 정렬 진행
        if (low < high) {
            // TODO 2: 분할(partition) 수행하여 피벗의 최종 위치를 얻음
            int pivotIndex = partition(arr, low, high);

            // TODO 3: 피벗 기준으로 양쪽 부분 배열에 대해 재귀 호출
            quickSort(arr, low, pivotIndex - 1);  // 피벗 왼쪽 부분 정렬
            quickSort(arr, pivotIndex + 1, high); // 피벗 오른쪽 부분 정렬
        }
    }

    /**
     * 분할 함수 (Lomuto partition scheme)
     * 배열의 마지막 요소를 피벗으로 선택하고, 피벗을 올바른 위치에 배치
     * 피벗보다 작은 모든 요소를 피벗 왼쪽으로, 큰 요소는 오른쪽으로 보냄
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 피벗을 배열의 마지막 요소로 선택
        int i = (low - 1);     // 피벗보다 작은 요소들의 마지막 위치를 가리키는 인덱스

        // low부터 high-1까지 순회
        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같은 경우
            if (arr[j] <= pivot) {
                i++; // 작은 요소 그룹의 크기를 1 증가
                swap(arr, i, j); // arr[i]와 arr[j]를 교환
            }
        }

        // 마지막으로 피벗을 올바른 위치(i+1)로 이동
        swap(arr, i + 1, high);

        return i + 1; // 피벗의 최종 인덱스 반환
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println("=== 퀵정렬 예제 ===");
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("원본: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("정렬: " + Arrays.toString(arr));
    }
}
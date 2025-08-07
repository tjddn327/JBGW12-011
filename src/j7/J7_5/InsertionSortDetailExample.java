package j7.J7_5;

import java.util.Arrays;

public class InsertionSortDetailExample {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("초기 배열: " + Arrays.toString(array));
        insertionSortWithDetails(array);
        System.out.println("최종 정렬: " + Arrays.toString(array));
    }

    // TODO: 삽입 정렬 메서드를 작성하세요
    // 매개변수: int[] array
    // 알고리즘: 두 번째 요소부터 시작하여 앞의 정렬된 부분에 올바른 위치에 삽입
    public static void insertionSortWithDetails(int[] array) {
        // TODO: 두 번째 요소(인덱스 1)부터 마지막까지 반복
        for (int i = 1; i < array.length; i++) {
            // TODO: 현재 요소를 key로 저장
            int key = array[i];
            int j = i - 1;

            System.out.printf("\n--- %d번째 단계 (key = %d) ---\n", i, key);
            System.out.printf("정렬된 부분: %s\n",
                    Arrays.toString(Arrays.copyOfRange(array, 0, i)));

            // TODO: key보다 큰 값들을 오른쪽으로 이동
            // j가 0 이상이고 array[j]가 key보다 클 때까지 반복
            while (j >= 0 && array[j] > key) {
                // TODO: array[j]를 오른쪽으로 이동
                array[j + 1] = array[j];
                j = j - 1;
                System.out.printf("  이동 후: %s\n", Arrays.toString(array));
            }

            // TODO: key를 올바른 위치에 삽입
            array[j + 1] = key;
            System.out.printf("삽입 완료: %s\n", Arrays.toString(array));
        }
    }
}
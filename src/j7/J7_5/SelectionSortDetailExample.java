package j7.J7_5;

import java.util.Arrays;

public class SelectionSortDetailExample {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("초기 배열: " + Arrays.toString(array));
        selectionSortWithDetails(array);
        System.out.println("최종 정렬: " + Arrays.toString(array));
    }

    // TODO: 선택 정렬 메서드를 작성하세요
    // 매개변수: int[] array
    // 알고리즘: 매번 남은 부분에서 최소값을 찾아 현재 위치와 교환
    public static void selectionSortWithDetails(int[] array) {
        // TODO: 배열의 첫 번째부터 마지막-1까지 반복
        for (int i = 0; i < array.length - 1; i++) {
            // TODO: 현재 인덱스를 최소값 인덱스로 초기화
            int minIndex = i;

            System.out.printf("\n--- %d번째 단계 ---\n", i + 1);
            System.out.printf("정렬된 부분: %s\n",
                    Arrays.toString(Arrays.copyOfRange(array, 0, i)));
            System.out.printf("정렬할 부분: %s\n",
                    Arrays.toString(Arrays.copyOfRange(array, i, array.length)));

            // TODO: 나머지 부분에서 최소값 찾기
            // i+1부터 배열 끝까지 탐색
            for (int j = i + 1; j < array.length; j++) {
                // TODO: 더 작은 값을 찾으면 minIndex 업데이트
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                    System.out.printf("  새로운 최소값: %d (인덱스 %d)\n",
                            array[minIndex], minIndex);
                }
            }

            // TODO: 최소값과 현재 위치 교환
            if (minIndex != i) {
                System.out.printf("교환: %d ↔ %d\n", array[i], array[minIndex]);
                // TODO: 두 요소 교환하기
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            } else {
                System.out.println("교환 불필요 (이미 최소값)");
            }

            System.out.printf("결과: %s\n", Arrays.toString(array));
        }
    }
}
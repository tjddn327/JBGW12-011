package j4.j4_1;

public class BlackBoxImplementationChange {
    public static void main(String[] args) {
        System.out.println("=== 블랙박스 구현 변경 예제 ===\n");

        // TODO 8: 두 가지 정렬 방식 테스트하기
        System.out.println("버전 1 정렬:");
        int[] numbers1 = {5, 2, 8, 1, 9};
        SortingBlackBoxV1.sort(numbers1);
        printArray(numbers1);

        System.out.println("\n버전 2 정렬:");
        int[] numbers2 = {5, 2, 8, 1, 9};
        SortingBlackBoxV2.sort(numbers2);
        printArray(numbers2);
    }

    // TODO 9: 배열을 출력하는 메서드를 구현하세요
    public static void printArray(int[] arr) {
        // for문을 사용하여 배열의 모든 요소를 출력하세요
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 버블 정렬을 사용하는 블랙박스 (참고용 - 이미 구현됨)
class SortingBlackBoxV1 {
    public static void sort(int[] array) {
        System.out.println("(버블 정렬 사용 중...)");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

// TODO 10: 선택 정렬을 사용하는 블랙박스 완성하기
class SortingBlackBoxV2 {
    public static void sort(int[] array) {
        System.out.println("(선택 정렬 사용 중...)");
        // TODO: 선택 정렬 알고리즘을 구현하세요
        // 힌트: 최솟값을 찾아서 앞쪽으로 이동시키는 방식
        int size = array.length;
        for (int i = 0; i < size -1; i++){
            int min = i;
            for(int j = i + 1; j < size; j++){
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
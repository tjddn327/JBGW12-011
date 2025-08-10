package j9.j9_1;

public class BinarySearchExample {

    /**
     * 재귀적 이진 탐색 - 인덱스 반환
     */
    public static int binarySearch(int[] arr, int target, int left, int right) {
        // TODO 1: 기저 사례 - 탐색 범위가 유효하지 않은 경우 (못 찾음)
        // 힌트: left > right인 경우 -1 반환
        if (left > right) {
            return -1;
        }

        // TODO 2: 중간 인덱스 계산
        // 힌트: left + (right - left) / 2 사용 (오버플로우 방지)
        int mid = left + (right - left) / 2;

        // TODO 3: 기저 사례 - 값을 찾은 경우
        // 힌트: arr[mid]가 target과 같으면 mid 반환
        if (arr[mid] == target) {
            return mid;
        }

        // TODO 4: 재귀 사례 - 왼쪽 또는 오른쪽 절반 탐색
        // 힌트: target < arr[mid]이면 왼쪽 절반 탐색
        //      그렇지 않으면 오른쪽 절반 탐색
        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== 재귀적 이진 탐색 예제 ===");
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] targets = {7, 15, 1, 19, 4, 20};

        for (int target : targets) {
            int result = binarySearch(arr, target, 0, arr.length - 1);
            if (result != -1) {
                System.out.println(target + " 찾기: 인덱스 " + result);
            } else {
                System.out.println(target + " 찾기: 찾지 못함");
            }
        }
    }
}
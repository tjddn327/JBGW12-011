package j7.J7_2;

public class ArrayComparison {
    // TODO: 배열에서 가장 큰 차이를 가진 인접 요소 찾기 메서드를 작성하세요
    // 메서드명: findMaxDifference, 매개변수: int[] numbers
    // 배열 길이가 2 미만이면 "비교할 요소가 부족합니다." 출력
    // 인접한 요소들의 절댓값 차이를 계산하여 최대 차이와 인덱스 출력
    public static void findMaxDifference(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("비교할 요소가 부족합니다.");
            return;
        }

        int maxDiff = -1;
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i] - numbers[i + 1]);
            if (diff > maxDiff) {
                maxDiff = diff;
                index1 = i;
                index2 = i + 1;
            }
        }

        System.out.printf("최대 차이: %d (인덱스 %d와 %d 사이)\n", maxDiff, index1, index2);
        System.out.printf("값: %d와 %d\n", numbers[index1], numbers[index2]);
    }

    // TODO: 배열에서 패턴을 찾는 메서드를 작성하세요
    // 메서드명: findPattern, 매개변수: int[] array, int[] pattern
    // pattern이 array보다 길면 "패턴이 배열보다 깁니다." 출력
    // 패턴이 발견되면 위치를 출력, 없으면 "패턴을 찾을 수 없습니다." 출력
    public static void findPattern(int[] array, int[] pattern) {
        if (pattern.length > array.length) {
            System.out.println("패턴이 배열보다 깁니다.");
            return;
        }

        boolean patternFound = false;
        // array를 순회하며 패턴이 시작될 수 있는 마지막 위치까지만 검사
        for (int i = 0; i <= array.length - pattern.length; i++) {
            boolean match = true;
            // 현재 위치(i)에서 시작하는 부분 배열이 패턴과 일치하는지 확인
            for (int j = 0; j < pattern.length; j++) {
                if (array[i + j] != pattern[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println("패턴 발견 위치: " + i);
                patternFound = true;
            }
        }

        if (!patternFound) {
            System.out.println("패턴을 찾을 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 15, 8, 23, 19, 30, 12};
        findMaxDifference(values);

        System.out.println("\n=== 패턴 검색 ===");
        int[] data = {1, 2, 3, 4, 2, 3, 4, 5, 2, 3};
        int[] pattern = {2, 3, 4};
        findPattern(data, pattern);
    }
}
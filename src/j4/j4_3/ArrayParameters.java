package j4.j4_3;

public class ArrayParameters {
    public static void main(String[] args) {
        System.out.println("=== 배열 매개변수 예제 ===\n");

        int[] numbers = {15, 7, 23, 4, 18, 12, 9};

        // TODO 41: 배열 정보 출력하기
        System.out.print("원본 배열: ");
        printArray(numbers);

        // TODO 42: 통계 정보 출력하기
        System.out.println("\n=== 배열 통계 ===");
        sum(numbers);
        average(numbers);
        max(numbers);
        min(numbers);
        range(numbers);

        // TODO 43: 배열 조작하기
        System.out.println("\n\n=== 배열 조작 ===");


        System.out.print("2배 값: ");
        doubleValues(numbers);
        numbers = new int[]{15, 7, 23, 4, 18, 12, 9};
        System.out.print("10보다 큰 값: ");
        filterGreaterThan(numbers,10);
        // 원본 배열 정렬
        System.out.print("정렬된 배열: ");
        copyArray(numbers);
        // 원본은 변경되지 않음
        System.out.print("원본 배열: ");
        numbers = new int[]{15, 7, 23, 4, 18, 12, 9};
        sortArray(numbers);
    }

    // TODO 44: 배열 출력 메서드 구현하기
    static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }

    // TODO 45: 통계 메서드들 구현하기
    static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("합계: " + sum);
        return 0;
    }

    static double average(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println("평균: " + avg);
        return avg;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("최대값: " + max);
        return 0;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("최소값: " + min);
        return 0;
    }

    static int range(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int ran = max-min;
        System.out.printf("범위: %d", ran);
        return 0;
    }

    // TODO 46: 배열 조작 메서드들 구현하기
    static int[] doubleValues(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
            if(i == arr.length - 1){
                System.out.print(arr[i]+"]\n");
                continue;
            }
            System.out.print(arr[i] +", ");
        }

        return null;
    }

    static int[] filterGreaterThan(int[] arr, int threshold) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > threshold){
                if(i == 0){
                    System.out.print(arr[i]);
                    continue;
                }
                System.out.print(", "+arr[i]);
            }
        }
        System.out.print("]\n");
        return null;
    }

    static int[] copyArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(", "+arr[i]);
        }
        System.out.print("]\n");
        return null;
    }

    static void sortArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
                continue;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
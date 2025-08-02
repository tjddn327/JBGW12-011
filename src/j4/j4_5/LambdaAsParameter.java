package j4.j4_5;

// 함수형 인터페이스 정의 (이미 구현됨)
interface ArrayProcessor {
    void process(int[] array);
}

interface ArrayTransformer {
    int transform(int element);
}

public class LambdaAsParameter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("=== 람다를 매개변수로 전달 ===\n");

        // TODO 20: 원본 배열 출력하기
        System.out.print("원본 배열: ");
        processArray(numbers, arr -> {
            for (int n : arr) System.out.print(n + " ");
            System.out.println();
        });

        // TODO 21: 제곱 출력하기
        System.out.print("제곱 출력: ");
        processArray(numbers, arr -> {
            for (int n : arr) System.out.print(n * n + " ");
            System.out.println();
        });

        // TODO 22: 합계 계산하기
        processArray(numbers, arr -> {
            int sum = 0;
            for (int n : arr) sum += n;
            System.out.println("합계: " + sum);
        });

        // TODO 23: 배열 변환 테스트하기
        int[] doubled = transformArray(numbers, n -> n * 2);
        System.out.print("2배 변환: ");
        printArray(doubled);

        int[] squared = transformArray(numbers, n -> n * n);
        System.out.print("제곱 변환: ");
        printArray(squared);
    }

    // TODO 24: processArray 메서드 구현하기
    static void processArray(int[] array, ArrayProcessor processor) {
        processor.process(array);
    }

    // TODO 25: transformArray 메서드 구현하기
    static int[] transformArray(int[] array, ArrayTransformer transformer) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = transformer.transform(array[i]);
        }
        return result;
    }

    static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

package j4.j4_7;

import java.util.Arrays;

public class ArrayPreconditionExample {
    public static void main(String[] args) {
        System.out.println("=== 배열 사전/사후 조건 예제 ===\n");

        int[] numbers = {3, 7, 2, 9, 1, 5};

         System.out.println("원본 배열: " + Arrays.toString(numbers));
         System.out.println("최대값: " + findMax(numbers));

         reverseArray(numbers);
         System.out.println("뒤집은 배열: " + Arrays.toString(numbers));
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("배열이 null이거나 비어 있습니다.");
        }

        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }

        return max;
    }

    public static void reverseArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("배열이 null입니다.");
        }

        int left = 0, right = array.length - 1;
        while (left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
}

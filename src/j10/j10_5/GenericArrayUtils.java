package j10.j10_5;

import java.util.*;
import java.util.function.Predicate;

public class GenericArrayUtils {

    // TODO 1: 배열에서 특정 요소의 첫 인덱스 찾기
    public static <T> int indexOf(T[] array, T target) {
        if (array == null) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], target)) {
                return i;
            }
        }
        return -1;
    }

    // TODO 2: 배열에서 특정 요소 개수 세기
    public static <T> int countOccurrences(T[] array, T target) {
        if (array == null) {
            return 0;
        }

        int count = 0;
        for (T item : array) {
            if (Objects.equals(item, target)) {
                count++;
            }
        }
        return count;
    }

    // TODO 3: 배열 뒤집기
    public static <T> void reverse(T[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // TODO 4: 조건에 맞는 첫 번째 요소 찾기
    public static <T> T findFirst(T[] array, Predicate<T> predicate) {
        if (array == null || predicate == null) {
            return null;
        }

        for (T item : array) {
            if (predicate.test(item)) {
                return item;
            }
        }
        return null;
    }

    // TODO 5: 조건에 맞는 모든 요소 필터링
    public static <T> List<T> filter(T[] array, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        if (array == null || predicate == null) {
            return result;
        }

        for (T item : array) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }

        return result;
    }

    // TODO 6: 여러 배열 합치기
    @SafeVarargs
    public static <T> List<T> concat(T[]... arrays) {
        List<T> result = new ArrayList<>();

        for (T[] array : arrays) {
            if (array != null) {
                Collections.addAll(result, array);
            }
        }
        return result;
    }

    // TODO 7: 배열을 문자열로 변환 (구분자 사용)
    public static <T> String join(T[] array, String delimiter) {
        if (array == null || array.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);

        for (int i = 1; i < array.length; i++) {
            sb.append(delimiter).append(array[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // String 배열 테스트
        String[] words = {"apple", "banana", "cherry", "banana", "date"};

        System.out.println("원본 배열: " + Arrays.toString(words));
        System.out.println("'banana' 인덱스: " + indexOf(words, "banana"));
        System.out.println("'banana' 개수: " + countOccurrences(words, "banana"));

        // 배열 뒤집기
        String[] wordsCopy = words.clone();
        reverse(wordsCopy);
        System.out.println("뒤집힌 배열: " + Arrays.toString(wordsCopy));

        // 조건에 맞는 첫 단어 찾기
        String longWord = findFirst(words, word -> word.length() > 5);
        System.out.println("6글자 이상 첫 단어: " + longWord);

        // 조건에 맞는 단어 필터링
        List<String> shortWords = filter(words, word -> word.length() <= 5);
        System.out.println("5글자 이하 단어들: " + shortWords);

        // 여러 배열 합치기
        String[] moreWords = {"elderberry", "fig"};
        List<String> combined = concat(words, moreWords);
        System.out.println("합쳐진 리스트: " + combined);

        // 배열을 문자열로 합치기
        System.out.println("쉼표 구분 문자열: " + join(words, ", "));
    }
}

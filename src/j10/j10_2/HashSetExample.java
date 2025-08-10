package j10.j10_2;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        // 1. 중복 제거
        List<String> listWithDuplicates = Arrays.asList(
            "apple", "banana", "apple", "cherry", "banana", "date"
        );

        // 중복 제거하려면 그냥 HashSet에 리스트 넣으면 됨
        Set<String> uniqueItems = new HashSet<>(listWithDuplicates);

        System.out.println("원본 리스트: " + listWithDuplicates);
        System.out.println("중복 제거: " + uniqueItems);

        // 2. 집합 연산
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // 합집합
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);  // setB 모든 요소 추가
        System.out.println("\nA ∪ B = " + union);

        // 교집합
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);  // setB와 공통인 것만 남김
        System.out.println("A ∩ B = " + intersection);

        // 차집합
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);  // setB에 있는 것 제거
        System.out.println("A - B = " + difference);

        // 대칭 차집합 (합집합 - 교집합)
        Set<Integer> symmetricDiff = new HashSet<>(setA);
        symmetricDiff.addAll(setB);  // 1. 합집합 만들기
        Set<Integer> temp = new HashSet<>(setA);
        temp.retainAll(setB);        // 2. 교집합 만들기
        symmetricDiff.removeAll(temp);  // 3. 합집합에서 교집합 제거
        System.out.println("A △ B = " + symmetricDiff);

        // 3. 포함 관계 확인
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> subset = new HashSet<>(Arrays.asList("apple", "cherry"));

        System.out.println("\nfruits: " + fruits);
        System.out.println("subset: " + subset);
        System.out.println("subset ⊆ fruits? " + fruits.containsAll(subset));
        System.out.println("fruits ⊆ subset? " + subset.containsAll(fruits));
    }
}

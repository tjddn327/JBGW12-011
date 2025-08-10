package j10.j10_1;

import java.util.*;

public class HashSetExample {
    
    public static void main(String[] args) {
        // 중복 제거를 위한 Set
        HashSet<String> uniqueWords = new HashSet<>();
        
        String text = "the quick brown fox jumps over the lazy dog the fox";
        String[] words = text.split(" ");
        
        // TODO: words 배열의 각 단어를 uniqueWords에 추가
        for (String w : words) {
            uniqueWords.add(w);
        }
        
        // 집합 연산
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        
        // TODO: set1과 set2의 합집합 구하기
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        
        // TODO: set1과 set2의 교집합 구하기
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        
        // TODO: set1 - set2 차집합 구하기
        HashSet<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        
        System.out.println("고유한 단어들: " + uniqueWords);
        System.out.println("고유한 단어 수: " + uniqueWords.size());
        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합 (set1 - set2): " + difference);
    }
}

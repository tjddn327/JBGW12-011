package j10.j10_3;

import java.util.*;

public class TreeMapFeatures {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("김철수", 85);
        scores.put("이영희", 92);
        scores.put("박민수", 78);
        scores.put("정지원", 95);
        scores.put("홍길동", 88);
        
        System.out.println("전체 점수: " + scores);
        
        // NavigableMap 메서드들
        System.out.println("\n=== NavigableMap 기능 ===");
        System.out.println("첫 번째 학생: " + scores.firstEntry());
        System.out.println("마지막 학생: " + scores.lastEntry());
        
        System.out.println("\n'박민수' 바로 앞: " + scores.lowerEntry("박민수"));
        System.out.println("'박민수' 또는 바로 앞: " + scores.floorEntry("박민수"));
        System.out.println("'박민수' 바로 뒤: " + scores.higherEntry("박민수"));
        System.out.println("'박민수' 또는 바로 뒤: " + scores.ceilingEntry("박민수"));
        
        // 역순 맵
        NavigableMap<String, Integer> reverseScores = scores.descendingMap();
        System.out.println("\n역순: " + reverseScores);
        
        // 커스텀 Comparator
        TreeMap<String, Integer> customOrder = new TreeMap<>(
            Comparator.reverseOrder()
        );
        customOrder.putAll(scores);
        System.out.println("\n역순 정렬: " + customOrder);
    }
}
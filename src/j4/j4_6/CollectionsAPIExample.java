package j4.j4_6;

// TODO 44: 필요한 import문 추가하기
import java.util.*;

public class CollectionsAPIExample {
    public static void main(String[] args) {

        // === List API ===
        // TODO 45: List API 사용하기
        List<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("포도");

        System.out.println("=== List API ===");
        System.out.println("과일 목록: " + fruits);
        System.out.println("첫 번째 과일: " + fruits.get(0));
        System.out.println("과일 개수: " + fruits.size());

        // === Set API ===
        // TODO 46: Set API 사용하기
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(3); // 중복
        uniqueNumbers.add(4);
        uniqueNumbers.add(1); // 중복

        System.out.println("\n=== Set API ===");
        System.out.println("고유 숫자: " + uniqueNumbers);
        System.out.println("3이 있나요? " + uniqueNumbers.contains(3));

        // === Map API ===
        // TODO 47: Map API 사용하기
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("김철수", 90);
        scoreMap.put("이영희", 85);
        scoreMap.put("박민수", 92);

        System.out.println("\n=== Map API ===");
        System.out.println("점수표: " + scoreMap);
        System.out.println("김철수의 점수: " + scoreMap.get("김철수"));

        // === Collections 유틸리티 ===
        // TODO 48: Collections 유틸리티 사용하기
        List<Integer> numbers = Arrays.asList(5, 1, 3, 1, 4);
        Collections.sort(numbers);

        System.out.println("\n정렬된 리스트: " + numbers);
        System.out.println("최대값: " + Collections.max(numbers));
        System.out.println("최소값: " + Collections.min(numbers));
    }
}
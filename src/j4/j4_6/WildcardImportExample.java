package j4.j4_6;

// TODO 6: 와일드카드를 사용하여 패키지 전체 import하기
import java.util.*;

import java.io.File;

public class WildcardImportExample {
    public static void main(String[] args) {
        // TODO 7: List, Set, Map 컬렉션 생성하기
        List<Integer> numbers = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> scores = new HashMap<>();

        // TODO 8: 데이터 추가하기
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        uniqueWords.add("banana");
        uniqueWords.add("apple");
        uniqueWords.add("banana"); // 중복 무시
        scores.put("김철수", 90);
        scores.put("이영희", 85);

        // TODO 9: 결과 출력하기
        System.out.println("숫자 리스트: " + numbers);
        System.out.println("고유 단어: " + uniqueWords);
        System.out.println("점수: " + scores);

        // TODO 10: File 객체로 현재 디렉토리 정보 출력하기
        File currentDir = new File(".");
        System.out.println("\n현재 디렉토리: " + currentDir.getAbsolutePath());
    }
}

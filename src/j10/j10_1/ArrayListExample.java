package j10.j10_1;

import java.util.*;

public class ArrayListExample {
    
    public static void main(String[] args) {
        // 문자열 리스트
        ArrayList<String> fruits = new ArrayList<>();
        
        // TODO: 과일 추가 - "사과", "바나나", "오렌지"
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        
        // TODO: 인덱스 1에 "딸기" 추가
        fruits.add(1, "딸기");
        
        // TODO: 첫 번째 과일 가져오기
        String firstFruit = fruits.get(0);
        
        // TODO: 인덱스 2의 과일을 "키위"로 변경
        fruits.set(2, "키위");
        
        // TODO: "딸기" 삭제
        fruits.remove("딸기");
        
        // TODO: 인덱스 0의 과일 삭제
        fruits.remove(0);
        
        // TODO: "오렌지"가 있는지 확인
        boolean hasOrange = fruits.contains("오렌지");
        
        // TODO: "키위"의 인덱스 찾기
        int kiwiIndex = fruits.indexOf("키위");
        
        // TODO: fruits 리스트 정렬
        Collections.sort(fruits);
        
        System.out.println("과일 목록: " + fruits);
        System.out.println("첫 번째 과일: " + firstFruit);
        System.out.println("수정 후: " + fruits);
        System.out.println("삭제 후: " + fruits);
        System.out.println("오렌지 있음? " + hasOrange);
        System.out.println("키위의 위치: " + kiwiIndex);
        System.out.println("정렬 후: " + fruits);
        System.out.println("크기: " + fruits.size());
        
        fruits.clear();
        System.out.println("비운 후 비어있음? " + fruits.isEmpty());
    }
}

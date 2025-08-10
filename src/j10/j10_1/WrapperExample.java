package j10.j10_1;

import java.util.*;

public class WrapperExample {
    
    /**
     * 리스트의 합계 계산 (오토언박싱 활용)
     */
    public static int calculateSum(List<Integer> numbers) {
        // TODO: 향상된 for 루프를 사용하여 합계 계산
        // 힌트: 오토언박싱이 자동으로 발생
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // 오토언박싱 발생
        }
        return sum;
    }
    
    /**
     * null 안전하게 처리하는 메서드
     */
    public static int safeGetValue(Integer nullableInt, int defaultValue) {
        // TODO: nullableInt가 null이면 defaultValue 반환
        if (nullableInt == null) {
            return defaultValue;
        } else {
            return nullableInt;
        }
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println("합계: " + calculateSum(numbers));
        
        int a = 42;
        Integer b = a; // 오토박싱
        int c = b; // 언박싱
        
        System.out.println("42의 이진수: " + Integer.toBinaryString(a));
        System.out.println("42의 16진수: " + Integer.toHexString(a));
        
        String str = "123";
        int parsed = Integer.parseInt(str);
        System.out.println("파싱된 값: " + parsed);
        
        Integer nullable = null;
        System.out.println("Nullable 값: " + safeGetValue(nullable, 0));
        
        Integer a1 = 127;
        Integer a2 = 127;
        System.out.println("a == b (127): " + (a1 == a2));
        
        Integer c1 = 128;
        Integer c2 = 128;
        System.out.println("c == d (128): " + (c1 == c2));
        System.out.println("c.equals(d): " + c1.equals(c2));
    }
}

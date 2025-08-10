package j10.j10_2;

import java.util.*;

public class ListPerformanceTest {
    
    public static void main(String[] args) {
        int size = 100000;
        
        // ArrayList 테스트
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        System.out.println("=== 성능 비교 (요소 수: " + size + ") ===\n");
        
        // 1. 끝에 추가
        System.out.println("1. 끝에 추가:");
        long startTime = System.nanoTime();
        // ArrayList에 0부터 size-1까지 추가
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long arrayAddEnd = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        // LinkedList에 0부터 size-1까지 추가
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        long linkedAddEnd = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList: %.2f ms%n", arrayAddEnd / 1_000_000.0);
        System.out.printf("LinkedList: %.2f ms%n", linkedAddEnd / 1_000_000.0);
        
        // 2. 처음에 추가 (1000개)
        System.out.println("\n2. 처음에 추가 (1000개):");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        
        startTime = System.nanoTime();
        // ArrayList 맨 앞에 1000개 요소 추가
        for (int i = 0; i < 1000; i++) {
            arrayList2.add(0, i);
        }
        long arrayAddFirst = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        // LinkedList 맨 앞에 1000개 요소 추가 (addFirst)
        for (int i = 0; i < 1000; i++) {
            linkedList2.addFirst(i);
        }
        long linkedAddFirst = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList: %.2f ms%n", arrayAddFirst / 1_000_000.0);
        System.out.printf("LinkedList: %.2f ms%n", linkedAddFirst / 1_000_000.0);
        
        // 3. 임의 접근 (10000번)
        System.out.println("\n3. 임의 접근 (10000번):");
        Random rand = new Random();
        
        startTime = System.nanoTime();
        // ArrayList 무작위 인덱스로 10000번 접근
        for (int i = 0; i < 10000; i++) {
            int index = rand.nextInt(size);
            int val = arrayList.get(index);
        }
        long arrayGet = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        // LinkedList 무작위 인덱스로 10000번 접근
        for (int i = 0; i < 10000; i++) {
            int index = rand.nextInt(size);
            int val = linkedList.get(index);
        }
        long linkedGet = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList: %.2f ms%n", arrayGet / 1_000_000.0);
        System.out.printf("LinkedList: %.2f ms%n", linkedGet / 1_000_000.0);
        
        // 4. 중간 삭제 (100개)
        System.out.println("\n4. 중간 삭제 (100개):");
        ArrayList<Integer> arrayList3 = new ArrayList<>(arrayList);
        LinkedList<Integer> linkedList3 = new LinkedList<>(linkedList);
        
        startTime = System.nanoTime();
        // ArrayList 중간 요소 100개 삭제 (중간 위치부터)
        int startIndex = arrayList3.size() / 2;
        for (int i = 0; i < 100; i++) {
            arrayList3.remove(startIndex);
        }
        long arrayRemoveMid = System.nanoTime() - startTime;
        
        startTime = System.nanoTime();
        // LinkedList에서 Iterator를 사용해 100개 삭제
        ListIterator<Integer> iter = linkedList3.listIterator(linkedList3.size() / 2);
        for (int i = 0; i < 100; i++) {
            iter.next();
            iter.remove();
        }
        long linkedRemoveMid = System.nanoTime() - startTime;
        
        System.out.printf("ArrayList: %.2f ms%n", arrayRemoveMid / 1_000_000.0);
        System.out.printf("LinkedList: %.2f ms%n", linkedRemoveMid / 1_000_000.0);
    }
}

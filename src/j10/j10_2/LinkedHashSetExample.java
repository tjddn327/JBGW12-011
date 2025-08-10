package j10.j10_2;

import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        String[] data = {"banana", "apple", "cherry", "date", "elderberry"};

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String item : data) {
            hashSet.add(item);
            linkedHashSet.add(item);
            treeSet.add(item);
        }

        System.out.println("HashSet (순서 없음): " + hashSet);
        System.out.println("LinkedHashSet (삽입 순서): " + linkedHashSet);
        System.out.println("TreeSet (정렬됨): " + treeSet);

        // LRU 캐시 구현
        System.out.println("\n=== LRU 캐시 예제 ===");

        class LRUCache<K, V> extends LinkedHashMap<K, V> {
            private final int maxSize;

            public LRUCache(int maxSize) {
                super(16, 0.75f, true);  // true = access-order
                this.maxSize = maxSize;
            }

            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxSize;
            }
        }

        LRUCache<String, String> cache = new LRUCache<>(3);

        cache.put("A", "Data A");
        cache.put("B", "Data B");
        cache.put("C", "Data C");
        System.out.println("캐시: " + cache);

        cache.get("A");  // A 접근해서 최근 사용으로 이동
        cache.put("D", "Data D");  // B가 제거됨 (가장 오래된)
        System.out.println("D 추가 후: " + cache);

        cache.get("C");  // C 접근
        cache.put("E", "Data E");  // D 제거됨
        System.out.println("E 추가 후: " + cache);
    }
}

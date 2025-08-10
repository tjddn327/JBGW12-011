package j10.j10_5;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class GenericCache<K, V> {
    // 내부 Map 사용, TTL(Time To Live) 적용
    private final Map<K, CacheEntry<V>> cache;
    private final int maxSize;
    private final long ttlMillis; // 캐시 유지 시간(ms)

    // 캐시 항목 저장용 내부 클래스
    private static class CacheEntry<V> {
        final V value;
        final long createdTime;

        CacheEntry(V value) {
            this.value = value;
            this.createdTime = System.currentTimeMillis();
        }

        // TTL 만료 여부 판단
        boolean isExpired(long ttlMillis) {
            return ttlMillis > 0 &&
                   (System.currentTimeMillis() - createdTime) > ttlMillis;
        }
    }

    // TODO 1: 기본 생성자 (maxSize만 설정, ttl 없음)
    public GenericCache(int maxSize) {
        this(maxSize, -1);
    }

    // TODO 2: 생성자 (maxSize와 TTL 설정)
    public GenericCache(int maxSize, long ttlMillis) {
        this.cache = new ConcurrentHashMap<>();
        this.maxSize = maxSize;
        this.ttlMillis = ttlMillis;
    }

    // TODO 3: 캐시에 값 저장 (put)
    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("키는 null일 수 없습니다");
        }

        // 용량 초과 시 오래된 항목 제거
        if (cache.size() >= maxSize) {
            evictOldest();
        }

        cache.put(key, new CacheEntry<>(value));
    }

    // TODO 4: 캐시에서 값 조회 (get)
    public V get(K key) {
        if (key == null) return null;

        CacheEntry<V> entry = cache.get(key);
        if (entry == null) return null;

        // TTL 만료 시 항목 제거 후 null 반환
        if (entry.isExpired(ttlMillis)) {
            cache.remove(key);
            return null;
        }

        return entry.value;
    }

    // 키 존재 여부 확인
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // TODO 5: 키에 해당하는 항목 제거 (remove)
    public V remove(K key) {
        CacheEntry<V> entry = cache.remove(key);
        return entry != null ? entry.value : null;
    }

    // 전체 캐시 비우기
    public void clear() {
        cache.clear();
    }

    // 현재 캐시 크기 반환 (만료된 항목은 제외)
    public int size() {
        cleanupExpired();
        return cache.size();
    }

    // 캐시가 비었는지 여부
    public boolean isEmpty() {
        return size() == 0;
    }

    // TODO 6: 만료된 항목 정리
    private void cleanupExpired() {
        if (ttlMillis <= 0) return;

        cache.entrySet().removeIf(entry ->
            entry.getValue().isExpired(ttlMillis));
    }

    // TODO 7: 가장 오래된 항목 제거 (단순 구현)
    private void evictOldest() {
        K oldestKey = null;
        long oldestTime = Long.MAX_VALUE;

        for (Map.Entry<K, CacheEntry<V>> entry : cache.entrySet()) {
            if (entry.getValue().createdTime < oldestTime) {
                oldestTime = entry.getValue().createdTime;
                oldestKey = entry.getKey();
            }
        }

        if (oldestKey != null) {
            cache.remove(oldestKey);
        }
    }

    // TODO 8: 캐시 상태 출력 (통계 정보)
    public void printStats() {
        cleanupExpired();
        System.out.println("캐시 통계:");
        System.out.println("  현재 크기: " + cache.size());
        System.out.println("  최대 크기: " + maxSize);
        System.out.println("  TTL: " + (ttlMillis > 0 ? ttlMillis + "ms" : "무제한"));
    }

    public static void main(String[] args) throws InterruptedException {
        // 기본 캐시 테스트
        GenericCache<String, Integer> cache = new GenericCache<>(3);

        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);

        System.out.println("캐시 값들:");
        System.out.println("one: " + cache.get("one"));
        System.out.println("two: " + cache.get("two"));
        System.out.println("three: " + cache.get("three"));

        // 크기 초과 시 오래된 항목 제거 테스트
        cache.put("four", 4); // 가장 오래된 항목 제거됨
        System.out.println("\n크기 초과 후:");
        System.out.println("one: " + cache.get("one")); // null일 수 있음
        System.out.println("four: " + cache.get("four"));

        cache.printStats();

        // TTL 테스트
        System.out.println("\n=== TTL 테스트 ===");
        GenericCache<String, String> ttlCache = new GenericCache<>(5, 1000); // 1초 TTL

        ttlCache.put("temp", "임시 데이터");
        System.out.println("즉시 조회: " + ttlCache.get("temp"));

        Thread.sleep(1100); // 1.1초 대기

        System.out.println("1.1초 후 조회: " + ttlCache.get("temp")); // null 예상
        ttlCache.printStats();
    }
}

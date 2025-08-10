package j10.j10_2;

import java.util.*;

public class TopKElements {

    // K개의 가장 큰 요소 찾기
    public static List<Integer> findTopK(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();  // 크기 초과하면 가장 작은 값 제거
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);
        // 내림차순 정렬
        result.sort(Comparator.reverseOrder());

        return result;
    }

    // K번째로 큰 요소 찾기
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();  // K번째 큰 수
    }

    // 빈도수 기준 Top-K
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((w1, w2) -> {
            int freq1 = count.get(w1);
            int freq2 = count.get(w2);
            if (freq1 != freq2) {
                return freq1 - freq2;  // 빈도수 오름차순
            }
            return w2.compareTo(w1);  // 빈도 같으면 사전 역순
        });

        for (String word : count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) {
                heap.poll();  // 크기 유지
            }
        }

        List<String> result = new ArrayList<>(heap);
        // 빈도수 내림차순, 같으면 사전순
        result.sort((w1, w2) -> {
            int freq1 = count.get(w1);
            int freq2 = count.get(w2);
            if (freq1 != freq2) {
                return freq2 - freq1;  // 내림차순
            }
            return w1.compareTo(w2);  // 사전순
        });

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4, 8, 7, 9};
        System.out.println("배열: " + Arrays.toString(nums));
        System.out.println("Top 3: " + findTopK(nums, 3));
        System.out.println("3번째로 큰 수: " + findKthLargest(nums, 3));

        String[] words = {"apple", "banana", "apple", "cherry", "banana",
                          "apple", "date", "banana", "cherry", "elderberry"};
        System.out.println("\n단어 배열: " + Arrays.toString(words));
        System.out.println("가장 빈번한 3개: " + topKFrequent(words, 3));
    }
}

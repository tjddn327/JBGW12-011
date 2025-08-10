package j10.j10_2;

import java.util.*;

public class SortedListMaintainer {
    
    // 정렬된 상태를 유지하며 삽입
    public static <T extends Comparable<T>> void insertSorted(List<T> list, T item) {
        ListIterator<T> iter = list.listIterator();
        
        while (iter.hasNext()) {
            T current = iter.next();
            if (item.compareTo(current) <= 0) {
                iter.previous();  // 한 칸 뒤로 가서 멈춤
                break;
            }
        }
        // 현재 위치에 삽입
        iter.add(item);
    }
    
    // 병합 정렬 (두 정렬된 리스트 병합)
    public static <T extends Comparable<T>> List<T> mergeSortedLists(
            List<T> list1, List<T> list2) {
        
        List<T> result = new LinkedList<>();
        ListIterator<T> iter1 = list1.listIterator();
        ListIterator<T> iter2 = list2.listIterator();
        
        T item1 = iter1.hasNext() ? iter1.next() : null;
        T item2 = iter2.hasNext() ? iter2.next() : null;
        
        while (item1 != null || item2 != null) {
            if (item1 == null) {
                result.add(item2);
                item2 = iter2.hasNext() ? iter2.next() : null;
            } else if (item2 == null) {
                result.add(item1);
                item1 = iter1.hasNext() ? iter1.next() : null;
            } else {
                if (item1.compareTo(item2) <= 0) {
                    result.add(item1);
                    item1 = iter1.hasNext() ? iter1.next() : null;
                } else {
                    result.add(item2);
                    item2 = iter2.hasNext() ? iter2.next() : null;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        // 정렬된 삽입 테스트
        List<Integer> sortedList = new LinkedList<>();
        int[] values = {5, 2, 8, 1, 9, 3, 7};
        
        for (int value : values) {
            insertSorted(sortedList, value);
            System.out.println("삽입 " + value + " 후: " + sortedList);
        }
        
        // 병합 테스트
        List<String> list1 = Arrays.asList("apple", "cherry", "grape");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "kiwi");
        
        List<String> merged = mergeSortedLists(list1, list2);
        System.out.println("\n병합 결과: " + merged);
    }
}

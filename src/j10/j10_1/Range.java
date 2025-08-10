package j10.j10_1;

import java.util.*;
import java.util.NoSuchElementException;

/**
 * Iterator를 구현하는 커스텀 클래스
 */
public class Range implements Iterable<Integer> {
    private int start;
    private int end;
    private int step;
    
    public Range(int start, int end) {
        this(start, end, 1);
    }
    
    public Range(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }
    
    @Override
    public Iterator<Integer> iterator() {
        // TODO: RangeIterator 인스턴스 반환
        return new RangeIterator();
    }
    
    private class RangeIterator implements Iterator<Integer> {
        private int current = start;
        
        @Override
        public boolean hasNext() {
            // TODO: 다음 요소가 있는지 확인
            // 힌트: step이 양수면 current < end, 음수면 current > end
            if (step > 0) {
                return current < end;
            } else if (step < 0) {
                return current > end;
            }
            return false;
        }
        
        @Override
        public Integer next() {
            // TODO: 현재 값을 반환하고 current를 step만큼 증가
            // 힌트: hasNext()가 false면 NoSuchElementException 던지기
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int ret = current;
            current += step;
            return ret;
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Range(0, 10): ");
        for (int i : new Range(0, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Range(10, 0, -1): ");
        for (int i : new Range(10, 0, -1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("Range(0, 21, 2): ");
        for (int i : new Range(0, 21, 2)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

package j10.j10_5;

import java.util.*;

public class GenericQueue<T> {
    // 내부에 LinkedList 사용해서 큐 구현
    private LinkedList<T> items;

    public GenericQueue() {
        items = new LinkedList<>();
    }

    // TODO 1: 큐에 요소 추가 메서드 작성 (enqueue)
    public void enqueue(T item) {
        items.add(item);
    }

    // TODO 2: 큐에서 요소 제거 메서드 작성 (dequeue)
    public T dequeue() {
        if (items.isEmpty()) {
            throw new NoSuchElementException("큐가 비어있습니다");
        }
        return items.removeFirst();
    }

    // TODO 3: 큐의 첫 번째 요소 확인 (peek)
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("큐가 비어있습니다");
        }
        return items.getFirst();
    }

    // 큐가 비어있는지 확인하는 메서드
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // 큐의 현재 크기 반환
    public int size() {
        return items.size();
    }

    // TODO 4: 다른 컬렉션의 모든 요소를 큐에 추가
    public void addAll(Collection<? extends T> collection) {
        for (T item : collection) {
            enqueue(item);
        }
    }

    // TODO 5: 큐의 모든 요소를 다른 컬렉션으로 이동(drain)
    public void drainTo(Collection<? super T> collection) {
        while (!isEmpty()) {
            collection.add(dequeue());
        }
    }

    @Override
    public String toString() {
        return "Queue" + items.toString();
    }

    public static void main(String[] args) {
        // String 타입 큐 테스트
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("첫 번째");
        stringQueue.enqueue("두 번째");
        stringQueue.enqueue("세 번째");

        System.out.println("String 큐: " + stringQueue);
        System.out.println("Dequeue: " + stringQueue.dequeue());
        System.out.println("Peek: " + stringQueue.peek());

        // Integer 타입 큐 테스트
        GenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);

        System.out.println("\nInteger 큐: " + intQueue);
        System.out.println("크기: " + intQueue.size());

        // 다른 컬렉션 추가 테스트
        List<Integer> numbers = Arrays.asList(40, 50, 60);
        intQueue.addAll(numbers);
        System.out.println("addAll 후: " + intQueue);

        // 다른 컬렉션으로 이동(drain)
        List<Integer> result = new ArrayList<>();
        intQueue.drainTo(result);
        System.out.println("drainTo 결과: " + result);
        System.out.println("큐 상태: " + intQueue);
    }
}

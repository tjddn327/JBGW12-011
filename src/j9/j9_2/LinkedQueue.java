package j9.j9_2;

import java.util.NoSuchElementException;

public class LinkedQueue<T> {

    private Node<T> front; // 큐의 맨 앞 (제거되는 위치)
    private Node<T> rear;  // 큐의 맨 뒤 (추가되는 위치)
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void enqueue(T data) {
        // TODO: 큐의 뒤쪽에 요소 추가
        // 힌트: rear 포인터 활용, 빈 큐 처리
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) { // 큐가 비어있으면
            front = newNode;
            rear = newNode;
        } else { // 큐에 요소가 있으면
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        // TODO: 큐의 앞쪽에서 요소 제거 및 반환
        // 힌트: front 포인터 활용, 빈 큐 처리
        if (isEmpty()) {
            throw new NoSuchElementException("큐가 비어 있습니다.");
        }
        T data = front.data;
        front = front.next;

        // 만약 dequeue 후 큐가 비게 되면 rear도 null로 설정
        if (front == null) {
            rear = null;
        }

        size--;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        System.out.println("enqueue: 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("큐 크기: " + queue.size());
        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());

        System.out.println("enqueue: 40");
        queue.enqueue(40);

        System.out.println("dequeue: " + queue.dequeue());
        System.out.println("dequeue: " + queue.dequeue());

        System.out.println("빈 큐? " + queue.isEmpty());
    }
}
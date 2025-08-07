package j9.j9_2;

public class LinkedQueue<T> {

    private Node<T> front;
    private Node<T> rear;
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
    }

    public T dequeue() {
        // TODO: 큐의 앞쪽에서 요소 제거 및 반환
        // 힌트: front 포인터 활용, 빈 큐 처리

        return null; // 임시 반환값
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        // 실행 결과:
        // enqueue: 10, 20, 30
        // 큐 크기: 3
        // dequeue: 10
        // dequeue: 20
        // enqueue: 40
        // dequeue: 30
        // dequeue: 40
        // 빈 큐? true
    }
}
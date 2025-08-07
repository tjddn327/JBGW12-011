package j9.j9_2;

public class LinkedStack<T> {

    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T data) {
        // TODO: 스택의 맨 위에 요소 추가
    }

    public T pop() {
        // TODO: 스택의 맨 위 요소 제거 및 반환
        // 힌트: 빈 스택 처리

        return null; // 임시 반환값
    }

    public T peek() {
        // TODO: 스택의 맨 위 요소 확인 (제거하지 않음)

        return null; // 임시 반환값
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();

        // 실행 결과:
        // push: 첫번째, 두번째, 세번째
        // 스택 크기: 3
        // peek: 세번째
        // pop: 세번째
        // pop: 두번째
        // pop: 첫번째
        // 빈 스택? true
    }
}
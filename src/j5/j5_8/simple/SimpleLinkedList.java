package j5.j5_8.simple;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 간단한 연결 리스트 구현
 */
public class SimpleLinkedList<T> {
    private Node head;
    private int size;

    // 노드를 나타내는 내부 클래스
    private class Node {
        T data;
        Node next;

        Node(T data) {
            // TODO 36: data 초기화하고 next를 null로 설정하기
            this.data = data;
            this.next = null;
        }
    }

    // 반복자를 구현하는 내부 클래스
    public class ListIterator implements Iterator<T> {
        private Node current;
        private Node previous;
        private Node beforePrevious; // remove() 할 때 이전노드 추적용

        public ListIterator() {
            // TODO 37: current를 head로, previous를 null로 초기화하기
            current = head;
            previous = null;
            beforePrevious = null;
        }

        @Override
        public boolean hasNext() {
            // TODO 38: 다음 요소가 있는지 확인하기
            return current != null;
        }

        @Override
        public T next() {
            // TODO 39: 다음 요소 반환하기
            // hasNext()가 false면 NoSuchElementException 던지기
            // current의 데이터 저장, previous와 current 업데이트
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data;
            // 이동 전에 previous, beforePrevious 업데이트
            beforePrevious = previous;
            previous = current;
            current = current.next;
            return data;
        }

        // 현재 요소 삭제
        public void remove() {
            // TODO 40: 현재 위치의 요소 삭제하기
            // previous가 null이면 첫 번째 요소 삭제
            // 아니면 previous의 앞 노드 찾아서 연결 수정
            // size 감소

            if (previous == null) {
                throw new IllegalStateException("next()를 호출하기 전에 remove()를 호출할 수 없습니다.");
            }

            if (beforePrevious == null) {
                // 첫 노드 삭제
                head = current;
            } else {
                beforePrevious.next = current;
            }

            previous = null; // remove 후 중복 호출 방지
            size--;
        }

        // 현재 위치에 삽입
        public void insert(T data) {
            // TODO 41: 현재 위치에 새 요소 삽입하기
            // 새 노드 생성
            // previous가 null이면 리스트 맨 앞에 삽입
            // 아니면 previous와 current 사이에 삽입
            // previous와 size 업데이트

            Node newNode = new Node(data);

            if (previous == null) {
                // 리스트 맨 앞에 삽입
                newNode.next = head;
                head = newNode;
            } else {
                newNode.next = current;
                previous.next = newNode;
            }

            previous = newNode;
            size++;
        }
    }

    public void add(T data) {
        // TODO 42: 리스트 끝에 요소 추가하기
        // 새 노드 생성
        // head가 null이면 head로 설정
        // 아니면 마지막 노드 찾아서 연결
        // size 증가

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public ListIterator iterator() {
        // TODO 43: 새로운 ListIterator 반환하기
        return new ListIterator();
    }

    public int size() {
        // TODO 44: 리스트 크기 반환하기
        return size;
    }

    @Override
    public String toString() {
        // TODO 45: 리스트를 "[item1, item2, ...]" 형식으로 반환하기
        // StringBuilder 사용
        // 모든 노드 순회하며 데이터 추가

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            if (temp.next != null) {
                sb.append(", ");
            }
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
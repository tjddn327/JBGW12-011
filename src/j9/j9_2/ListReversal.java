package j9.j9_2;

public class ListReversal {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    /**
     * 리스트 뒤집기 (반복)
     */
    public static Node reverseIterative(Node head) {
        // TODO: 반복문을 사용하여 리스트 뒤집기
        // 힌트: previous, current, next 포인터 사용

        return null; // 임시 반환값
    }

    /**
     * 리스트 뒤집기 (재귀)
     */
    public static Node reverseRecursive(Node head) {
        // TODO: 재귀를 사용하여 리스트 뒤집기
        // 힌트:
        // 1. 기저 사례: 빈 리스트나 단일 노드
        // 2. 재귀 사례: 나머지를 뒤집고 현재 노드를 끝에 추가

        return null; // 임시 반환값
    }

    // 유틸리티 메서드
    public static void printList(String label, Node head) {
        System.out.print(label + ": ");
        Node runner = head;

        while (runner != null) {
            System.out.print(runner.data);
            if (runner.next != null) {
                System.out.print(" → ");
            }
            runner = runner.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 리스트 생성: A → B → C → D
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");

        // 실행 결과:
        // 원본: A → B → C → D
        // 반복 뒤집기: D → C → B → A
        // 재귀 뒤집기: D → C → B → A
    }
}
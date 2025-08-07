package j9.j9_2;

public class LinkedListTraversalExample {

    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    /**
     * while 루프를 사용한 순회
     */
    public static void traverseWithWhile(Node head) {
        // TODO: while 루프로 리스트 순회하며 각 노드의 위치와 데이터 출력
        // 힌트: runner 변수와 position 변수 사용
        Node runner = head;
        while (runner != null) {
            System.out.print(runner.data + " ");
        }
    }

    /**
     * 재귀를 사용한 순회
     */
    public static void traverseRecursive(Node head, int position) {
        // TODO: 재귀를 사용하여 리스트 순회
        // 힌트: 기저 사례는 head == null
    }

    /**
     * 역순 출력 (재귀)
     */
    public static void printReversed(Node head) {
        // TODO: 재귀를 사용하여 리스트를 역순으로 출력
        // 힌트: 먼저 나머지를 재귀 호출한 후 현재 노드 출력
    }

    public static void main(String[] args) {
        // 연결 리스트 생성
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");

        // 실행 결과:
        // === While 루프 순회 ===
        // [0] A
        // [1] B
        // [2] C
        // [3] D
        //
        // === 재귀 순회 ===
        // [0] A
        // [1] B
        // [2] C
        // [3] D
        //
        // === 역순 출력 ===
        // D C B A
    }
}
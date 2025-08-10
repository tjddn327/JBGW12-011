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
        int position = 0;
        while (runner != null) {
            System.out.println("[" + position + "] " + runner.data);
            runner = runner.next;
            position++;
        }
    }

    /**
     * 재귀를 사용한 순회
     */
    public static void traverseRecursive(Node head, int position) {
        // TODO: 재귀를 사용하여 리스트 순회
        // 힌트: 기저 사례는 head == null

        // 기저 사례
        if (head == null) {
            return;
        }

        // 재귀 사례
        System.out.println("[" + position + "] " + head.data);
        traverseRecursive(head.next, position + 1);
    }

    /**
     * 역순 출력 (재귀)
     */
    public static void printReversed(Node head) {
        // TODO: 재귀를 사용하여 리스트를 역순으로 출력
        // 힌트: 먼저 나머지를 재귀 호출한 후 현재 노드 출력

        // 기저 사례
        if (head == null) {
            return;
        }

        // 재귀 사례
        printReversed(head.next); // 리스트의 나머지 부분을 먼저 처리
        System.out.print(head.data + " "); // 그 다음 현재 노드를 출력
    }

    public static void main(String[] args) {
        // 연결 리스트 생성
        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");

        System.out.println("=== While 루프 순회 ===");
        traverseWithWhile(head);

        System.out.println("\n=== 재귀 순회 ===");
        traverseRecursive(head, 0);

        System.out.println("\n=== 역순 출력 ===");
        printReversed(head);
        System.out.println();
    }
}
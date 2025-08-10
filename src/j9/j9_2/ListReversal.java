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
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;    // 다음 노드를 임시 저장
            current.next = previous; // 현재 노드의 다음을 이전 노드로 변경
            previous = current;     // previous를 현재 노드로 이동
            current = next;         // current를 다음 노드로 이동
        }
        return previous; // 새로운 head는 이전의 마지막 노드였던 previous
    }

    /**
     * 리스트 뒤집기 (재귀)
     */
    public static Node reverseRecursive(Node head) {
        // TODO: 재귀를 사용하여 리스트 뒤집기

        // 1. 기저 사례: 빈 리스트이거나 노드가 하나뿐인 경우
        if (head == null || head.next == null) {
            return head;
        }

        // 2. 재귀 사례: 나머지 리스트(head.next부터)를 뒤집는다.
        Node newHead = reverseRecursive(head.next);

        // head.next는 뒤집힌 리스트의 마지막 노드가 됨.
        // 그 노드의 next를 현재 head로 설정한다.
        head.next.next = head;

        // 원래의 연결(head -> head.next)을 끊어 순환을 방지한다.
        head.next = null;

        return newHead;
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
        // 리스트1 생성
        Node head1 = new Node("A");
        head1.next = new Node("B");
        head1.next.next = new Node("C");
        head1.next.next.next = new Node("D");

        // 리스트2 생성 (재귀 테스트용)
        Node head2 = new Node("A");
        head2.next = new Node("B");
        head2.next.next = new Node("C");
        head2.next.next.next = new Node("D");

        printList("원본", head1);

        Node reversedHead1 = reverseIterative(head1);
        printList("반복 뒤집기", reversedHead1);

        // 재귀 테스트를 위해 다시 원래 리스트로 뒤집기
        Node reversedHead2 = reverseRecursive(head2);
        printList("재귀 뒤집기", reversedHead2);
    }
}
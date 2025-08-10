package j9.j9_2;

public class MergeLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * 두 정렬된 리스트 병합
     */
    public static Node mergeSortedLists(Node head1, Node head2) {
        // TODO: 두 정렬된 리스트를 하나의 정렬된 리스트로 병합

        // 1. 둘 중 한 리스트가 비어있으면 다른 리스트를 반환
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        // 2. 더미 노드를 사용하여 코드 단순화
        Node dummy = new Node(-1); // 병합된 리스트의 시작점 바로 앞 노드
        Node tail = dummy;         // 병합된 리스트의 마지막 노드

        // 3. 두 리스트를 동시에 순회하며 작은 값 선택
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // 한쪽 리스트가 먼저 끝나면 남은 리스트를 뒤에 붙임
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }

        return dummy.next; // 더미 노드 다음이 실제 병합 리스트의 시작
    }

    public static void printList(String label, Node head) {
        System.out.print(label + ": ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 리스트1: 1 → 3 → 5 → 7
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(7);

        // 리스트2: 2 → 4 → 6 → 8
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(8);

        printList("리스트1", list1);
        printList("리스트2", list2);

        Node mergedList = mergeSortedLists(list1, list2);
        printList("병합 결과", mergedList);
    }
}
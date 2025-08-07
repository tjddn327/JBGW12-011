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
        // 힌트:
        // 1. 빈 리스트 처리
        // 2. 더미 노드 사용으로 코드 단순화
        // 3. 두 리스트를 동시에 순회하며 작은 값 선택

        return null; // 임시 반환값
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

        // 실행 결과:
        // 리스트1: 1 → 3 → 5 → 7
        // 리스트2: 2 → 4 → 6 → 8
        // 병합 결과: 1 → 2 → 3 → 4 → 5 → 6 → 7 → 8
    }
}
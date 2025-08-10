package j9.j9_2;

public class RemoveDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /**
     * 정렬된 리스트에서 중복 제거
     */
    public static void removeDuplicatesSorted(Node head) {
        // TODO: 인접한 중복 요소 제거
        // 힌트: current와 current.next 비교
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // 다음 노드를 건너뜀
            } else {
                current = current.next; // 다음 노드로 이동
            }
        }
    }

    /**
     * 정렬되지 않은 리스트에서 중복 제거
     */
    public static void removeDuplicatesUnsorted(Node head) {
        // TODO: 모든 중복 요소 제거
        // 힌트: 각 노드에 대해 그 이후의 모든 노드와 비교 (O(n^2) 방식)
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next; // 중복 발견 시 제거
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public static void printList(Node head) {
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
        // 정렬된 리스트: 1 → 1 → 2 → 3 → 3 → 3 → 4
        Node sorted = new Node(1);
        sorted.next = new Node(1);
        sorted.next.next = new Node(2);
        sorted.next.next.next = new Node(3);
        sorted.next.next.next.next = new Node(3);
        sorted.next.next.next.next.next = new Node(3);
        sorted.next.next.next.next.next.next = new Node(4);

        System.out.print("정렬된 리스트 원본: ");
        printList(sorted);
        removeDuplicatesSorted(sorted);
        System.out.print("중복 제거 후: ");
        printList(sorted);
        System.out.println();

        // 정렬되지 않은 리스트: 3 → 1 → 4 → 1 → 3 → 2
        Node unsorted = new Node(3);
        unsorted.next = new Node(1);
        unsorted.next.next = new Node(4);
        unsorted.next.next.next = new Node(1);
        unsorted.next.next.next.next = new Node(3);
        unsorted.next.next.next.next.next = new Node(2);

        System.out.print("정렬되지 않은 리스트 원본: ");
        printList(unsorted);
        removeDuplicatesUnsorted(unsorted);
        System.out.print("중복 제거 후: ");
        printList(unsorted);
    }
}
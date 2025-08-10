package j9.j9_2;

public class SortedStringList {

    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    /**
     * 정렬된 순서로 삽입
     */
    public void insert(String data) {
        // TODO: 알파벳 순서로 정렬된 위치에 삽입
        Node newNode = new Node(data);

        // 1. 빈 리스트이거나 맨 앞에 삽입하는 경우
        if (head == null || data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // 2. 중간이나 끝에 삽입하는 경우
        Node current = head;
        // 삽입할 위치의 바로 앞 노드를 찾는다.
        while (current.next != null && data.compareTo(current.next.data) > 0) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    /**
     * 정렬된 리스트에서 효율적 검색
     */
    public boolean containsOptimized(String data) {
        // TODO: 정렬된 특성을 활용한 검색
        // 힌트: 찾는 값보다 큰 값이 나오면 조기 종료
        Node current = head;
        while (current != null) {
            int cmp = data.compareTo(current.data);
            if (cmp == 0) { // 값을 찾음
                return true;
            } else if (cmp < 0) { // 찾는 값보다 큰 값을 만남 (더 이상 찾을 필요 없음)
                return false;
            }
            current = current.next;
        }
        return false; // 리스트 끝까지 못 찾음
    }

    @Override
    public String toString() {
        if (head == null) return "[]";

        StringBuilder sb = new StringBuilder("[");
        Node runner = head;

        while (runner != null) {
            sb.append(runner.data);
            if (runner.next != null) {
                sb.append(", ");
            }
            runner = runner.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SortedStringList list = new SortedStringList();

        // 무작위 순서로 삽입
        list.insert("Dog");
        list.insert("Cat");
        list.insert("Elephant");
        list.insert("Bird");
        list.insert("Ant");

        // 실행 결과
        System.out.println("정렬된 리스트: " + list);
        System.out.println("'Cat' 검색: " + list.containsOptimized("Cat"));
        System.out.println("'Fish' 검색: " + list.containsOptimized("Fish"));
    }
}
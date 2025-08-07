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
        // 힌트:
        // 1. 빈 리스트나 맨 앞에 삽입하는 경우
        // 2. 중간이나 끝에 삽입하는 경우
        // compareTo() 메서드 사용
    }

    /**
     * 정렬된 리스트에서 효율적 검색
     */
    public boolean containsOptimized(String data) {
        // TODO: 정렬된 특성을 활용한 검색
        // 힌트: 찾는 값보다 큰 값이 나오면 조기 종료

        return false; // 임시 반환값
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

        // 실행 결과:
        // 정렬된 리스트: [Ant, Bird, Cat, Dog, Elephant]
        // 'Cat' 검색: true
        // 'Fish' 검색: false
    }
}
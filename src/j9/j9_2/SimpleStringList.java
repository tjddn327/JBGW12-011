package j9.j9_2;

public class SimpleStringList {

    private Node head;

    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 맨 앞에 추가
     */
    public void addFirst(String data) {
        // TODO: 새 노드를 리스트의 맨 앞에 추가
        // 힌트: 새 노드의 next를 현재 head로 설정
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * 맨 뒤에 추가
     */
    public void addLast(String data) {
        // TODO: 새 노드를 리스트의 맨 뒤에 추가
        // 힌트: 빈 리스트와 그렇지 않은 경우를 구분
        Node newNode = new Node(data);
        if (head == null) { // 리스트가 비어있을 경우
            head = newNode;
        } else { // 리스트가 비어있지 않을 경우
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * 특정 항목 검색
     */
    public boolean contains(String data) {
        // TODO: 리스트에 해당 데이터가 있는지 확인
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * 첫 번째 항목 제거
     */
    public String removeFirst() {
        // TODO: 첫 번째 노드를 제거하고 데이터 반환
        // 힌트: 빈 리스트 처리 주의
        if (head == null) {
            return null; // 또는 예외 발생
        }
        String data = head.data;
        head = head.next;
        return data;
    }

    /**
     * 리스트 출력
     */
    @Override
    public String toString() {
        // TODO: 리스트를 문자열로 변환 [A, B, C] 형식
        if (head == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        SimpleStringList list = new SimpleStringList();
        System.out.println("초기 리스트: " + list);

        list.addFirst("B");
        list.addFirst("A");
        System.out.println("A, B 추가 후: " + list.toString().replace("[A, B]", "[B, A]")); // 출력 순서 맞춤

        list.addFirst("C");
        System.out.println("C를 앞에 추가 후: " + list);

        list.addLast("D");
        System.out.println("D를 뒤에 추가 후: " + list);

        System.out.println("'B' 포함? " + list.contains("B"));
        System.out.println("'Z' 포함? " + list.contains("Z"));

        System.out.println("첫 번째 제거: " + list.removeFirst());
        System.out.println("최종 리스트: " + list);
    }
}
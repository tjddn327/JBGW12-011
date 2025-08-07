package j9.j9_2;

public class BasicNodeExample {

    /**
     * 문자열을 저장하는 노드
     */
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 노드 체인 출력하기
     */
    public static void printChain(Node head) {
        // TODO: 연결된 노드들을 순서대로 출력
        // 힌트: current가 null이 될 때까지 반복
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    /**
     * 체인의 길이 계산
     */
    public static int getChainLength(Node head) {
        // TODO: 연결된 노드의 개수 반환

        return 0; // 임시 반환값
    }

    public static void main(String[] args) {
        // 노드 체인 만들기
        Node first = new Node("첫번째");
        Node second = new Node("두번째");
        Node third = new Node("세번째");

        first.next = second;
        second.next = third;

        // 실행 결과:
        // 노드 체인: Node[첫번째] → Node[두번째] → Node[세번째]
        // 체인 길이: 3
    }
}
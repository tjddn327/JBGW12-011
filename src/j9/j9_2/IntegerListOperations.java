package j9.j9_2;

public class IntegerListOperations {

    static class IntNode {
        int value;
        IntNode next;

        IntNode(int value) {
            this.value = value;
        }
    }

    /**
     * 리스트의 합계 계산
     */
    public static int sum(IntNode head) {
        // TODO: 리스트의 모든 값을 합산
        int total = 0;
        IntNode current = head;
        while (current != null) {
            total += current.value;
            current = current.next;
        }
        return total;
    }

    /**
     * 최대값 찾기
     */
    public static int findMax(IntNode head) {
        // TODO: 리스트에서 최대값 찾기
        // 힌트: 빈 리스트 처리 주의
        if (head == null) {
            throw new IllegalStateException("리스트가 비어 있습니다.");
        }

        int maxVal = head.value;
        IntNode current = head.next;
        while (current != null) {
            if (current.value > maxVal) {
                maxVal = current.value;
            }
            current = current.next;
        }
        return maxVal;
    }

    /**
     * 짝수만 카운트
     */
    public static int countEvens(IntNode head) {
        // TODO: 짝수인 노드의 개수 카운트
        int count = 0;
        IntNode current = head;
        while (current != null) {
            if (current.value % 2 == 0) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // 정수 리스트 생성: 3 → 7 → 2 → 9 → 4 → 6
        IntNode head = new IntNode(3);
        head.next = new IntNode(7);
        head.next.next = new IntNode(2);
        head.next.next.next = new IntNode(9);
        head.next.next.next.next = new IntNode(4);
        head.next.next.next.next.next = new IntNode(6);

        // 리스트 출력
        System.out.print("리스트: ");
        IntNode current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();

        System.out.println("합계: " + sum(head));
        System.out.println("최대값: " + findMax(head));
        System.out.println("짝수 개수: " + countEvens(head));
    }
}
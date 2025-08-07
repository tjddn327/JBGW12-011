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
    }

    /**
     * 맨 뒤에 추가
     */
    public void addLast(String data) {
        // TODO: 새 노드를 리스트의 맨 뒤에 추가
        // 힌트: 빈 리스트와 그렇지 않은 경우를 구분
    }

    /**
     * 특정 항목 검색
     */
    public boolean contains(String data) {
        // TODO: 리스트에 해당 데이터가 있는지 확인

        return false; // 임시 반환값
    }

    /**
     * 첫 번째 항목 제거
     */
    public String removeFirst() {
        // TODO: 첫 번째 노드를 제거하고 데이터 반환
        // 힌트: 빈 리스트 처리 주의

        return null; // 임시 반환값
    }

    /**
     * 리스트 출력
     */
    @Override
    public String toString() {
        // TODO: 리스트를 문자열로 변환 [A, B, C] 형식

        return "[]"; // 임시 반환값
    }

    public static void main(String[] args) {
        SimpleStringList list = new SimpleStringList();

        // 실행 결과:
        // 초기 리스트: []
        // A, B 추가 후: [A, B]
        // C를 앞에 추가 후: [C, A, B]
        // D를 뒤에 추가 후: [C, A, B, D]
        // 'B' 포함? true
        // 'Z' 포함? false
        // 첫 번째 제거: C
        // 최종 리스트: [A, B, D]
    }
}
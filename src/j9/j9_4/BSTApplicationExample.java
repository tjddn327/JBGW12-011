package j9.j9_4;

public class BSTApplicationExample {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // 데이터 삽입
        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35};
        for (int val : values) {
            bst.insert(val);
        }

        // 정렬된 출력
        System.out.print("정렬된 순서: ");
        bst.printInOrder();  // 10 20 25 30 35 40 50 60 70 80

        // 검색
        System.out.println("25가 있나요? " + bst.contains(25));  // true
        System.out.println("45가 있나요? " + bst.contains(45));  // false

        // 최소/최대값
        System.out.println("최소값: " + bst.findMin());  // 10
        System.out.println("최대값: " + bst.findMax());  // 80

        // 삭제
        bst.delete(30);  // 자식이 둘인 노드 삭제
        System.out.print("30 삭제 후: ");
        bst.printInOrder();  // 10 20 25 35 40 50 60 70 80
    }
}
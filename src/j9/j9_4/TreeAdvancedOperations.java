package j9.j9_4;

public class TreeAdvancedOperations {

    // TreeNode 클래스는 예제 1-1에 정의되어 있다고 가정합니다.
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data) { this.data = data; }
    }

    // 두 트리가 동일한지 확인
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // TODO 1: 두 노드가 모두 null이면 true 반환
        if (p == null && q == null) {
            return true;
        }
        // TODO 2: 하나만 null이면 false 반환
        if (p == null || q == null) {
            return false;
        }

        // TODO 3: 두 노드의 데이터가 같고,
        //         왼쪽 서브트리들끼리 같고,
        //         오른쪽 서브트리들끼리 같은지 확인
        return (p.data == q.data) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

    // 트리가 대칭인지 확인
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;

        return t1.data == t2.data
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }

    // 트리 뒤집기 (좌우 반전)
    public static TreeNode invertTree(TreeNode root) {
        // TODO 1: 기저 사례 - root가 null이면 null 반환
        if (root == null) {
            return null;
        }

        // TODO 2: 왼쪽 자식을 임시 변수에 저장
        TreeNode temp = root.left;

        // TODO 3: 왼쪽에 오른쪽 서브트리를 뒤집어서 할당
        root.left = invertTree(root.right);

        // TODO 4: 오른쪽에 임시 변수에 저장한 왼쪽 서브트리를 뒤집어서 할당
        root.right = invertTree(temp);

        // TODO 5: 현재 노드 반환
        return root;
    }

    // 배열을 균형 BST로 변환
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return node;
    }

    // 트리를 연결 리스트로 평탄화 (전위 순회 순서)
    public static void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;

        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = temp;
    }
}
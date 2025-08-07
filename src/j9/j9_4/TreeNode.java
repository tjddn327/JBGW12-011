package j9.j9_4;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // 생성자들
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
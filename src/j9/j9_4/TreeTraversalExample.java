package j9.j9_4;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalExample {

    // 전위 순회 (루트 → 왼쪽 → 오른쪽)
    public static void preorder(TreeNode root) {
        // TODO 1: root가 null이면 리턴
        if (root == null) {
            return;
        }
        // TODO 2: 현재 노드의 데이터 출력
        System.out.print(root.data + " ");
        // TODO 3: 왼쪽 서브트리 순회
        preorder(root.left);
        // TODO 4: 오른쪽 서브트리 순회
        preorder(root.right);
    }

    // 중위 순회 (왼쪽 → 루트 → 오른쪽)
    public static void inorder(TreeNode root) {
        // TODO 1: root가 null이면 리턴
        if (root == null) {
            return;
        }
        // TODO 2: 왼쪽 서브트리 순회
        inorder(root.left);
        // TODO 3: 현재 노드의 데이터 출력
        System.out.print(root.data + " ");
        // TODO 4: 오른쪽 서브트리 순회
        inorder(root.right);
    }

    // 후위 순회 (왼쪽 → 오른쪽 → 루트)
    public static void postorder(TreeNode root) {
        // TODO 1: root가 null이면 리턴
        if (root == null) {
            return;
        }
        // TODO 2: 왼쪽 서브트리 순회
        postorder(root.left);
        // TODO 3: 오른쪽 서브트리 순회
        postorder(root.right);
        // TODO 4: 현재 노드의 데이터 출력
        System.out.print(root.data + " ");
    }

    // 레벨 순회 (너비 우선 탐색)
    public static void levelOrder(TreeNode root) {
        // TODO 1: root가 null이면 리턴
        if (root == null) {
            return;
        }

        // TODO 2: 큐 생성하고 root를 큐에 추가
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // TODO 3: 큐가 비지 않은 동안 반복:
        while (!queue.isEmpty()) {
            //   - 큐에서 노드를 꺼내고 데이터 출력
            TreeNode node = queue.poll();
            System.out.print(node.data + " ");

            //   - 왼쪽 자식이 있으면 큐에 추가
            if (node.left != null) {
                queue.add(node.left);
            }
            //   - 오른쪽 자식이 있으면 큐에 추가
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \   \
            4   5   6
        */
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6))
        );

        System.out.println("전위 순회: ");
        preorder(root);  // 1 2 4 5 3 6

        System.out.println("\n중위 순회: ");
        inorder(root);   // 4 2 5 1 3 6

        System.out.println("\n후위 순회: ");
        postorder(root); // 4 5 2 6 3 1

        System.out.println("\n레벨 순회: ");
        levelOrder(root); // 1 2 3 4 5 6
    }
}
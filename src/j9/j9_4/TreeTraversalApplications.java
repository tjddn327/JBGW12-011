package j9.j9_4;

public class TreeTraversalApplications {

    // 트리의 모든 노드 합계 구하기
    public static int sumTree(TreeNode root) {
        // TODO 1: 기저 사례 - root가 null이면 0 반환
        // TODO 2: 현재 노드와 왼쪽, 오른쪽 서브트리의 합을 더해서 반환

        return 0; // 임시 반환값
    }

    // 트리의 최대값 찾기
    public static int findMax(TreeNode root) {
        // TODO 1: 기저 사례 - root가 null이면 Integer.MIN_VALUE 반환

        // TODO 2: 왼쪽 서브트리의 최대값 구하기
        // TODO 3: 오른쪽 서브트리의 최대값 구하기

        // TODO 4: 현재 노드, 왼쪽 최대값, 오른쪽 최대값 중 가장 큰 값 반환

        return 0; // 임시 반환값
    }

    // 특정 값이 트리에 있는지 확인
    public static boolean contains(TreeNode root, int target) {
        // TODO 1: 기저 사례 - root가 null이면 false 반환
        // TODO 2: 현재 노드의 값이 target과 같으면 true 반환

        // TODO 3: 왼쪽 또는 오른쪽 서브트리에 target이 있는지 확인

        return false; // 임시 반환값
    }

    // 트리의 높이 구하기
    public static int height(TreeNode root) {
        // TODO 1: 기저 사례 - root가 null이면 0 반환
        // TODO 2: 1 + (왼쪽 서브트리와 오른쪽 서브트리 높이 중 큰 값) 반환

        return 0; // 임시 반환값
    }

    // 잎 노드의 개수 세기
    public static int countLeaves(TreeNode root) {
        // TODO 1: 기저 사례 - root가 null이면 0 반환
        // TODO 2: 잎 노드인지 확인 (왼쪽, 오른쪽 자식이 모두 null)
        // TODO 3: 왼쪽과 오른쪽 서브트리의 잎 노드 개수를 더해서 반환


        return 0; // 임시 반환값
    }

    // 모든 경로 출력하기
    public static void printPaths(TreeNode root) {
        int[] path = new int[1000];
        printPathsHelper(root, path, 0);
    }

    private static void printPathsHelper(TreeNode node, int[] path, int pathLen) {
        if (node == null) return;

        path[pathLen] = node.data;
        pathLen++;

        if (node.left == null && node.right == null) {
            // 잎 노드에 도달하면 경로 출력
            System.out.print("경로: ");
            for (int i = 0; i < pathLen; i++) {
                System.out.print(path[i]);
                if (i < pathLen - 1) System.out.print(" → ");
            }
            System.out.println();
        } else {
            printPathsHelper(node.left, path, pathLen);
            printPathsHelper(node.right, path, pathLen);
        }
    }
}
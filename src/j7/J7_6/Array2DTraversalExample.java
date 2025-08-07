package j7.J7_6;

public class Array2DTraversalExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("원본 배열:");
        printMatrix(matrix);

        System.out.println("\n=== 다양한 순회 방법 ===");

        System.out.println("행 우선 순회 (Row-major):");
        traverseRowMajor(matrix);

        System.out.println("\n열 우선 순회 (Column-major):");
        traverseColumnMajor(matrix);

        System.out.println("\n대각선 순회:");
        traverseDiagonal(matrix);

        System.out.println("\n나선형 순회:");
        traverseSpiral(matrix);
        System.out.println(); // 나선형 순회 후 줄바꿈
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }

    // TODO: 행 우선 순회 메서드를 작성하세요
    public static void traverseRowMajor(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    // TODO: 열 우선 순회 메서드를 작성하세요
    public static void traverseColumnMajor(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    // TODO: 대각선 순회 메서드를 작성하세요
    public static void traverseDiagonal(int[][] matrix) {
        int minDim = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < minDim; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

    // 나선형 순회 (구현 제공)
    public static void traverseSpiral(int[][] matrix) {
        if (matrix.length == 0) return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) System.out.print(matrix[top][j] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(matrix[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) System.out.print(matrix[bottom][j] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }
}
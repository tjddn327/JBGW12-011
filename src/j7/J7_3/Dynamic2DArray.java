package j7.J7_3;

import java.util.ArrayList;

public class Dynamic2DArray {
    public static void main(String[] args) {
        // TODO: 2차원 ArrayList를 생성하세요
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // TODO: 3x4 행렬을 초기화하세요
        int rows = 3;
        int cols = 4;
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(i * cols + j + 1);
            }
            matrix.add(row);
        }

        // TODO: 행렬을 출력하세요
        System.out.println("=== 초기 행렬 ===");
        printMatrix(matrix);

        // TODO: 특정 요소(1행 2열)를 99로 수정하세요
        matrix.get(1).set(2, 99);
        System.out.println("\n=== 수정 후 행렬 ===");
        printMatrix(matrix);

        // TODO: 새로운 행을 추가하세요
        ArrayList<Integer> newRow = new ArrayList<>();
        newRow.add(100);
        newRow.add(101);
        newRow.add(102);
        newRow.add(103);
        matrix.add(newRow);
        System.out.println("\n=== 행 추가 후 ===");
        printMatrix(matrix);

        // TODO: 각 행의 끝에 0을 추가하세요 (열 추가)
        for (ArrayList<Integer> row : matrix) {
            row.add(0);
        }
        System.out.println("\n=== 열 추가 후 ===");
        printMatrix(matrix);

        // TODO: 행렬의 모든 요소의 합을 계산하세요
        int sum = 0;
        for (ArrayList<Integer> row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("\n행렬의 모든 요소 합: " + sum);
    }

    // TODO: 행렬 출력 메서드를 작성하세요
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
    }
}
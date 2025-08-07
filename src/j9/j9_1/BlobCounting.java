package j9.j9_1;

public class BlobCounting {

    private static boolean[][] visited;

    /**
     * 4방향 연결 blob 크기 계산
     */
    public static int getBlobSize4(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // TODO 1: 경계 체크 및 기저 사례
        // 힌트: 범위를 벗어나거나, 이미 방문했거나, 0인 경우

        // TODO 2: 현재 위치 방문 표시

        // TODO 3: 4방향 재귀 호출
        // 힌트: 위, 아래, 왼쪽, 오른쪽

        return 0; // 임시 반환값
    }

    public static void main(String[] args) {
        System.out.println("=== Blob 카운팅 예제 ===");

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 0, 1, 1}
        };

        // 실행 결과:
        // (0,0) 위치의 blob 크기: 5
        // (2,4) 위치의 blob 크기: 4
        // (3,0) 위치의 blob 크기: 2
    }
}
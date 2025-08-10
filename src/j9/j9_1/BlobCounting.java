package j9.j9_1;

public class BlobCounting {

    private static boolean[][] visited;

    /**
     * 4방향 연결 blob 크기 계산
     * @param grid 2차원 그리드
     * @param row 현재 셀의 행
     * @param col 현재 셀의 열
     * @return 현재 셀을 포함하는 blob의 크기
     */
    public static int getBlobSize4(int[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // TODO 1: 경계 체크 및 기저 사례
        // 힌트: 범위를 벗어나거나, 이미 방문했거나, 셀 값이 0(땅이 아님)인 경우 0 반환
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || grid[row][col] == 0) {
            return 0;
        }

        // TODO 2: 현재 위치 방문 표시
        visited[row][col] = true;

        // TODO 3: 4방향 재귀 호출 (현재 셀 크기 1 + 상하좌우 blob 크기)
        // 힌트: 위, 아래, 왼쪽, 오른쪽
        int size = 1;
        size += getBlobSize4(grid, row - 1, col); // 위
        size += getBlobSize4(grid, row + 1, col); // 아래
        size += getBlobSize4(grid, row, col - 1); // 왼쪽
        size += getBlobSize4(grid, row, col + 1); // 오른쪽

        return size;
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

        int rows = grid.length;
        int cols = grid[0].length;

        // 각 테스트마다 visited 배열을 초기화해야 합니다.
        visited = new boolean[rows][cols];
        System.out.println("(0,0) 위치의 blob 크기: " + getBlobSize4(grid, 0, 0));

        visited = new boolean[rows][cols];
        System.out.println("(2,4) 위치의 blob 크기: " + getBlobSize4(grid, 2, 4));

        visited = new boolean[rows][cols];
        System.out.println("(3,0) 위치의 blob 크기: " + getBlobSize4(grid, 3, 0));
    }
}
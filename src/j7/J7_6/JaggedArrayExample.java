package j7.J7_6;

public class JaggedArrayExample {
    public static void main(String[] args) {
        // 삼각형 모양의 배열 생성
        int[][] triangle = new int[5][];  // 5개의 행만 생성

        // 각 행을 다른 길이로 생성
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];  // i+1개의 요소
        }

        // 값 초기화
        int value = 1;
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = value++;
            }
        }

        System.out.println("삼각형 배열:");
        printJaggedArray(triangle);

        // 파스칼의 삼각형 만들기
        int[][] pascal = createPascalTriangle(6);
        System.out.println("\n파스칼의 삼각형:");
        printJaggedArray(pascal);
    }

    public static void printJaggedArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }

    // TODO: 파스칼의 삼각형 생성 메서드를 작성하세요
    // 매개변수: int rows
    // 반환값: int[][] (가변 길이 배열)
    // 규칙: pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
    public static int[][] createPascalTriangle(int rows) {
        // TODO: 가변 길이 배열 생성
        int[][] pascal = new int[rows][];

        for (int i = 0; i < rows; i++) {
            // TODO: 각 행의 길이를 i+1로 설정
            pascal[i] = new int[i + 1];

            // TODO: 첫 번째와 마지막 요소를 1로 설정
            pascal[i][0] = 1;
            pascal[i][i] = 1;

            // TODO: 중간 요소들을 계산하세요
            // 힌트: pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j]
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        return pascal;
    }
}
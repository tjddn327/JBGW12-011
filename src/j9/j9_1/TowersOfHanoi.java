package j9.j9_1;

public class TowersOfHanoi {

    private static int moveCount = 0;

    /**
     * 기본 하노이의 탑 해결
     */
    public static void hanoi(int n, char from, char to, char aux) {
        // TODO 1: 기저 사례 - n이 1인 경우
        // 힌트: 원반 1개를 from에서 to로 직접 이동
        if(n == 1) {
            System.out.println(from + "에서 " + to + "로 이동");
            moveCount++;
            return;
        }

        // TODO 2: 재귀 사례 - 3단계로 해결
        // 단계 1: 위쪽 n-1개를 from에서 aux로 이동 (to를 임시로 사용)
        hanoi(n-1, from, aux, to);
        // 단계 2: 가장 큰 원반(n번)을 from에서 to로 이동
        System.out.println(n + "번을 " + from + "에서 " + to + "로 이동");
        // 단계 3: aux에 있는 n-1개를 to로 이동 (from을 임시로 사용)
        hanoi(n-1, aux, from, to);
        moveCount++;
    }

    public static void main(String[] args) {
        System.out.println("=== 하노이의 탑 예제 ===");

        // 3개 원반 실행 결과:
        // 이동 1: 원반 1을 A에서 C로
        // 이동 2: 원반 2를 A에서 B로
        // 이동 3: 원반 1을 C에서 B로
        // 이동 4: 원반 3을 A에서 C로
        // 이동 5: 원반 1을 B에서 A로
        // 이동 6: 원반 2를 B에서 C로
        // 이동 7: 원반 1을 A에서 C로
        // 총 7번의 이동 (이론값: 7)
        hanoi(3, 'A', 'B', 'C');
        System.out.println(moveCount);
    }
}
package j4.j4_4;

public class ThreeNPlusOneFunctions {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 시퀀스 함수 ===\n");

        // TODO 77: 3N+1 기본 테스트하기
        int start = 27;
        System.out.println("시작값: " + start);
        System.out.println("다음 항: " + nextN(start));
        System.out.println("시퀀스 길이: " + sequenceLength(start));
        System.out.println("최대값: " + maxInSequence(start));

        // TODO 78: 시퀀스 출력 테스트하기
        System.out.print("\n시퀀스: ");
        printSequence(start);
    }

    // TODO 79: 3N+1 다음 항 계산 함수 구현하기
    static int nextN(int n) {
        // 다음 항 계산
        if (n % 2 == 0) return n / 2;
        else return 3 * n + 1;
    }

    // TODO 80: 시퀀스 길이 계산 함수 구현하기
    static int sequenceLength(int start) {
        // 1까지의 단계 수 계산
        int length = 1;
        int n = start;
        while (n != 1) {
            n = nextN(n);
            length++;
        }
        return length;
    }

    // TODO 81: 시퀀스의 최대값 찾기 함수 구현하기
    static int maxInSequence(int start) {
        // 최대값 찾기
        int max = start;
        int n = start;
        while (n != 1) {
            n = nextN(n);
            if (n > max) max = n;
        }
        return max;
    }

    // TODO 82: 시퀀스 출력 함수 구현하기
    static void printSequence(int start) {
        // 시퀀스 출력
        int n = start;
        while (true) {
            System.out.print(n);
            if (n == 1) break;
            System.out.print(" → ");
            n = nextN(n);
        }
        System.out.println();
    }
}

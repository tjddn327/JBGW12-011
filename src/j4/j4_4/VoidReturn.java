package j4.j4_4;

public class VoidReturn {
    public static void main(String[] args) {
        System.out.println("=== void 메서드의 return ===\n");

        // TODO 83: 음수 처리 테스트하기
        processPositiveOnly(10);
        processPositiveOnly(-5);
        processPositiveOnly(20);

        // TODO 84: 배열 검색 테스트하기
        int[] numbers = {10, 20, 30, 40, 50};
        searchAndPrint(numbers, 30);
        searchAndPrint(numbers, 25);

        // TODO 85: 유효성 검사 테스트하기
        validateAndProcess("user@email.com");
        validateAndProcess("invalid-email");
    }

    // TODO 86: 양수만 처리 함수 구현하기
    static void processPositiveOnly(int n) {
        // 음수 처리
        if (n < 0) {
            System.out.println(n + "은(는) 음수입니다. 처리하지 않습니다.");
            return;
        }
        System.out.println(n + "을(를) 처리합니다...");
        System.out.println("결과: " + (n * 2));
    }

    // TODO 87: 배열에서 값 찾기 함수 구현하기
    static void searchAndPrint(int[] array, int target) {
        // 배열 검색
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println(target + " 찾기: 인덱스 " + i + "에서 발견!");
                return;
            }
        }
        System.out.println(target + " 찾기: 찾을 수 없습니다.");
    }

    // TODO 88: 유효성 검사 함수 구현하기
    static void validateAndProcess(String email) {
        // 이메일 유효성 검사
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("이메일 처리: 잘못된 이메일 형식입니다.");
            return;
        }
        System.out.println("이메일 처리: " + email + " 처리 완료!");
    }
}

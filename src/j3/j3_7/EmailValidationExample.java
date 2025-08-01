package j3.j3_7;

import java.util.Scanner;

public class EmailValidationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 이메일 검증 예제 ===");

        String email = getValidEmail();
        System.out.println("등록된 이메일: " + email);

        // 이메일 정보 분석
        analyzeEmail(email);
    }

    public static String getValidEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("이메일 주소를 입력하세요: ");
            String input = sc.nextLine().trim();

            // TODO: 이메일 검증 시도
            // 힌트: validateEmail() 호출

            // 여기에 코드를 작성하세요
            try {
                validateEmail(input);
                System.out.println("✅ 유효한 이메일입니다.");
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validateEmail(String email) {
        // TODO: 이메일 유효성 검증
        // 힌트: IllegalArgumentException 사용

        // 여기에 코드를 작성하세요
        if (!email.contains("@")) {
            throw new IllegalArgumentException("이메일에는 '@'가 포함되어야 합니다.");
        }

        String[] parts = email.split("@");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) {
            throw new IllegalArgumentException("이메일 형식이 올바르지 않습니다.");
        }

        if (!parts[1].contains(".")) {
            throw new IllegalArgumentException("도메인에 '.'이 포함되어야 합니다.");
        }
    }

    public static void analyzeEmail(String email) {
        // TODO: 이메일 분석
        // 힌트: split("@") 사용하여 사용자명과 도메인 분리

        // 여기에 코드를 작성하세요
        System.out.println("\n📧 이메일 분석:");

        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        System.out.println("사용자명: " + username);
        System.out.println("도메인: " + domain);

        // 도메인 종류 판단
        if (domain.endsWith(".com")) {
            System.out.println("종류: 상업적 도메인");
        } else {
            System.out.println("종류: 기타 도메인");
        }
    }
}

package j3_1;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "java2024";
        int maxAttempts = 3;
        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("시스템에 로그인하세요.");

        while (attempts < maxAttempts && !loggedIn) {
            System.out.print("패스워드: ");
            String inputPassword = sc.nextLine();
            attempts = attempts + 1;

            // TODO: 패스워드 검증
            // 힌트:
            // 1. 입력한 패스워드가 맞으면:
            //    - loggedIn = true
            //    - 성공 메시지 출력
            // 2. 틀리면:
            //    - 남은 기회 계산
            //    - 기회가 남아있으면 안내
            //    - 기회가 없으면 계정 잠김

            // 여기에 코드를 작성하세요
            if (inputPassword.equals(correctPassword)) {
                loggedIn = true;
                System.out.println("로그인 성공!");
            }
            else{
                System.out.println("틀렸습니다! 남은 기회 : " + (maxAttempts - attempts) + "번");
            }
        }

        if (loggedIn) {
            System.out.println("환영합니다!");
            // 여기에 로그인 후 작업 추가
        }
    }
}

package j3.j3_5;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 미리 설정된 사용자 정보
        String validUsername = "admin";
        String validPassword = "1234";
        boolean isAccountLocked = false;
        int loginAttempts = 0;

        System.out.println("=== 로그인 시스템 ===");

        if (isAccountLocked) {
            System.out.println("계정이 잠겨 있습니다. 관리자에게 문의하세요.");
        } else {
            System.out.print("사용자명: ");
            String username = sc.nextLine();
            System.out.print("비밀번호: ");
            String password = sc.nextLine();


            // TODO: 로그인 처리
            // 힌트: 중첩된 if-else

            // 여기에 코드를 작성하세요
            if(username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("로그인 성공! 환영합니다, "+validUsername + "님!");
                System.out.println("관리자 권한이 있습니다.");
                isAccountLocked = true;
                loginAttempts++;
            }else {
                System.out.println("존재하지 않는 사용자명입니다.");
            }
        }
    }
}

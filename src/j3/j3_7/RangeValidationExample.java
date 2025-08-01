package j3.j3_7;

import java.util.Scanner;

public class RangeValidationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 범위 검증 입력 예제 ===");

        int age = getValidAge();
        int score = getValidScore();

        System.out.println("입력 완료!");
        System.out.println("나이: " + age + "세");
        System.out.println("점수: " + score + "점");

        // 등급 계산
        String grade = calculateGrade(score);
        System.out.println("등급: " + grade);
    }

    public static int getValidAge() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나이를 입력하세요 (1-150): ");
            String input = sc.nextLine();

            // TODO: 나이 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도

            // 여기에 코드를 작성하세요
            try {
                int age = Integer.parseInt(input);
                if (age >= 1 && age <= 150) {
                    System.out.println("✅ 유효한 나이입니다.");
                    return age;
                } else {
                    System.out.println("나이는 1부터 150 사이여야 합니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해야 합니다.");
            }
        }
    }

    public static int getValidScore() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력하세요 (0-100): ");
            String input = sc.nextLine();

            // TODO: 점수 검증 로직
            // 힌트: 범위 검사 후 continue로 재시도

            // 여기에 코드를 작성하세요
            try {
                int score = Integer.parseInt(input);
                if (score >= 0 && score <= 100) {
                    System.out.println("✅ 유효한 점수입니다.");
                    return score;
                } else {
                    System.out.println("점수는 0부터 100 사이여야 합니다.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해야 합니다.");
            }
        }
    }

    public static String calculateGrade(int score) {
        // TODO: 점수에 따른 등급 계산
        // 힌트: if-else if 체인

        // 여기에 코드를 작성하세요
         // 임시 반환값
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

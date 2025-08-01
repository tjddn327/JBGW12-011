package j3.j3_5;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0-100): ");
        double score = sc.nextDouble();

        String grade = "a";
        String comment = "a";

        // 입력 검증
        if (score < 0 || score > 100) {
            System.out.println("유효하지 않은 점수입니다!");
            return;
        }

        // TODO: 등급 결정
        // 힌트: else-if 체인

        // 여기에 코드를 작성하세요

        if(score >= 95){
            grade = "A+";
            comment = "탁월합니다!\n\uD83C\uDF89 장학금 대상자입니다!";
        }else if(score >= 90){
            grade = "A";
            comment = "우수합니다!\n\uD83C\uDF89 장학금 대상자입니다!";
        }else if(score >= 85){
            grade = "B+";
            comment = "매우좋습니다!";
        }
        else if(score >= 80){
            grade = "B";
            comment = "좋습니다!";
        }
        else if(score >= 75){
            grade = "C+";
            comment = "양호합니다.";
        }
        else if(score >= 70){
            grade = "C";
            comment = "보통입니다.";
        }
        else if(score >= 65){
            grade = "D+";
            comment = "노력이 필요합니다.";
        }
        else if(score >= 60){
            grade = "D";
            comment = "많은 노력이 필요합니다.";
        }else if(score < 60){
            grade = "F";
            comment = "재수강이 필요합니다.";
        }

        System.out.println("\n=== 성적 결과 ===");
        System.out.printf("점수: %.1f%n", score);
        System.out.println("등급: " + grade);
        System.out.println("평가: " + comment);

        // TODO: 장학금 자격

        // 여기에 코드를 작성하세요
    }
}

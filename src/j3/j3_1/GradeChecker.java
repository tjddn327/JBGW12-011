package j3.j3_1;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0-100): ");
        int score = sc.nextInt();

        String grade;
        String comment;

        // TODO: 성적 판정 로직
        // 힌트:
        // 90점 이상: A, "우수합니다!"
        // 80점 이상: B, "잘했습니다!"
        // 70점 이상: C, "보통입니다."
        // 60점 이상: D, "노력이 필요합니다."
        // 60점 미만: F, "재수강이 필요합니다."

        // 여기에 코드를 작성하세요
        grade = "d";
        comment = "x";
        if(score >= 90){
            grade = "A";
            comment = "우수합니다!";
        }
        else if(score >= 80){
            grade = "B";
            comment = "잘했습니다!";
        }
        else if(score >= 70){
            grade = "C";
            comment = "보통입니다.";
        }
        else if(score >= 60){
            grade = "D";
            comment = "노력이 필요합니다.";
        }
        else {
            grade = "F";
            comment = "재수강이 필요합니다.";
        }

        System.out.println("학점: " + grade);
        System.out.println("평가: " + comment);
    }
}

package j3.j3_2;

import java.util.Scanner;

public class GradeProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언
        String studentName;
        int numberOfSubjects;
        double totalScore = 0;
        double average = 0;
        String grade = "a";

        System.out.println("=== 성적 처리 시스템 ===");

        // 학생 이름 입력
        System.out.print("학생 이름: ");
        studentName = sc.nextLine();

        // 과목 수 입력 (양수 검증)
        do {
            System.out.print("과목 수: ");
            numberOfSubjects = sc.nextInt();

            if (numberOfSubjects <= 0) {
                System.out.println("과목 수는 1개 이상이어야 합니다!");
            }
        } while (numberOfSubjects <= 0);

        // 각 과목 점수 입력
        System.out.println("\n각 과목의 점수를 입력하세요 (0-100):");

        int subjectCount = 0;
        while (subjectCount < numberOfSubjects) {
            System.out.print("과목 " + (subjectCount + 1) + ": ");
            double score = sc.nextDouble();

            // 점수 범위 검증
            if (score < 0 || score > 100) {
                System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
                continue;
            }

            totalScore = totalScore + score;
            subjectCount = subjectCount + 1;
        }

        // TODO: 평균 및 학점 계산
        // 힌트:
        // 1. 평균 = totalScore / numberOfSubjects
        // 2. 학점 기준:
        //    - 90점 이상: A
        //    - 80점 이상: B
        //    - 70점 이상: C
        //    - 60점 이상: D
        //    - 60점 미만: F

        // 여기에 코드를 작성하세요
        average = totalScore / numberOfSubjects;
        if(average >= 90){
            grade = "A";
        }
        else if(average >= 80){
            grade = "B";
        }
        else if(average >= 70){
            grade = "C";
        }
        else if(average >= 60){
            grade = "D";
        }
        else if(average < 60){
            grade = "F";
        }

        // 결과 출력
        System.out.println("\n=== 성적 결과 ===");
        System.out.println("학생: " + studentName);
        System.out.println("총 과목 수: " + numberOfSubjects);
        System.out.printf("평균 점수: %.2f%n", average);
        System.out.println("학점: " + grade);

        // 추가 메시지
        if (grade.equals("A")) {
            System.out.println("축하합니다! 훌륭한 성적입니다! 🎆");
        } else if (grade.equals("F")) {
            System.out.println("더 노력이 필요합니다. 화이팅! 💪");
        }
    }
}

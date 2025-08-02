package j4.j4_7;

import java.util.Scanner;

public class GradeManager {
    static final int MAX_STUDENTS = 100;
    static String[] names = new String[MAX_STUDENTS];
    static double[] averages = new double[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        runGradeManager();
    }

    static void runGradeManager() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAllStudents(); break;
                case 3: displayStatistics(); break;
                case 4: System.out.println("프로그램 종료."); return;
                default: System.out.println("잘못된 선택입니다.");
            }
        }
    }

    static void displayMenu() {
        System.out.println("=== 성적 관리 시스템 ===");
        System.out.println("1. 학생 추가");
        System.out.println("2. 전체 학생 보기");
        System.out.println("3. 통계 보기");
        System.out.println("4. 종료");
    }

    static void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 이름: ");
        names[studentCount] = scanner.nextLine();
        System.out.println("3과목의 점수를 입력하세요:");
        averages[studentCount] = inputAndCalculateAverage();
        studentCount++;
        System.out.println("학생이 추가되었습니다.");
    }

    static double inputAndCalculateAverage() {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        for (int i = 1; i <= 3; i++) {
            double score;
            while (true) {
                System.out.print("과목 " + i + ": ");
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) break;
                System.out.println("점수는 0~100 사이여야 합니다.");
            }
            total += score;
        }
        return total / 3.0;
    }

    static void displayAllStudents() {
        if (studentCount == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("=== 전체 학생 목록 ===");
        System.out.printf("%-15s %-10s %-5s\n", "이름", "평균", "학점");
        System.out.println("------------------------------");
        for (int i = 0; i < studentCount; i++) {
            char grade = calculateGrade(averages[i]);
            System.out.printf("%-15s %-10.2f %-5c\n", names[i], averages[i], grade);
        }
    }

    static char calculateGrade(double average) {
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    static void displayStatistics() {
        if (studentCount == 0) {
            System.out.println("학생 정보가 없습니다.");
            return;
        }
        System.out.println("=== 통계 보기 ===");
        System.out.printf("전체 평균: %.2f\n", calculateTotalAverage());
        System.out.printf("최고 점수: %.2f\n", findHighest());
        System.out.printf("최저 점수: %.2f\n", findLowest());
    }

    static double calculateTotalAverage() {
        double total = 0.0;
        for (int i = 0; i < studentCount; i++) {
            total += averages[i];
        }
        return total / studentCount;
    }

    static double findHighest() {
        double max = averages[0];
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] > max) max = averages[i];
        }
        return max;
    }

    static double findLowest() {
        double min = averages[0];
        for (int i = 1; i < studentCount; i++) {
            if (averages[i] < min) min = averages[i];
        }
        return min;
    }
}

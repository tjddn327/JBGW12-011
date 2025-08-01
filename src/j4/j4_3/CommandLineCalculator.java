package j4.j4_3;

import java.util.Scanner;

public class CommandLineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String insu = sc.nextLine();
        // TODO 61: 인수 개수 검증하기
        String[] names = insu.split(" ");
        // TODO 62: 계산 수행하기
        try {

        } catch (NumberFormatException e) {
            System.out.println("오류: 숫자를 올바르게 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    // TODO 63: 계산 메서드 구현하기
    static double calculate(double a, String op, double b) {
        return 0;
    }

    // TODO 64: 사용법 출력 메서드 구현하기
    static void printUsage() {

    }
}
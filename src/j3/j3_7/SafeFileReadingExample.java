package j3.j3_7;

import java.io.*;
import java.util.Scanner;

public class SafeFileReadingExample {//포기~~
    public static void main(String[] args) {
        System.out.println("=== 안전한 파일 읽기 예제 ===");

        String fileName = getValidFileName();
        processNumbersFile(fileName);
    }

    public static String getValidFileName() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("파일 이름을 입력하세요: ");
            String fileName = sc.nextLine().trim();

            if (fileName.isEmpty()) {
                System.out.println("❌ 파일 이름을 입력해주세요.");
                continue;
            }

            try {
                // 파일 열기 시도
                File file = new File(fileName);
                System.out.println("✅ 파일을 성공적으로 열었습니다: " + fileName);
                return fileName;

            } catch (IllegalArgumentException e) {
                System.out.println("❌ 파일을 열 수 없습니다: " + fileName);
                System.out.println("   원인: 파일이 존재하지 않거나 접근할 수 없습니다.");

                System.out.print("다시 시도하시겠습니까? (y/n): ");
                String retry = sc.nextLine().trim().toLowerCase();
                if (!retry.startsWith("y")) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
            }
        }
    }

    public static void processNumbersFile(String fileName) {
        double sum = 0;
        int count = 0;
        int errorCount = 0;

        System.out.println("\n📄 파일 처리 중: " + fileName);
        System.out.println("-".repeat(40));

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (true) {
                // TODO: 파일에서 숫자 읽기
                // 힌트: TextIO.getDouble() 사용

                // 여기에 코드를 작성하세요
                String line = reader.readLine();
                if (line == null) break;

                String trimmed = line.trim();
                if (trimmed.isEmpty()) continue;

                try {
                    double number = Double.parseDouble(trimmed);
                    count++;
                    sum += number;
                    System.out.printf("읽은 숫자 %d: %.2f%n", count, number);
                } catch (NumberFormatException e) {
                    errorCount++;
                    System.out.printf("⚠️  잘못된 형식 무시: %s%n", trimmed);
                }
            }

        } catch (Exception e) {
            System.out.println("❌ 파일 처리 중 예상치 못한 오류: " + e.getMessage());
        }

        // 결과 출력
        System.out.println("-".repeat(40));
        System.out.println("📊 처리 결과:");
        System.out.println("• 읽은 숫자 개수: " + count);
        System.out.println("• 오류 개수: " + errorCount);
        System.out.println("• 숫자 총합: " + sum);

        if (count > 0) {
            double average = sum / count;
            System.out.printf("• 평균: %.2f%n", average);
            System.out.printf("• 최대값 추정: %.2f (가정)%n", average * 2);
        } else {
            System.out.println("• 유효한 숫자가 없습니다.");
        }
    }
}

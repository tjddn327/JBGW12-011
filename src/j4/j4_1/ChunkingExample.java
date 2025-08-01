package j4.j4_1;

public class ChunkingExample {
    public static void main(String[] args) {
        System.out.println("=== 청킹을 통한 복잡성 관리 ===\n");

        // TODO 11: 학생 성적 처리 기능 사용하기
        int[] scores = {85, 92, 78, 96, 88, 91, 83, 87};
        processStudentGrades(scores);
        System.out.println();

        // TODO 12: 보고서 생성 기능 사용하기
        generateMonthlyReport("2024년 1월");
        System.out.println();

        // TODO 13: 이메일 발송 기능 사용하기
        sendWelcomeEmail("user@example.com", "홍길동");
    }

    // TODO 14: 학생 성적 처리 메서드 완성하기
    public static void processStudentGrades(int[] scores) {
        System.out.println("학생 성적 처리:");

        // TODO: 아래 메서드들을 호출하여 성적을 처리하고 결과를 출력하세요
        // 1. 평균 계산
        // 2. 최고 점수 찾기
        // 3. 최저 점수 찾기
        // 4. 학점 결정
        // 5. 결과 출력
        System.out.println("평균 점수: " + calculateAverage(scores));
        System.out.println("최고 점수: " + findHighestScore(scores));
        System.out.println("최저 점수: " + findLowestScore(scores));
        System.out.println("학점: " + determineGrade(calculateAverage(scores)));

    }

    // TODO 15: 평균 계산 메서드 구현하기
    private static double calculateAverage(int[] scores) {
        // 배열의 모든 점수를 더하고 개수로 나누어 평균을 계산하세요
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum/scores.length;
    }

    // TODO 16: 최고 점수 찾기 메서드 구현하기
    private static int findHighestScore(int[] scores) {
        // 배열에서 가장 높은 점수를 찾아 반환하세요
        for (int i = 0; i < scores.length - 1; i++) {
            for(int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        return scores[0];
    }

    // TODO 17: 최저 점수 찾기 메서드 구현하기
    private static int findLowestScore(int[] scores) {
        // 배열에서 가장 낮은 점수를 찾아 반환하세요
        for (int i = 0; i < scores.length - 1; i++) {
            for(int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        return scores[0];
    }

    // TODO 18: 학점 결정 메서드 구현하기
    private static String determineGrade(double average) {
        // 평균에 따라 A, B, C, D, F 학점을 반환하세요
        // 90 이상: A, 80 이상: B, 70 이상: C, 60 이상: D, 60 미만: F
        switch ((int) average/10) {
            case 9,10 -> {
                return "A";
            }
            case 8 -> {
                return "B";
            }
            case 7 -> {
                return "C";
            }
            case 6 -> {
                return "D";
            }
            default -> {
                return "F";
            }
        }
    }

    // TODO 19: 월간 보고서 생성 메서드 구현하기
    public static void generateMonthlyReport(String month) {
        // 보고서 생성 과정을 단계별로 출력하세요
        System.out.println(month + " 보고서 생성:");
        System.out.println("1. 데이터 수집 중...");
        System.out.println("2. 통계 분석 중...");
        System.out.println("3. 차트 생성 중...");
        System.out.println("4. PDF 생성 중...");
        System.out.println("✅ 보고서가 완성되었습니다.");
    }

    // TODO 20: 이메일 발송 메서드 구현하기
    public static void sendWelcomeEmail(String email, String name) {
        // 이메일 발송 과정을 출력하세요
        System.out.println("환영 이메일 발송:");
        System.out.println("수신자: " + email);
        System.out.println("이름: " + name);
        System.out.println("✅ 이메일이 발송되었습니다.");
    }
}
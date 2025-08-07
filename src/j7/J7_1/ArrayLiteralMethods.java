package j7.J7_1;

public class ArrayLiteralMethods {
    // TODO: 요일 이름 반환 메서드를 작성하세요
    // 메서드명: getDayName, 매개변수: int dayNumber
    // 배열 리터럴을 사용하여 요일 배열 생성 (일,월,화,수,목,금,토)
    // 유효한 번호면 "요일명요일" 반환, 아니면 "잘못된 요일" 반환
    public static String getDayName(int dayNumber) {
        String[] days = {"일", "월", "화", "수", "목", "금", "토"};
        if (dayNumber >= 0 && dayNumber < days.length) {
            return days[dayNumber] + "요일";
        }
        return "잘못된 요일";
    }

    // TODO: 월별 일수 반환 메서드를 작성하세요
    // 메서드명: getDaysInMonth, 매개변수: int month, boolean isLeapYear
    // 배열 리터럴로 각 월의 일수 정의
    // 2월이고 윤년이면 29일 반환
    public static int getDaysInMonth(int month, boolean isLeapYear) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear) {
            return 29;
        }
        if (month >= 1 && month <= 12) {
            return daysInMonth[month];
        }
        return 0; // 잘못된 월
    }

    // TODO: 점수에 따른 등급 반환 메서드를 작성하세요
    // 메서드명: getGrade, 매개변수: int score
    // 경계값 배열과 등급 배열을 사용하여 등급 결정
    public static String getGrade(int score) {
        int[] boundaries = {90, 80, 70, 60, 0};
        String[] grades = {"A", "B", "C", "D", "F"};
        for (int i = 0; i < boundaries.length; i++) {
            if (score >= boundaries[i]) {
                return grades[i];
            }
        }
        return "F"; // 기본값
    }

    // TODO: 메뉴 출력 메서드를 작성하세요
    // 메서드명: showMenu
    // 배열 리터럴을 직접 전달하여 printMenu 호출
    public static void showMenu() {
        printMenu("메인 메뉴", new String[]{
                "1. 파일", "2. 편집", "3. 보기", "4. 도움말", "0. 종료"
        });
    }

    private static void printMenu(String title, String[] items) {
        System.out.println("=== " + title + " ===");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("================");
    }

    public static void main(String[] args) {
        // getDayName 테스트
        System.out.println("오늘은 " + getDayName(3));  // 수요일

        // getDaysInMonth 테스트
        System.out.println("\n2024년 2월: " +
                getDaysInMonth(2, true) + "일");  // 29일

        // getGrade 테스트
        int[] scores = {95, 82, 73, 65, 58};
        System.out.println("\n성적 평가:");
        for (int score : scores) {
            System.out.println(score + "점: " + getGrade(score) + "등급");
        }

        // showMenu 테스트
        System.out.println();
        showMenu();
    }
}
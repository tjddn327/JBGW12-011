package j4.j4_4;

public class ReturnTypeExamples {
    public static void main(String[] args) {
        System.out.println("=== 다양한 반환 타입 예제 ===\n");

        // TODO 1: int 반환 메서드 테스트하기
        int squareResult = square(5);
        System.out.println("5의 제곱: " + squareResult);

        // TODO 2: double 반환 메서드 테스트하기
         double avgResult = average(10, 20);
         System.out.println("10과 20의 평균: " + avgResult);

        // TODO 3: boolean 반환 메서드 테스트하기
         boolean evenCheck = isEven(7);
         System.out.println("7은 짝수인가? " + evenCheck);

        // TODO 4: char 반환 메서드 테스트하기
         char grade = getGrade(85);
         System.out.println("85점의 학점: " + grade);

        // TODO 5: String 반환 메서드 테스트하기
         String day = getDayName(3);
         System.out.println("3번째 요일: " + day);
    }

    // TODO 6: int를 반환하는 함수 구현하기
    static int square(int n) {
        return n * n;
        // n의 제곱 반환
    }

    // TODO 7: double을 반환하는 함수 구현하기
    static double average(int a, int b) {
        return (double)(a + b)/2;
        // 두 수의 평균 반환
    }

    // TODO 8: boolean을 반환하는 함수 구현하기
    static boolean isEven(int n) {
        return n % 2 == 0;
        // 짝수 여부 판단
    }

    // TODO 9: char를 반환하는 함수 구현하기
    static char getGrade(int score) {
        switch (score/10) {
            case 9,10 -> {
                return 'A';
            }
            case 8 -> {
                return 'B';
            }
            case 7 -> {
                return 'C';
            }
            case 6 -> {
                return 'D';
            }
            default -> {
                return 'F';
            }
        }
        // 점수에 따른 학점 반환 (A~F)
    }

    // TODO 10: String을 반환하는 함수 구현하기
    static String getDayName(int dayNumber) {
        // 1~7을 요일명으로 변환
        switch (dayNumber%7) {
            case 1 -> {
                return "월요일";
            }
            case 2 -> {
                return "화요일";
            }
            case 3 -> {
                return "수요일";
            }
            case 4 -> {
                return "목요일";
            }
            case 5 -> {
                return "금요일";
            }
            case 6 -> {
                return "토요일";
            }
            case 0->{
                return "일요일";
            }
            default -> {
                return "그런건 없다";
            }
        }
    }
}
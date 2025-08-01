package j4.j4_2;

public class SubroutineBasics {
    public static void main(String[] args) {
        System.out.println("=== 서브루틴 기본 예제 ===\n");

        // TODO 1: 매개변수와 반환값이 없는 메서드 호출하기
        printWelcome();

        // TODO 2: 매개변수가 있는 메서드 호출하기
        greetUser("홍길동");
        greetUser("김철수");

        // TODO 3: 반환값이 있는 메서드 호출하기
        int sum = add(10, 20);
        System.out.println("10 + 20 = " + sum);

        // TODO 4: 여러 매개변수와 반환값이 있는 메서드 호출하기
        double avg = calculateAverage(85, 92, 78);
        System.out.println("평균 점수: " + avg);

        // TODO 5: 문자열을 반환하는 메서드 호출하기
        String message = createMessage("Java", "재미있다");
        System.out.println(message);
    }

    // TODO 6: void 메서드 구현하기 (반환값 없음)
    public static void printWelcome() {
        // "프로그램에 오신 것을 환영합니다!"와 "즐거운 시간 되세요." 출력
        System.out.println("프로그램에 오신 것을 환영합니다!");
        System.out.println("즐거운 시간 되세요.");
        System.out.println();
    }

    // TODO 7: 매개변수가 있는 void 메서드 구현하기
    public static void greetUser(String name) {
        // "안녕하세요, [이름]님!" 형태로 인사말 출력
        System.out.println("안녕하세요, " + name + "님!");
    }

    // TODO 8: int를 반환하는 메서드 구현하기
    public static int add(int a, int b) {
        // 두 수의 합을 계산하여 반환
        return a + b;
    }

    // TODO 9: double을 반환하는 메서드 구현하기
    public static double calculateAverage(int score1, int score2, int score3) {
        // 세 점수의 평균을 계산하여 반환 (주의: 정수 나눗셈 피하기)
        double sum = score1 + score2 + score3;
        return sum / 3;
    }

    // TODO 10: String을 반환하는 메서드 구현하기
    public static String createMessage(String subject, String description) {
        // "[subject]은(는) [description]!" 형태의 문자열 반환
        return subject + "은(는)" + description;
    }
}

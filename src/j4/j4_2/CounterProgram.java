package j4.j4_2;

public class CounterProgram {
    // TODO 32: 정적 멤버 변수 선언하기
    // globalCounter, methodACalls, methodBCalls 변수 선언
    static int globalCounter = 0;
    static int methodACalls = 0;
    static int methodBCalls = 0;

    public static void main(String[] args) {
        System.out.println("=== 카운터 프로그램 ===\n");

        System.out.println("초기 상태:");
         printCounters();

        // TODO 33: 메서드들을 여러 번 호출하기
         methodA(); methodA(); methodB(); methodA(); methodB(); methodB();

        System.out.println("\n최종 상태:");
         printCounters();
    }

    // TODO 34: methodA 구현하기
    public static void methodA() {
        // methodACalls 증가
        // globalCounter 증가
        // "Method A 호출됨 (총 X번째)" 출력
        methodACalls++;
        globalCounter++;
        System.out.println("Method A 호출됨 (총 " + methodACalls + "번째)");
    }

    // TODO 35: methodB 구현하기
    public static void methodB() {
        // methodBCalls 증가
        // globalCounter 증가
        // "Method B 호출됨 (총 X번째)" 출력
        methodBCalls++;
        globalCounter++;
        System.out.println("Method B 호출됨 (총 " + methodBCalls + "번째)");

    }

    // TODO 36: printCounters 구현하기
    public static void printCounters() {
        // 전체 호출 횟수, Method A 호출 횟수, Method B 호출 횟수 출력
        System.out.println("전체 호출 횟수: " + globalCounter);
        System.out.println("Method A 호출: " + methodACalls + "회");
        System.out.println("Method B 호출: " + methodBCalls + "회");
    }
}
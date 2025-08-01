package j4.j4_3;

public class VariableScope {
    // TODO 80: 전역 변수들 선언하기
    static int globalCount = 0;
    static int localInA = 200;

    public static void main(String[] args) {
        System.out.println("=== 변수 범위 예제 ===\n");

        // TODO 81: main의 지역 변수 선언하고 초기 상태 출력하기
        int localInMain = 100;

        System.out.println("main 시작:");
        System.out.println("globalCount = " + globalCount);
        System.out.println("localInMain = " + localInMain);
        // TODO 82: 메서드 호출하기
        methodA();
        methodB(50);

        System.out.println("\nmain 종료:");
        System.out.println("globalCount = " + globalCount);
        System.out.println("localInMain = " + localInMain);
    }

    // TODO 83: methodA 구현하기
    static void methodA() {
        System.out.println("\nmethodA:");
        System.out.println("globalCount = " + globalCount);
        System.out.println("localInA = " + localInA);
        System.out.println("내부 블록의 innerVar = " + (localInA+100));
        globalCount++;
    }

    // TODO 84: methodB 구현하기
    static void methodB(int parameter) {
        System.out.println("\nmethodB:");
        System.out.println("paramter = " + parameter);
        System.out.println("globalCount = " + globalCount);
        parameter = 999;
        globalCount+=10;
        System.out.println("수정 후 paramter = " + parameter);
        System.out.println("수정 후 globalCount = " + globalCount);

    }
}
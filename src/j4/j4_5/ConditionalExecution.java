package j4.j4_5;

// 함수형 인터페이스 정의 (이미 구현됨)
interface Condition {
    boolean test();
}

interface Action {
    void perform();
}

public class ConditionalExecution {
    public static void main(String[] args) {
        System.out.println("=== 조건부 실행 예제 ===\n");

        int score = 85;

        // TODO 26: 조건부 실행 테스트하기
        executeIf(() -> score >= 90, () -> System.out.println("A 학점입니다!"));
        executeIf(() -> score >= 80, () -> System.out.println("B 학점입니다!"));

        // TODO 27: 반복 실행 테스트하기
        int count = 3;
        repeatAction(count, () -> System.out.println("반복 실행!"));

        // TODO 28: 조건에 따른 선택 실행 테스트하기
        chooseAction(score >= 60, () -> System.out.println("합격입니다!"), () -> System.out.println("불합격입니다."));
    }

    // TODO 29: executeIf 메서드 구현하기
    static void executeIf(Condition condition, Action action) {
        if (condition.test()) {
            action.perform();
        }
    }

    // TODO 30: repeatAction 메서드 구현하기
    static void repeatAction(int times, Action action) {
        for (int i = 0; i < times; i++) {
            action.perform();
        }
    }

    // TODO 31: chooseAction 메서드 구현하기
    static void chooseAction(boolean condition, Action ifTrue, Action ifFalse) {
        if (condition) {
            ifTrue.perform();
        } else {
            ifFalse.perform();
        }
    }
}

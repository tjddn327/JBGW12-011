package j4.j4_3;

public class GlobalVsParameter {
    // TODO 92: 전역 변수 방식을 위한 변수 선언하기
    static int startBalance = 1000;

    public static void main(String[] args) {
        System.out.println("=== 전역 변수 vs 매개변수 비교 ===\n");

        // TODO 93: 전역 변수 방식 테스트하기
        System.out.println("1. 전역 변수 방식:");
        System.out.println("초기 잔액: " + startBalance);
        depositGlobal(500);
        withdrawGlobal(200);
        System.out.println("최종 잔액: " + startBalance);

        // TODO 94: 매개변수 방식 테스트하기
        System.out.println("\n2. 매개변수 방식:");
        int balance = 1000;
        System.out.println("초기 잔액: " + balance);
        balance = depositParameter(balance, 500);
        balance = withdrawParameter(balance, 200);
        System.out.println("최종 잔액: " + balance);

        // TODO 95: 부작용 시연하기
        System.out.println("\n=== 비교 ===");
        demonstrateSideEffects();
        withdrawGlobal(100);
        someComplexOperation();
    }

    // TODO 96: 전역 변수 방식 메서드들 구현하기
    static void depositGlobal(int amount) {
        System.out.println(amount + "원 입금 (전역)");
        startBalance += amount;
    }

    static void withdrawGlobal(int amount) {
        System.out.println(amount + "원 출금 (전역)");
        startBalance -= amount;
    }

    // TODO 97: 매개변수 방식 메서드들 구현하기
    static int depositParameter(int balance, int amount) {
        System.out.println(amount + "원 입금 (매개변수)");
        balance += amount;
        return balance;
    }

    static int withdrawParameter(int balance, int amount) {
        System.out.println(amount + "원 출금 (매개변수)");
        balance -= amount;
        return balance;
    }

    // TODO 98: 부작용 시연 메서드들 구현하기
    static void demonstrateSideEffects() {
        System.out.println("현재 전역 잔액: " + startBalance);
    }

    static void someComplexOperation() {
        System.out.println("작업 후 전역 잔액: "+ startBalance);
        System.out.println("경고: 예상치 못한 잔액 변경 발생!");
    }
}
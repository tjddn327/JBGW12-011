package j4.j4_1;

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("=== 인터페이스 구성 요소 예제 ===\n");

        // TODO 26: 구문적 인터페이스 테스트하기
        System.out.println("1. 구문적 인터페이스 (올바른 사용):");
        // add 메서드와 calculateAverage 메서드를 호출해보세요
        add(5,3);
        double[] num = {20, 25, 30};
        calculateAverage(num);

        // TODO 27: 의미적 인터페이스 이해하기
        System.out.println("\n2. 의미적 인터페이스 이해:");
        // BankAccount 객체를 생성하고 출금 기능을 테스트해보세요
        BankAccount b = new BankAccount(1000);
        b.withdraw(300);
        b.getBalance();
        b.withdraw(800);
        b.getBalance();
    }

    // TODO 28: 두 정수를 더하는 메서드 구현하기
    /**
     * 두 정수를 더합니다.
     * 구문: add(int, int) -> int
     * 의미: 첫 번째 매개변수와 두 번째 매개변수의 합을 반환
     */
    public static int add(int a, int b) {
        // 두 수의 합을 반환하세요
        System.out.println("add(" + a + ", " + b + ") = " + (a+b));
        return a + b;
    }

    // TODO 29: 배열의 평균을 계산하는 메서드 구현하기
    /**
     * 배열의 평균을 계산합니다.
     * 전제조건: 배열이 null이 아니고 비어있지 않아야 함
     */
    public static double calculateAverage(double[] numbers) {
        // 배열이 null이거나 비어있으면 예외를 발생시키고
        // 그렇지 않으면 평균을 계산하여 반환하세요
        double sum = 0;
        try {
            sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 0) {
                    throw new IllegalArgumentException();
                } else {
                    sum += numbers[i];
                }
            }
            System.out.println("평균 = " + sum/numbers.length);
        } catch (IllegalArgumentException e) {
            System.out.println("비어있음");
            return 0;
        }
        return sum;
    }
}

// TODO 30: 은행 계좌 클래스 완성하기
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        // 초기 잔액을 설정하세요
        this.balance = initialBalance;
    }

    /**
     * 계좌에서 돈을 출금합니다.
     *
     * 의미적 계약:
     * - 잔액이 충분하면 출금하고 true 반환
     * - 잔액이 부족하면 출금하지 않고 false 반환
     * - 음수 금액은 허용하지 않음
     */
    public boolean withdraw(double amount) {
        // 출금 로직을 구현하세요
        if(amount < 0){
            System.out.println("음수는 안됩니다.");
            return false;
        }
        else if(amount > balance){
            System.out.println(amount + "원 출금 실패 (잔액부족)");
            return false;
        }else{
            balance -= amount;
            System.out.println(amount + "원 출금 성공");
            return true;
        }
    }

    public double getBalance() {
        // 현재 잔액을 반환하세요
        System.out.println("최종 잔액: " + balance);
        return balance;
    }
}
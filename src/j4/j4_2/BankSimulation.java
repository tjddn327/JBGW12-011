package j4.j4_2;

public class BankSimulation {
    // TODO 37: 멤버 변수들 선언하기
    // accountHolder (문자열), balance (실수), transactionCount (정수),
    // totalDeposits (실수), totalWithdrawals (실수)
    static String accountHolder = "홍길동";
    static double balance = 0;
    static int transactionCount = 0;
    static double totalDeposits = 0;
    static double totalWithdrawals = 0;

    public static void main(String[] args) {
        System.out.println("=== 은행 계좌 시뮬레이션 ===");
         System.out.println("계좌 소유자: " + accountHolder);

        // TODO 38: 간단한 시뮬레이션 실행하기
        // 메뉴 방식 대신 직접 호출로 테스트
         deposit(10000);
         withdraw(3000);
         deposit(5000);
         withdraw(15000); // 잔액 부족
         showStatistics();
    }

    // TODO 39: 입금 메서드 구현하기
    public static void deposit(double amount) {
        // amount가 0 이하면 "유효하지 않은 금액입니다." 출력하고 return
        // balance에 amount 추가
        // totalDeposits에 amount 추가
        // transactionCount 증가
        // 입금 완료 메시지와 현재 잔액 출력
        if(amount <= 0) {
            System.out.println("유효하지 않은 금액입니다.");
            return;
        }
        balance += amount;
        totalDeposits += amount;
        transactionCount++;
        System.out.println((int)amount + "원이 입급되었습니다.");
        checkBalance();
    }

    // TODO 40: 출금 메서드 구현하기
    public static void withdraw(double amount) {
        // amount가 0 이하면 "유효하지 않은 금액입니다." 출력하고 return
        // amount가 balance보다 크면 "잔액이 부족합니다." 출력하고 return
        // balance에서 amount 차감
        // totalWithdrawals에 amount 추가
        // transactionCount 증가
        // 출금 완료 메시지와 현재 잔액 출력
        if(amount <= 0) {
            System.out.println("유효하지 않은 금액입니다.");
            return;
        }else if(amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
        totalWithdrawals += amount;
        transactionCount++;
        System.out.println((int)amount + "원이 출금되었습니다.");
        checkBalance();
    }

    // TODO 41: 잔액 조회 메서드 구현하기
    public static void checkBalance() {
        // 현재 잔액 출력
        System.out.println("현재 잔액: " + (int)balance + "원");
    }

    // TODO 42: 통계 보기 메서드 구현하기
    public static void showStatistics() {
        // 총 거래 횟수, 총 입금액, 총 출금액, 현재 잔액 출력
        // 거래 횟수가 0보다 크면 평균 거래액도 출력
        System.out.println("\n=== 거래 통계 ===");
        System.out.println("총 거래 횟수: " + (int)transactionCount);
        System.out.println("총 입금액: " + (int)totalDeposits + "원");
        System.out.println("총 출금액: " + (int)totalWithdrawals + "원");
        checkBalance();
        System.out.println("평균 거래액: " + (int)((totalDeposits+totalWithdrawals)/transactionCount) + "원");
    }
}

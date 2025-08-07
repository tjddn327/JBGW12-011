package j5.j5_5.bank;

// 테스트
public class BankAccountTest {
    public static void main(String[] args) {
        // TODO 23: 일반 계좌와 프리미엄 계좌 생성하기
        // 일반 계좌: "1234", 100000원
        // 프리미엄 계좌: "5678", 100000원, 신용한도 50000, 이자율 2.5%



        // TODO 24: 일반 계좌 테스트하기
        // 50000원 입금, 30000원 출금, 200000원 출금 시도
        // 잔액 출력
        System.out.println("=== 일반 계좌 테스트 ===");
        BankAccount b = new BankAccount("1234", 100000);
        b.deposit(50000);
        b.withdraw(30000);
        b.withdraw(200000);

        // TODO 25: 프리미엄 계좌 테스트하기
        // 50000원 입금, 170000원 출금(신용한도 사용)
        // 이자 지급, VIP 혜택 적용
        // 잔액 출력
        System.out.println("=== 프리미엄 계좌 테스트 ===");
        PremiumAccount p = new PremiumAccount("5678", 100000,50000, 2.5);
        p.deposit(50000);
        p.withdraw(170000);
        p.applyInterest();
        p.applyVIPBenefit();


        // TODO 26: 프리미엄 계좌 거래 내역 출력하기
    }
}
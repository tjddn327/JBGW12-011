package j5.j5_5.bank;

// 프리미엄 계좌 - 특별 기능 추가
public class PremiumAccount extends BankAccount {
    private double creditLimit;
    private double interestRate;

    public PremiumAccount(String accountNumber, double initialBalance,
                          double creditLimit, double interestRate) {
        // TODO 19: 부모 생성자 호출하고 추가 필드 초기화하기
        super(accountNumber, initialBalance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    // 오버라이딩: 마이너스 통장 기능
    @Override
    public void withdraw(double amount) {
        // TODO 20: 신용 한도를 포함한 출금 기능 구현하기
        // amount > 0이고 amount <= balance + creditLimit일 때 처리
        // balance -= amount (protected이므로 직접 접근 가능)
        // addTransaction()으로 "출금: [금액]원 (잔액: [잔액]원)" 추가
        // balance < 0이면 "신용 한도 사용 중: [사용금액]원" 추가
        // 한도 초과 시 "출금 한도 초과!" 출력
        if (amount < 0 && amount > balance + creditLimit) {
            return;
        }
        balance -=  amount;
        addTransaction("출금: " + amount + "원 (잔액: " + balance + "원)");
        if (balance < 0){
            addTransaction("신용 한도 사용 중: " + (-balance) + "원");
            return;
        }
        if (amount > creditLimit + balance) {
            System.out.println("출금 한도 초과!");
        }
    }

    // 새로운 기능: 이자 지급
    public void applyInterest() {
        // TODO 21: 이자 지급 기능 구현하기
        // balance > 0일 때만 처리
        // 이자 = balance * (interestRate / 100)
        // balance에 이자 추가
        // addTransaction()으로 "이자 지급: [이자]원" 추가
        if (balance <= 0){
            return;
        }
        interestRate *= balance / 100;
        balance += interestRate;
        addTransaction("이자 지급: " + interestRate + "원 추가");

    }

    // 새로운 기능: VIP 혜택
    public void applyVIPBenefit() {
        // TODO 22: VIP 혜택금 지급하기
        // 혜택금 10000원을 balance에 추가
        // addTransaction()으로 "VIP 혜택금 지급: 10000원" 추가
        balance += 10000;
        addTransaction("VIP 혜택금 지급: 10000원");
    }
}
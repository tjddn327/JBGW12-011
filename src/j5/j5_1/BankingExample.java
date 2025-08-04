package j5.j5_1;

// 사용 예제
public class BankingExample {
    public static void main(String[] args) {
        // 계좌 생성
        BankAccount account = new BankAccount("123-456-789", "김철수", "1234");

        // 계좌 정보 확인
        System.out.println("계좌번호: " + account.getAccountNumber());
        System.out.println("예금주: " + account.getAccountHolder());
        System.out.println("잔액: " + account.getBalance());

        // 거래
        account.deposit(100000);
        account.withdraw(30000, "1234");  // 성공
        account.withdraw(20000, "0000");  // 실패 (잘못된 비밀번호)

        // 비밀번호 변경
        account.changePassword("1234", "5678");

        // 계좌 잠금
        account.lockAccount();
        account.deposit(50000);  // 실패 (계좌 잠김)

        // 계좌 잠금 해제
        account.unlockAccount("5678");
        account.deposit(50000);  // 성공
    }
}

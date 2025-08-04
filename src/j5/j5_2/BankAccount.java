package j5.j5_2;

/**
 * 안전한 생성자를 가진 BankAccount 클래스
 */
public class BankAccount {
    // TODO 11: private 인스턴스 변수 선언하기
    // accountNumber, ownerName (String), balance (double), bankName (String)
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String bankName;

    // TODO 12: 기본 생성자 구현하기 - 0원 계좌
    public BankAccount(String accountNumber, String ownerName) {
        // 계좌번호와 예금주명이 null이거나 비어있으면 IllegalArgumentException 발생
        // this.accountNumber = accountNumber, this.ownerName = ownerName
        // this.balance = 0.0, this.bankName = "Java Bank"
        // "[예금주]님의 계좌([계좌번호])가 개설되었습니다." 출력
        if (accountNumber == null || accountNumber.isEmpty() ||
                ownerName == null || ownerName.isEmpty()) {
            throw new IllegalArgumentException("계좌번호와 예금주명은 반드시 입력되어야 합니다.");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.bankName = "Java Bank";
        System.out.println(ownerName + "님의 계좌(" + accountNumber + ")가 개설되었습니다.");

    }

    // TODO 13: 초기 입금액이 있는 생성자 구현하기
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        // 계좌번호와 예금주명 유효성 검사 (null이거나 비어있으면 예외)
        // initialBalance가 0보다 작으면 "초기 잔액은 0 이상이어야 합니다." 예외
        // 모든 필드 초기화
        // "[예금주]님의 계좌([계좌번호])가 [금액]원으로 개설되었습니다." 출력
        if (accountNumber == null || accountNumber.isEmpty() ||
                ownerName == null || ownerName.isEmpty()) {
            throw new IllegalArgumentException("계좌번호와 예금주명은 반드시 입력되어야 합니다.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("초기 잔액은 0 이상이어야 합니다.");
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.bankName = "Java Bank";
        System.out.println(ownerName + "님의 계좌(" + accountNumber + ")가 " + initialBalance + "원으로 개설되었습니다.");

    }

    // TODO 14: 은행명까지 지정하는 생성자 구현하기
    public BankAccount(String accountNumber, String ownerName,
                       double initialBalance, String bankName) {
        // 모든 매개변수 유효성 검사
        // bankName이 null이거나 비어있으면 "Java Bank"로 설정
        // "[은행명]에서 [예금주]님의 계좌([계좌번호])가 [금액]원으로 개설되었습니다." 출력
        if (accountNumber == null || accountNumber.isEmpty() ||
                ownerName == null || ownerName.isEmpty()) {
            throw new IllegalArgumentException("계좌번호와 예금주명은 반드시 입력되어야 합니다.");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("초기 잔액은 0 이상이어야 합니다.");
        }
        if (bankName == null || bankName.isEmpty()) {
            bankName = "Java Bank";
        }
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.bankName = bankName;
        System.out.println(bankName + "에서 " + ownerName + "님의 계좌(" + accountNumber + ")가 " + initialBalance + "원으로 개설되었습니다.");

    }

    // TODO 15: getter 메서드들 구현하기
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public String getBankName() {
        return bankName;
    }

    // TODO 16: 입금 메서드 구현하기
    public void deposit(double amount) {
        // amount가 0보다 크면 balance에 추가
        // "[금액]원이 입금되었습니다. 현재 잔액: [잔액]원" 출력
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("입금 금액은 0보다 커야 합니다.");
        }
    }

    // TODO 17: 계좌 정보 출력 메서드 구현하기
    public void displayAccountInfo() {
        // "=== 계좌 정보 ===" 출력
        // "은행: [은행명]", "계좌번호: [계좌번호]", "예금주: [예금주]", "잔액: [잔액]원" 출력
        System.out.println("=== 계좌 정보 ===");
        System.out.println("은행: " + bankName);
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + ownerName);
        System.out.println("잔액: " + balance + "원");
    }
}


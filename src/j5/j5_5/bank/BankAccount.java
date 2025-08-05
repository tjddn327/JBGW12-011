package j5.j5_5.bank;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Locale;

/**
 * protected 접근 제어자의 활용을 보여주는 예제
 */
public class BankAccount {
    private String accountNumber;
    protected double balance;  // 서브클래스에서 접근 가능
    protected List<String> transactionHistory;
    public SimpleDateFormat date = new SimpleDateFormat("E MMM dd hh:mm:ss z yyyy", Locale.ENGLISH);

    public BankAccount(String accountNumber, double initialBalance) {
        // TODO 14: 필드 초기화하기
        // accountNumber, balance 초기화
        // transactionHistory를 새 ArrayList로 초기화
        // addTransaction()으로 "계좌 개설: [초기잔액]원" 추가
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactionHistory = new ArrayList<>();
        addTransaction("계좌 개설: " + balance + "원");
    }

    public void deposit(double amount) {
        // TODO 15: 입금 기능 구현하기
        // amount > 0일 때만 처리
        // balance에 amount 추가
        // addTransaction()으로 "입금: [금액]원" 추가
        if (amount < 0) {
            return;
        }
        balance += amount;
        addTransaction("입금: " + balance + "원");
    }

    public void withdraw(double amount) {
        // TODO 16: 출금 기능 구현하기
        // amount > 0이고 amount <= balance일 때만 처리
        // balance에서 amount 차감
        // addTransaction()으로 "출금: [금액]원" 추가
        if (amount < 0 || amount > balance) {
            return;
        }
        balance -= amount;
        addTransaction("출금: " + amount + "원");
    }

    protected void addTransaction(String transaction) {
        // TODO 17: 거래 내역 추가하기
        // transactionHistory에 현재 시간과 transaction 추가
        // 형식: "날짜시간 - 거래내용"
        System.out.println(date.format(new Date()) + " - " + transaction);
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        // TODO 18: 거래 내역 출력하기
        // "=== 거래 내역 ===" 출력
        // transactionHistory의 모든 항목 출력
        System.out.println("=== 거래 내역 ===");
    }
}
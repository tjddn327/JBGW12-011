package j7.J7_4;

import java.util.ArrayList;
import java.util.List;
import java.time.Instant;
import java.util.stream.Collectors;

public class ImmutabilityExample {
    // TODO: 은행 계좌 거래 레코드를 정의하세요 (불변)
    record Transaction(String id, String accountNumber, String type, double amount, double balanceAfter, String timestamp) {}

    // TODO: 계좌 상태 레코드를 정의하세요 (불변)
    record AccountState(String accountNumber, double balance) {
        // TODO: 입금 후 새 상태 반환 메서드를 작성하세요
        public AccountState deposit(double amount) {
            return new AccountState(accountNumber, balance + amount);
        }

        // TODO: 출금 후 새 상태 반환 메서드를 작성하세요
        public AccountState withdraw(double amount) {
            if (balance < amount) {
                throw new IllegalArgumentException("잔액 부족");
            }
            return new AccountState(accountNumber, balance - amount);
        }
    }

    // 거래 처리기
    static class TransactionProcessor {
        private List<Transaction> transactions = new ArrayList<>();
        private int transactionId = 1;

        // TODO: 입금 처리 메서드를 작성하세요
        public AccountState processDeposit(AccountState account, double amount) {
            AccountState newState = account.deposit(amount);
            transactions.add(new Transaction("TXN" + transactionId++, account.accountNumber(), "입금", amount, newState.balance(), Instant.now().toString()));
            return newState;
        }

        // TODO: 출금 처리 메서드를 작성하세요
        public AccountState processWithdrawal(AccountState account, double amount) {
            AccountState newState = account.withdraw(amount);
            transactions.add(new Transaction("TXN" + transactionId++, account.accountNumber(), "출금", amount, newState.balance(), Instant.now().toString()));
            return newState;
        }

        // TODO: 거래 내역 조회 메서드를 작성하세요
        public List<Transaction> getTransactionHistory(String accountNumber) {
            return transactions.stream()
                    .filter(t -> t.accountNumber().equals(accountNumber))
                    .collect(Collectors.toList());
        }
    }

    public static void main(String[] args) {
        TransactionProcessor processor = new TransactionProcessor();

        // TODO: 초기 계좌 상태를 생성하세요
        AccountState account = new AccountState("123-456-789", 100000);
        System.out.println("초기 상태: " + account);

        // TODO: 거래를 처리하세요
        account = processor.processDeposit(account, 50000);
        System.out.println("입금 후: " + account);

        account = processor.processWithdrawal(account, 30000);
        System.out.println("출금 후: " + account);

        account = processor.processDeposit(account, 20000);
        System.out.println("입금 후: " + account);

        System.out.println("\n=== 거래 내역 ===");
        for (Transaction txn : processor.getTransactionHistory("123-456-789")) {
            System.out.printf("%s | %s | %,.0f원 | 잔액: %,.0f원\n",
                    txn.id(), txn.type(), txn.amount(), txn.balanceAfter());
        }
    }
}
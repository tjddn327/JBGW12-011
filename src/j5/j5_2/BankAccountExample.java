package j5.j5_2;

// TODO 18: 사용 예제 완성하기
public class BankAccountExample {
    public static void main(String[] args) {
        try {
            // TODO 19: 다양한 생성자로 계좌 생성하기
            // account1: "123-456-789", "김철수"
            // account2: "987-654-321", "이영희", 100000
            // account3: "555-777-999", "박민수", 500000, "우리은행"
            BankAccount account1 = new BankAccount("123-456-789", "김철수");
            BankAccount account2 = new BankAccount("987-654-321", "이영희", 100000);
            BankAccount account3 = new BankAccount("555-777-999", "박민수", 500000, "우리은행");


            // TODO 20: 계좌 정보 출력하기
            System.out.println("\n=== 계좌 정보 출력 ===");
            // 각 계좌의 displayAccountInfo() 호출하고 빈 줄 출력
            account1.displayAccountInfo();
            System.out.println();

            account2.displayAccountInfo();
            System.out.println();

            account3.displayAccountInfo();
            System.out.println();

            // TODO 21: 입금 테스트하기
            System.out.println("\n=== 입금 테스트 ===");
            // account1에 50000원 입금
            account1.deposit(50000);

        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}

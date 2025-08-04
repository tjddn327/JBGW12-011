package j5.j5_2;

// TODO 82: 사용 예제 완성하기
public class ComplexConstructorExample {
    public static void main(String[] args) {
        try {
            System.out.println("=== 온라인 주문 시스템 ===");

            // TODO 83: 다양한 주문 생성하기
            Order order1 = new Order("CUST001", "노트북", 2, 1500000);
            Order order2 = new Order("CUST002", "마우스", 15, 25000);
            Order order3 = new Order("CUST001", "키보드", 5, 80000);

            // TODO 84: 주문 상세 정보 출력하기
            System.out.println("\n=== 주문 상세 정보 ===");
            order1.displayOrderInfo();
            System.out.println();

            order2.displayOrderInfo();
            System.out.println();

            order3.displayOrderInfo();
            System.out.println();

        } catch (IllegalArgumentException e) {
            System.out.println("주문 생성 오류: " + e.getMessage());
        }
    }
}

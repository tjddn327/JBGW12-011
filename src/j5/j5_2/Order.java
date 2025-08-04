package j5.j5_2;

/**
 * 복잡한 생성자 로직을 가진 Order 클래스
 */
public class Order {
    // TODO 76: final 필드 선언하기
    private final String orderId;
    private final String customerId;
    private final String productName;
    private final int quantity;
    private final double unitPrice;
    private final double totalAmount;
    private final String orderDate;
    private final String status;

    // TODO 77: static 변수 선언하기
    private static int orderSequence = 1;

    // TODO 78: 생성자 구현하기
    public Order(String customerId, String productName, int quantity, double unitPrice) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("고객 ID는 필수입니다.");
        }
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("상품명은 필수입니다.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("수량은 1 이상이어야 합니다.");
        }
        if (unitPrice < 0) {
            throw new IllegalArgumentException("단가는 0 이상이어야 합니다.");
        }

        this.orderId = generateOrderId();
        this.customerId = customerId;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        double baseAmount = quantity * unitPrice;
        if (quantity >= 10) {
            baseAmount *= 0.9;
            System.out.println("10개 이상 주문으로 10% 할인이 적용되었습니다.");
        }
        this.totalAmount = baseAmount;

        this.orderDate = java.time.LocalDate.now().toString();
        this.status = "주문완료";

        System.out.println("주문이 생성되었습니다: " + orderId);
    }

    // TODO 79: 주문 ID 생성 메서드 구현하기
    private static String generateOrderId() {
        String today = java.time.LocalDate.now().toString().replace("-", "");
        return "ORD" + today + String.format("%04d", orderSequence++);
    }

    // TODO 80: getter 메서드들 구현하기
    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    // TODO 81: 주문 정보 출력 메서드 구현하기
    public void displayOrderInfo() {
        System.out.println("=== 주문 정보 ===");
        System.out.println("주문 ID: " + orderId);
        System.out.println("고객 ID: " + customerId);
        System.out.println("상품명: " + productName);
        System.out.println("수량: " + quantity + "개");
        System.out.println("단가: " + unitPrice + "원");
        System.out.println("총액: " + totalAmount + "원");
        System.out.println("주문일: " + orderDate);
        System.out.println("상태: " + status);
    }
}

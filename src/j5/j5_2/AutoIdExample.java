package j5.j5_2;

// TODO 71: 사용 예제 완성하기
public class AutoIdExample {
    public static void main(String[] args) {
        System.out.println("=== 자동 ID 생성 시스템 ===");

        // TODO 72: 여러 상품 생성하기
        Product product1 = new Product("노트북", 1500000, "전자제품");
        Product product2 = new Product("마우스", 25000, "전자제품");
        Product product3 = new Product("의자", 150000, "가구");
        Product product4 = new Product("책", 15000, "도서");

        // TODO 73: 상품 정보 출력하기
        System.out.println("\n=== 상품 정보 ===");
        product1.displayInfo();
        product2.displayInfo();
        product3.displayInfo();
        product4.displayInfo();

        // TODO 74: 통계 정보 출력하기
        System.out.println("\n=== 통계 정보 ===");
        System.out.println("총 생성된 상품 수: " + Product.getTotalProducts());
        System.out.println("다음 상품 ID: " + Product.getNextProductId());

        // TODO 75: ID 카운터 재설정 테스트하기
        System.out.println("\n=== ID 카운터 재설정 ===");
        Product.resetIdCounter(5000);
        Product product5 = new Product("키보드", 80000, "전자제품");
        product5.displayInfo();
        System.out.println("총 상품 수: " + Product.getTotalProducts());
    }
}

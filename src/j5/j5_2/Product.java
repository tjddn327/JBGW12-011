package j5.j5_2;

/**
 * 자동 ID 생성 기능이 있는 Product 클래스
 */
public class Product {
    // TODO 64: static 변수 선언하기
    private static int nextProductId = 1000;
    private static int totalProducts = 0;

    // TODO 65: 인스턴스 변수 선언하기
    private final int productId;
    private String name;
    private String category;
    private double price;
    private boolean inStock;

    // TODO 66: 생성자 구현하기
    public Product(String name, double price, String category) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("상품명은 필수입니다.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }

        this.productId = nextProductId++;
        this.name = name;
        this.price = price;
        this.category = (category == null) ? "기타" : category;
        this.inStock = true;

        totalProducts++;
        System.out.println("상품 생성: ID=" + productId + ", 이름=" + name);
    }

    // TODO 67: static 메서드들 구현하기
    public static int getTotalProducts() {
        return totalProducts;
    }

    public static int getNextProductId() {
        return nextProductId;
    }

    public static void resetIdCounter(int startId) {
        nextProductId = startId;
    }

    // TODO 68: getter 메서드들 구현하기
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInStock() {
        return inStock;
    }

    // TODO 69: setter 메서드들 구현하기 (ID는 final이므로 setter 없음)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // TODO 70: 정보 출력 메서드 구현하기
    public void displayInfo() {
        String stockStatus = inStock ? "있음" : "없음";
        System.out.println("ID: " + productId + ", 상품명: " + name + ", 가격: " + price + "원, 카테고리: " + category + ", 재고: " + stockStatus);
    }
}

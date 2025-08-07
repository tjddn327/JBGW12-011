package j7.J7_4;

import java.util.ArrayList;
import java.util.List;

public class RecordListExample {
    // TODO: 상품 레코드를 정의하세요
    record Product(String id, String name, double price, int stock) {
        // TODO: 재고 가치 계산 메서드를 작성하세요
        public double stockValue() {
            return price * stock;
        }

        // TODO: 재고 부족 여부 메서드를 작성하세요
        public boolean isLowStock() {
            return stock < 10;
        }
    }

    // 상품 관리 클래스
    static class ProductManager {
        private List<Product> products = new ArrayList<>();
        public void addProduct(Product product) { products.add(product); }

        // TODO: 재고 부족 상품 찾기 메서드를 작성하세요
        public List<Product> getLowStockProducts() {
            ArrayList<Product> lowStock = new ArrayList<>();
            for (Product p : products) {
                if (p.isLowStock()) {
                    lowStock.add(p);
                }
            }
            return lowStock;
        }

        // TODO: 총 재고 가치 계산 메서드를 작성하세요
        public double getTotalStockValue() {
            double total = 0;
            for (Product p : products) {
                total += p.stockValue();
            }
            return total;
        }

        // TODO: 가격 범위로 상품 검색 메서드를 작성하세요
        public List<Product> findByPriceRange(double min, double max) {
            ArrayList<Product> found = new ArrayList<>();
            for (Product p : products) {
                if (p.price() >= min && p.price() <= max) {
                    found.add(p);
                }
            }
            return found;
        }
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // TODO: 상품들을 추가하세요
        manager.addProduct(new Product("P001", "노트북", 1200000, 5));
        manager.addProduct(new Product("P002", "마우스", 25000, 50));
        manager.addProduct(new Product("P003", "키보드", 85000, 8));
        manager.addProduct(new Product("P004", "모니터", 450000, 12));
        manager.addProduct(new Product("P005", "USB", 15000, 3));

        System.out.println("=== 재고 부족 상품 ===");
        for (Product p : manager.getLowStockProducts()) {
            System.out.printf("%s - %s: %d개\n", p.id(), p.name(), p.stock());
        }

        System.out.println("\n=== 10만원 이하 상품 ===");
        for (Product p : manager.findByPriceRange(0, 100000)) {
            System.out.printf("%s: %,.0f원\n", p.name(), p.price());
        }

        System.out.printf("\n총 재고 가치: %,.0f원\n", manager.getTotalStockValue());
    }
}
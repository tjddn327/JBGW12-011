package j7.J7_5;

import java.util.Arrays;

public class ObjectSortingExample {
    static class Product {
        String name;
        int price;
        int stock;

        Product(String name, int price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }

        @Override
        public String toString() {
            return String.format("%s(%d원, 재고:%d)", name, price, stock);
        }
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("노트북", 1200000, 5),
                new Product("마우스", 25000, 50),
                new Product("키보드", 85000, 20),
                new Product("모니터", 450000, 8)
        };

        System.out.println("원본 배열:");
        printProducts(products);

        // 가격순 정렬 (오름차순)
        sortByPrice(products);
        System.out.println("\n가격순 정렬 (오름차순):");
        printProducts(products);

        // 재고순 정렬 (내림차순)
        sortByStock(products);
        System.out.println("\n재고순 정렬 (내림차순):");
        printProducts(products);

        // 이름순 정렬 (알파벳/한글순)
        sortByName(products);
        System.out.println("\n이름순 정렬:");
        printProducts(products);
    }

    // TODO: 가격순 정렬 메서드를 작성하세요 (삽입 정렬 사용)
    // 매개변수: Product[] products
    // 오름차순으로 정렬
    public static void sortByPrice(Product[] products) {
        // TODO: 삽입 정렬 알고리즘을 사용하여 가격순 정렬
        for (int i = 1; i < products.length; i++) {
            Product key = products[i];
            int j = i - 1;

            // TODO: 현재 제품보다 가격이 높은 제품들을 오른쪽으로 이동
            while (j >= 0 && products[j].price > key.price) {
                products[j + 1] = products[j];
                j = j - 1;
            }

            // TODO: 현재 제품을 올바른 위치에 삽입
            products[j + 1] = key;
        }
    }

    // TODO: 재고순 정렬 메서드를 작성하세요 (선택 정렬, 내림차순)
    // 매개변수: Product[] products
    // 재고가 많은 순서대로 정렬
    public static void sortByStock(Product[] products) {
        // TODO: 선택 정렬 알고리즘을 사용하여 재고순 정렬 (내림차순)
        for (int i = 0; i < products.length - 1; i++) {
            int maxIndex = i;

            // TODO: 나머지 부분에서 재고가 가장 많은 제품 찾기
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].stock > products[maxIndex].stock) {
                    maxIndex = j;
                }
            }

            // TODO: 최대값과 현재 위치 교환
            Product temp = products[i];
            products[i] = products[maxIndex];
            products[maxIndex] = temp;
        }
    }

    // TODO: 이름순 정렬 메서드를 작성하세요 (삽입 정렬 사용)
    // 매개변수: Product[] products
    // 문자열 비교를 위해 compareTo() 메서드 사용
    public static void sortByName(Product[] products) {
        for (int i = 1; i < products.length; i++) {
            Product key = products[i];
            int j = i - 1;

            // TODO: 현재 제품보다 이름이 사전적으로 뒤에 오는 제품들을 오른쪽으로 이동
            // 힌트: String.compareTo() 메서드 사용
            while (j >= 0 && products[j].name.compareTo(key.name) > 0) {
                products[j + 1] = products[j];
                j = j - 1;
            }

            // TODO: 현재 제품을 올바른 위치에 삽입
            products[j + 1] = key;
        }
    }

    public static void printProducts(Product[] products) {
        for (Product product : products) {
            System.out.println("  " + product);
        }
    }
}
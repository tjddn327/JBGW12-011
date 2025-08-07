package j7.J7_2;

import java.util.Arrays;

public class InventoryManager {
    private static class Item {
        String name;
        int quantity;
        double price;

        Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private Item[] items;
    private int itemCount;

    public InventoryManager() {
        items = new Item[4];
        itemCount = 0;
    }

    // TODO: 항목 추가 메서드를 작성하세요 (자동 크기 조정)
    public void addItem(String name, int quantity, double price) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].name.equals(name)) {
                items[i].quantity += quantity;
                System.out.println("기존 항목 수량 증가: " + name);
                return;
            }
        }
        if (itemCount == items.length) {
            expandArray();
        }
        items[itemCount] = new Item(name, quantity, price);
        itemCount++;
        System.out.println("새 항목 추가: " + name);
    }

    // TODO: 배열 크기 확장 메서드를 작성하세요
    private void expandArray() {
        int newSize = items.length * 2;
        System.out.printf("배열 크기 확장: %d -> %d\n", items.length, newSize);
        items = Arrays.copyOf(items, newSize);
    }

    // TODO: 항목 제거 메서드를 작성하세요
    public boolean removeItem(String name) {
        int index = -1;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].name.equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        items[index] = items[itemCount - 1]; // 마지막 항목으로 덮어쓰기
        items[itemCount - 1] = null;
        itemCount--;
        System.out.println("항목 제거됨: " + name);

        if (itemCount > 0 && itemCount < items.length / 4) {
            shrinkArray();
        }
        return true;
    }

    // TODO: 배열 크기 축소 메서드를 작성하세요
    private void shrinkArray() {
        int newSize = items.length / 2;
        if (newSize < 4) newSize = 4; // 최소 크기 유지
        System.out.printf("배열 크기 축소: %d -> %d\n", items.length, newSize);
        items = Arrays.copyOf(items, newSize);
    }

    // TODO: 재고 현황 출력 메서드를 작성하세요
    public void printInventory() {
        System.out.println("\n=== 재고 현황 ===");
        System.out.printf("항목 수: %d / 배열 크기: %d\n", itemCount, items.length);
        double totalValue = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            double itemValue = item.quantity * item.price;
            totalValue += itemValue;
            System.out.printf("- %s: %d개 × %.0f원 = %.0f원\n",
                    item.name, item.quantity, item.price, itemValue);
        }
        System.out.printf("총 재고 가치: %.0f원\n", totalValue);
    }

    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();
        inventory.addItem("노트북", 5, 1200000);
        inventory.addItem("마우스", 20, 30000);
        inventory.addItem("키보드", 15, 80000);
        inventory.addItem("모니터", 8, 350000);
        inventory.addItem("USB", 50, 15000);
        inventory.printInventory();
        inventory.addItem("마우스", 10, 30000);
        inventory.removeItem("USB");
        inventory.removeItem("모니터");
        inventory.removeItem("키보드");
        inventory.printInventory();
    }
}
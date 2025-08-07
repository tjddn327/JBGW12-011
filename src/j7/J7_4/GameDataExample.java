package j7.J7_4;

import java.util.ArrayList;
import java.util.List;

public class GameDataExample {
    // TODO: 게임 캐릭터 스탯 레코드를 정의하세요
    record Stats(int health, int attack, int defense, int speed) {
        // TODO: 전투력 계산 메서드를 작성하세요
        public int combatPower() {
            return attack * 2 + defense + speed;
        }
    }

    // TODO: 아이템 레코드를 정의하세요
    record Item(String name, String type, int value, Stats bonusStats) {}

    // TODO: 캐릭터 레코드를 정의하세요
    record Character(String name, String job, Stats baseStats, List<Item> inventory) {
        // TODO: 총 스탯 계산 메서드를 작성하세요
        public Stats totalStats() {
            int totalHealth = baseStats.health();
            int totalAttack = baseStats.attack();
            int totalDefense = baseStats.defense();
            int totalSpeed = baseStats.speed();

            for (Item item : inventory) {
                totalHealth += item.bonusStats().health();
                totalAttack += item.bonusStats().attack();
                totalDefense += item.bonusStats().defense();
                totalSpeed += item.bonusStats().speed();
            }
            return new Stats(totalHealth, totalAttack, totalDefense, totalSpeed);
        }

        // TODO: 아이템 추가 메서드를 작성하세요 (새 캐릭터 반환)
        public Character addItem(Item item) {
            List<Item> newInventory = new ArrayList<>(this.inventory);
            newInventory.add(item);
            return new Character(this.name, this.job, this.baseStats, newInventory);
        }
    }

    public static void main(String[] args) {
        // TODO: 아이템들을 생성하세요
        Item sword = new Item("강철 검", "무기", 1000, new Stats(0, 10, 0, 0));
        Item shield = new Item("철 방패", "방어구", 800, new Stats(0, 0, 8, 0));
        Item boots = new Item("신속의 부츠", "신발", 500, new Stats(0, 0, 2, 5));

        // TODO: 캐릭터를 생성하세요
        Character warrior = new Character("아서", "전사", new Stats(100, 15, 10, 5), new ArrayList<>());

        // TODO: 아이템을 장착하세요 (불변성 유지)
        warrior = warrior.addItem(sword);
        warrior = warrior.addItem(shield);
        warrior = warrior.addItem(boots);

        System.out.println("=== 캐릭터 정보 ===");
        System.out.println("이름: " + warrior.name());
        System.out.println("직업: " + warrior.job());

        System.out.println("\n기본 스탯:");
        Stats base = warrior.baseStats();
        System.out.printf("체력: %d, 공격력: %d, 방어력: %d, 속도: %d\n",
                base.health(), base.attack(), base.defense(), base.speed());

        System.out.println("\n장착 아이템:");
        for (Item item : warrior.inventory()) {
            System.out.println("- " + item.name() + " (" + item.type() + ")");
        }

        System.out.println("\n총 스탯:");
        Stats total = warrior.totalStats();
        System.out.printf("체력: %d, 공격력: %d, 방어력: %d, 속도: %d\n",
                total.health(), total.attack(), total.defense(), total.speed());
        System.out.println("전투력: " + total.combatPower());
    }
}
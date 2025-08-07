package j5.j5_5.animal;

import java.util.ArrayList;
import java.util.List;

// 동물원 관리 시스템
public class Zoo {
    private List<Animal> animals;
    private String name;

    public Zoo(String name) {
        // TODO 45: name 초기화하고 animals를 새 ArrayList로 초기화하기
        this.name = name;
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        // TODO 46: animals에 animal 추가하고
        // "[동물이름]이(가) [동물원이름]에 추가되었습니다." 출력하기
        animals.add(animal);
        System.out.println(animal.name + "이(가) " + name + "에 추가되었습니다.");
    }

    public void feedAllAnimals() {
        // TODO 47: 모든 동물에게 먹이 주기
        // "=== 모든 동물에게 먹이 주기 ===" 출력
        // 모든 동물의 eat() 메서드 호출
        System.out.println("\n=== 모든 동물에게 먹이 주기 ===");
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void makeAllSounds() {
        // TODO 48: 모든 동물의 소리 듣기
        // "=== 동물들의 소리 ===" 출력
        // 각 동물에 대해 "[이름]: " 출력 후 makeSound() 호출
        System.out.println("\n=== 동물들의 소리 ===");
        for (Animal animal : animals) {
            System.out.print(animal.name + ": ");
            animal.makeSound();
        }
    }

    public void performSpecialActions() {
        // TODO 49: 특별한 행동들 수행하기
        // "=== 특별한 행동들 ===" 출력
        // Dog이면 wagTail(), Eagle이면 hunt() 호출
        // instanceof 사용
        System.out.println("\n=== 특별한 행동들 ===");
        for(Animal a : animals){
            if(a instanceof Dog){
                ((Dog) a).wagTail();
            }else if (a instanceof  Eagle){
                ((Eagle) a).hunt();
            }
        }
    }
}
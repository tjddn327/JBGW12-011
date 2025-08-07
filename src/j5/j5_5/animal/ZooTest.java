package j5.j5_5.animal;

// 테스트
public class ZooTest {
    public static void main(String[] args) {
        // TODO 50: 동물원 생성하고 동물들 추가하기
        // Zoo: "행복한 동물원"
        // Dog: "바둑이", 5, 15.5, "진돗개"
        // Eagle: "독수리", 7, 6.8, 2.1, 50
        Zoo z = new Zoo("행복한 동물원");
        Dog d = new Dog("바둑이", 5, 15.5, "진돗개");
        Eagle e = new Eagle("독수리", 7, 6.8, 2.1, 50);
        z.addAnimal(d);
        z.addAnimal(e);
        // TODO 51: 동물원 운영하기
        // feedAllAnimals(), makeAllSounds(), performSpecialActions() 호출
        z.feedAllAnimals();
        z.makeAllSounds();
        z.performSpecialActions();
    }
}
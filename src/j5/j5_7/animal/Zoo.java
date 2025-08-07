package j5.j5_7.animal;

// 동물원 관리 시스템
public class Zoo {
    public static void main(String[] args) {
        // TODO 72: Dog과 Duck 객체 생성하기
        // Dog: "바둑이"
        // Duck: "도널드"
        Dog d = new Dog("바둑이");
        Duck du = new Duck("도널드");

        // TODO 73: LandAnimal 배열로 처리하기
        // 두 동물을 LandAnimal 배열에 담고
        // 각각 run(), makeSound(), jump() 호출하기
        LandAnimal[] l = new LandAnimal[2];
        System.out.println("=== 육상 동물 행동 ===");
        l[0] = d;
        l[0].run();
        l[0].makeSound();
        l[0].jump();
        l[1] = du;
        l[1].run();
        l[1].makeSound();
        l[1].jump();

        // TODO 74: 오리의 특별한 능력 테스트하기
        // swim(), dive(2), fly() 호출
        // 현재 고도 출력
        // land() 호출
        System.out.println("\n=== 오리의 특별한 능력 ===");
        du.swim();
        du.dive(2);
        du.fly();
        System.out.println("현재 고도: " + du.getAltitude() + "m");
        du.land();
    }
}
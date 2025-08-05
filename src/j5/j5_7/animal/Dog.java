package j5.j5_7.animal;

// 구체적인 구현 - 개
public class Dog implements LandAnimal {
    private String name;
    private int speed = 30;  // km/h
    private int volume = 5;

    public Dog(String name) {
        // TODO 47: name 초기화하기
        this.name = name;
    }

    @Override
    public String getName() {
        // TODO 48: name 반환하기
        return name;
    }

    @Override
    public void eat(String food) {
        // TODO 49: "[name]가 [food]를 먹습니다." 출력하기
        System.out.println(name + "가 " + food + "를 먹습니다.");
    }

    @Override
    public void sleep() {
        // TODO 50: "[name]가 잠을 잡니다. Zzz..." 출력하기
        System.out.println(name + "가 잠을 잡니다. Zzz...");
    }

    @Override
    public void move(int distance) {
        // TODO 51: "[name]가 [distance]m 이동합니다." 출력하기
        System.out.println(name + "가 " + distance + "m 이동합니다.");
    }

    @Override
    public int getSpeed() {
        // TODO 52: speed 반환하기
        return speed;
    }

    @Override
    public void makeSound() {
        // TODO 53: "[name]가 짖습니다: 멍멍! (볼륨: [volume])" 출력하기
        System.out.println(name + "가 짖습니다: 멍멍! (볼륨: " + volume + ")");
    }

    @Override
    public void setVolume(int level) {
        // TODO 54: volume 설정하기 (0~10 범위로 제한)
        // Math.max(0, Math.min(10, level)) 사용
        volume = Math.max(0, Math.min(10, level));
    }

    @Override
    public void run() {
        // TODO 55: "[name]가 달립니다!" 출력하고
        // move(100) 호출하기
        System.out.println(name + "가 달립니다!");
    }

    @Override
    public void jump() {
        // TODO 56: "[name]가 점프합니다!" 출력하기
        System.out.println(name + "가 점프합니다!");
    }
}

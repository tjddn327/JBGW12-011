package j5.j5_7.animal;

// 구체적인 구현 - 오리 (여러 능력)
public class Duck implements LandAnimal, AquaticAnimal, FlyingAnimal {
    private String name;
    private int landSpeed = 5;
    private int swimSpeed = 10;
    private int flySpeed = 40;
    private int currentSpeed;
    private int altitude = 0;
    private int volume = 3;

    public Duck(String name) {
        // TODO 57: name과 currentSpeed(landSpeed) 초기화하기
        this.name = name;
        this.currentSpeed = landSpeed;
    }

    @Override
    public String getName() {
        // TODO 58: name 반환하기
        return name;
    }

    @Override
    public void eat(String food) {
        // TODO 59: "[name]가 [food]를 먹습니다." 출력하기
        System.out.println(name + "가 " + food + "를 먹습니다.");
    }

    @Override
    public void sleep() {
        // TODO 60: "[name]가 물 위에서 잠을 잡니다." 출력하기
        System.out.println(name + "가 물 위에서 잠을 잡니다.");
    }

    @Override
    public void move(int distance) {
        // TODO 61: "[name]가 [distance]m 이동합니다. (속도: [currentSpeed]km/h)" 출력하기
        System.out.println(name + "가 " + distance + "m 이동합니다. (속도: " + currentSpeed + "km/h)");
    }

    @Override
    public int getSpeed() {
        // TODO 62: currentSpeed 반환하기
        return currentSpeed;
    }

    @Override
    public void makeSound() {
        // TODO 63: "[name]: 꽥꽥! (볼륨: [volume])" 출력하기
        System.out.println(name + ": 꽥꽥! (볼륨: " + volume + ")");
    }

    @Override
    public void setVolume(int level) {
        // TODO 64: volume 설정하기 (0~10 범위로 제한)
        volume = Math.max(0, Math.min(10, level));
    }

    @Override
    public void run() {
        // TODO 65: currentSpeed를 landSpeed로 설정하고
        // "[name]가 뒤뚱뒤뚱 걷습니다." 출력하기
        currentSpeed = landSpeed;
        System.out.println(name + "가 뒤뚱뒤뚱 걷습니다.");
    }

    @Override
    public void jump() {
        // TODO 66: "[name]가 폴짝 뜁니다." 출력하기
        System.out.println(name + "가 폴짝 뜁니다.");
    }

    @Override
    public void swim() {
        // TODO 67: currentSpeed를 swimSpeed로 설정하고
        // "[name]가 우아하게 헤엄칩니다." 출력하기
        currentSpeed = swimSpeed;
        System.out.println(name + "가 우아하게 헤엄칩니다.");
    }

    @Override
    public void dive(int depth) {
        // TODO 68: "[name]가 [depth]m 깊이로 잠수합니다." 출력하기
        System.out.println(name + "가 " + depth + "m 깊이로 잠수합니다.");
    }

    @Override
    public void fly() {
        // TODO 69: currentSpeed를 flySpeed로 설정하고
        // altitude를 100으로 설정하고
        // "[name]가 날아오릅니다!" 출력하기
        currentSpeed = flySpeed;
        altitude = 100;
        System.out.println(name + "가 날아오릅니다!");
    }

    @Override
    public void land() {
        // TODO 70: altitude를 0으로, currentSpeed를 landSpeed로 설정하고
        // "[name]가 착륙합니다." 출력하기
        altitude = 0;
        currentSpeed = landSpeed;
        System.out.println(name + "가 착륙합니다.");
    }

    @Override
    public int getAltitude() {
        // TODO 71: altitude 반환하기
        return altitude;
    }
}
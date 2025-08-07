package j5.j5_5.animal;

// 조류 추상 클래스
public abstract class Bird extends Animal {
    protected double wingspan;
    protected boolean canFly;

    public Bird(String name, int age, double weight, double wingspan, boolean canFly) {
        // TODO 33: 부모 생성자 호출하고 wingspan, canFly 초기화하기
        super(name, age, weight);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }

    public void layEggs() {
        // TODO 34: "[이름]이(가) 알을 낳습니다." 출력하기
        System.out.println(name + "이(가) 알을 낳습니다.");
    }
}
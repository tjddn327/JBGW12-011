package j5.j5_5.animal;

// 포유류 추상 클래스
public abstract class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(String name, int age, double weight, boolean hasFur) {
        // TODO 31: 부모 생성자 호출하고 hasFur 초기화하기
        super(name, age, weight);
        this.hasFur = hasFur;
    }

    public void nurse() {
        // TODO 32: "[이름]이(가) 새끼에게 젖을 먹입니다." 출력하기
        System.out.println(name + "이(가) 새끼에게 젖을 먹입니다.");
    }
}
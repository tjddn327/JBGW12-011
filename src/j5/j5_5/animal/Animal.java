package j5.j5_5.animal;

/**
 * 복잡한 클래스 계층 구조를 보여주는 예제
 */
// 최상위 추상 클래스
public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;

    public Animal(String name, int age, double weight) {
        // TODO 27: 필드 초기화하기
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 추상 메서드
    public abstract void makeSound();
    public abstract void move();
    public abstract String getHabitat();

    // 구체 메서드
    public void eat() {
        // TODO 28: "[이름]이(가) 먹이를 먹습니다." 출력하기
        System.out.println(name + "이(가) " + "먹이를 먹습니다.");
    }

    public void sleep() {
        // TODO 29: "[이름]이(가) 잠을 잡니다." 출력하기
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    @Override
    public String toString() {
        // TODO 30: "[이름] (나이: [나이], 체중: [체중]kg)" 형식으로 반환하기
        return name + "(나이: " + age + ", 체중: " + weight + "kg)";
    }
}
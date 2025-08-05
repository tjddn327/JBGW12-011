package j5.j5_5.animal;

// 구체적인 동물 클래스들
public class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        // TODO 35: 부모 생성자 호출(hasFur는 true)하고 breed 초기화하기
        super(name, age, weight, true);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        // TODO 36: "멍멍!" 출력하기
        System.out.println("멍멍!");
    }

    @Override
    public void move() {
        // TODO 37: "[이름]이(가) 네 발로 뛰어다닙니다." 출력하기
        System.out.println(name + "이(가) 네 발로 뛰어다닙니다.");
    }

    @Override
    public String getHabitat() {
        // TODO 38: "인간과 함께 사는 집" 반환하기
        return "인간과 함께 사는 집";
    }

    public void wagTail() {
        // TODO 39: "[이름]이(가) 꼬리를 흔듭니다." 출력하기
        System.out.println(name + "이(가) 꼬리를 흔듭니다.");
    }
}
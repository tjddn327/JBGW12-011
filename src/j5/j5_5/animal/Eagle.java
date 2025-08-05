package j5.j5_5.animal;

public class Eagle extends Bird {
    private double huntingRange;

    public Eagle(String name, int age, double weight, double wingspan, double huntingRange) {
        // TODO 40: 부모 생성자 호출(canFly는 true)하고 huntingRange 초기화하기
        super(name, age, weight, wingspan, true);
        this.huntingRange = huntingRange;

    }

    @Override
    public void makeSound() {
        // TODO 41: "끼이익!" 출력하기
        System.out.println("끼이익!");
    }

    @Override
    public void move() {
        // TODO 42: "[이름]이(가) 하늘을 날아다닙니다." 출력하기
        System.out.println(name + "이(가) 하늘을 날아다닙니다.");
    }

    @Override
    public String getHabitat() {
        // TODO 43: "높은 산의 절벽" 반환하기
        return "높은 산의 절벽";
    }

    public void hunt() {
        // TODO 44: "[이름]이(가) 사냥을 합니다. 사냥 범위: [사냥범위]km" 출력하기
        System.out.println(name + "이(가) 사냥을 합니다. 사냥 범위: " + huntingRange + "km");
    }
}
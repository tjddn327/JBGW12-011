package j5.j5_6.vehicle;

class SportsCar extends Vehicle {
    protected String model = "스포츠카";  // 부모의 model을 숨김
    private boolean turboMode = false;

    public SportsCar() {
        // TODO 19: 부모 클래스의 maxSpeed를 250으로 설정하기
        // super를 사용하여 부모의 필드에 접근
        super.maxSpeed = 250;
    }

    public void displayAllInfo() {
        System.out.println("=== 전체 정보 ===");
        // TODO 20: this.model과 super.model의 차이 출력하기
        // this.model: 자신의 model 필드
        // super.model: 부모의 model 필드
        // super.maxSpeed와 turboMode도 출력
        System.out.println("this.model: " + this.model);
        System.out.println("super.model: " + super.model);
        System.out.println("최고 속도: " + super.maxSpeed);
        System.out.println("터보 모드: "  + this.turboMode);
    }

    @Override
    public void honk() {
        // TODO 21: 부모의 honk() 호출 후 추가 동작 수행하기
        // super.honk() 호출
        // "부웉!!" 출력
        super.honk();
        System.out.println("부웉!!");
    }
}
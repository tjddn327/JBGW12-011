package j5.j5_6.vehicle;

/**
 * super를 사용하여 숨겨진 부모 클래스 멤버에 접근하는 예제
 */
class Vehicle {
    protected String model = "일반 차량";
    protected int maxSpeed = 100;

    public void displayInfo() {
        System.out.println("차량 모델: " + model);
        System.out.println("최고 속도: " + maxSpeed + "km/h");
    }

    public void honk() {
        System.out.println("빵빵!");
    }
}
package j5.j5_6.vehicle;

// 테스트
public class SuperAccessExample {
    public static void main(String[] args) {
        // TODO 22: SportsCar 객체 생성하고 메서드들 호출하기
        // displayInfo() 호출 (부모의 메서드)
        // displayAllInfo() 호출
        // honk() 호출
        SportsCar sc = new SportsCar();
        sc.displayInfo();
        sc.displayAllInfo();
        sc.honk();
    }
}
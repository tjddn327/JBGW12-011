package j5.j5_2;

// TODO 28: 사용 예제 완성하기
public class InitializationOrderExample {
    public static void main(String[] args) {
        // TODO 29: 첫 번째 객체 생성하고 정보 출력하기
        System.out.println("=== 첫 번째 객체 생성 ===");
        // 기본 생성자로 obj1 생성하고 displayInfo() 호출
        InitializationExample obj1 = new InitializationExample();
        obj1.displayInfo();

        // TODO 30: 두 번째 객체 생성하고 정보 출력하기
        System.out.println("=== 두 번째 객체 생성 ===");
        // "커스텀이름"으로 obj2 생성하고 displayInfo() 호출
        InitializationExample obj2 = new InitializationExample("커스텀이름");
        obj2.displayInfo();
    }
}

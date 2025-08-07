package j5.j5_6.shape;

// 테스트
public class InheritanceConstructorExample {
    public static void main(String[] args) {
        // TODO 44: 다양한 생성자로 도형 객체 생성하기
        // Rectangle: 10, 5, "파랑", true
        // Rectangle: 7, 3 (기본 색상)
        // Circle: 5 (기본 설정)
        Rectangle r = new Rectangle(10,5,"파랑", true);
        Rectangle r1 = new Rectangle(7,3);
        Circle c = new Circle(5);

        // TODO 45: 생성된 도형 정보 출력하기
        System.out.println("=== Rectangle 생성 ===\n" + r);
        System.out.println("=== Rectangle 생성 (크기만) ===\n" + r1);
        System.out.println("=== Circle 생성 ===\n" + c);
    }
}
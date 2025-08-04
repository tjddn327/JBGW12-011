package j5.j5_2;

// TODO 49: 사용 예제 완성하기
public class ThisKeywordExample {
    public static void main(String[] args) {
        System.out.println("=== this 키워드 활용 예제 ===");

        // TODO 50: 다양한 생성자로 사각형 생성하기
        // rect1: 기본 생성자
        // rect2: 크기 5.0인 정사각형
        // rect3: 3.0 x 4.0 사각형
        // rect4: 2.0 x 6.0 빨간색 사각형
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.0);
        Rectangle rect3 = new Rectangle(3.0, 4.0);
        Rectangle rect4 = new Rectangle(2.0, 6.0, "빨간색");

        // TODO 51: 생성된 사각형 정보 출력하기
        System.out.println("\n=== 생성된 사각형들 ===");
        // 모든 사각형의 displayInfo() 호출
        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();
        rect4.displayInfo();

        // TODO 52: 메서드 체이닝 사용하기
        System.out.println("\n=== 메서드 체이닝 ===");
        // new Rectangle().setWidth(10.0).setHeight(5.0).setColor("파란색")으로 rect5 생성
        // rect5의 정보 출력
        Rectangle rect5 = new Rectangle()
                .setWidth(10.0)
                .setHeight(5.0)
                .setColor("파란색");
        rect5.displayInfo();

        // TODO 53: 크기 비교하기
        System.out.println("\n=== 크기 비교 ===");
        // rect3과 rect4를 비교하여 결과 출력
        if (rect4.isLargerThan(rect3)) {
            System.out.println("rect4가 rect3보다 큽니다.");
        } else {
            System.out.println("rect4가 rect3보다 크지 않습니다.");
        }
        if (!rect3.isLargerThan(rect4)) {
            System.out.println("rect4가 rect3보다 크거나 같습니다.");
        }
    }
}

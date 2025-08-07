package j7.J7_4;

public class BasicRecordExample {
    // TODO: 2D 좌표를 나타내는 레코드를 정의하세요
    // 레코드명: Point, 매개변수: int x, int y
    record Point(int x, int y) {}

    // TODO: 사각형을 나타내는 레코드를 정의하세요
    // 레코드명: Rectangle, 매개변수: Point topLeft, Point bottomRight
    record Rectangle(Point topLeft, Point bottomRight) {
        // TODO: 너비 계산 메서드를 작성하세요
        public int width() {
            return bottomRight.x() - topLeft.x();
        }

        // TODO: 높이 계산 메서드를 작성하세요
        public int height() {
            return bottomRight.y() - topLeft.y();
        }

        // TODO: 면적 계산 메서드를 작성하세요
        public int area() {
            return width() * height();
        }
    }

    public static void main(String[] args) {
        // TODO: 레코드를 생성하세요
        Point p1 = new Point(10, 20);
        Point p2 = new Point(50, 80);
        Rectangle rect = new Rectangle(p1, p2);

        // 필드 접근
        System.out.println("점 1: x=" + p1.x() + ", y=" + p1.y());
        System.out.println("점 2: x=" + p2.x() + ", y=" + p2.y());

        // toString() 자동 구현
        System.out.println("점 1: " + p1);
        System.out.println("사각형: " + rect);

        // 메서드 호출
        System.out.println("사각형 너비: " + rect.width());
        System.out.println("사각형 높이: " + rect.height());
        System.out.println("사각형 면적: " + rect.area());

        // TODO: equals() 테스트를 수행하세요
        Point p3 = new Point(10, 20);
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1 == p3: " + (p1 == p3));
    }
}
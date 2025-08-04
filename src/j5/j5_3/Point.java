package j5.j5_3;

/**
 * 좌표를 나타내는 클래스
 */
public class Point {
    private double x, y;

    // TODO 33: 생성자 구현하기
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // TODO 34: toString() 메서드 재정의하기
    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    // TODO 35: 다른 점까지의 거리 계산 메서드 구현하기
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

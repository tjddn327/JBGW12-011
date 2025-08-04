package j5.j5_1;

/**
 * 좌표를 나타내는 클래스
 */
public class Point {
    public int x;
    public int y;

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void display() {
        System.out.println("좌표: (" + x + ", " + y + ")");
    }

    // 객체 복사를 위한 메서드
    public Point copy() {
        Point newPoint = new Point();
        newPoint.x = this.x;
        newPoint.y = this.y;
        return newPoint;
    }
}
package j7.J7_3;

import java.util.ArrayList;

public class SimpleDrawing {
    // TODO: 점을 나타내는 클래스를 작성하세요
    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%.1f, %.1f)", x, y);
        }
    }

    // TODO: 곡선 데이터 클래스를 작성하세요
    static class Curve {
        String color;
        ArrayList<Point> points;

        public Curve(String color) {
            this.color = color;
            this.points = new ArrayList<>();
        }

        // 점 추가 메서드 작성
        public void addPoint(double x, double y) {
            points.add(new Point(x, y));
        }

        // 곡선 출력 메서드 작성
        public void printCurve() {
            System.out.println("색상: " + color);
            System.out.print("점들: ");
            for (Point p : points) {
                System.out.print(p + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // TODO: 여러 곡선을 저장하는 ArrayList를 생성하세요
        ArrayList<Curve> drawing = new ArrayList<>();

        // TODO: 첫 번째 곡선(빨간색)을 생성하고 점들을 추가하세요
        Curve curve1 = new Curve("빨간색");
        curve1.addPoint(0, 0);
        curve1.addPoint(10, 10);
        curve1.addPoint(20, 5);
        curve1.addPoint(30, 15);
        drawing.add(curve1);

        // TODO: 두 번째 곡선(파란색)을 생성하고 점들을 추가하세요
        Curve curve2 = new Curve("파란색");
        curve2.addPoint(5, 20);
        curve2.addPoint(15, 25);
        curve2.addPoint(25, 20);
        drawing.add(curve2);

        // TODO: 세 번째 곡선(초록색)을 생성하고 점들을 추가하세요
        Curve curve3 = new Curve("초록색");
        curve3.addPoint(0, 30);
        curve3.addPoint(30, 0);
        drawing.add(curve3);

        // TODO: 전체 그림을 출력하세요
        System.out.println("=== 전체 그림 ===");
        for (int i = 0; i < drawing.size(); i++) {
            System.out.println("곡선 " + (i + 1) + ":");
            drawing.get(i).printCurve();
        }

        // TODO: 가장 많은 점을 가진 곡선을 찾으세요
        Curve maxPointsCurve = drawing.get(0);
        for (Curve curve : drawing) {
            if (curve.points.size() > maxPointsCurve.points.size()) {
                maxPointsCurve = curve;
            }
        }
        System.out.println("가장 많은 점을 가진 곡선: " +
                maxPointsCurve.color + " (" + maxPointsCurve.points.size() + "개)");

        // TODO: 마지막 곡선을 제거하세요 (Undo 기능)
        if (!drawing.isEmpty()) {
            Curve removed = drawing.remove(drawing.size() - 1);
            System.out.println("\n제거된 곡선: " + removed.color);
        }

        // TODO: 남은 곡선 수를 출력하세요
        System.out.println("남은 곡선 수: " + drawing.size());
    }
}
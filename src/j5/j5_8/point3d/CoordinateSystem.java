package j5.j5_8.point3d;

/**
 * 2D와 3D 좌표를 다루는 좌표 시스템
 */
public class CoordinateSystem {

    // 2D 좌표를 나타내는 정적 중첩 클래스
    public static class Point2D {
        private double x, y;

        public Point2D(double x, double y) {
            // TODO 1: x와 y 좌표 초기화하기
            this.x = x;
            this.y = y;
        }

        public double distanceFromOrigin() {
            // TODO 2: 원점(0, 0)으로부터의 거리 계산하기
            // 피타고라스 정리 사용: sqrt(x² + y²)
            return Math.sqrt(x * x + y * y);
        }

        public double distanceTo(Point2D other) {
            // TODO 3: 다른 점까지의 거리 계산하기
            // 두 점 사이의 거리 공식 사용
            double dx = this.x - other.x;
            double dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() {
            // TODO 4: "(x, y)" 형식으로 좌표 반환하기
            // 소수점 2자리까지 표시
            return String.format("(%.2f, %.2f)", x, y);
        }
    }

    // 3D 좌표를 나타내는 정적 중첩 클래스
    public static class Point3D {
        private double x, y, z;

        public Point3D(double x, double y, double z) {
            // TODO 5: x, y, z 좌표 초기화하기
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distanceFromOrigin() {
            // TODO 6: 3D 공간에서 원점으로부터의 거리 계산하기
            // sqrt(x² + y² + z²)
            return Math.sqrt(x * x + y * y + z * z);
        }

        public Point2D projectToXY() {
            // TODO 7: XY 평면으로 투영하기 (z 좌표 무시)
            return new Point2D(x, y);
        }

        public Point2D projectToXZ() {
            // TODO 8: XZ 평면으로 투영하기 (y 좌표 무시)
            return new Point2D(x, z);
        }

        public Point2D projectToYZ() {
            // TODO 9: YZ 평면으로 투영하기 (x 좌표 무시)
            return new Point2D(y, z);
        }

        @Override
        public String toString() {
            // TODO 10: "(x, y, z)" 형식으로 좌표 반환하기
            return String.format("(%.2f, %.2f, %.2f)", x, y, z);
        }
    }

    // 선분을 나타내는 정적 중첩 클래스
    public static class LineSegment {
        private Point3D start;
        private Point3D end;

        public LineSegment(Point3D start, Point3D end) {
            // TODO 11: 시작점과 끝점 초기화하기
            this.start = start;
            this.end = end;
        }

        public double getLength() {
            // TODO 12: 선분의 길이 계산하기
            // 두 점 사이의 3D 거리 공식 사용
            double dx = end.x - start.x;
            double dy = end.y - start.y;
            double dz = end.z - start.z;
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        }

        public Point3D getMidpoint() {
            // TODO 13: 선분의 중점 계산하기
            double midX = (start.x + end.x) / 2;
            double midY = (start.y + end.y) / 2;
            double midZ = (start.z + end.z) / 2;
            return new Point3D(midX, midY, midZ);
        }
    }
}
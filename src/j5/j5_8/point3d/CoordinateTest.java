package j5.j5_8.point3d;

// 테스트 클래스
class CoordinateTest {
    public static void main(String[] args) {
        // TODO 14: 2D 점 생성하기
        // p1: (3, 4), p2: (6, 8)
        CoordinateSystem.Point2D p1 = new CoordinateSystem.Point2D(3, 4);
        CoordinateSystem.Point2D p2 = new CoordinateSystem.Point2D(6, 8);

        // TODO 15: 2D 점 정보 출력하기
        // p1, p2 출력
        // 원점에서 p1까지의 거리
        // p1에서 p2까지의 거리
        System.out.println("2D 점:");
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println("원점에서 P1까지의 거리: " + p1.distanceFromOrigin());
        System.out.println("P1에서 P2까지의 거리: " + p1.distanceTo(p2));

        System.out.println();


        // TODO 16: 3D 점 생성하기
        // p3d1: (1, 2, 3), p3d2: (4, 5, 6)
        CoordinateSystem.Point3D p3d1 = new CoordinateSystem.Point3D(1, 2, 3);
        CoordinateSystem.Point3D p3d2 = new CoordinateSystem.Point3D(4, 5, 6);

        // TODO 17: 3D 점 정보 출력하기
        // p3d1 출력
        // XY 평면으로의 투영 출력
        System.out.println("3D 점:");
        System.out.println("P3D1: " + p3d1);
        System.out.println("XY 평면 투영: " + p3d1.projectToXY());

        // TODO 18: 선분 생성하고 정보 출력하기
        // p3d1에서 p3d2로의 선분
        // 길이와 중점 출력
        CoordinateSystem.LineSegment segment = new CoordinateSystem.LineSegment(p3d1, p3d2);
        System.out.println("선분:");
        System.out.println("길이: " + segment.getLength());
        System.out.println("중점: " + segment.getMidpoint());
    }
}
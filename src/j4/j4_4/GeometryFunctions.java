package j4.j4_4;

public class GeometryFunctions {
    public static void main(String[] args) {
        System.out.println("=== 기하학 함수 예제 ===\n");

        // TODO 33: 피타고라스 정리 테스트하기
         double c = pythagoras(3, 4);
         System.out.println("직각삼각형 (3, 4)의 빗변: " + c);

        // TODO 34: 원의 면적과 둘레 테스트하기
         double radius = 5;
         System.out.println("\n반지름 " + radius + "인 원:");
         System.out.println("면적: " + circleArea(radius));
         System.out.println("둘레: " + circlePerimeter(radius));

        // TODO 35: 삼각형 면적 테스트하기
         double area = triangleArea(3, 4, 5);
         System.out.println("\n변의 길이가 3, 4, 5인 삼각형의 면적: " + area);

        // TODO 36: 두 점 사이의 거리 테스트하기
         double distance = distanceBetweenPoints(0, 0, 3, 4);
         System.out.println("\n(0,0)과 (3,4) 사이의 거리: " + distance);
    }

    // TODO 37: 피타고라스 정리 함수 구현하기
    static double pythagoras(double a, double b) {
        // 빗변 길이 계산
        return Math.sqrt(a * a + b * b);
    }

    // TODO 38: 원의 면적 함수 구현하기
    static double circleArea(double radius) {
        // 원의 면적 계산
        return Math.PI * radius * radius;
    }

    // TODO 39: 원의 둘레 함수 구현하기
    static double circlePerimeter(double radius) {
        // 원의 둘레 계산
        return 2 * Math.PI * radius;
    }

    // TODO 40: 삼각형 면적 함수 구현하기
    static double triangleArea(double a, double b, double c) {
        // 세 변의 길이로 면적 계산
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // TODO 41: 두 점 사이의 거리 함수 구현하기
    static double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        // 두 점 사이의 거리 계산
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);

    }
}
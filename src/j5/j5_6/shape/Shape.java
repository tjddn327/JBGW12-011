package j5.j5_6.shape;

/**
 * 도형 클래스 계층구조에서 생성자 사용
 */
abstract class Shape {
    protected String color;
    protected boolean filled;

    // Shape의 생성자
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("Shape 생성자 호출");
    }

    public Shape(String color) {
        this(color, false);  // 다른 생성자 호출
    }

    public Shape() {
        this("검정");  // 기본값
    }
}
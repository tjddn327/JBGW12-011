package j5.j5_6.shape;

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        // TODO 41: super()를 사용하여 부모 생성자 호출하기
        // radius 초기화
        // "Circle 생성자 호출" 출력
        super(color, filled);
        this.radius = radius;
        System.out.println("Circle 생성자 호출");
    }

    public Circle(double radius) {
        // TODO 42: this()를 사용하여 완전한 생성자 호출하기
        // 기본값: "빨강", true
        this(radius, "빨강", true);

    }

    @Override
    public String toString() {
        // TODO 43: "[color] 원 (반지름: [radius])[채움 여부]" 형식으로 반환하기
        String a = filled ? "채움" : "";
        return color + "원 (반지름: " + radius + ") " + a;
    }
}
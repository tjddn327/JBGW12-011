package j5.j5_6.shape;

class Rectangle extends Shape {
    private double width;
    private double height;

    // Rectangle의 완전한 생성자
    public Rectangle(double width, double height, String color, boolean filled) {
        // TODO 37: super()를 사용하여 부모 생성자 호출하기
        // color와 filled를 부모 생성자에 전달
        // width와 height 초기화
        // "Rectangle 생성자 호출" 출력
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // 크기와 색상만 지정
    public Rectangle(double width, double height, String color) {
        // TODO 38: this()를 사용하여 완전한 생성자 호출하기
        // filled는 false로 설정
        super(color, false);
        this.width = width;
        this.height = height;
    }

    // 크기만 지정
    public Rectangle(double width, double height) {
        // TODO 39: super()를 사용하여 기본 Shape 생성자 호출하기
        // width와 height 초기화
        // "Rectangle 생성자 호출" 출력
        this.width = width;
        this.height = height;
        System.out.println("Rectangle 생성자 호출");
    }

    @Override
    public String toString() {
        // TODO 40: "[color] 사각형 ([width] x [height])[채움 여부]" 형식으로 반환하기
        // filled가 true이면 " [채움]" 추가
        String a = filled ? "채움" : "";
        return color + " 사각형 (" + width + " x " + height + ") " + a;
    }
}

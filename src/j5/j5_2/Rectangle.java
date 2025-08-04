package j5.j5_2;

/**
 * this 키워드의 다양한 사용법을 보여주는 클래스
 */
public class Rectangle {
    // TODO 39: private 인스턴스 변수 선언하기
    private double width, height;
    private String color;

    // TODO 40: this로 인스턴스 변수와 매개변수 구분하는 생성자 구현하기
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.color = "흰색";
    }

    // TODO 41: 색상까지 받는 생성자 구현하기
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // TODO 42: this()를 사용한 생성자 체이닝 - 기본 생성자
    public Rectangle() {
        this(1.0, 1.0, "흰색");
    }

    // TODO 43: this()를 사용한 생성자 체이닝 - 정사각형 생성자
    public Rectangle(double size) {
        this(size, size, "흰색");
    }

    // TODO 44: 메서드 체이닝을 위한 setter 구현하기
    public Rectangle setWidth(double width) {
        this.width = width;
        return this;
    }

    public Rectangle setHeight(double height) {
        this.height = height;
        return this;
    }

    public Rectangle setColor(String color) {
        this.color = color;
        return this;
    }

    // TODO 45: getter 메서드들 구현하기
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    // TODO 46: 넓이 계산 메서드 구현하기
    public double getArea() {
        return width * height;
    }

    // TODO 47: 정보 출력 메서드 구현하기
    public void displayInfo() {
        System.out.println("사각형 정보: " + width + " x " + height + " (" + color + "), 넓이: " + getArea());
    }

    // TODO 48: this를 매개변수로 사용하는 비교 메서드 구현하기
    public boolean isLargerThan(Rectangle other) {
        return this.getArea() > other.getArea();
    }
}

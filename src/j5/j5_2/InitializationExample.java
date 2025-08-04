package j5.j5_2;

/**
 * 다양한 초기화 방법을 보여주는 클래스
 */
public class InitializationExample {
    // TODO 22: 인스턴스 변수 선언 시 초기화하기
    private String name = "기본이름";
    private int count = 0;

    // TODO 23: 인스턴스 초기화 블록 구현하기
    {
        // "인스턴스 초기화 블록 실행" 출력
        // count = 10, name = "초기화블록에서설정"으로 변경
        System.out.println("인스턴스 초기화 블록 실행");
        count = 10;
        name = "초기화블록에서설정";
    }

    // TODO 24: static 변수와 static 초기화 블록 구현하기
    // private static String className 선언
    private static String className;
    static {
        // "static 초기화 블록 실행" 출력
        // className = "InitializationExample"로 설정
        System.out.println("static 초기화 블록 실행");
        className = "InitializationExample";
    }

    // TODO 25: 기본 생성자 구현하기
    public InitializationExample() {
        // "기본 생성자 실행" 출력
        // name = "생성자에서설정", count = 100으로 변경
        System.out.println("기본 생성자 실행");
        name = "생성자에서설정";
        count = 100;
    }

    // TODO 26: 매개변수 생성자 구현하기
    public InitializationExample(String customName) {
        // "매개변수 생성자 실행" 출력
        // this.name = customName, this.count = 200으로 설정
        System.out.println("매개변수 생성자 실행");
        this.name = customName;
        this.count = 200;
    }

    // TODO 27: 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "클래스명: [className]", "이름: [name]", "카운트: [count]" 출력하고 빈 줄
        System.out.println("클래스명: " + className);
        System.out.println("이름: " + name);
        System.out.println("카운트: " + count);
        System.out.println();
    }
}

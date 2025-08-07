package j5.j5_5.person;

/**
 * 상속의 기본 개념을 보여주는 예제
 */
// 부모 클래스
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        // TODO 1: name과 age 초기화하기
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        // TODO 2: "안녕하세요, 저는 [이름]이고, [나이]살입니다." 출력하기
        System.out.println("안녕하세요, 저는 " + name + "이고, " + age + "살입니다.");
    }

    public void sleep() {
        // TODO 3: "[이름]이(가) 잠을 잡니다." 출력하기
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}


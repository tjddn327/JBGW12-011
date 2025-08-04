package j5.j5_1;

/**
 * 사람을 나타내는 기본 클래스
 */
public class Person {
    // TODO 1: 인스턴스 변수 선언하기
    public String name;
    public int age;
    public String email;

    // TODO 2: 자기소개 메서드 구현하기
    public void introduce() {
        System.out.println("안녕하세요! 저는 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
    }

    // TODO 3: 생일 메서드 구현하기
    public void haveBirthday() {
        age++; // age = age + 1
        System.out.println(name + "님의 생일을 축하합니다! 이제 " + age + "살이 되었습니다.");
    }

    // TODO 4: 이메일 유효성 확인 메서드 구현하기
    public boolean hasValidEmail() {
        return email != null && email.contains("@");
    }
}
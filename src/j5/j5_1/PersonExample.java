package j5.j5_1;

public class PersonExample {
    public static void main(String[] args) {
        // TODO 6: 첫 번째 객체 생성하고 정보 설정하기
        Person person1 = new Person();
        person1.name = "김철수";
        person1.age = 25;
        person1.email = "kim@example.com";

        // TODO 7: 두 번째 객체 생성하고 정보 설정하기
        Person person2 = new Person();
        person2.name = "이영희";
        person2.age = 23;
        person2.email = "lee@example.com";

        // TODO 8: 메서드 호출하기
        person1.introduce();
        person2.introduce();

        // TODO 9: 생일 축하하기
        person1.haveBirthday();

        // TODO 10: 이메일 유효성 확인하기
        if (person1.hasValidEmail()) {
            System.out.println(person1.name + "님의 이메일은 유효합니다.");
        } else {
            System.out.println(person1.name + "님의 이메일은 유효하지 않습니다.");
        }
    }
}

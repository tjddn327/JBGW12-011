package j5.j5_3;

import java.util.Objects;

/**
 * Object 클래스 메서드를 올바르게 재정의한 예제
 */
public class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // TODO 20: 생성자 구현하기
    public Person(String name, int age, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // TODO 21: Getter 메서드들 구현하기
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // TODO 22: toString() 메서드 재정의하기
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +
                ", email='" + email + "', phone='" + phoneNumber + "'}";
    }

    // TODO 23: equals() 메서드 재정의하기
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                       // 같은 객체인지 비교
        if (obj == null || getClass() != obj.getClass()) return false; // null 또는 클래스 다르면 false

        Person person = (Person) obj;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(email, person.email) &&
                Objects.equals(phoneNumber, person.phoneNumber);
    }

    // TODO 24: hashCode() 메서드 재정의하기
    @Override
    public int hashCode() {
        return Objects.hash(name, age, email, phoneNumber);
    }
}

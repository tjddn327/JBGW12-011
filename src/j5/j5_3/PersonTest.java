package j5.j5_3;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("=== Person 클래스 테스트 ===\n");

        // TODO 26: 객체 생성하기
        Person person1 = new Person("김철수", 25, "kim@email.com", "010-1234-5678");
        Person person2 = new Person("이영희", 23, "lee@email.com", "010-9876-5432");
        Person person3 = new Person("김철수", 25, "kim@email.com", "010-1234-5678");

        // TODO 27: toString() 테스트하기
        System.out.println("=== toString() 테스트 ===");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);

        // TODO 28: equals() 테스트하기
        System.out.println("\n=== equals() 테스트 ===");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1 == person3: " + (person1 == person3));

        // TODO 29: hashCode() 테스트하기
        System.out.println("\n=== hashCode() 테스트 ===");
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        System.out.println("person1과 person3의 hashCode 같은가? " +
                (person1.hashCode() == person3.hashCode()));
    }
}

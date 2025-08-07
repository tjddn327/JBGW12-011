package j5.j5_5.person;

// 테스트 클래스
public class InheritanceExample {
    public static void main(String[] args) {
        // TODO 10: Person, Student, Teacher 객체 생성하기
        // Person: "김철수", 30
        // Student: "이영희", 16, "한국고등학교", 2
        // Teacher: "박교사", 45, "수학", 20
        Person p = new Person("김철수", 30);
        Student s = new Student("이영희", 16, "한국고등학교", 2);
        Teacher c = new Teacher("박교사", 45, "수학", 20);

        // TODO 11: 각자 소개하기
        // 각 객체의 introduce() 메서드 호출
        System.out.println("=== 각자 소개하기 ===");
        p.introduce();
        System.out.println();
        s.introduce();
        System.out.println();
        c.introduce();

        // TODO 12: 공통 행동 실행하기
        // 모든 객체의 sleep() 메서드 호출
        System.out.println("\n=== 공통 행동 ===");
        p.sleep();
        s.sleep();
        c.sleep();

        // TODO 13: 특수 행동 실행하기
        // student.study()와 teacher.teach() 호출
        System.out.println("\n=== 특수 행동 ===");
        s.study();
        c.teach();
    }
}

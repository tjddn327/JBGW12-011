package j5.j5_2;

// TODO 8: 사용 예제 완성하기
public class StudentConstructorExample {
    public static void main(String[] args) {
        System.out.println("=== 다양한 생성자 사용 ===");

        // TODO 9: 각각 다른 생성자를 사용하여 Student 객체 생성하기
        // 기본 생성자로 student1 생성
        // 이름만 지정하여 student2 생성 ("김철수")
        // 이름과 나이를 지정하여 student3 생성 ("이영희", 22)
        // 모든 정보를 지정하여 student4 생성 ("박민수", 21, "S202301", 3.8)
        Student student1 = new Student();
        Student student2 = new Student("김철수");
        Student student3 = new Student("이영희", 22);
        Student student4 = new Student("박민수", 21, "S202301", 3.8);

        // TODO 10: 학생 정보 출력하기
        System.out.println("\n=== 학생 정보 출력 ===");
        // 모든 학생의 displayInfo() 메서드 호출
        System.out.println("\n=== 학생 정보 출력 ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}

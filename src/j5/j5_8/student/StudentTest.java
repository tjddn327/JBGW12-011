package j5.j5_8.student;


import java.util.List;
import java.util.function.Predicate;

// 테스트
class StudentTest {
    public static void main(String[] args) {
        // TODO 72: StudentManager 생성하고 학생 4명 추가하기
        // 김철수(22, 3.8), 이영희(21, 4.2)
        // 박민수(23, 3.5), 최지우(20, 4.0)
        StudentManager manager = new StudentManager();
        manager.addStudent("김철수", 22, 3.8);
        manager.addStudent("이영희", 21, 4.2);
        manager.addStudent("박민수", 23, 3.5);
        manager.addStudent("최지우", 20, 4.0);

        // TODO 73: 원본 학생 리스트 출력하기
        manager.printStudents("원본");

        // TODO 74: 이름순으로 정렬하고 출력하기
        manager.sortByName();
        manager.printStudents("이름순 정렬");

        // TODO 75: 학점순으로 정렬하고 출력하기
        manager.sortByGPA();
        manager.printStudents("학점순 정렬");

        // TODO 76: 익명 클래스로 GPA 4.0 이상 학생 필터링하기
        // Predicate<StudentManager.Student> 구현
        // test 메서드에서 s.gpa >= 4.0 검사
        List<StudentManager.Student> highGpaStudents = manager.filterStudents(new Predicate<StudentManager.Student>() {
            @Override
            public boolean test(StudentManager.Student s) {
                return s.gpa >= 4.0;
            }
        });

        // TODO 77: 필터링 결과 출력하기
        System.out.println("=== 학점 4.0 이상 ===");
        for (StudentManager.Student s : highGpaStudents) {
            System.out.println(s);
        }
        System.out.println();

        // TODO 78: 람다 표현식으로 21세 이하 학생 필터링하기
        List<StudentManager.Student> youngStudents = manager.filterStudents(s -> s.age <= 21);

        // TODO 79: 필터링 결과 출력하기
        System.out.println("=== 21세 이하 ===");
        for (StudentManager.Student s : youngStudents) {
            System.out.println(s);
        }
        System.out.println();
    }
}

package j4.j4_6;

// TODO 69: Main 클래스 만들기
// TODO 70: 필요한 import문 추가하기
import j4.j4_6.model.Student;
import j4.j4_6.service.StudentService;

import java.time.LocalDate;
import java.util.List;

/**
 * 학생 관리 시스템의 메인 클래스입니다.
 */
public class Main {
    public static void main(String[] args) {
        // TODO 72: StudentService 객체 생성하기
        StudentService service = new StudentService();

        // TODO 73: 학생들 추가하기
        service.addStudent(new Student("S001", "김철수", 20, LocalDate.of(2023, 3, 1)));
        service.addStudent(new Student("S002", "이영희", 19, LocalDate.of(2023, 3, 1)));
        service.addStudent(new Student("S003", "박민수", 21, LocalDate.of(2022, 9, 1)));

        // TODO 74: 모든 학생 출력하기
        System.out.println("=== 전체 학생 목록 ===");
        for (Student s : service.getAllStudents()) {
            System.out.println(s);
        }

        // TODO 75: 특정 학생 검색하기
        System.out.println("\n=== 학생 검색 ===");
        Student found = service.findStudent("S002");
        System.out.println("찾은 학생: " + found);

        // TODO 76: 이름으로 검색하기
        System.out.println("\n=== 이름으로 검색 ===");
        List<Student> results = service.searchByName("김");
        for (Student s : results) {
            System.out.println(s);
        }
    }
}

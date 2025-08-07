package j7.J7_4;

import java.time.LocalDate;
import java.util.List;

public class ComplexRecordExample {
    // TODO: 학생 정보 레코드를 정의하세요
    record Student(
            String name,
            int id,
            LocalDate birthDate,
            List<String> courses,
            double gpa
    ) {
        // TODO: 나이 계산 메서드를 작성하세요
        public int age() {
            return LocalDate.now().getYear() - birthDate.getYear();
        }

        // TODO: 수강 과목 수 메서드를 작성하세요
        public int courseCount() {
            return courses != null ? courses.size() : 0;
        }
    }

    public static void main(String[] args) {
        // TODO: 학생 레코드를 생성하세요
        Student student = new Student(
                "김철수",
                20210001,
                LocalDate.of(2000, 3, 15),
                List.of("자바", "데이터베이스", "웹프로그래밍"),
                4.2
        );

        // 정보 출력
        System.out.println("학생 정보: " + student);
        System.out.println("이름: " + student.name());
        System.out.println("나이: " + student.age() + "세");
        System.out.println("수강 과목 수: " + student.courseCount());

        // TODO: 수강 과목을 출력하세요
        System.out.println("\n수강 과목:");
        if (student.courses() != null) {
            for (String course : student.courses()) {
                System.out.println("- " + course);
            }
        }
    }
}
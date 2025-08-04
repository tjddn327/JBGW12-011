package j5.j5_1;

// 테스트
public class GradeSystemTest {
    public static void main(String[] args) {
        String[] subjects = {"국어", "영어", "수학", "과학"};
        ClassGradeSystem gradeSystem = new ClassGradeSystem(subjects);

        // 학생 등록
        gradeSystem.addStudent("2024001", "김철수");
        gradeSystem.addStudent("2024002", "이영희");
        gradeSystem.addStudent("2024003", "박민수");
        gradeSystem.addStudent("2024004", "정수진");

        // 점수 입력
        Student student1 = gradeSystem.findStudent("2024001");
        if (student1 != null) {
            student1.setScore("국어", 85);
            student1.setScore("영어", 90);
            student1.setScore("수학", 88);
            student1.setScore("과학", 92);
        }

        Student student2 = gradeSystem.findStudent("2024002");
        if (student2 != null) {
            student2.setScore("국어", 92);
            student2.setScore("영어", 88);
            student2.setScore("수학", 95);
            student2.setScore("과학", 90);
        }

        Student student3 = gradeSystem.findStudent("2024003");
        if (student3 != null) {
            student3.setScore("국어", 78);
            student3.setScore("영어", 82);
            student3.setScore("수학", 85);
            student3.setScore("과학", 80);
        }

        Student student4 = gradeSystem.findStudent("2024004");
        if (student4 != null) {
            student4.setScore("국어", 88);
            student4.setScore("영어", 95);
            student4.setScore("수학", 82);
            student4.setScore("과학", 87);
        }

        // 전체 성적표 출력
        gradeSystem.printClassReport();
    }
}

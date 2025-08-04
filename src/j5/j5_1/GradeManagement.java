package j5.j5_1;

// 성적 관리 시스템
public class GradeManagement {
    public static void main(String[] args) {
        // 과목 설정
        String[] subjects = {"국어", "영어", "수학", "과학", "사회"};

        // 학생 생성
        Student student1 = new Student("2024001", "김철수", subjects);
        Student student2 = new Student("2024002", "이영희", subjects);

        // 점수 입력
        student1.setScore("국어", 85);
        student1.setScore("영어", 92);
        student1.setScore("수학", 78);
        student1.setScore("과학", 88);
        student1.setScore("사회", 95);

        student2.setScore("국어", 90);
        student2.setScore("영어", 88);
        student2.setScore("수학", 95);
        student2.setScore("과학", 82);
        student2.setScore("사회", 87);

        // 성적표 출력
        student1.printReport();
        student2.printReport();

        // 특정 과목 점수 조회
        System.out.println("\n" + student1.getName() + "의 수학 점수: " +
                student1.getScore("수학"));
    }
}

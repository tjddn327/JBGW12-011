package j10.j10_1;

import java.util.*;

public class SimpleGradeSystem {

    // 학생 클래스
    static class Student {
        private String id;
        private String name;
        private Map<String, Double> grades;

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
            this.grades = new HashMap<>();
        }

        public void addGrade(String subject, double grade) {
            // TODO: 과목과 성적을 grades Map에 추가
            grades.put(subject, grade);
        }

        public double getAverageGrade() {
            // TODO: 모든 성적의 평균 계산
            // 힌트: grades가 비어있으면 0 반환
            if (grades.isEmpty()) return 0.0;

            double sum = 0;
            for (double g : grades.values()) {
                sum += g;
            }
            return sum / grades.size();
        }

        public String getId() { return id; }
        public String getName() { return name; }
    }

    private Map<String, Student> students;

    public SimpleGradeSystem() {
        this.students = new HashMap<>();
    }

    // 학생 추가
    public void addStudent(Student student) {
        // TODO: students Map에 학생 추가 (ID를 키로 사용)
        students.put(student.getId(), student);
    }

    // 성적 입력
    public void addGrade(String studentId, String subject, double grade) {
        // TODO: 해당 학생을 찾아서 성적 추가
        // 힌트: students.get(studentId) 사용
        Student s = students.get(studentId);
        if (s != null) {
            s.addGrade(subject, grade);
        }
    }

    // 전체 학생 중 최고 평균 성적 학생 찾기
    public Student getTopStudent() {
        // TODO: 모든 학생 중 평균 성적이 가장 높은 학생 반환
        // 힌트: students.values()로 모든 학생 순회
        Student top = null;
        double maxAvg = -1;

        for (Student s : students.values()) {
            double avg = s.getAverageGrade();
            if (avg > maxAvg) {
                maxAvg = avg;
                top = s;
            }
        }
        return top;
    }

    public static void main(String[] args) {
        SimpleGradeSystem system = new SimpleGradeSystem();

        // 학생 추가
        Student s1 = new Student("2024001", "김철수");
        Student s2 = new Student("2024002", "이영희");
        Student s3 = new Student("2024003", "박민수");

        system.addStudent(s1);
        system.addStudent(s2);
        system.addStudent(s3);

        // 성적 입력
        system.addGrade("2024001", "수학", 85);
        system.addGrade("2024001", "영어", 90);

        system.addGrade("2024002", "수학", 95);
        system.addGrade("2024002", "영어", 92);

        system.addGrade("2024003", "수학", 78);
        system.addGrade("2024003", "영어", 85);

        System.out.printf("%s 평균: %.1f%n", s1.getName(), s1.getAverageGrade());
        System.out.printf("%s 평균: %.1f%n", s2.getName(), s2.getAverageGrade());
        System.out.printf("%s 평균: %.1f%n", s3.getName(), s3.getAverageGrade());

        Student top = system.getTopStudent();
        System.out.println("최고 성적 학생: " + top.getName());
    }
}

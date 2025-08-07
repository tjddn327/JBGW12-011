package j7.J7_3;

import java.util.ArrayList;

public class StudentManagement {
    static class Course {
        String name;
        int credits;

        // TODO: Course 생성자를 작성하세요
        public Course(String name, int credits) {
            this.name = name;
            this.credits = credits;
        }
    }

    static class Student {
        String name;
        int id;
        ArrayList<Course> courses;
        ArrayList<Double> grades;

        // TODO: Student 생성자를 작성하세요
        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            this.courses = new ArrayList<>();
            this.grades = new ArrayList<>();
        }

        // TODO: 과목 등록 메서드를 작성하세요
        public void enrollCourse(Course course, double grade) {
            courses.add(course);
            grades.add(grade);
        }

        // TODO: GPA 계산 메서드를 작성하세요
        public double calculateGPA() {
            double totalWeightedPoints = 0;
            int totalCredits = 0;
            for (int i = 0; i < courses.size(); i++) {
                totalWeightedPoints += grades.get(i) * courses.get(i).credits;
                totalCredits += courses.get(i).credits;
            }
            return totalCredits == 0 ? 0 : totalWeightedPoints / totalCredits;
        }

        // TODO: 성적표 출력 메서드를 작성하세요
        public void printTranscript() {
            System.out.printf("=== 성적표: %s (ID: %d) ===\n", name, id);
            for (int i = 0; i < courses.size(); i++) {
                System.out.printf("%s (%d학점): %.1f\n", courses.get(i).name, courses.get(i).credits, grades.get(i));
            }
            System.out.printf("평균 학점: %.2f\n", calculateGPA());
        }
    }

    public static void main(String[] args) {
        // TODO: 학생 목록을 저장할 ArrayList를 생성하세요
        ArrayList<Student> students = new ArrayList<>();

        // TODO: 학생들을 생성하세요
        Student student1 = new Student("김철수", 20210001);
        Student student2 = new Student("이영희", 20210002);

        // TODO: 학생1에게 다음 과목들을 등록하세요
        student1.enrollCourse(new Course("자바 프로그래밍", 3), 4.0);
        student1.enrollCourse(new Course("자료구조", 3), 3.5);
        student1.enrollCourse(new Course("데이터베이스", 3), 4.5);

        // TODO: 학생2에게 다음 과목들을 등록하세요
        student2.enrollCourse(new Course("자바 프로그래밍", 3), 4.5);
        student2.enrollCourse(new Course("웹 프로그래밍", 3), 4.0);
        student2.enrollCourse(new Course("알고리즘", 3), 3.0);

        // TODO: 학생들을 목록에 추가하세요
        students.add(student1);
        students.add(student2);

        // TODO: 모든 학생의 성적표를 출력하세요
        for (Student s : students) {
            s.printTranscript();
            System.out.println();
        }

        // TODO: 평균 GPA가 3.5 이상인 학생을 찾아서 출력하세요
        System.out.println("=== 우수 학생 (GPA 3.5 이상) ===");
        for (Student s : students) {
            if (s.calculateGPA() >= 3.5) {
                System.out.printf("%s: %.2f\n", s.name, s.calculateGPA());
            }
        }
    }
}
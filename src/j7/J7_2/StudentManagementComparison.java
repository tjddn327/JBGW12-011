package j7.J7_2;

import java.util.Arrays;
import java.util.ArrayList;

public class StudentManagementComparison {
    // 방법 1: 병렬 배열 사용
    static class ParallelArrayApproach {
        private String[] names;
        private int[] studentIds;
        private double[] gpas;
        private String[] majors;
        private int studentCount;

        public ParallelArrayApproach(int capacity) {
            names = new String[capacity];
            studentIds = new int[capacity];
            gpas = new double[capacity];
            majors = new String[capacity];
            studentCount = 0;
        }

        // TODO: 학생 추가 메서드를 작성하세요
        public void addStudent(String name, int id, double gpa, String major) {
            if (studentCount >= names.length) {
                System.out.println("배열이 가득 찼습니다!");
                return;
            }
            names[studentCount] = name;
            studentIds[studentCount] = id;
            gpas[studentCount] = gpa;
            majors[studentCount] = major;
            studentCount++;
        }

        // TODO: 학생 목록 출력 메서드를 작성하세요
        public void printStudents() {
            System.out.println("=== 병렬 배열 방식 ===");
            for (int i = 0; i < studentCount; i++) {
                System.out.printf("%d. %s (ID: %d, GPA: %.2f, 전공: %s)\n",
                        (i + 1), names[i], studentIds[i], gpas[i], majors[i]);
            }
        }

        // TODO: 평균 GPA 계산 메서드를 작성하세요
        public double getAverageGPA() {
            if (studentCount == 0) return 0.0;
            double sum = 0;
            for (int i = 0; i < studentCount; i++) {
                sum += gpas[i];
            }
            return sum / studentCount;
        }
    }

    // 방법 2: 객체 배열 사용
    static class ObjectArrayApproach {
        static class Student {
            String name; int studentId; double gpa; String major;
            Student(String name, int id, double gpa, String major) {
                this.name = name; this.studentId = id; this.gpa = gpa; this.major = major;
            }
            @Override
            public String toString() {
                return String.format("%s (ID: %d, GPA: %.2f, 전공: %s)",
                        name, studentId, gpa, major);
            }
        }
        private Student[] students;
        private int studentCount;

        public ObjectArrayApproach(int capacity) {
            students = new Student[capacity];
            studentCount = 0;
        }

        // TODO: 학생 추가 메서드를 작성하세요
        public void addStudent(String name, int id, double gpa, String major) {
            if (studentCount >= students.length) {
                students = Arrays.copyOf(students, students.length * 2);
            }
            students[studentCount++] = new Student(name, id, gpa, major);
        }

        // TODO: 학생 목록 출력 메서드를 작성하세요
        public void printStudents() {
            System.out.println("\n=== 객체 배열 방식 ===");
            for (int i = 0; i < studentCount; i++) {
                System.out.println((i + 1) + ". " + students[i]);
            }
        }

        // TODO: 평균 GPA 계산 메서드를 작성하세요
        public double getAverageGPA() {
            if (studentCount == 0) return 0.0;
            double sum = 0;
            for (int i = 0; i < studentCount; i++) {
                sum += students[i].gpa;
            }
            return sum / studentCount;
        }

        // TODO: 특정 전공 학생들 필터링 메서드를 작성하세요
        public Student[] getStudentsByMajor(String major) {
            ArrayList<Student> list = new ArrayList<>();
            for (int i = 0; i < studentCount; i++) {
                if (students[i].major.equals(major)) {
                    list.add(students[i]);
                }
            }
            return list.toArray(new Student[0]);
        }
    }

    public static void main(String[] args) {
        ParallelArrayApproach parallel = new ParallelArrayApproach(5);
        parallel.addStudent("김철수", 20210001, 3.8, "컴퓨터공학");
        parallel.addStudent("이영희", 20210002, 4.0, "전자공학");
        parallel.addStudent("박민수", 20210003, 3.5, "컴퓨터공학");
        parallel.printStudents();
        System.out.printf("평균 GPA: %.2f\n", parallel.getAverageGPA());

        ObjectArrayApproach object = new ObjectArrayApproach(3);
        object.addStudent("김철수", 20210001, 3.8, "컴퓨터공학");
        object.addStudent("이영희", 20210002, 4.0, "전자공학");
        object.addStudent("박민수", 20210003, 3.5, "컴퓨터공학");
        object.addStudent("최지은", 20210004, 3.9, "전자공학");
        object.printStudents();
        System.out.printf("평균 GPA: %.2f\n", object.getAverageGPA());

        System.out.println("\n=== 컴퓨터공학 전공 학생들 ===");
        ObjectArrayApproach.Student[] csStudents = object.getStudentsByMajor("컴퓨터공학");
        for (ObjectArrayApproach.Student s : csStudents) {
            System.out.println(s);
        }
    }
}
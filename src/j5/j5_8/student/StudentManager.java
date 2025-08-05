package j5.j5_8.student;

import java.util.*;
import java.util.function.Predicate;

/**
 * 학생 관리 시스템
 */
public class StudentManager {
    private List<Student> students = new ArrayList<>();

    static class Student {
        String name;
        int age;
        double gpa;

        Student(String name, int age, double gpa) {
            // TODO 64: name, age, gpa 초기화하기
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            // TODO 65: "name (나이: age, 학점: gpa)" 형식으로 반환하기
            return String.format("%s (나이: %d, 학점: %.2f)", name, age, gpa);
        }
    }

    public void addStudent(String name, int age, double gpa) {
        // TODO 66: 새 Student 객체 생성하여 students에 추가하기
        students.add(new Student(name, age, gpa));
    }

    // 다양한 정렬 방법
    public void sortByName() {
        // TODO 67: 익명 클래스로 Comparator 구현하여 이름순 정렬하기
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
    }

    public void sortByAge() {
        // TODO 68: 익명 클래스로 Comparator 구현하여 나이순 정렬하기
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
    }

    public void sortByGPA() {
        // TODO 69: 익명 클래스로 Comparator 구현하여 학점 내림차순 정렬하기
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.gpa, s1.gpa);
            }
        });
    }

    // 필터링
    public List<Student> filterStudents(Predicate<Student> condition) {
        // TODO 70: 조건에 맞는 학생만 필터링하기
        // 새 리스트 생성
        // condition.test()로 각 학생 검사
        // 조건에 맞으면 리스트에 추가
        List<Student> filtered = new ArrayList<>();
        for (Student s : students) {
            if (condition.test(s)) {
                filtered.add(s);
            }
        }
        return filtered;
    }

    public void printStudents(String title) {
        // TODO 71: 학생 리스트 출력하기
        // "=== title ===" 출력
        // 모든 학생 출력
        System.out.println("=== " + title + " ===");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }
}

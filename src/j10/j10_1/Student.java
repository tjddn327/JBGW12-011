package j10.j10_1;

import java.util.*;

public class Student implements Comparable<Student> {
    private String studentId;
    private String name;
    private double gpa;
    
    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }
    
    // GPA로 내림차순 정렬 (높은 점수가 먼저)
    @Override
    public int compareTo(Student other) {
        // TODO: GPA 기준 내림차순 비교
        // 힌트: Double.compare(other.gpa, this.gpa)
        return Double.compare(other.gpa, this.gpa);
    }
    
    @Override
    public String toString() {
        return String.format("%s: %s (GPA: %.2f)", studentId, name, gpa);
    }
    
    // Getter 메서드들
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public String getStudentId() { return studentId; }
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("2024001", "김철수", 3.8));
        students.add(new Student("2024002", "이영희", 4.2));
        students.add(new Student("2024003", "박민수", 3.5));
        students.add(new Student("2024004", "정지원", 4.0));
        
        System.out.println("정렬 전:");
        for (Student s : students) {
            System.out.println(s);
        }
        
        Collections.sort(students);
        
        System.out.println("\nGPA 내림차순 정렬:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

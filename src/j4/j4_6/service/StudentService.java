package j4.j4_6.service;

import j4.j4_6.model.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 학생 정보를 관리하는 서비스 클래스입니다.
 * <ul>
 *   <li>학생 추가</li>
 *   <li>학생 검색</li>
 *   <li>학생 목록 출력</li>
 * </ul>
 */
public class StudentService {
    // TODO 63: 학생 저장용 Map 선언하기
    private Map<String, Student> studentMap;

    // TODO 64: 생성자 구현하기
    public StudentService() {
        studentMap = new HashMap<>();
    }

    // TODO 65: addStudent 메서드 구현하기
    /**
     * 학생을 추가합니다.
     * @param student 추가할 학생
     * @throws IllegalArgumentException 중복 학번일 경우
     */
    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getStudentId())) {
            throw new IllegalArgumentException("이미 존재하는 학번입니다: " + student.getStudentId());
        }
        studentMap.put(student.getStudentId(), student);
    }

    // TODO 66: findStudent 메서드 구현하기
    public Student findStudent(String studentId) {
        return studentMap.get(studentId);
    }

    // TODO 67: getAllStudents 메서드 구현하기
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    // TODO 68: searchByName 메서드 구현하기
    public List<Student> searchByName(String name) {
        return studentMap.values().stream()
                .filter(s -> s.getName().contains(name))
                .collect(Collectors.toList());
    }
}
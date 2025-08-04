package j5.j5_2;

/**
 * 다양한 생성자를 가진 Student 클래스
 */
public class Student {
    // TODO 1: private 인스턴스 변수 선언하기
    // name (String), age (int), studentId (String), gpa (double)
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    // TODO 2: 기본 생성자 구현하기
    public Student() {
        // name = "미정", age = 20, studentId = "S000000", gpa = 0.0으로 초기화
        // "기본 생성자로 학생 객체가 생성되었습니다." 출력
        this.name = "미정";
        this.age = 20;
        this.studentId = "S000000";
        this.gpa = 0.0;
        System.out.println("기본 생성자로 학생 객체가 생성되었습니다.");
    }

    // TODO 3: 이름만 받는 생성자 구현하기
    public Student(String name) {
        // this.name을 매개변수로 설정, age = 20, studentId = "S000000", gpa = 0.0
        // "[이름] 학생 객체가 생성되었습니다." 출력
        this.name = name;
        this.age = 20;
        this.studentId = "S000000";
        this.gpa = 0.0;
        System.out.println(name + " 학생 객체가 생성되었습니다.");
    }

    // TODO 4: 이름과 나이를 받는 생성자 구현하기
    public Student(String name, int age) {
        // name과 age를 매개변수로 설정, studentId = "S000000", gpa = 0.0
        // "[이름] ([나이]세) 학생 객체가 생성되었습니다." 출력
        this.name = name;
        this.age = age;
        this.studentId = "S000000";
        this.gpa = 0.0;
        System.out.println(name + " (" + age + "세) 학생 객체가 생성되었습니다.");
    }

    // TODO 5: 모든 정보를 받는 생성자 구현하기
    public Student(String name, int age, String studentId, double gpa) {
        // 모든 매개변수로 인스턴스 변수 초기화
        // "완전한 정보로 [이름] 학생 객체가 생성되었습니다." 출력
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        System.out.println("완전한 정보로 " + name + " 학생 객체가 생성되었습니다.");
    }

    // TODO 6: getter 메서드들 구현하기
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getStudentId() {
        return studentId;
    }
    public double getGpa() {
        return gpa;
    }

    // TODO 7: 학생 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "이름: [이름], 나이: [나이], 학번: [학번], GPA: [GPA]" 형식으로 출력
        System.out.println("이름: " + name + ", 나이: " + age + ", 학번: " + studentId + ", GPA: " + gpa);

    }
}


package j5.j5_5.person;

// 자식 클래스 1
public class Student extends Person {
    private String school;
    private int grade;

    public Student(String name, int age, String school, int grade) {
        // TODO 4: 부모 생성자 호출하고 school, grade 초기화하기
        // super() 사용
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    // 메서드 오버라이딩
    @Override
    public void introduce() {
        // TODO 5: 부모의 introduce() 호출 후 추가 정보 출력하기
        // super.introduce() 사용
        // "저는 [학교] [학년]학년입니다." 추가 출력
        super.introduce();
        System.out.println("저는 " + school + grade + "입니다.");
    }

    // 새로운 메서드 추가
    public void study() {
        // TODO 6: "[이름]이(가) 공부를 합니다." 출력하기
        System.out.println(name + "이(가) 공부를 합니다.");
    }
}


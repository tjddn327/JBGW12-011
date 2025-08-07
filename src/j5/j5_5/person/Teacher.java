package j5.j5_5.person;

// 자식 클래스 2
public class Teacher extends Person {
    private String subject;
    private int experience;

    public Teacher(String name, int age, String subject, int experience) {
        // TODO 7: 부모 생성자 호출하고 subject, experience 초기화하기
        super(name, age);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public void introduce() {
        // TODO 8: 부모의 introduce() 호출 후 추가 정보 출력하기
        // "저는 [과목] 과목을 [경력]년간 가르쳤습니다." 추가 출력
        super.introduce();
        System.out.println("저는 " + subject + "과목을 " + experience + "년간 가르쳤습니다.");
    }

    public void teach() {
        // TODO 9: "[이름] 선생님이 [과목]을(를) 가르칩니다." 출력하기
        System.out.println(name + "선생님이 " + subject + "을(를) 가르칩니다.");
    }
}


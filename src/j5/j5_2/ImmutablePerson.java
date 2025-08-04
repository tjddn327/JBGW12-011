package j5.j5_2;

/**
 * final 필드를 가진 불변 Person 클래스
 */
public class ImmutablePerson {
    // TODO 54: final 필드 선언하기
    private final String name;
    private final String socialId;
    private final int birthYear;
    private int age; // 변경 가능

    // TODO 55: 생성자 구현하기
    public ImmutablePerson(String name, String socialId, int birthYear) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }
        if (socialId == null || socialId.length() != 13) {
            throw new IllegalArgumentException("주민번호는 13자리여야 합니다.");
        }
        if (birthYear < 1900 || birthYear > 2023) {
            throw new IllegalArgumentException("출생연도가 유효하지 않습니다.");
        }

        this.name = name;
        this.socialId = socialId;
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;
    }

    // TODO 56: getter 메서드들 구현하기 (setter는 없음)
    public String getName() {
        return name;
    }

    public String getSocialId() {
        return socialId;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return age;
    }

    // TODO 57: age 업데이트 메서드 구현하기
    public void updateAge(int currentYear) {
        this.age = currentYear - birthYear;
    }

    // TODO 58: 새로운 객체를 반환하는 방식으로 "변경" 구현하기
    public ImmutablePerson withNewAge(int currentYear) {
        ImmutablePerson newPerson = new ImmutablePerson(this.name, this.socialId, this.birthYear);
        newPerson.updateAge(currentYear);
        return newPerson;
    }

    // TODO 59: 정보 출력 메서드 구현하기
    public void displayInfo() {
        String maskedId = socialId.substring(0, 6) + "-*******";
        System.out.println("이름: " + name + ", 주민번호: " + maskedId + ", 출생연도: " + birthYear + ", 나이: " + age);
    }
}

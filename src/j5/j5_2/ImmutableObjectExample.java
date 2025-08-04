package j5.j5_2;

// TODO 60: 사용 예제 완성하기
public class ImmutableObjectExample {
    public static void main(String[] args) {
        try {
            System.out.println("=== 불변 객체 예제 ===");

            // TODO 61: 불변 객체 생성하기
            // "김철수", "9001011234567", 1990으로 person 생성하고 정보 출력
            ImmutablePerson person = new ImmutablePerson("김철수", "9001011234567", 1990);
            person.displayInfo();

            // TODO 62: age 업데이트하기
            // 2024년 기준으로 나이 업데이트하고 정보 출력
            person.updateAge(2024);
            System.out.println("\n나이 업데이트 후:");
            person.displayInfo();

            // TODO 63: 새 객체 생성 방식 테스트하기
            // 2025년 기준으로 새 객체 생성
            // 원본 객체와 새 객체 정보 모두 출력
            ImmutablePerson newPerson = person.withNewAge(2025);

            System.out.println("\n새 객체 생성 후:");
            System.out.println("원본 객체:");
            person.displayInfo();

            System.out.println("새 객체:");
            newPerson.displayInfo();

        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}

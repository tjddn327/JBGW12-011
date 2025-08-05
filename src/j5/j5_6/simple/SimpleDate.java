package j5.j5_6.simple;

/**
 * 다양한 생성자를 제공하는 날짜 클래스
 */
public class SimpleDate {
    private int year;
    private int month;
    private int day;

    // 완전한 생성자
    public SimpleDate(int year, int month, int day) {
        // TODO 30: year, month, day 초기화하기
        // "날짜 생성: " + this 출력

        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("날짜 생성: " + toString());
    }

    // 년, 월만 지정 (일은 1일로)
    public SimpleDate(int year, int month) {
        // TODO 31: this()를 사용하여 완전한 생성자 호출하기
        // day는 1로 설정
        this.year = year;
        this.month = month;
        day = 1;
    }

    // 년만 지정 (1월 1일로)
    public SimpleDate(int year) {
        // TODO 32: this()를 사용하여 다른 생성자 호출하기
        // month는 1로 설정
        this.year = year;
        month = 1;
        day = 1;
    }

    // 오늘 날짜로 생성
    public SimpleDate() {
        // TODO 33: this()를 사용하여 기본 날짜(2024, 1, 20) 설정하기
        year = 2025;
        month = 8;
        day = 5;
    }

    @Override
    public String toString() {
        // TODO 34: "[year]년 [month]월 [day]일" 형식으로 반환하기
        return year + "년 " + month + "월 " + day + "일";
    }
}
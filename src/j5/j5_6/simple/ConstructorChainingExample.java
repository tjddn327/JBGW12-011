package j5.j5_6.simple;

// 테스트
public class ConstructorChainingExample {
    public static void main(String[] args) {
        // TODO 35: 다양한 생성자를 사용하여 SimpleDate 객체 생성하기
        // date1: 2024년 12월 25일
        // date2: 2024년 3월 1일
        // date3: 2024년 1월 1일
        // date4: 2024년 1월 20일
        SimpleDate s1 = new SimpleDate(2024,12,25);
        SimpleDate s2 = new SimpleDate(2024,3,1);
        SimpleDate s3 = new SimpleDate(2024,1,1);
        SimpleDate s4 = new SimpleDate();


        // TODO 36: 생성된 날짜들 출력하기

        System.out.println("date1: " + s1.toString());
        System.out.println("date2: " + s2.toString());
        System.out.println("date3: " + s3.toString());
        System.out.println("date4: " + s4.toString());
    }
}

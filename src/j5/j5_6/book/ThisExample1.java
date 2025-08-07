package j5.j5_6.book;

// 테스트
public class ThisExample1 {
    public static void main(String[] args) {
        // TODO 5: Book 객체 생성하고 출력하기
        // 제목: "자바의 정석", 저자: "남궁성", 페이지: 1000, 가격: 30000
        Book b = new Book("자바의 정석", "남궁성", 1000, 30000);
        System.out.println(b);
        // TODO 6: 제목을 "이펙티브 자바"로, 가격을 45000으로 변경하고 출력하기
        b.setTitle("이펙티브 자바");
        b.setPrice(45000);
        System.out.println(b);
    }
}
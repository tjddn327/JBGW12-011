package j5.j5_6.pizza;

// 테스트
public class BuilderPatternExample {
    public static void main(String[] args) {
        // TODO 64: 빌더 패턴을 사용하여 피자 3개 만들기
        // pizza1: Large, 페퍼로니, 버섯
        // pizza2: Medium, 치즈 없음, 양파
        // pizza3: Small, 기본 설정(치즈만)
        Pizza.Builder p1 = new Pizza.Builder("Large");
        Pizza.Builder p2 = new Pizza.Builder("Medium");
        Pizza.Builder p3 = new Pizza.Builder("Small");
        p1.cheese(true);
        p1.pepperoni(true);
        p1.mushrooms(true);
        p1.onions(false);
//        p2.cheese(false);
//        p3.cheese(true);



        // TODO 65: 주문한 피자들 출력하기
        System.out.println(p1.toString());
    }
}

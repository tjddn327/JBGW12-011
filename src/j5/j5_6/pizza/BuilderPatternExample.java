package j5.j5_6.pizza;

// 테스트
public class BuilderPatternExample {
    public static void main(String[] args) {
        // TODO 64: 빌더 패턴을 사용하여 피자 3개 만들기
        // pizza1: Large, 페퍼로니, 버섯
        // pizza2: Medium, 치즈 없음, 양파
        // pizza3: Small, 기본 설정(치즈만)
        Pizza p1 = new Pizza.Builder("Large")
                .pepperoni(true)
                .mushrooms(true)
                .build();
        Pizza p2 = new Pizza.Builder("Medium")
                .cheese(false)
                .onions(true)
                .build();
        Pizza p3 = new Pizza.Builder("Small")
                .build();

        // TODO 65: 주문한 피자들 출력하기
        System.out.println("주문한 피자:\n");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

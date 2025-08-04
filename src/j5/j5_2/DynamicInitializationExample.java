package j5.j5_2;

// TODO 35: 사용 예제 완성하기
public class DynamicInitializationExample {
    public static void main(String[] args) {
        System.out.println("=== 동적 초기화 테스트 ===");

        // TODO 36: 주사위 3개 생성하기
        // DynamicDice dice1, dice2, dice3 생성
        DynamicDice dice1 = new DynamicDice();
        DynamicDice dice2 = new DynamicDice();
        DynamicDice dice3 = new DynamicDice();

        // TODO 37: 주사위 굴리기
        System.out.println("\n=== 주사위 굴리기 ===");
        // 각 주사위의 roll() 메서드 호출
        dice1.roll();
        dice2.roll();
        dice3.roll();

        // TODO 38: 총 생성된 주사위 수 출력하기
        // "총 생성된 주사위 수: [개수]" 출력
        System.out.println("\n총 생성된 주사위 수: " + DynamicDice.getTotalDiceCount());
    }
}

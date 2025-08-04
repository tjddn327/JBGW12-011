package j5.j5_2;

import java.time.LocalTime;

/**
 * 동적 초기화를 보여주는 주사위 클래스
 */
public class DynamicDice {
    // TODO 31: 동적으로 초기화되는 인스턴스 변수 선언하기
    private int value = (int)(Math.random() * 6) + 1;
    private String createdTime = LocalTime.now().toString();
    private static int totalDiceCount = 0;
    private int diceNumber;

    // TODO 32: 생성자 구현하기
    public DynamicDice() {
        // totalDiceCount 증가
        totalDiceCount++;
        // diceNumber = totalDiceCount로 설정
        diceNumber = totalDiceCount;
        // "[번호]번째 주사위 생성 - 초기값: [값] (생성시간: [시간])" 출력
        System.out.println(diceNumber + "번째 주사위 생성 - 초기값: " + value + " (생성시간: " + createdTime + ")");
    }

    // TODO 33: getter 메서드들 구현하기
    public int getValue() {
        return value;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public int getDiceNumber() {
        return diceNumber;
    }

    public static int getTotalDiceCount() {
        return totalDiceCount;
    }

    // TODO 34: 주사위 굴리기 메서드 구현하기
    public void roll() {
        // value를 새로운 랜덤 값(1~6)으로 변경
        value = (int)(Math.random() * 6) + 1;
        // "[번호]번 주사위를 굴렸습니다: [값]" 출력
        System.out.println(diceNumber + "번 주사위를 굴렸습니다: " + value);
    }
}
package j5.j5_4;

import java.util.Random;

public class HighLowGameExample {
    public static void main(String[] args) {
        System.out.println("=== High-Low 카드 게임 ===");
        System.out.println("다음 카드가 현재 카드보다 높을지 낮을지 맞춰보세요!\n");

        HighLowGame game = new HighLowGame();
        Random rand = new Random();

        while (!game.isGameOver() && game.getScore() < 10) {
            Card current = game.getCurrentCard();
            System.out.println("현재 카드: " + current);

            // 랜덤 추측 (true면 높다, false면 낮다)
            boolean guessHigher = rand.nextBoolean();
            System.out.println("추측: 다음 카드가 더 " + (guessHigher ? "높다" : "낮다"));

            boolean result;
            if (guessHigher) {
                result = game.guessHigher();
            } else {
                result = game.guessLower();
            }

            Card nextCard = game.getCurrentCard();
            System.out.println("다음 카드: " + nextCard);

            if (result) {
                System.out.println("정답! 현재 점수: " + game.getScore() + "\n");
            } else {
                System.out.println("틀렸습니다! 게임 종료\n");
            }
        }

        System.out.println("최종 점수: " + game.getScore());
    }
}

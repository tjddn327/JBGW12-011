package j5.j5_4;

public class SimpleBlackjackExample {
    public static void main(String[] args) {
        System.out.println("=== 간단한 블랙잭 게임 ===\n");

        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        for (int round = 1; round <= 5; round++) {
            System.out.println("=== 라운드 " + round + " ===");

            Deck deck = new Deck();
            deck.shuffle();

            BlackjackHand playerHand = new BlackjackHand();
            BlackjackHand dealerHand = new BlackjackHand();

            // 초기 카드 2장씩 나누기
            playerHand.addCard(deck.dealCard());
            playerHand.addCard(deck.dealCard());
            dealerHand.addCard(deck.dealCard());
            dealerHand.addCard(deck.dealCard());

            // 플레이어 턴
            System.out.println("플레이어 카드:");
            for (int i = 0; i < playerHand.getCardCount(); i++) {
                System.out.println("  " + playerHand.getCard(i));
            }
            System.out.println("플레이어 합계: " + playerHand.getBlackjackValue() + "\n");

            // 딜러 카드 중 한 장 숨김
            System.out.println("딜러 카드:");
            System.out.println("  " + dealerHand.getCard(0));
            System.out.println("  [숨김]\n");

            // 플레이어가 17 이하이면 카드 더 받기
            while (playerHand.getBlackjackValue() <= 17) {
                if (deck.cardsLeft() == 0) break;
                Card newCard = deck.dealCard();
                System.out.println("플레이어가 카드를 받습니다: " + newCard);
                playerHand.addCard(newCard);
                System.out.println("플레이어 합계: " + playerHand.getBlackjackValue() + "\n");

                if (playerHand.getBlackjackValue() > 21) {
                    System.out.println("플레이어 버스트!\n");
                    break;
                }
            }

            // 딜러 턴 (숨겨진 카드 공개)
            System.out.println("딜러의 숨겨진 카드: " + dealerHand.getCard(1));
            System.out.println("딜러 합계: " + dealerHand.getBlackjackValue() + "\n");

            // 딜러가 16 이하면 카드 더 받기
            while (dealerHand.getBlackjackValue() <= 16) {
                if (deck.cardsLeft() == 0) break;
                Card newCard = deck.dealCard();
                System.out.println("딜러가 카드를 받습니다: " + newCard);
                dealerHand.addCard(newCard);
                System.out.println("딜러 합계: " + dealerHand.getBlackjackValue() + "\n");

                if (dealerHand.getBlackjackValue() > 21) {
                    System.out.println("딜러 버스트!\n");
                    break;
                }
            }

            // 승부 판정
            int playerVal = playerHand.getBlackjackValue();
            int dealerVal = dealerHand.getBlackjackValue();

            System.out.println("=== 결과 ===");
            if (playerVal > 21) {
                System.out.println("딜러 승리!\n");
                dealerWins++;
            } else if (dealerVal > 21) {
                System.out.println("플레이어 승리!\n");
                playerWins++;
            } else if (playerVal > dealerVal) {
                System.out.println("플레이어 승리!\n");
                playerWins++;
            } else if (playerVal < dealerVal) {
                System.out.println("딜러 승리!\n");
                dealerWins++;
            } else {
                System.out.println("무승부!\n");
                ties++;
            }
        }

        // 최종 통계
        System.out.println("=== 최종 결과 ===");
        System.out.println("플레이어 승리: " + playerWins);
        System.out.println("딜러 승리: " + dealerWins);
        System.out.println("무승부: " + ties);
    }
}

package j5.j5_4;

import java.util.Random;

public class Deck {
    private Card[] deck;     // 카드 배열
    private int cardsUsed;   // 사용된 카드 수
    private static final int TOTAL_CARDS = 52;
    private Random random = new Random();

    // TODO 10: 52장 카드 덱 생성자
    public Deck() {
        deck = new Card[TOTAL_CARDS];
        int index = 0;
        for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
            for (int value = Card.ACE; value <= Card.KING; value++) {
                deck[index] = new Card(value, suit);
                index++;
            }
        }
        cardsUsed = 0;
    }

    // TODO 11: Fisher-Yates 셔플
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);  // 0부터 i까지 랜덤 인덱스
            // 카드 교환
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
        cardsUsed = 0;  // 셔플하면 다시 다 남은 상태니까 0으로 초기화
    }

    // TODO 12: 남은 카드 수
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

    // TODO 13: 카드 한 장 나누기
    public Card dealCard() {
        if (cardsUsed == deck.length) {
            throw new IllegalStateException("모든 카드를 다 사용했습니다.");
        }
        Card card = deck[cardsUsed];
        cardsUsed++;
        return card;
    }

    // TODO 14: 조커 포함 여부 (기본덱은 조커 없음)
    public boolean hasJoker() {
        return false;
    }
}

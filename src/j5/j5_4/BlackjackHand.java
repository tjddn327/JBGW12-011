package j5.j5_4;
/**
 * 블랙잭 스타일 손패 (에이스를 유연하게 처리)
 */
public class BlackjackHand extends Hand {

    /**
     * 블랙잭에서의 손패 값 계산
     */
    public int getBlackjackValue() {
        int val = 0;
        boolean ace = false;

        for (int i = 0; i < getCardCount(); i++) {
            Card card = getCard(i);
            int cardVal = card.getValue();

            if (cardVal > 10) {
                cardVal = 10;   // J, Q, K는 10으로 계산
            }
            if (cardVal == 1) {
                ace = true;     // 에이스 발견
            }
            val = val + cardVal;
        }

        // 에이스가 있고 11로 계산해도 21을 넘지 않으면
        if (ace && val + 10 <= 21) {
            val = val + 10;
        }

        return val;
    }
}
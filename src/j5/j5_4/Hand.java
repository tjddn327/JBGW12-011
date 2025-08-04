package j5.j5_4;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    // TODO 19: 생성자 - 빈 손패 생성
    public Hand() {
        hand = new ArrayList<>();
    }

    // TODO 20: 손패 비우기
    public void clear() {
        hand.clear();
    }

    // TODO 21: 카드 추가
    public void addCard(Card c) {
        if (c == null) {
            throw new NullPointerException("카드는 null일 수 없습니다.");
        }
        hand.add(c);
    }

    // TODO 22: 특정 카드 제거
    public void removeCard(Card c) {
        hand.remove(c);
    }

    // TODO 23: 특정 위치의 카드 제거
    public void removeCard(int position) {
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("유효하지 않은 위치입니다.");
        }
        hand.remove(position);
    }

    // TODO 24: 카드 수 반환
    public int getCardCount() {
        return hand.size();
    }

    // TODO 25: 특정 위치 카드 반환
    public Card getCard(int position) {
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("유효하지 않은 위치입니다.");
        }
        return hand.get(position);
    }

    // TODO 26: 무늬별 정렬 (선택 정렬)
    public void sortBySuit() {
        ArrayList<Card> sorted = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                Card c2 = hand.get(minIndex);
                // 무늬가 더 작거나, 무늬 같으면 값 비교
                if (c1.getSuit() < c2.getSuit() ||
                        (c1.getSuit() == c2.getSuit() && c1.getValue() < c2.getValue())) {
                    minIndex = i;
                }
            }
            sorted.add(hand.remove(minIndex));
        }
        hand = sorted;
    }

    // TODO 27: 값별 정렬 (선택 정렬)
    public void sortByValue() {
        ArrayList<Card> sorted = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                Card c2 = hand.get(minIndex);
                // 값이 더 작거나, 값 같으면 무늬 비교
                if (c1.getValue() < c2.getValue() ||
                        (c1.getValue() == c2.getValue() && c1.getSuit() < c2.getSuit())) {
                    minIndex = i;
                }
            }
            sorted.add(hand.remove(minIndex));
        }
        hand = sorted;
    }
}

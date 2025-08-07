package j7.J7_5;

import java.util.Arrays;

public class CardShuffleExample {
    static class Card {
        String suit;  // 무늬: ♠, ♥, ♦, ♣
        String rank;  // 숫자: A, 2-10, J, Q, K

        Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return suit + rank;
        }
    }

    public static void main(String[] args) {
        // 52장의 카드 덱 생성
        Card[] deck = createDeck();

        System.out.println("새 덱 (정렬된 상태):");
        printDeck(deck, 13);  // 한 줄에 13장씩 출력

        // 카드 섞기
        shuffleDeck(deck);

        System.out.println("\n섞은 후:");
        printDeck(deck, 13);

        // 카드 나누기 (4명의 플레이어에게 5장씩)
        System.out.println("\n=== 카드 나누기 (4명 × 5장) ===");
        dealCards(deck, 4, 5);
    }

    public static Card[] createDeck() {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        Card[] deck = new Card[52];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = new Card(suit, rank);
            }
        }

        return deck;
    }

    public static void shuffleDeck(Card[] deck) {
        for (int i = deck.length - 1; i > 0; i--) {
            int randomIndex = (int)(Math.random() * (i + 1));

            // 카드 교환
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static void printDeck(Card[] deck, int cardsPerLine) {
        for (int i = 0; i < deck.length; i++) {
            System.out.printf("%-4s", deck[i]);
            if ((i + 1) % cardsPerLine == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void dealCards(Card[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("카드가 부족합니다.");
            return;
        }
        for (int player = 1; player <= players; player++) {
            System.out.printf("플레이어 %d: ", player);

            for (int card = 0; card < cardsPerPlayer; card++) {
                int cardIndex = (player - 1) * cardsPerPlayer + card;
                System.out.printf("%-4s", deck[cardIndex]);
            }
            System.out.println();
        }
    }
}
package j5.j5_4;

public class HandExample {
    public static void main(String[] args) {
        System.out.println("=== 카드 5장 받기 ===");

        // TODO 28: 덱과 손 생성 후 셔플
        Deck deck = new Deck();
        deck.shuffle();
        Hand hand = new Hand();

        // TODO 29: 카드 5장 받기
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            hand.addCard(card);
            System.out.println("받은 카드: " + card);
        }

        // TODO 30: 손에 있는 카드 수 출력
        System.out.println("\n손에 있는 카드 수: " + hand.getCardCount());

        // TODO 31: 무늬별 정렬 후 출력
        System.out.println("\n=== 무늬별로 정렬 ===");
        hand.sortBySuit();
        for (int i = 0; i < hand.getCardCount(); i++) {
            System.out.println("카드 " + (i + 1) + ": " + hand.getCard(i));
        }

        // TODO 32: 값별 정렬 후 출력
        System.out.println("\n=== 값별로 정렬 ===");
        hand.sortByValue();
        for (int i = 0; i < hand.getCardCount(); i++) {
            System.out.println("카드 " + (i + 1) + ": " + hand.getCard(i));
        }
    }
}

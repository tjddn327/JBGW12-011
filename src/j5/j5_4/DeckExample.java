package j5.j5_4;

public class DeckExample {
    public static void main(String[] args) {
        System.out.println("셔플된 덱에서 카드 5장 뽑기:");

        // TODO 15: 덱 생성 및 셔플
        Deck deck = new Deck();
        deck.shuffle();

        // TODO 16: 카드 5장 뽑기 및 출력
        for (int i = 1; i <= 5; i++) {
            Card card = deck.dealCard();
            System.out.println("카드 " + i + ": " + card);
        }

        // TODO 17: 남은 카드 수 출력
        System.out.println("\n남은 카드: " + deck.cardsLeft() + "장");

        // TODO 18: 다시 셔플
        System.out.println("\n덱을 다시 셔플합니다...");
        deck.shuffle();
        System.out.println("다시 셔플 후 남은 카드: " + deck.cardsLeft() + "장");
    }
}

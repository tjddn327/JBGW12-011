package j5.j5_4;

public class CardExample {
    public static void main(String[] args) {
        // TODO 7: 카드 생성
        Card card1 = new Card(Card.ACE, Card.SPADES);
        Card card2 = new Card(Card.KING, Card.HEARTS);
        Card card3 = new Card(7, Card.DIAMONDS);

        // TODO 8: 카드 출력
        System.out.println("카드 1: " + card1);
        System.out.println("카드 2: " + card2);
        System.out.println("카드 3: " + card3);

        // TODO 9: 카드1 세부 정보 출력
        System.out.println("\n카드 1의 값: " + card1.getValue());
        System.out.println("카드 1의 무늬: " + card1.getSuitAsString());
    }
}

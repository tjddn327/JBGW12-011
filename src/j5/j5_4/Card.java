package j5.j5_4;

public class Card {

    // 무늬 상수
    public final static int SPADES = 0;   // 스페이드
    public final static int HEARTS = 1;   // 하트
    public final static int DIAMONDS = 2; // 다이아몬드
    public final static int CLUBS = 3;    // 클럽

    // 값 상수
    public final static int ACE = 1;      // 에이스
    public final static int JACK = 11;    // 잭
    public final static int QUEEN = 12;   // 퀸
    public final static int KING = 13;    // 킹

    // 필드
    private final int suit;   // 무늬
    private final int value;  // 값

    // TODO 1: 생성자
    public Card(int theValue, int theSuit) {
        this.value = theValue;
        this.suit = theSuit;
    }

    // TODO 2: 값 반환
    public int getValue() {
        return value;
    }

    // TODO 3: 무늬 반환
    public int getSuit() {
        return suit;
    }

    // TODO 4: 무늬를 문자열로 반환
    public String getSuitAsString() {
        switch (suit) {
            case SPADES:
                return "스페이드";
            case HEARTS:
                return "하트";
            case DIAMONDS:
                return "다이아몬드";
            case CLUBS:
                return "클럽";
            default:
                return "??";
        }
    }

    // TODO 5: 값을 문자열로 반환
    public String getValueAsString() {
        switch (value) {
            case ACE:
                return "에이스";
            case JACK:
                return "잭";
            case QUEEN:
                return "퀸";
            case KING:
                return "킹";
            default:
                if (value >= 2 && value <= 10) {
                    return Integer.toString(value);
                } else {
                    return "??";
                }
        }
    }

    // TODO 6: toString() 오버라이드
    @Override
    public String toString() {
        return getValueAsString() + " " + getSuitAsString();
    }
}

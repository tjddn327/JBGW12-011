package j5.j5_4;

public class HighLowGame {
    private Deck deck;
    private Card currentCard;
    private int correctGuesses;
    private boolean gameOver;

    // TODO 33: 게임 초기화
    public HighLowGame() {
        deck = new Deck();
        deck.shuffle();
        currentCard = deck.dealCard();
        correctGuesses = 0;
        gameOver = false;
    }

    // TODO 34: 현재 카드 반환
    public Card getCurrentCard() {
        return currentCard;
    }

    // TODO 35: 게임 종료 여부 반환
    public boolean isGameOver() {
        return gameOver;
    }

    // TODO 36: 점수 반환
    public int getScore() {
        return correctGuesses;
    }

    // TODO 37: "다음 카드가 더 높다" 추측
    public boolean guessHigher() {
        if (gameOver) return false;

        if (deck.cardsLeft() == 0) {
            gameOver = true;
            return false;
        }

        Card nextCard = deck.dealCard();
        boolean correct = nextCard.getValue() > currentCard.getValue();
        if (correct) {
            correctGuesses++;
        } else {
            gameOver = true;
        }
        currentCard = nextCard;
        return correct;
    }

    // TODO 38: "다음 카드가 더 낮다" 추측
    public boolean guessLower() {
        if (gameOver) return false;

        if (deck.cardsLeft() == 0) {
            gameOver = true;
            return false;
        }

        Card nextCard = deck.dealCard();
        boolean correct = nextCard.getValue() < currentCard.getValue();
        if (correct) {
            correctGuesses++;
        } else {
            gameOver = true;
        }
        currentCard = nextCard;
        return correct;
    }
}

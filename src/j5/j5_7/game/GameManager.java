package j5.j5_7.game;

// 게임 관리자
public class GameManager implements GameConstants {
    private GameCharacter[] players;
    private int gameState;
    private int playerCount;

    public GameManager() {
        // TODO 25: 게임 매니저 초기화하기
        // players를 MAX_PLAYERS 크기로 생성
        // gameState를 STATE_WAITING으로 설정
        // playerCount를 0으로 설정
        players = new GameCharacter[MAX_PLAYERS];
        gameState = STATE_WAITING;
        playerCount = 0;
    }

    public void addPlayer(GameCharacter player) {
        // TODO 26: 플레이어 추가하기
        // playerCount < MAX_PLAYERS이면 players 배열에 추가
        // playerCount 증가
        if(playerCount < MAX_PLAYERS) {
            players[playerCount] = player;
            playerCount++;
        }
    }

    public void startGame() {
        // TODO 27: 게임 시작하기
        // playerCount >= MIN_PLAYERS이면:
        //   gameState를 STATE_PLAYING으로 변경
        //   "게임 시작!" 출력
        // 아니면:
        //   "최소 [MIN_PLAYERS]명이 필요합니다." 출력
        if(playerCount >= MIN_PLAYERS) {
            gameState = STATE_PLAYING;
            System.out.println("게임 시작!");
        }else{
            System.out.println("최소 " + MIN_PLAYERS + "명이 필요합니다.");
        }
    }

    private int getPlayerCount() {
        return playerCount;
    }
}
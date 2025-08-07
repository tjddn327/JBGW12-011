package j5.j5_7.game;

/**
 * 게임 설정을 위한 상수 인터페이스
 */
public interface GameConstants {
    // 게임 설정 상수들 (모두 public static final)
    int MAX_PLAYERS = 4;
    int MIN_PLAYERS = 2;

    int BOARD_WIDTH = 10;
    int BOARD_HEIGHT = 10;

    int INITIAL_HEALTH = 100;
    int INITIAL_MANA = 50;

    // 게임 상태
    int STATE_WAITING = 0;
    int STATE_PLAYING = 1;
    int STATE_PAUSED = 2;
    int STATE_GAME_OVER = 3;

    // 방향
    int DIRECTION_UP = 0;
    int DIRECTION_RIGHT = 1;
    int DIRECTION_DOWN = 2;
    int DIRECTION_LEFT = 3;
}
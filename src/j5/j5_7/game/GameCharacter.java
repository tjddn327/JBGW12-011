package j5.j5_7.game;

// 게임 캐릭터 인터페이스
public interface GameCharacter extends GameConstants {
    void move(int direction);
    void attack(GameCharacter target);
    int getHealth();
    int getMana();
    boolean isAlive();
}
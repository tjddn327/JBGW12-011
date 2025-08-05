package j5.j5_7.game;

// 테스트
public class GameTest {
    public static void main(String[] args) {
        // TODO 28: GameManager 생성하기
        GameManager gm = new GameManager();
        // TODO 29: Player 생성하고 추가하기
        // "용사"와 "마법사" 플레이어 생성
        // GameManager에 추가
        Player p1 = new Player("용사");
        Player p2 = new Player("마법사");
        gm.addPlayer(p1);
        gm.addPlayer(p2);

        // TODO 30: 게임 시작 시도하기
        gm.startGame();

        // TODO 31: 플레이어들 이동시키기
        // 용사는 UP, RIGHT로 이동
        // 마법사는 DOWN, LEFT로 이동
        p1.move(GameConstants.DIRECTION_UP);
        p1.move(GameConstants.DIRECTION_RIGHT);
        p2.move(GameConstants.DIRECTION_DOWN);
        p2.move(GameConstants.DIRECTION_LEFT);

        // TODO 32: 서로 공격하기
        // 용사가 마법사를 공격
        // 마법사가 용사를 공격
        p1.attack(p2);
        p2.attack(p1);
    }
}
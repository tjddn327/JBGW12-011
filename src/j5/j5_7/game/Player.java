package j5.j5_7.game;

// 플레이어 구현
public class Player implements GameCharacter {
    private String name;
    private int health;
    private int mana;
    private int x, y;

    public Player(String name) {
        // TODO 19: 플레이어 초기화하기
        // name 설정
        // health를 INITIAL_HEALTH로 초기화
        // mana를 INITIAL_MANA로 초기화
        // x, y를 보드 중앙으로 설정 (BOARD_WIDTH/2, BOARD_HEIGHT/2)
        this.name = name;
        this.health = INITIAL_HEALTH;
        this.mana = INITIAL_MANA;
        x = BOARD_WIDTH/2;
        y = BOARD_HEIGHT/2;
    }

    @Override
    public void move(int direction) {
        // TODO 20: 방향에 따라 이동하기
        // DIRECTION_UP: y > 0이면 y--
        // DIRECTION_DOWN: y < BOARD_HEIGHT - 1이면 y++
        // DIRECTION_LEFT: x > 0이면 x--
        // DIRECTION_RIGHT: x < BOARD_WIDTH - 1이면 x++
        // "[name] 이동: (x, y)" 출력
        if (y > 0 && direction == DIRECTION_UP) {
            y--;
        }
        if (y < BOARD_HEIGHT -1 && direction == DIRECTION_DOWN) {
            y++;
        }
        if(x>0 && direction == DIRECTION_LEFT){
            x--;
        }
        if (x < BOARD_WIDTH -1 && direction == DIRECTION_RIGHT) {
            x++;
        }
        System.out.println(name + "이동: (" + x + "," + y + ")");
    }

    @Override
    public void attack(GameCharacter target) {
        // TODO 21: 공격 구현하기
        // "[name]이(가) 공격!" 출력
        System.out.println(name + "이(가) 공격!");
        if (target instanceof Player) {
            Player p = (Player) target;
            p.health -= 10;
            if (p.health < 0) p.health = 0;
        }
    }

    @Override
    public int getHealth() {
        // TODO 22: health 반환하기
        return health;
    }

    @Override
    public int getMana() {
        // TODO 23: mana 반환하기
        return mana;
    }

    @Override
    public boolean isAlive() {
        // TODO 24: health > 0인지 반환하기
        return health > 0;
    }
}
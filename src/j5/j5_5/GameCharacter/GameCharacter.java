package j5.j5_5.GameCharacter;

/**
 * 다형성을 활용한 게임 캐릭터 시스템
 */
public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int level;
    protected int attackPower;

    public GameCharacter(String name, int maxHealth, int attackPower) {
        // TODO 52: 필드 초기화하기
        // name, maxHealth, attackPower 초기화
        // health = maxHealth, level = 1로 설정
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackPower = attackPower;
        health = maxHealth;
        level = 1;
    }

    // 추상 메서드들
    public abstract void attack(GameCharacter target);
    public abstract void useSpecialSkill(GameCharacter target);
    public abstract String getClassName();

    // 공통 메서드들
    public void takeDamage(int damage) {
        // TODO 53: 피해 입기 구현하기
        // health에서 damage 차감 (0 미만이면 0으로)
        // "[이름]이(가) [피해]의 피해를 입었습니다! (남은 체력: [체력])" 출력
        // health가 0이면 "[이름]이(가) 쓰러졌습니다!" 추가 출력
        if(damage < 0){
            damage = 0;
            System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다! (남은 체력: " + health + ")");
            return;
        }
        health -= damage;
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다! (남은 체력: " + health + ")");
        if(health == 0){
            System.out.println(name + "이(가) 쓰러졌습니다!");
        }
    }

    public void heal(int amount) {
        // TODO 54: 체력 회복 구현하기
        // health에 amount 추가 (maxHealth 초과 시 maxHealth로)
        // "[이름]이(가) [회복량]의 체력을 회복했습니다! (현재 체력: [체력])" 출력
        if((health+=amount) > maxHealth){
            health = maxHealth;
        }else{
            health += amount;
        }
        System.out.println(name + "이(가) " + amount + "의 체력을 회복했습니다! (현재 체력: " + health + ")");

    }

    public boolean isAlive() {
        // TODO 55: 생존 여부 반환하기
        if(health <= 0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        // TODO 56: 캐릭터 정보 문자열 반환하기
        // "[이름] (Lv.[레벨] [직업]) - HP: [현재체력]/[최대체력], 공격력: [공격력]"
        return name + "(Lv." + level + getClassName() + ") - HP: " + health + "/" + maxHealth + ", 공격력: ";
    }
}
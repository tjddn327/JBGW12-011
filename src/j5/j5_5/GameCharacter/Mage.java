package j5.j5_5.GameCharacter;

// 마법사 클래스
public class Mage extends GameCharacter {
    private int mana;
    private int maxMana;

    public Mage(String name) {
        // TODO 62: 부모 생성자 호출하기
        // maxHealth: 80, attackPower: 15
        // maxMana = 100, mana = maxMana로 초기화
        super(name, 80, 15);
        this.maxMana = 100;
        this.mana = maxMana;
    }

    @Override
    public void attack(GameCharacter target) {
        // TODO 63: 마법 공격 구현하기
        // mana >= 10이면:
        //   "[이름]이(가) [대상이름]에게 파이어볼을 시전합니다!" 출력
        //   target.takeDamage(attackPower + 10) 호출
        //   mana -= 10
        // 아니면:
        //   "[이름]의 마나가 부족합니다! 기본 공격을 합니다." 출력
        //   target.takeDamage(attackPower) 호출
        if(mana>=10){
            System.out.println(name + "이(가) " + target.name + "에게 파이어볼을 시전합니다!");
            target.takeDamage(attackPower + 10);
            mana -= 10;
        }else{
            System.out.println(name + "의 마나가 부족합니다! 기본공격을 합니다.");
            target.takeDamage(attackPower);
        }
    }

    @Override
    public void useSpecialSkill(GameCharacter target) {
        // TODO 64: 메테오 스킬 구현하기
        // mana >= 30이면:
        //   "[이름]이(가) 메테오를 시전합니다!" 출력
        //   specialDamage = attackPower * 3
        //   target.takeDamage(specialDamage) 호출
        //   mana -= 30
        // 아니면:
        //   "마나가 부족합니다!" 출력
        if(mana>=30){
            System.out.println(name + "이(가) 메테오를 시전합니다!");
            int specialDamage = attackPower * 3;
            target.takeDamage(specialDamage);
            mana -= 30;
        }else {
            System.out.println("마나가 부족합니다!");
        }
    }

    @Override
    public String getClassName() {
        // TODO 65: "마법사" 반환하기
        return "마법사";
    }
}
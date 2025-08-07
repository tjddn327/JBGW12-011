package j5.j5_5.GameCharacter;

// 전사 클래스
public class Warrior extends GameCharacter {
    private int armor;

    public Warrior(String name) {
        // TODO 57: 부모 생성자 호출하기
        // maxHealth: 150, attackPower: 20
        // armor = 10으로 초기화
        super(name, 150, 20);
        this.armor = 10;
    }

    @Override
    public void attack(GameCharacter target) {
        // TODO 58: 기본 공격 구현하기
        // "[이름]이(가) [대상이름]을(를) 검으로 공격합니다!" 출력
        // target.takeDamage(attackPower) 호출
        System.out.println(name + "이(가) " + target + "을(를) 검으로 공격합니다!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useSpecialSkill(GameCharacter target) {
        // TODO 59: 특수 스킬 구현하기
        // "[이름]이(가) 광폭화를 사용합니다!" 출력
        // specialDamage = attackPower * 2
        // target.takeDamage(specialDamage) 호출
        System.out.println(name + "이(가) 광폭화를 사용합니다!");
        int specialDamage = attackPower * 2;
        target.takeDamage(specialDamage);
    }

    @Override
    public void takeDamage(int damage) {
        // TODO 60: 방어구 효과 적용하여 피해 입기
        // reducedDamage = damage - armor (최소 0)
        // "[이름]의 방어구가 [감소량]의 피해를 막았습니다!" 출력
        // super.takeDamage(reducedDamage) 호출
        int reducedDamage;
        if((damage - armor) <= 0){
            reducedDamage = 0;
        }else{
            reducedDamage = damage - armor;
        }
        System.out.println(name + "의 방어구가 " + reducedDamage + "의 피해를 막았습니다!");
        super.takeDamage(reducedDamage);
    }

    @Override
    public String getClassName() {
        // TODO 61: "전사" 반환하기
        return "전사";
    }
}
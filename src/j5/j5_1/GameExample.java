package j5.j5_1;

// 사용 예제
public class GameExample {
    public static void main(String[] args) {
        // 게임 정보 표시 (객체 생성 전)
        GameCharacter.showGameInfo();

        // 캐릭터 생성
        GameCharacter warrior = new GameCharacter("전사");
        GameCharacter mage = new GameCharacter("마법사");
        GameCharacter archer = new GameCharacter("궁수");

        // 게임 정보 다시 표시
        GameCharacter.showGameInfo();

        // 캐릭터 플레이
        warrior.gainExperience(150);
        warrior.gainExperience(200);
        warrior.showStatus();

        mage.gainExperience(300);
        mage.showStatus();

        System.out.println("\n총 캐릭터 수: " + GameCharacter.totalCharacters);
    }
}
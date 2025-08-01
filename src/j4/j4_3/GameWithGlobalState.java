package j4.j4_3;

public class GameWithGlobalState {
    // TODO 85: 게임 상태 전역 변수들 선언하기
    static int gameCount = 1;
    static int playerWins = 0;
    static int comWins = 0;

    public static void main(String[] args) {
        System.out.println("=== 주사위 게임 (전역 변수 사용) ===\n");

        // TODO 86: 게임 진행하기
        playRound();
        playRound();
        playRound();
        playRound();
        playRound();

        // TODO 87: 최종 결과 출력하기
        showFinalResult();
    }

    // TODO 88: 한 라운드 플레이 메서드 구현하기
    static void playRound() {
        int a = rollDice();
        int b = rollDice();
        System.out.println("=== 라운드" + gameCount + " ===");
        gameCount++;
        System.out.println("플레이어: " + a);
        System.out.println("컴퓨터: " + b);
        if(a>b){
            System.out.println("플레이어 승리!");
            playerWins++;
        }else if(a<b){
            System.out.println("컴퓨터 승리!");
            comWins++;
        }
        showCurrentScore();
    }

    // TODO 89: 주사위 굴리기 메서드 구현하기
    static int rollDice() {
        return (int)(Math.random()*6)+1;
    }

    // TODO 90: 현재 점수 출력 메서드 구현하기
    static void showCurrentScore() {
        System.out.println("현재 점수 - 플레이어: " + playerWins + ", 컴퓨터: " + comWins);
    }

    // TODO 91: 최종 결과 출력 메서드 구현하기
    static void showFinalResult() {
        System.out.println("=== 최종 결과 ===");
        System.out.println("플레이어: " + playerWins + "승");
        System.out.println("컴퓨터: " + comWins + "승");
        if(playerWins > comWins){
            System.out.println("축하합니다! 당신이 이겼습니다!");
        }else if(playerWins < comWins){
            System.out.println("컴퓨터에게 졌네요 다음기회에...");
        }
    }
}
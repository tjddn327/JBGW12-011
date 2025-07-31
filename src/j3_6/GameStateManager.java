package j3_6;

enum GameState {
    MAIN_MENU, LOADING, PLAYING, PAUSED, GAME_OVER, SETTINGS
}

enum PlayerAction {
    MOVE_UP, MOVE_DOWN, MOVE_LEFT, MOVE_RIGHT, ATTACK, DEFEND, PAUSE
}

public class GameStateManager {
    private GameState currentState = GameState.MAIN_MENU;

    public static void main(String[] args) {
        GameStateManager game = new GameStateManager();

        // 상태 전환 시뮬레이션
        game.handleStateTransition(GameState.LOADING);
        game.handleStateTransition(GameState.PLAYING);
        game.handlePlayerAction(PlayerAction.PAUSE);
        game.handlePlayerAction(PlayerAction.MOVE_UP);
    }

    public void handleStateTransition(GameState newState) {
        System.out.println("\n=== 상태 전환: " + currentState + " → " + newState + " ===");

        // TODO: 이전 상태 정리
        // 힌트: switch문 사용

        // 여기에 코드를 작성하세요

        switch (newState) {
            case LOADING -> {System.out.println("메인 메뉴 정리\n⏳ 게임 데이터 로딩\n진행률 표시");}
            case PLAYING -> {System.out.println("로딩 화면 종료\n\uD83C\uDFAE 게임 플레이 시작\nUI 활성화");}
            case PAUSED -> {System.out.println("게임 일시정지\n⏸\uFE0F 게임 일시정지\n일시정지 메뉴 표시");}
        }

        // TODO: 새 상태 초기화
        // 힌트: switch문 사용
        currentState = newState;

        // 여기에 코드를 작성하세요


    }

    public void handlePlayerAction(PlayerAction action) {
        System.out.println("\n플레이어 액션: " + action);

        // TODO: 상태별 플레이어 액션 처리
        // 힌트: 중첩 switch문

        // 여기에 코듍를 작성하세요
        switch (action) {
            case MOVE_UP -> {
                System.out.println("게임이 일시정지 상태입니다.");
            }
            case PAUSE -> {
                handleStateTransition(GameState.PAUSED);
            }
        }
    }
}

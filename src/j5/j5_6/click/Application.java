package j5.j5_6.click;

// 애플리케이션 클래스
class Application implements ClickListener {
    private Button saveButton;
    private Button cancelButton;

    public Application() {
        // TODO 15: 버튼들 생성하기
        // saveButton: "저장"
        // cancelButton: "취소"
        saveButton = new Button("저장");
        cancelButton = new Button("취소");

        // TODO 16: 리스너 등록하기
        // this를 리스너로 등록

    }

    @Override
    public void onClick(Button source) {
        // TODO 17: source가 어떤 버튼인지 확인하고 처리하기
        // saveButton: "저장 작업을 수행합니다." 출력
        // cancelButton: "작업을 취소합니다." 출력
    }

    public void run() {
        // TODO 65-1: 버튼들 클릭하기
        // saveButton.click()
        // cancelButton.click()
        saveButton.click();
        cancelButton.click();
    }
}
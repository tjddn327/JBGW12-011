package j5.j5_7.event;

// 애플리케이션 - 이벤트 처리
public class Application {
    private Button saveButton;
    private Button cancelButton;

    public Application() {
        // TODO 83: 버튼 생성하기
        // saveButton: "저장"
        // cancelButton: "취소"
        saveButton = new Button("저장");
        cancelButton = new Button("취소");

        // TODO 84: 저장 버튼에 클릭 리스너 등록하기
        // ClickListener 구현체 생성 (익명 클래스)
        // onClick에서 "저장 버튼 클릭!" 출력하고 save() 호출
        saveButton.addEventListener("click", new ClickListener() {
            @Override
            public void onClick(Event event) {
                System.out.println("저장 버튼 클릭!");
                save();
            }
        });

        // TODO 85: 취소 버튼에 클릭 리스너 등록하기
        // 람다 표현식 사용
        // "취소 버튼 클릭!" 출력하고 cancel() 호출
        cancelButton.addEventListener("click", (Event event) -> {
            System.out.println("취소 버튼 클릭!");
            cancel();
        });



    }

    private void save() {
        System.out.println("데이터를 저장합니다...");
    }

    private void cancel() {
        System.out.println("작업을 취소합니다...");
    }

    public void run() {
        // TODO 86: 버튼 클릭 시뮬레이션하기
         saveButton.click();
         cancelButton.click();
    }

    public static void main(String[] args) {
        // TODO 87: Application 실행하기
        // Application 객체 생성하고 run() 호출
        Application app = new Application();
        app.run();
    }
}
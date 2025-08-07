package j5.j5_8.custom;

// 테스트
class ButtonTest {
    public static void main(String[] args) {
        // TODO 59: CustomButton 생성하기 (텍스트: "확인")
        CustomButton button = new CustomButton("확인");

        // TODO 60: 익명 클래스로 ClickListener 추가하기
        // onClick에서 "버튼 클릭됨: " + event 출력
        button.addClickListener(new CustomButton.ClickListener() {
            @Override
            public void onClick(CustomButton.ClickEvent event) {
                System.out.println("버튼 클릭됨: " + event);
            }
        });

        // TODO 61: 람다 표현식으로 ClickListener 추가하기
        // "람다 리스너: [button text] 클릭!" 출력
        button.addClickListener(event -> {
            System.out.println("람다 리스너: " + event.getButtonText() + " 클릭!");
        });

        // TODO 62: 버튼 클릭하기 (100, 50)
        button.click(100, 50);

        // TODO 63: 버튼 비활성화 후 다시 클릭하기
        button.setEnabled(false);
        button.click(100, 50);
    }
}

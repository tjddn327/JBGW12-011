package j5.j5_6.click;

// 버튼 클래스
class Button {
    private String label;
    private ClickListener listener;

    public Button(String label) {
        this.label = label;
    }

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println(label + " 버튼이 클릭되었습니다.");
        // TODO 14: listener가 null이 아니면 onClick 호출하기
        // this를 매개변수로 전달
        if(listener != null) {
            listener.onClick(this);
        }
    }

    public String getLabel() {
        return label;
    }
}
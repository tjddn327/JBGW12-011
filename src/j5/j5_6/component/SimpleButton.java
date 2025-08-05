package j5.j5_6.component;

// 버튼 클래스
class SimpleButton extends Component {
    private String text;

    public SimpleButton(int x, int y, int width, int height, String text) {
        super(x, y, width, height);
        this.text = text;
    }

    public SimpleButton(int x, int y, String text) {
        // TODO 49: this()를 사용하여 기본 크기(100, 30) 설정하기
        super(x, y, 100, 30);
        this.text = text;
    }

    @Override
    public void draw() {
        // TODO 50: "Button [[text]] at ([x], [y])" 형식으로 출력하기
        System.out.println("Button [" + text + "] at (" + x + "," + y + ")");
    }

    public void click() {
        System.out.println(text + " 버튼이 클릭 되었습니다.");
        highlight();
    }

    private void highlight() {
        // TODO 51: "[text] 버튼 하이라이트" 출력 후 redraw() 호출하기
        System.out.println(text + " 버튼 하이라이트");
        redraw();
    }
}
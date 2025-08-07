package j5.j5_6.component;

// 텍스트 필드 클래스
class TextField extends Component {
    private String value;
    private String placeholder;

    public TextField(int x, int y, int width, String placeholder) {
        super(x, y, width, 25);  // 높이는 고정
        this.placeholder = placeholder;
        this.value = "";
    }

    public void setText(String value) {
        // TODO 52: value 설정하고 redraw() 호출하기
        this.value = value;
        redraw();
    }

    @Override
    public void draw() {
        // TODO 53: value가 비어있으면 placeholder, 아니면 value 표시하기
        // "TextField [[display]] at ([x], [y])" 형식으로 출력
        String display = (value.isEmpty()) ? placeholder : value;
        System.out.println("TextField [" + display + "] at (" + x + ", " + y + ")");
    }
}
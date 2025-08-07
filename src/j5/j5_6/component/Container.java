package j5.j5_6.component;

// 컨테이너 클래스
class Container extends Component {
    protected Component[] children;
    protected int childCount;

    public Container(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.children = new Component[10];
        this.childCount = 0;
    }

    public void add(Component child) {
        // TODO 46: 자식 컴포넌트 추가하기
        // childCount가 배열 크기보다 작으면:
        //   - children 배열에 child 추가
        //   - childCount 증가
        //   - child.setParent(this) 호출
        if(this.childCount < this.children.length) {
            children[childCount] = child;
            childCount++;
            child.setParent(this);
        }

    }

    @Override
    public void draw() {
        System.out.println("Container 그리기 at (" + x + ", " + y + ")");
        // TODO 47: 모든 자식 컴포넌트 그리기
        // childCount만큼 반복하면서 children[i].redraw() 호출
        for(int i = 0; i < childCount; i++) {
            children[i].draw();
        }
    }

    @Override
    public void redraw() {
        // TODO 48: super.redraw() 호출 후 부모에게 알리기
        // super.redraw() 호출
        // parent가 null이 아니면 parent.redraw() 호출
        super.redraw();
        if(parent != null) {
            parent.redraw();
        }
    }
}
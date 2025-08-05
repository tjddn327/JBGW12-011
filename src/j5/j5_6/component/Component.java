package j5.j5_6.component;

/**
 * GUI 컴포넌트 시스템 구현
 */
// 기본 컴포넌트 클래스
abstract class Component {
    protected int x, y;
    protected int width, height;
    protected boolean visible;
    protected Component parent;

    public Component(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.visible = true;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    public void show() {
        this.visible = true;
        redraw();
    }

    public void hide() {
        this.visible = false;
        if (parent != null) {
            parent.redraw();  // 부모에게 다시 그리기 요청
        }
    }

    public abstract void draw();

    public void redraw() {
        if (visible) {
            draw();
        }
    }
}
package j5.j5_8.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 간단한 GUI 버튼 클래스
 */
public class CustomButton {
    private String text;
    private boolean enabled = true;
    private List<ClickListener> listeners;

    public CustomButton(String text) {
        // TODO 50: text 초기화하고 listeners를 새 ArrayList로 초기화하기
        this.text = text;
        this.listeners = new ArrayList<>();
    }

    // 클릭 이벤트를 처리하는 내부 클래스
    public class ClickEvent {
        private long timestamp;
        private int x, y;  // 클릭 좌표

        public ClickEvent(int x, int y) {
            // TODO 51: timestamp를 현재 시간으로, x와 y 좌표 초기화하기
            this.timestamp = System.currentTimeMillis();
            this.x = x;
            this.y = y;
        }

        public String getButtonText() {
            // TODO 52: 외부 클래스의 text 반환하기
            return CustomButton.this.text;
        }

        public boolean isButtonEnabled() {
            // TODO 53: 외부 클래스의 enabled 상태 반환하기
            return CustomButton.this.enabled;
        }

        @Override
        public String toString() {
            // TODO 54: "ClickEvent[button=text, pos=(x,y), time=timestamp]" 형식으로 반환하기
            return String.format("ClickEvent[button=%s, pos=(%d,%d), time=%d]", text, x, y, timestamp);
        }
    }

    // 클릭 리스너 인터페이스
    public interface ClickListener {
        void onClick(ClickEvent event);
    }

    public void addClickListener(ClickListener listener) {
        // TODO 55: listeners에 listener 추가하기
        listeners.add(listener);
    }

    // 버튼 클릭 시뮬레이션
    public void click(int x, int y) {
        // TODO 56: 버튼 클릭 처리하기
        // enabled가 false면 "버튼이 비활성화되어 있습니다." 출력하고 리턴
        // ClickEvent 생성
        // 모든 listener에 onClick 호출

        if (!enabled) {
            System.out.println("버튼이 비활성화되어 있습니다.");
            return;
        }

        ClickEvent event = new ClickEvent(x, y);
        for (ClickListener listener : listeners) {
            listener.onClick(event);
        }
    }

    public void setEnabled(boolean enabled) {
        // TODO 57: enabled 상태 설정하기
        this.enabled = enabled;
    }

    public String getText() {
        // TODO 58: text 반환하기
        return text;
    }
}

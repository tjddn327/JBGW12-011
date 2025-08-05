package j5.j5_7.event;

// 특정 이벤트 리스너들
public interface ClickListener extends EventListener {
    @Override
    default void onEvent(Event event) {
        if ("click".equals(event.getType())) {
            onClick(event);
        }
    }

    void onClick(Event event);
}
package j5.j5_7.event;

// 이벤트 발생자 인터페이스
public interface EventEmitter {
    void addEventListener(String eventType, EventListener listener);
    void removeEventListener(String eventType, EventListener listener);
    void emit(Event event);
}
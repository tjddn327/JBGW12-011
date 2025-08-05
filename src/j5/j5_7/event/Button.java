package j5.j5_7.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 버튼 클래스 - 이벤트 발생자
public class Button implements EventEmitter {
    private String text;
    private Map<String, List<EventListener>> listeners;

    public Button(String text) {
        // TODO 78: text 초기화하고
        // listeners를 새 HashMap으로 초기화하기
        listeners = new HashMap<>();
    }

    @Override
    public void addEventListener(String eventType, EventListener listener) {
        // TODO 79: 이벤트 리스너 등록하기
         listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    @Override
    public void removeEventListener(String eventType, EventListener listener) {
        // TODO 80: 이벤트 리스너 제거하기
        // listeners.get(eventType)에서 listener 제거
        if(listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }

    @Override
    public void emit(Event event) {
        // TODO 81: 이벤트 발생시키기
        // event.getType()에 해당하는 리스너들을 찾아서
        // 각각의 onEvent(event) 호출하기


    }

    // 버튼 클릭 시뮬레이션
    public void click() {
        // TODO 82: 클릭 이벤트 생성하고 발생시키기
        // Event 생성 (type: "click", source: this)
        // event에 "button" 데이터로 text 추가
        // emit(event) 호출
    }

    public String getText() {
        return text;
    }
}
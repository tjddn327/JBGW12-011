package j5.j5_7.event;

import java.util.HashMap;
import java.util.Map;

// 이벤트 클래스
public class Event {
    private String type;
    private Object source;
    private long timestamp;
    private Map<String, Object> data;

    public Event(String type, Object source) {
        // TODO 75: type, source, timestamp 초기화하기
        // timestamp는 System.currentTimeMillis() 사용
        // data는 새 HashMap으로 초기화
        this.type = type;
        this.source = source;
        timestamp = System.currentTimeMillis();
        data = new HashMap<>();
    }

    // getter 메서드들
    public String getType() { return type; }
    public Object getSource() { return source; }
    public long getTimestamp() { return timestamp; }

    public void setData(String key, Object value) {
        // TODO 76: data에 key-value 추가하기
        data.put(key, value);
    }

    public Object getData(String key) {
        // TODO 77: data에서 key에 해당하는 값 반환하기
        return data.get(key);
    }
}

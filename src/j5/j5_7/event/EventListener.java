package j5.j5_7.event;

import java.util.*;

/**
 * 이벤트 처리를 위한 인터페이스 시스템
 */
// 이벤트 리스너 인터페이스
public interface EventListener {
    void onEvent(Event event);
}
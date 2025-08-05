package j5.j5_6.message;

/**
 * 메서드 체이닝을 구현하는 StringBuilder 스타일 클래스
 */
public class MessageBuilder {
    private StringBuilder message;

    public MessageBuilder() {
        this.message = new StringBuilder();
    }

    public MessageBuilder append(String text) {
        // TODO 7: message에 text를 추가하고 this를 반환하기
        // 메서드 체이닝을 위해 자기 자신을 반환
        message.append(text);
        return this;
    }

    public MessageBuilder appendLine(String text) {
        // TODO 8: message에 text와 줄바꿈 문자를 추가하고 this를 반환하기
        message.append(text).append("\n");
        return this;
    }

    public MessageBuilder appendWithSpace(String text) {
        // TODO 9: message가 비어있지 않으면 공백 추가 후 text 추가하기
        // this를 반환하여 체이닝 가능하게 하기
        if(!message.isEmpty()) {
            message.append(" ");
        }
        message.append(text);
        return this;
    }

    public MessageBuilder reset() {
        // TODO 10: message를 비우고 this를 반환하기
        message = new StringBuilder();
        return this;
    }

    @Override
    public String toString() {
        return message.toString();
    }
}
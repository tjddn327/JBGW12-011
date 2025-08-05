package j5.j5_7.read;

// 구현 예제 1: 문자열에서 읽기
public class StringReader implements Readable {
    private String content;
    private int position;

    public StringReader(String content) {
        // TODO 33: content와 position 초기화하기
        this.content = content;
        position = 0;
    }

    @Override
    public char readChar() {
        // TODO 34: 문자 하나 읽기
        // position >= content.length()이면 '\0' 반환
        // 아니면 content.charAt(position) 반환하고 position 증가
        if(position >= content.length()) {
            return '\0';
        }else{
            return content.charAt(position++);
        }
    }
}
package j5.j5_7.read;

/**
 * 읽기 가능한 소스를 나타내는 인터페이스
 */
public interface Readable {
    // 추상 메서드 - 구현 필수
    char readChar();

    // 기본 메서드 - 한 줄 읽기
    default String readLine() {
        StringBuilder line = new StringBuilder();
        try {
            char ch = readChar();
            while (ch != '\n' && ch != '\0') {
                line.append(ch);
                ch = readChar();
            }
        } catch (Exception e) {
            // 읽기 종료
        }
        return line.toString();
    }

    // 기본 메서드 - 단어 읽기
    default String readWord() {
        StringBuilder word = new StringBuilder();
        try {
            char ch = readChar();

            // 공백 건너뛰기
            while (Character.isWhitespace(ch)) {
                ch = readChar();
            }

            // 단어 읽기
            while (!Character.isWhitespace(ch) && ch != '\0') {
                word.append(ch);
                ch = readChar();
            }
        } catch (Exception e) {
            // 읽기 종료
        }
        return word.toString();
    }

    // 기본 메서드 - 모든 내용 읽기
    default String readAll() {
        StringBuilder all = new StringBuilder();
        try {
            String line;
            while (!(line = readLine()).isEmpty()) {
                all.append(line).append('\n');
            }
        } catch (Exception e) {
            // 읽기 종료
        }
        return all.toString();
    }
}

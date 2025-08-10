package j9.j9_5;

public class BasicParser {
    private String input;
    private int position;

    // 파싱 예외
    static class ParseError extends Exception {
        public ParseError(String message) {
            super(message);
        }
    }

    // 기본 유틸리티 메서드
    private char peek() {
        if (position < input.length()) {
            return input.charAt(position);
        }
        return '\0';  // 입력 끝
    }

    private char next() {
        char ch = peek();
        position++;
        return ch;
    }

    private void skipWhitespace() {
        while (position < input.length() &&
                Character.isWhitespace(input.charAt(position))) {
            position++;
        }
    }

    private boolean isAtEnd() {
        skipWhitespace();
        return position >= input.length();
    }

    // 특정 문자 기대
    private void expect(char expected) throws ParseError {
        skipWhitespace();
        if (peek() != expected) {
            throw new ParseError("'" + expected + "'가 필요하지만 '" +
                    peek() + "'를 발견했습니다.");
        }
        next();
    }

    // 문자열 매칭
    private boolean match(String str) {
        skipWhitespace();
        int savedPos = position;

        for (char ch : str.toCharArray()) {
            if (next() != ch) {
                position = savedPos;
                return false;
            }
        }

        return true;
    }
}
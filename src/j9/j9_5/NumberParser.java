//package j9.j9_5;
//
//public class NumberParser extends BasicParser {
//
//
//    // <integer> ::= <digit> | <digit> <integer>
//    public int parseInteger() throws ParseError {
//        skipWhitespace();
//
//        // TODO 1: 현재 문자가 숫자가 아니면 ParseError 던지기
//        if (!Character.isDigit(peek())) {
//            throw new ParseError("숫자가 필요하지만 '" + peek() + "'를 발견했습니다.");
//        }
//
//        // TODO 2: 숫자를 읽어서 정수로 변환
//        // 힌트: 반복문을 사용하여 연속된 숫자를 읽고,
//        //      result = result * 10 + (next() - '0') 방식으로 값 축적
//        int result = 0;
//        while (Character.isDigit(peek())) {
//            result = result * 10 + (next() - '0');
//        }
//        return result;
//    }
//
//    // <signed-integer> ::= [ "+" | "-" ] <integer>
//    public int parseSignedInteger() throws ParseError {
//        skipWhitespace();
//        boolean isNegative = false;
//
//        // TODO 1: 부호 처리
//        // - '+' 또는 '-'가 있는지 확인
//        // - '-'인 경우 negative 플래그 설정
//        if (peek() == '+') {
//            next();
//        } else if (peek() == '-') {
//            isNegative = true;
//            next();
//        }
//
//        // TODO 2: parseInteger()를 호출하여 숫자 파싱
//        int value = parseInteger();
//
//        // TODO 3: negative이면 음수로 변환하여 반환
//        return isNegative ? -value : value;
//    }
//
//    // <real-number> ::= <integer> [ "." <integer> ]
//    public double parseRealNumber() throws ParseError {
//        skipWhitespace();
//
//        // 정수 부분을 문자열로 먼저 읽습니다. 부호까지 처리하기 위함입니다.
//        StringBuilder sb = new StringBuilder();
//        if (peek() == '+' || peek() == '-') {
//            sb.append(next());
//        }
//
//        // TODO 1: parseInteger()로 정수 부분 파싱 (개선된 방식)
//        if (!Character.isDigit(peek())) {
//            throw new ParseError("숫자가 필요합니다.");
//        }
//        while(Character.isDigit(peek())) {
//            sb.append(next());
//        }
//
//        // TODO 2: 소수점이 있는지 확인
//        if (peek() == '.') {
//            sb.append(next()); // '.' 소비
//
//            // TODO 3: 소수점이 있으면:
//            //   - 다음 문자가 숫자인지 확인 (아니면 예외)
//            if (!Character.isDigit(peek())) {
//                throw new ParseError("소수점 뒤에 숫자가 필요합니다.");
//            }
//            //   - 소수 부분 파싱 (반복문으로 숫자 읽기)
//            while (Character.isDigit(peek())) {
//                sb.append(next());
//            }
//        }
//
//        return Double.parseDouble(sb.toString());
//    }
//
//    // 테스트
//    public static void main(String[] args) {
//        NumberParser parser = new NumberParser();
//
//        try {
//            parser.input = "123";
//            parser.position = 0;
//            System.out.println(parser.parseInteger());  // 123
//
//            parser.input = "-456";
//            parser.position = 0;
//            System.out.println(parser.parseSignedInteger());  // -456
//
//            parser.input = "3.14159";
//            parser.position = 0;
//            System.out.println(parser.parseRealNumber());  // 3.14159
//
//        } catch (ParseError e) {
//            System.err.println("파싱 오류: " + e.getMessage());
//        }
//    }
//}
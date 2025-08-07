//package j9.j9_5;
//
//public class ExpressionParser extends BasicParser {
//
//    // <expression> ::= <term> [ ("+" | "-") <term> ]...
//    public double parseExpression() throws ParseError {
//        // TODO 1: parseTerm()으로 첫 번째 항 파싱
//
//        // TODO 2: '+' 또는 '-' 연산자가 있는 동안 반복:
//        //   - 연산자 저장
//        //   - parseTerm()으로 다음 항 파싱
//        //   - 연산자에 따라 덧셈/뻔셈 수행
//
//        return 0.0; // 임시 반환값
//    }
//
//    // <term> ::= <factor> [ ("*" | "/") <factor> ]...
//    public double parseTerm() throws ParseError {
//        // TODO 1: parseFactor()로 첫 번째 인수 파싱
//
//        // TODO 2: '*' 또는 '/' 연산자가 있는 동안 반복:
//        //   - 연산자 저장
//        //   - parseFactor()로 다음 인수 파싱
//        //   - 곱셈/나눗셈 수행 (나눗셈시 0 검사)
//
//        return 0.0; // 임시 반환값
//    }
//
//    // <factor> ::= <number> | "(" <expression> ")" | "-" <factor>
//    public double parseFactor() throws ParseError {
//        skipWhitespace();
//
//        // TODO 1: 음수 처리 - '-'로 시작하면 parseFactor() 재귀 호출
//
//        // TODO 2: 괄호 처리 - '('로 시작하면:
//        //   - '(' 소비
//        //   - parseExpression() 호출
//        //   - ')' 기대 (expect 메서드 사용)
//
//        // TODO 3: 숫자 처리 - 숫자나 '.' 로 시작하면 parseNumber() 호출
//
//        // TODO 4: 그 외의 경우 ParseError 던지기
//
//        return 0.0; // 임시 반환값
//    }
//
//    // 숫자 파싱 (정수 또는 실수)
//    private double parseNumber() throws ParseError {
//        StringBuilder sb = new StringBuilder();
//
//        // 정수 부분
//        while (Character.isDigit(peek())) {
//            sb.append(next());
//        }
//
//        // 소수 부분
//        if (peek() == '.') {
//            sb.append(next());
//
//            if (!Character.isDigit(peek())) {
//                throw new ParseError("소수점 뒤에 숫자가 필요합니다");
//            }
//
//            while (Character.isDigit(peek())) {
//                sb.append(next());
//            }
//        }
//
//        return Double.parseDouble(sb.toString());
//    }
//
//    // 편의 메서드: 전체 수식 파싱
//    public double parse(String expression) throws ParseError {
//        this.input = expression;
//        this.position = 0;
//
//        double result = parseExpression();
//
//        if (!isAtEnd()) {
//            throw new ParseError("예상치 못한 문자: " + peek());
//        }
//
//        return result;
//    }
//
//    // 테스트
//    public static void main(String[] args) {
//        ExpressionParser parser = new ExpressionParser();
//
//        String[] expressions = {
//                "2 + 3",
//                "2 + 3 * 4",
//                "(2 + 3) * 4",
//                "10 / 2 - 3",
//                "3.14 * 2 * 2",
//                "-5 + 3",
//                "-(2 + 3) * 4",
//                "1 + 2 * 3 - 4 / 2"
//        };
//
//        for (String expr : expressions) {
//            try {
//                double result = parser.parse(expr);
//                System.out.printf("%s = %.2f%n", expr, result);
//            } catch (ParseError e) {
//                System.err.println(expr + " : " + e.getMessage());
//            }
//        }
//    }
//}
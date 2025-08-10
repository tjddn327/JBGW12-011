//package j9.j9_5;
//
//public class ExpressionParser extends BasicParser {
//
//    public class ExpressionParser extends BasicParser {
//
//        // <expression> ::= <term> [ ("+" | "-") <term> ]...
//        public double parseExpression() throws ParseError {
//            // TODO 1: parseTerm()으로 첫 번째 항 파싱
//            double left = parseTerm();
//
//            // TODO 2: '+' 또는 '-' 연산자가 있는 동안 반복:
//            while (true) {
//                skipWhitespace();
//                char op = peek();
//                if (op == '+' || op == '-') {
//                    next(); // 연산자 소비
//                    //   - parseTerm()으로 다음 항 파싱
//                    double right = parseTerm();
//                    //   - 연산자에 따라 덧셈/뺄셈 수행
//                    if (op == '+') {
//                        left += right;
//                    } else {
//                        left -= right;
//                    }
//                } else {
//                    break;
//                }
//            }
//            return left;
//        }
//
//        // <term> ::= <factor> [ ("*" | "/") <factor> ]...
//        public double parseTerm() throws ParseError {
//            // TODO 1: parseFactor()로 첫 번째 인수 파싱
//            double left = parseFactor();
//
//            // TODO 2: '*' 또는 '/' 연산자가 있는 동안 반복:
//            while (true) {
//                skipWhitespace();
//                char op = peek();
//                if (op == '*' || op == '/') {
//                    next(); // 연산자 소비
//                    //   - parseFactor()로 다음 인수 파싱
//                    double right = parseFactor();
//                    //   - 곱셈/나눗셈 수행 (나눗셈시 0 검사)
//                    if (op == '*') {
//                        left *= right;
//                    } else {
//                        if (right == 0) {
//                            throw new ParseError("0으로 나눌 수 없습니다.");
//                        }
//                        left /= right;
//                    }
//                } else {
//                    break;
//                }
//            }
//            return left;
//        }
//
//        // <factor> ::= <number> | "(" <expression> ")" | "-" <factor>
//        public double parseFactor() throws ParseError {
//            skipWhitespace();
//
//            // TODO 1: 음수 처리 - '-'로 시작하면 parseFactor() 재귀 호출
//            if (peek() == '-') {
//                next(); // '-' 소비
//                return -parseFactor();
//            }
//
//            // TODO 2: 괄호 처리 - '('로 시작하면:
//            if (peek() == '(') {
//                //   - '(' 소비
//                next();
//                //   - parseExpression() 호출
//                double result = parseExpression();
//                //   - ')' 기대 (expect 메서드 사용)
//                expect(')');
//                return result;
//            }
//
//            // TODO 3: 숫자 처리 - 숫자나 '.' 로 시작하면 parseNumber() 호출
//            if (Character.isDigit(peek()) || peek() == '.') {
//                return parseNumber();
//            }
//
//            // TODO 4: 그 외의 경우 ParseError 던지기
//            throw new ParseError("예상치 못한 문자: " + peek());
//        }
//
//        // 숫자 파싱 (정수 또는 실수)
//        private double parseNumber() throws ParseError {
//            skipWhitespace();
//            StringBuilder sb = new StringBuilder();
//
//            // 정수 부분
//            while (Character.isDigit(peek())) {
//                sb.append(next());
//            }
//
//            // 소수 부분
//            if (peek() == '.') {
//                sb.append(next());
//
//                if (!Character.isDigit(peek())) {
//                    throw new ParseError("소수점 뒤에 숫자가 필요합니다");
//                }
//
//                while (Character.isDigit(peek())) {
//                    sb.append(next());
//                }
//            }
//
//            if (sb.length() == 0) {
//                throw new ParseError("숫자를 찾을 수 없습니다.");
//            }
//
//            return Double.parseDouble(sb.toString());
//        }
//
//        // 편의 메서드: 전체 수식 파싱
//        public double parse(String expression) throws ParseError {
//            this.input = expression;
//            this.position = 0;
//
//            double result = parseExpression();
//
//            if (!isAtEnd()) {
//                throw new ParseError("예상치 못한 문자: " + peek());
//            }
//
//            return result;
//        }
//
//        // 테스트
//        public static void main(String[] args) {
//            ExpressionParser parser = new ExpressionParser();
//
//            String[] expressions = {
//                    "2 + 3",
//                    "2 + 3 * 4",
//                    "(2 + 3) * 4",
//                    "10 / 2 - 3",
//                    "3.14 * 2 * 2",
//                    "-5 + 3",
//                    "-(2 + 3) * 4",
//                    "1 + 2 * 3 - 4 / 2"
//            };
//
//            for (String expr : expressions) {
//                try {
//                    double result = parser.parse(expr);
//                    System.out.printf("%s = %.2f%n", expr, result);
//                } catch (ParseError e) {
//                    System.err.println(expr + " : " + e.getMessage());
//                }
//            }
//        }
//    }
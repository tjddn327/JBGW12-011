//package j9.j9_6;
//
//import java.util.*;
//
//public class VariableExpressionParser {
//
//    // 수식 트리 노드들
//    abstract static class ExpNode {
//        abstract double value(double xValue);
//        abstract String toString();
//    }
//
//    static class ConstNode extends ExpNode {
//        double number;
//
//        ConstNode(double number) {
//            this.number = number;
//        }
//
//        double value(double xValue) {
//            return number;
//        }
//
//        public String toString() {
//            return String.valueOf(number);
//        }
//    }
//
//    static class VariableNode extends ExpNode {
//        double value(double xValue) {
//            return xValue;
//        }
//
//        public String toString() {
//            return "x";
//        }
//    }
//
//    static class BinOpNode extends ExpNode {
//        char op;
//        ExpNode left, right;
//
//        BinOpNode(char op, ExpNode left, ExpNode right) {
//            this.op = op;
//            this.left = left;
//            this.right = right;
//        }
//
//        double value(double xValue) {
//            double leftVal = left.value(xValue);
//            double rightVal = right.value(xValue);
//
//            switch (op) {
//                case '+': return leftVal + rightVal;
//                case '-': return leftVal - rightVal;
//                case '*': return leftVal * rightVal;
//                case '/': return leftVal / rightVal;
//                default: throw new IllegalStateException("Unknown operator: " + op);
//            }
//        }
//
//        public String toString() {
//            return "(" + left + " " + op + " " + right + ")";
//        }
//    }
//
//    static class UnaryMinusNode extends ExpNode {
//        ExpNode operand;
//
//        UnaryMinusNode(ExpNode operand) {
//            this.operand = operand;
//        }
//
//        double value(double xValue) {
//            return -operand.value(xValue);
//        }
//
//        public String toString() {
//            return "-" + operand;
//        }
//    }
//
//    // 파서
//    private String input;
//    private int pos;
//
//    private void skipSpaces() {
//        while (pos < input.length() && Character.isWhitespace(input.charAt(pos))) {
//            pos++;
//        }
//    }
//
//    private char peek() {
//        skipSpaces();
//        if (pos < input.length()) {
//            return input.charAt(pos);
//        }
//        return '\0';
//    }
//
//    private char next() {
//        skipSpaces();
//        if (pos < input.length()) {
//            return input.charAt(pos++);
//        }
//        return '\0';
//    }
//
//    /**
//     * 수식 파싱
//     */
//    public ExpNode parseExpression() throws ParseError {
//        ExpNode left = parseTerm();
//
//        while (peek() == '+' || peek() == '-') {
//            char op = next();
//            ExpNode right = parseTerm();
//            left = new BinOpNode(op, left, right);
//        }
//
//        return left;
//    }
//
//    /**
//     * 항 파싱
//     */
//    private ExpNode parseTerm() throws ParseError {
//        ExpNode left = parseFactor();
//
//        while (peek() == '*' || peek() == '/') {
//            char op = next();
//            ExpNode right = parseFactor();
//            left = new BinOpNode(op, left, right);
//        }
//
//        return left;
//    }
//
//    /**
//     * 인수 파싱 (변수 지원)
//     */
//    private ExpNode parseFactor() throws ParseError {
//        skipSpaces();
//
//        // 단항 마이너스
//        if (peek() == '-') {
//            next();
//            return new UnaryMinusNode(parseFactor());
//        }
//
//        // 괄호
//        if (peek() == '(') {
//            next();
//            ExpNode expr = parseExpression();
//            if (next() != ')') {
//                throw new ParseError("닫는 괄호가 필요합니다");
//            }
//            return expr;
//        }
//
//        // 변수 x
//        if (peek() == 'x' || peek() == 'X') {
//            next();
//            return new VariableNode();
//        }
//
//        // 숫자
//        if (Character.isDigit(peek()) || peek() == '.') {
//            return new ConstNode(parseNumber());
//        }
//
//        throw new ParseError("예상치 못한 문자: " + peek());
//    }
//
//    private double parseNumber() throws ParseError {
//        StringBuilder sb = new StringBuilder();
//
//        while (Character.isDigit(peek()) || peek() == '.') {
//            sb.append(next());
//        }
//
//        try {
//            return Double.parseDouble(sb.toString());
//        } catch (NumberFormatException e) {
//            throw new ParseError("잘못된 숫자 형식");
//        }
//    }
//
//    static class ParseError extends Exception {
//        ParseError(String message) {
//            super(message);
//        }
//    }
//
//    /**
//     * 수식 파싱 및 평가
//     */
//    public void evaluateExpression(String expression) {
//        // TODO 22: 입력 수식과 위치 초기화
//
//        try {
//            // TODO 23: parseExpression()을 호출하여 수식 트리 생성
//
//            // TODO 24: 전체 수식이 파싱되었는지 확인
//            // 힌트: pos < input.length()이면 예외 발생
//
//            // TODO 25: 파싱 결과 출력
//            // - 원본 수식
//            // - 파싱된 트리
//            // - x = 0, 1, 2, 3일 때의 값
//
//            // TODO 26: 그래프용 데이터 생성
//            // 힌트: x = -2부터 2까지 0.5 간격으로 계산
//
//        } catch (ParseError e) {
//            System.err.println("파싱 오류: " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        VariableExpressionParser parser = new VariableExpressionParser();
//
//        String[] expressions = {
//                "x + 1",
//                "2 * x",
//                "x * x",
//                "3 * (x - 1) * (x + 1)",
//                "x * x + 2 * x + 1",
//                "-x + 5",
//                "(x + 1) / (x - 1)"
//        };
//
//        for (String expr : expressions) {
//            System.out.println("\n" + "=".repeat(50));
//            parser.evaluateExpression(expr);
//        }
//    }
//}
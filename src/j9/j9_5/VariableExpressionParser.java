//package j9.j9_5;
//
//import java.util.*;
//
//public class VariableExpressionParser extends BasicParser {
//    private Map<String, Double> variables = new HashMap<>();
//
//    // 변수 노드
//    static class VariableNode extends ExprNode {
//        private String name;
//        private Map<String, Double> variables;
//
//        public VariableNode(String name, Map<String, Double> variables) {
//            this.name = name;
//            this.variables = variables;
//        }
//
//        @Override
//        public double evaluate() {
//            if (!variables.containsKey(name)) {
//                throw new RuntimeException("정의되지 않은 변수: " + name);
//            }
//            return variables.get(name);
//        }
//
//        @Override
//        public String toInfix() {
//            return name;
//        }
//
//        @Override
//        public String toPrefix() {
//            return name;
//        }
//
//        @Override
//        public String toPostfix() {
//            return name;
//        }
//    }
//
//    // <factor> ::= <number> | <variable> | "(" <expression> ")" | "-" <factor>
//    @Override
//    public ExprNode parseFactor() throws ParseError {
//        skipWhitespace();
//
//        if (peek() == '-') {
//            next();
//            return new UnaryMinusNode(parseFactor());
//        }
//
//        if (peek() == '(') {
//            next();
//            ExprNode expr = parseExpression();
//            expect(')');
//            return expr;
//        }
//
//        if (Character.isDigit(peek()) || peek() == '.') {
//            return new NumberNode(parseNumber());
//        }
//
//        if (Character.isLetter(peek())) {
//            String varName = parseIdentifier();
//            return new VariableNode(varName, variables);
//        }
//
//        throw new ParseError("예상치 못한 문자: " + peek());
//    }
//
//    // <identifier> ::= <letter> [ <letter> | <digit> ]...
//    private String parseIdentifier() {
//        StringBuilder sb = new StringBuilder();
//
//        while (Character.isLetterOrDigit(peek())) {
//            sb.append(next());
//        }
//
//        return sb.toString();
//    }
//
//    // 변수 설정
//    public void setVariable(String name, double value) {
//        variables.put(name, value);
//    }
//
//    // 테스트
//    public static void main(String[] args) {
//        VariableExpressionParser parser = new VariableExpressionParser();
//
//        // 변수 설정
//        parser.setVariable("x", 10);
//        parser.setVariable("y", 5);
//        parser.setVariable("pi", 3.14159);
//
//        String[] expressions = {
//                "x + y",
//                "x * 2 + y",
//                "pi * x * x",
//                "(x + y) / 2",
//                "x * x + y * y"
//        };
//
//        for (String expr : expressions) {
//            try {
//                parser.input = expr;
//                parser.position = 0;
//
//                ExprNode tree = parser.parseExpression();
//
//                System.out.printf("%s = %.2f%n", expr, tree.evaluate());
//
//            } catch (Exception e) {
//                System.err.println(expr + " : " + e.getMessage());
//            }
//        }
//    }
//}
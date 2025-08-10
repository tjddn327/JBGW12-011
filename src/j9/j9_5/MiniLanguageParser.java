//package j9.j9_5;
//
//import java.util.*;
//
//public class MiniLanguageParser extends BasicParser {
//    // BasicParser의 필드와 메서드가 필요합니다.
//    private String input;
//    private int position;
//
//    // BasicParser의 클래스와 메서드
//    static class ParseError extends Exception { public ParseError(String message) { super(message); } }
//    private char peek() { return position < input.length() ? input.charAt(position) : '\0'; }
//    private char next() { char ch = peek(); if (position < input.length()) position++; return ch; }
//    private void skipWhitespace() { while (position < input.length() && (Character.isWhitespace(input.charAt(position)) || input.charAt(position) == '\n' || input.charAt(position) == '\r')) { position++; } }
//    private boolean isAtEnd() { skipWhitespace(); return position >= input.length(); }
//    private void expect(char expected) throws ParseError { skipWhitespace(); if (peek() != expected) { throw new ParseError("'" + expected + "'가 필요하지만 '" + peek() + "'를 발견했습니다."); } next(); }
//    private boolean match(String str) { skipWhitespace(); int savedPos = position; for (char ch : str.toCharArray()) { if (next() != ch) { position = savedPos; return false; } } return true; }
//    private String parseIdentifier() { skipWhitespace(); StringBuilder sb = new StringBuilder(); while (Character.isLetterOrDigit(peek())) { sb.append(next()); } return sb.toString(); }
//
//    // Statement 추상 클래스
//    abstract static class Statement {
//        abstract void execute(Environment env);
//    }
//
//    // 환경 (변수 저장)
//    static class Environment {
//        private Map<String, Double> variables = new HashMap<>();
//
//        public void setVariable(String name, double value) {
//            variables.put(name, value);
//        }
//
//        public double getVariable(String name) {
//            if (!variables.containsKey(name)) {
//                // 기본값 0으로 초기화
//                // throw new RuntimeException("정의되지 않은 변수: " + name);
//                this.variables.put(name, 0.0);
//            }
//            return variables.get(name);
//        }
//    }
//
//    // ExpressionParser 로직 통합
//    private ExpressionTreeParser exprParser = new ExpressionTreeParser();
//    private ExprNode parseExpression() throws ParseError {
//        this.exprParser.input = this.input;
//        this.exprParser.position = this.position;
//        ExprNode result = this.exprParser.parseExpression();
//        this.position = this.exprParser.position;
//        return result;
//    }
//
//    // 할당문
//    static class AssignmentStatement extends Statement {
//        private String variable;
//        private ExprNode expression;
//
//        public AssignmentStatement(String var, ExprNode expr) {
//            this.variable = var;
//            this.expression = expr;
//        }
//
//        @Override
//        public void execute(Environment env) {
//            double value = expression.evaluate();
//            env.setVariable(variable, value);
//        }
//    }
//
//    // 출력문
//    static class PrintStatement extends Statement {
//        private ExprNode expression;
//
//        public PrintStatement(ExprNode expr) {
//            this.expression = expr;
//        }
//
//        @Override
//        public void execute(Environment env) {
//            // Expression의 변수 맵을 Environment와 연결
//            connectVariables(expression, env.variables);
//            double value = expression.evaluate();
//            System.out.println(value);
//        }
//    }
//
//    // If문
//    static class IfStatement extends Statement {
//        private ExprNode condition;
//        private Statement thenStmt;
//        private Statement elseStmt;
//
//        public IfStatement(ExprNode cond, Statement then, Statement els) {
//            this.condition = cond;
//            this.thenStmt = then;
//            this.elseStmt = els;
//        }
//
//        @Override
//        public void execute(Environment env) {
//            connectVariables(condition, env.variables);
//            if (condition.evaluate() != 0) {
//                thenStmt.execute(env);
//            } else if (elseStmt != null) {
//                elseStmt.execute(env);
//            }
//        }
//    }
//
//    // 블록문
//    static class BlockStatement extends Statement {
//        private List<Statement> statements;
//
//        public BlockStatement(List<Statement> stmts) {
//            this.statements = stmts;
//        }
//
//        @Override
//        public void execute(Environment env) {
//            for (Statement stmt : statements) {
//                stmt.execute(env);
//            }
//        }
//    }
//
//    // Helper to connect variable maps
//    private static void connectVariables(ExprNode node, Map<String, Double> vars) {
//        if (node instanceof VariableExpressionParser.VariableNode) {
//            try {
//                var field = VariableExpressionParser.VariableNode.class.getDeclaredField("variables");
//                field.setAccessible(true);
//                field.set(node, vars);
//            } catch (Exception e) {}
//        } else if (node instanceof BinaryOpNode) {
//            connectVariables(ExpressionTreeParser.getLeft((BinaryOpNode)node), vars);
//            connectVariables(ExpressionTreeParser.getRight((BinaryOpNode)node), vars);
//        } else if (node instanceof UnaryMinusNode) {
//            connectVariables(ExpressionTreeParser.getOperand((UnaryMinusNode)node), vars);
//        }
//    }
//
//    // <program> ::= [ <statement> ]...
//    public List<Statement> parseProgram() throws ParseError {
//        List<Statement> statements = new ArrayList<>();
//
//        while (!isAtEnd()) {
//            statements.add(parseStatement());
//            skipWhitespace();
//        }
//
//        return statements;
//    }
//
//    // <statement> ::= <assignment> | <print> | <if-statement> | <block>
//    public Statement parseStatement() throws ParseError {
//        skipWhitespace();
//
//        if (match("print")) {
//            return parsePrintStatement();
//        } else if (match("if")) {
//            return parseIfStatement();
//        } else if (peek() == '{') {
//            return parseBlockStatement();
//        } else {
//            return parseAssignment();
//        }
//    }
//
//    // <assignment> ::= <identifier> "=" <expression> ";"
//    private Statement parseAssignment() throws ParseError {
//        String var = parseIdentifier();
//        expect('=');
//        // Expression 파서를 사용하기 위해 약간의 조정
//        VariableExpressionParser tempParser = new VariableExpressionParser();
//        tempParser.input = this.input;
//        tempParser.position = this.position;
//        ExprNode expr = tempParser.parseExpression();
//        this.position = tempParser.position;
//
//        expect(';');
//        return new AssignmentStatement(var, expr);
//    }
//
//    // <print> ::= "print" <expression> ";"
//    private Statement parsePrintStatement() throws ParseError {
//        VariableExpressionParser tempParser = new VariableExpressionParser();
//        tempParser.input = this.input;
//        tempParser.position = this.position;
//        ExprNode expr = tempParser.parseExpression();
//        this.position = tempParser.position;
//
//        expect(';');
//        return new PrintStatement(expr);
//    }
//
//    // <if-statement> ::= "if" "(" <expression> ")" <statement> [ "else" <statement> ]
//    private Statement parseIfStatement() throws ParseError {
//        expect('(');
//        VariableExpressionParser tempParser = new VariableExpressionParser();
//        tempParser.input = this.input;
//        tempParser.position = this.position;
//        ExprNode condition = tempParser.parseExpression();
//        this.position = tempParser.position;
//
//        expect(')');
//        Statement thenStmt = parseStatement();
//        Statement elseStmt = null;
//
//        if (match("else")) {
//            elseStmt = parseStatement();
//        }
//
//        return new IfStatement(condition, thenStmt, elseStmt);
//    }
//
//    // <block> ::= "{" [ <statement> ]... "}"
//    private Statement parseBlockStatement() throws ParseError {
//        expect('{');
//        List<Statement> statements = new ArrayList<>();
//
//        while (peek() != '}' && !isAtEnd()) {
//            statements.add(parseStatement());
//            skipWhitespace();
//        }
//
//        expect('}');
//        return new BlockStatement(statements);
//    }
//
//    // 테스트
//    public static void main(String[] args) {
//        MiniLanguageParser parser = new MiniLanguageParser();
//
//        String program = "x = 10; y = 20; sum = x + y; print sum; if (x < y) { print 1; } else { print 0; }";
//
//        try {
//            parser.input = program;
//            parser.position = 0;
//
//            List<Statement> statements = parser.parseProgram();
//            Environment env = new Environment();
//
//            System.out.println("프로그램 실행:");
//            for (Statement stmt : statements) {
//                stmt.execute(env);
//            }
//
//        } catch (ParseError e) {
//            System.err.println("파싱 오류: " + e.getMessage());
//        }
//    }
//}
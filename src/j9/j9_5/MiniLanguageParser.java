//package j9.j9_5;
//
//public class MiniLanguageParser extends BasicParser {
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
//                throw new RuntimeException("정의되지 않은 변수: " + name);
//            }
//            return variables.get(name);
//        }
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
//        ExprNode expr = parseExpression();
//        expect(';');
//        return new AssignmentStatement(var, expr);
//    }
//
//    // <print> ::= "print" <expression> ";"
//    private Statement parsePrintStatement() throws ParseError {
//        ExprNode expr = parseExpression();
//        expect(';');
//        return new PrintStatement(expr);
//    }
//
//    // <if-statement> ::= "if" "(" <expression> ")" <statement> [ "else" <statement> ]
//    private Statement parseIfStatement() throws ParseError {
//        expect('(');
//        ExprNode condition = parseExpression();
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
//        String program = """
//            x = 10;
//            y = 20;
//            sum = x + y;
//            print sum;
//
//            if (x < y) {
//                print 1;
//            } else {
//                print 0;
//            }
//            """;
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
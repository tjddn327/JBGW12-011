package j9.j9_4.expnode;

// 단항 연산자 노드
class UnaryOpNode extends ExprNode {
    private String operator;
    private ExprNode operand;

    public UnaryOpNode(String op, ExprNode operand) {
        this.operator = op;
        this.operand = operand;
    }

    @Override
    public double evaluate() {
        double val = operand.evaluate();

        switch (operator) {
            case "-": return -val;
            case "sqrt": return Math.sqrt(val);
            case "abs": return Math.abs(val);
            case "sin": return Math.sin(val);
            case "cos": return Math.cos(val);
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    @Override
    public String toInfix() {
        return operator + "(" + operand.toInfix() + ")";
    }

    @Override
    public String toPostfix() {
        return operand.toPostfix() + " " + operator;
    }
}
package j9.j9_4.expnode;

// 이항 연산자 노드
class BinaryOpNode extends ExprNode {
    private char operator;
    private ExprNode left;
    private ExprNode right;

    public BinaryOpNode(char op, ExprNode left, ExprNode right) {
        this.operator = op;
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        // TODO 1: 왼쪽 및 오른쪽 자식의 값 계산
        double leftVal = left.evaluate();
        double rightVal = right.evaluate();

        // TODO 2: 연산자에 따라 적절한 연산 수행
        // +, -, *, /, ^ 연산자 처리
        // 나눗셈의 경우 0으로 나누는지 확인
        switch (operator) {
            case '+': return leftVal + rightVal;
            case '-': return leftVal - rightVal;
            case '*': return leftVal * rightVal;
            case '/':
                if (rightVal == 0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
                return leftVal / rightVal;
            case '^': return Math.pow(leftVal, rightVal);
            default: throw new IllegalArgumentException("알 수 없는 연산자: " + operator);
        }
    }

    @Override
    public String toInfix() {
        return "(" + left.toInfix() + " " + operator + " " + right.toInfix() + ")";
    }

    @Override
    public String toPostfix() {
        return left.toPostfix() + " " + right.toPostfix() + " " + operator;
    }
}
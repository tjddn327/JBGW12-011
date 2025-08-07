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

        // TODO 2: 연산자에 따라 적절한 연산 수행
        // +, -, *, /, ^ 연산자 처리
        // 나눗셈의 경우 0으로 나누는지 확인

        return 0.0; // 임시 반환값
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
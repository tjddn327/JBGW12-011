//package j9.j9_5;
//
//import j9.j9_5.exprnode.ExprNode;
//
//// 이항 연산자 노드
//class BinaryOpNode extends ExprNode {
//    private char operator;
//    private ExprNode left;
//    private ExprNode right;
//
//    public BinaryOpNode(char op, ExprNode left, ExprNode right) {
//        this.operator = op;
//        this.left = left;
//        this.right = right;
//    }
//
//    @Override
//    public double evaluate() {
//        double leftVal = left.evaluate();
//        double rightVal = right.evaluate();
//
//        switch (operator) {
//            case '+': return leftVal + rightVal;
//            case '-': return leftVal - rightVal;
//            case '*': return leftVal * rightVal;
//            case '/':
//                if (rightVal == 0) {
//                    throw new ArithmeticException("0으로 나눔");
//                }
//                return leftVal / rightVal;
//            default:
//                throw new IllegalStateException("Unknown operator: " + operator);
//        }
//    }
//
//    @Override
//    public String toInfix() {
//        return "(" + left.toInfix() + " " + operator + " " + right.toInfix() + ")";
//    }
//
//    @Override
//    public String toPrefix() {
//        return operator + " " + left.toPrefix() + " " + right.toPrefix();
//    }
//
//    @Override
//    public String toPostfix() {
//        return left.toPostfix() + " " + right.toPostfix() + " " + operator;
//    }
//}
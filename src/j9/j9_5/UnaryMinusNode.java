//package j9.j9_5;
//
//import j9.j9_5.exprnode.ExprNode;
//
//// 단항 마이너스 노드
//class UnaryMinusNode extends ExprNode {
//    private ExprNode operand;
//
//    public UnaryMinusNode(ExprNode operand) {
//        this.operand = operand;
//    }
//
//    @Override
//    public double evaluate() {
//        return -operand.evaluate();
//    }
//
//    @Override
//    public String toInfix() {
//        return "-" + operand.toInfix();
//    }
//
//    @Override
//    public String toPrefix() {
//        return "- " + operand.toPrefix();
//    }
//
//    @Override
//    public String toPostfix() {
//        return operand.toPostfix() + " -";
//    }
//}
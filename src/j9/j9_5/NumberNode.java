//package j9.j9_5;
//
//import j9.j9_5.exprnode.ExprNode;
//
//// 숫자 노드
//class NumberNode extends ExprNode {
//    private double value;
//
//    public NumberNode(double value) {
//        this.value = value;
//    }
//
//    @Override
//    public double evaluate() {
//        return value;
//    }
//
//    @Override
//    public String toInfix() {
//        return String.valueOf(value);
//    }
//
//    @Override
//    public String toPrefix() {
//        return String.valueOf(value);
//    }
//
//    @Override
//    public String toPostfix() {
//        return String.valueOf(value);
//    }
//}
package j9.j9_4.expnode;

// 추상 클래스
abstract class ExprNode {
    abstract double evaluate();
    abstract String toInfix();
    abstract String toPostfix();
}
package j9.j9_5;

// 수식 트리의 기본 노드
abstract class ExprNode {
    abstract double evaluate();
    abstract String toInfix();
    abstract String toPrefix();
    abstract String toPostfix();
}
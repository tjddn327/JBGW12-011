package j9.j9_4.expnode;

public class ExpressionTreeExample {
    public static void main(String[] args) {
        // 수식: (3 + 4) * 5
        ExprNode expr1 = new BinaryOpNode('*',
                new BinaryOpNode('+',
                        new NumberNode(3),
                        new NumberNode(4)
                ),
                new NumberNode(5)
        );

        System.out.println("수식 1:");
        System.out.println("중위 표기법: " + expr1.toInfix());
        System.out.println("후위 표기법: " + expr1.toPostfix());
        System.out.println("계산 결과: " + expr1.evaluate());

        // 수식: sqrt(16) + 3^2
        ExprNode expr2 = new BinaryOpNode('+',
                new UnaryOpNode("sqrt", new NumberNode(16)),
                new BinaryOpNode('^', new NumberNode(3), new NumberNode(2))
        );

        System.out.println("\n수식 2:");
        System.out.println("중위 표기법: " + expr2.toInfix());
        System.out.println("계산 결과: " + expr2.evaluate());

        // 복잡한 수식: ((10 - 5) * 2) / (3 + 1)
        ExprNode expr3 = new BinaryOpNode('/',
                new BinaryOpNode('*',
                        new BinaryOpNode('-',
                                new NumberNode(10),
                                new NumberNode(5)
                        ),
                        new NumberNode(2)
                ),
                new BinaryOpNode('+',
                        new NumberNode(3),
                        new NumberNode(1)
                )
        );

        System.out.println("\n수식 3:");
        System.out.println("중위 표기법: " + expr3.toInfix());
        System.out.println("후위 표기법: " + expr3.toPostfix());
        System.out.println("계산 결과: " + expr3.evaluate());
    }
}
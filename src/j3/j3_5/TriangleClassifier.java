package j3.j3_5;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 삼각형 판별기 ===");
        System.out.println("세 변의 길이를 입력하세요.");

        System.out.print("변 a: ");
        double a = sc.nextDouble();
        System.out.print("변 b: ");
        double b = sc.nextDouble();
        System.out.print("변 c: ");
        double c = sc.nextDouble();

        // 삼각형 성립 조건 확인
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("변의 길이는 양수여야 합니다!");
        } else if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("삼각형을 만들 수 없습니다!");
            System.out.println("(두 변의 합이 나머지 한 변보다 커야 합니다)");
        } else {
            System.out.println("삼각형을 만들 수 있습니다!");

            // TODO: 삼각형 종류 판별
            // 힌트: == 와 || 연산자

            // 여기에 코드를 작성하세요

            if(a == b && b == c){
                System.out.println("정삼각형");
            }else if(a == b || b == c || c == a){
                System.out.println("이등변삼각형");
            }else{
                System.out.println("일반삼각형");
            }

            // TODO: 직각삼각형 확인
            // 힌트: a² + b² = c² 등 세 가지 경우

            // 여기에 코드를 작성하세요

            if((a*a + b*b) == Math.abs(c*c)){
                System.out.println("추가: 직각삼각형입니다!");
            }
        }
    }
}

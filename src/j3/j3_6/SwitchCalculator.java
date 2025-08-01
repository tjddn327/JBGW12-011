package j3.j3_6;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Switch 표현식 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = sc.nextDouble();

        System.out.print("연산자 (+, -, *, /, %, ^): ");
        String operator = sc.next().trim();

        System.out.print("두 번째 숫자: ");
        double num2 = sc.nextDouble();

        // TODO: switch 표현식으로 계산 수행
        // 힌트: yield 사용, 0으로 나누기 검사
        double result = switch (operator){// 여기에 switch 표현식을 작성하세요
            case  "+" -> {
                System.out.println("덧셈을 수행합니다.");
                yield num1 + num2;
            }
            case "-" -> {
                System.out.println("뺄셈을 수행합니다.");
                yield num1 - num2;
            }
            case "*" -> {
                System.out.println("곱셈을 수행합니다.");
                yield num1 * num2;
            }
            case "/" -> {
                if(num2 == 0) {
                    System.out.println("0으로는 나눌수 없습니다!");
                    yield Double.NaN;
                }else {
                    System.out.println("나눗셈을 수행합니다.");
                }
                yield  num1 / num2;
            }
            case "^" -> {
                System.out.println("거듭제곱을 수행합니다.");
                yield  Math.pow(num1, num2);
            }
            case "%" -> {
                System.out.println("나머지연산을 수행합니다.");
                yield  num1 % num2;
            }
            default ->  {
                yield Double.NaN;
            }
        };

        // 결과 출력
        if (!Double.isNaN(result)) {
            System.out.printf("결과: %.2f %s %.2f = %.2f%n",
                    num1, operator, num2, result);

            // TODO: switch 표현식으로 결과 분석
            // 힌트: Double.compare() 사용
            String analysis = switch (Double.compare(result,0)){// 여기에 switch 표현식을 작성하세요
                case 1 -> {
                    yield "양수입니다.";
                }
                case -1 -> {
                    yield "음수입니다.";
                }
                default -> {
                    yield "0입니다.";
                }
            };
                    System.out.println("분석: " + analysis);

            // TODO: 정수 여부 확인
            // 힌트: 조건 평가 후 switch
            int isin = 0;
            if(result == (int)result) {
                isin = 1;
            }
            String numberType = switch (isin){// 여기에 switch 표현식을 작성하세요
                case 1 -> {
                    yield "정수입니다: " + (int)result;
                }
                case 0 -> {
                    yield "실수입니다: " + result;
                }
                default -> {
                    yield "복소수입니다: ";
                }
            };
                    System.out.println("타입: " + numberType);
        }
    }
}

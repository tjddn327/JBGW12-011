package j3.j3_6;

import java.util.Scanner;

public class GradeEvaluationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0-100): ");
        int score = sc.nextInt();

        // TODO: switch 표현식으로 등급 결정
        // 힌트: score / 10 사용
        char grade = switch (score/10){// 여기에 switch 표현식을 작성하세요
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

                // TODO: switch 표현식으로 평가 메시지 생성
                // 힌트: yield 사용
                String evaluation = switch (grade){// 여기에 switch 표현식을 작성하세요
                    case 'A' -> {
                        yield "(\uD83D\uDC4D 레전드 우수한 성과입니다!\n" +
                                "최우수)";
                    }
                    case 'B' -> {
                        yield "\uD83D\uDC4D 우수한 성과입니다!\n" +
                                "우수)";
                    }
                    case 'C' -> {
                        yield "노력하쇼";
                    }
                    case 'D' -> {
                        yield "더노력하쇼";
                    }
                    case 'F' -> {
                        yield "다음학기에 보세";
                    }
                    default -> {
                        yield "에흉";
                    }
                };

        // TODO: switch 표현식으로 학점 계산
        // 힌트: -> 연산자
        double gpa = switch (grade){// 여기에 switch 표현식을 작성하세요
            case 'A' -> {
                yield 4.0;
            }
            case 'B' -> {
                yield 3.0;
            }
            case 'C' -> {
                yield 2.0;
            }
            case 'D' -> {
                yield 1.0;
            }
            case 'F' -> {
                yield 0.0;
            }
            default ->  {
                yield 0.0;
            }
        };

                // TODO: switch 표현식으로 조언 생성
                // 힌트: -> 연산자
                String advice = switch (grade){// 여기에 switch 표현식을 작성하세요
                    case 'A' -> {
                        yield "대박이네요.";
                    }
                    case 'B' -> {
                        yield "조금만 더 집중하면 A등급도 가능할 것 같습니다.";
                    }
                    case 'C' -> {
                        yield "더 노력하세요.";
                    }
                    case 'D' -> {
                        yield "더 더 노력하세요.";
                    }
                    case 'F' ->{
                        yield "다음학기에 보지요.";
                    }
                    default -> {
                        yield "다음학기에 보지요.";
                    }
                };

                System.out.println("\n=== 성적 결과 ===");
        System.out.printf("점수: %d점%n", score);
        System.out.printf("등급: %c (%s)%n", grade, evaluation);
        System.out.printf("학점: %.1f%n", gpa);
        System.out.println("조언: " + advice);

        // TODO: 장학금 자격 여부 판단
        // 힌트: switch 표현식
        boolean scholarship = switch (grade){// 여기에 switch 표현식을 작성하세요
            case 'A' -> true;
            case 'B' -> false;
            case 'C' -> false;
            case 'D' -> false;
            case 'F' -> false;
            default -> false;
        };

        if (scholarship) {
            System.out.println("🎉 장학금 대상자입니다!");
        }
    }
}

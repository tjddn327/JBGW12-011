package j3.j3_6;

public class NumberClassifier {
    public static void main(String[] args) {
        int number = 3;

        System.out.println("숫자 " + number + " 분석:");

        // TODO: 숫자 분류 switch문
        // 힌트: -> 연산자 사용

        // 여기에 코드를 작성하세요
        switch (number){
            case 1 -> System.out.println("첫 번째 숫자입니다.");
            case 2,4,6,8 -> {
                System.out.println("짝수입니다.");
                System.out.println("2의 배수입니다.");
            }
            case 3,5,7,9 -> {
                System.out.println("홀수입니다.");
                System.out.println("소수일 가능성이 있습니다.");
            }
            case 0 -> System.out.println("영(零)입니다.");
            default -> {
                System.out.println("범위를 벗어난 숫자입니다.");
            }

        }
    }
}

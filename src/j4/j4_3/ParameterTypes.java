package j4.j4_3;

public class ParameterTypes {
    public static void main(String[] args) {
        System.out.println("=== 매개변수 타입 예제 ===\n");

        // TODO 1: 기본 타입 매개변수 메서드들 호출하기
        printNumber(42);
        printBoolean(true);
        printCharacter('A');
        // TODO 2: 문자열 매개변수 메서드 호출하기
        printMessage("Hello Java!");
        // TODO 3: 여러 매개변수 메서드 호출하기
        printPersonInfo("김철수", 25, 175.5);
        // TODO 4: 배열 매개변수 메서드 호출하기
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
    }

    // TODO 5: 정수를 출력하는 메서드 구현하기
    static void printNumber(int num) {
        System.out.println("정수: " + num);
    }

    // TODO 6: 불린값을 출력하는 메서드 구현하기
    static void printBoolean(boolean value) {
        System.out.println("불린값: " + value);
    }

    // TODO 7: 문자를 출력하는 메서드 구현하기
    static void printCharacter(char ch) {
        System.out.println("문자: " + ch);
    }

    // TODO 8: 문자열을 출력하는 메서드 구현하기
    static void printMessage(String msg) {
        System.out.println("메시지: " + msg);
    }

    // TODO 9: 개인 정보를 출력하는 메서드 구현하기
    static void printPersonInfo(String name, int age, double height) {
        System.out.println("\n=== 개인 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.printf("키: %.1fcm\n", height);
    }

    // TODO 10: 배열을 출력하는 메서드 구현하기
    static void printArray(int[] arr) {
        System.out.print("\n배열 요소: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
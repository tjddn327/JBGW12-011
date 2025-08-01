package j4.j4_3;

public class PrintOverloading {
    public static void main(String[] args) {
        System.out.println("=== print 메서드 오버로딩 ===\n");

        // TODO 29: 다양한 타입 출력 테스트하기
        print(42);
        print(3.14159);
        print("Hello World");
        print('X');
        print(true);

        // TODO 30: 여러 개 출력 테스트하기
        print(10,20);
        print("Java", 17);
        print(1,2,3);

        // TODO 31: 배열 출력 테스트하기
        int[] numbers = {5, 10, 15, 20};
        print(numbers);
        System.out.println();
        String[] words = {"Hello", "Java", "World"};
        print(words);
    }

    // TODO 32: 단일 값 출력 메서드들 구현하기
    static void print(int value) {
        System.out.println("[정수] "+value);
    }

    static void print(double value) {
        System.out.println("[실수] "+value);
    }

    static void print(String value) {
        System.out.println("[문자열] "+value);
    }

    static void print(char value) {
        System.out.println("[문자] "+value);
    }

    static void print(boolean value) {
        System.out.println("[불린] "+value);
    }

    // TODO 33: 여러 값 출력 메서드들 구현하기
    static void print(int a, int b) {
        System.out.println("[두 정수] "+ a + ", " + b);
    }

    static void print(String text, int number) {
        System.out.println("[문자열과 정수] "+ text + ": " + number);
    }

    static void print(int a, int b, int c) {
        System.out.println("[세 정수] "+ a + ", " + b + ", " + c);
    }

    // TODO 34: 배열 출력 메서드들 구현하기
    static void print(int[] array) {
        System.out.print("[정수 배열] ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    static void print(String[] array) {
        System.out.print("[문자열 배열] ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
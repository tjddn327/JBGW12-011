package j4.j4_4;

public class UsingReturnValues {
    public static void main(String[] args) {
        System.out.println("=== 반환값 활용 예제 ===\n");

        // TODO 11: 변수에 저장하여 사용하기
         int result = add(10, 20);
         System.out.println("저장된 결과: " + result);

        // TODO 12: 직접 출력하기
         System.out.println("직접 출력: " + add(30, 40));

        // TODO 13: 표현식에서 사용하기
         int total = 100 + add(50, 60);
         System.out.println("표현식 결과: " + total);

        // TODO 14: 조건문에서 사용하기
         if (add(25, 25) > 40) {
             System.out.println("25 + 25는 40보다 큽니다.");
         }

        // TODO 15: 다른 함수의 인자로 사용하기
         int doubled = multiply(add(5, 7), 2);
         System.out.println("(5 + 7) × 2 = " + doubled);

        // TODO 16: 반복문에서 사용하기
         System.out.print("카운트다운: ");
         for (int i = countdown(5)+1; i > 0; i = countdown(i)) {
             System.out.print(i + " ");
         }
         System.out.println("발사!");
    }

    // TODO 17: 덧셈 메서드 구현하기
    static int add(int a, int b) {
        return a + b;
    }

    // TODO 18: 곱셈 메서드 구현하기
    static int multiply(int a, int b) {
        return a * b;
    }

    // TODO 19: 카운트다운 메서드 구현하기
    static int countdown(int n) {
        return n-1;
    }
}
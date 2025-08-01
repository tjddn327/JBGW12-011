package j4.j4_3;

public class CalculatorOverloading {
    public static void main(String[] args) {
        System.out.println("=== 계산기 오버로딩 ===\n");

        // TODO 35: 두 수의 합 테스트하기
        add(5,3);
        add(5.5,3.3);

        // TODO 36: 세 수의 합 테스트하기
        add(1,2,3);
        add(1.1,2.2,3.3);

        // TODO 37: 배열의 합 테스트하기
        int[] intArray = {10, 20, 30, 40};
        add(intArray);
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        add(doubleArray);

        // TODO 38: 평균 계산 테스트하기
        System.out.println("\n평균 계산:");
        average(80,90);
        average(80,90,100);
        average(intArray);
    }

    // TODO 39: add 메서드들 구현하기
    static int add(int a, int b) {
        System.out.println("add(" + a + ", " + b + ") = " + (a+b));
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println("add(" + a + ", " + b + ") = " + (a+b));
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("add(" + a + ", " + b +  ", " + c + ") = " + (a+b+c));
        return a + b + c;
    }

    static double add(double a, double b, double c) {
        System.out.println("add(" + a + ", " + b +  ", " + c + ") = " + (a+b+c));
        return a + b + c;
    }

    static int add(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("add(intArray) = " + sum);
        return sum;
    }

    static double add(double[] numbers) {
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("add(doubleArray) = " + sum);
        return sum;
    }

    // TODO 40: average 메서드들 구현하기
    static double average(int a, int b) {
        System.out.println("average(" + a + ", " + b + ") = " + (double)(a+b)/2);
        return (double)(a+b)/2;
    }

    static double average(int a, int b, int c) {
        System.out.println("average(" + a + ", " + b + ", " + c + ") = " + (double)(a+b+c)/3);
        return (double)(a+b+c)/2;
    }

    static double average(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("add(intArray) = " + (double)sum/numbers.length);
        return (double)sum/numbers.length;
    }
}
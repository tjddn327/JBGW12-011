package j3_4;

public class ForLoopIncrements {
    public static void main(String[] args) {
        // TODO: 짝수 출력
        // 힌트:
        // 1. "0부터 20까지 짝수:" 출력
        // 2. for 루프로 i를 0부터 20까지 2씩 증가 (i += 2)
        // 3. i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("0부터 20까지 짝수:");
        for(int i = 0; i <= 20; i++) {
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // TODO: 홀수 출력
        // 힌트:
        // 1. "\n1부터 20까지 홀수:" 출력
        // 2. for 루프로 i를 1부터 20까지 2씩 증가
        // 3. i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("0부터 20까지 짝수:");
        for(int i = 0; i <= 20; i++) {
            if(i%2!=0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // TODO: 5의 배수
        // 힌트:
        // 1. "\n5의 배수 (5부터 50까지):" 출력
        // 2. for 루프로 i를 5부터 50까지 5씩 증가
        // 3. i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("5의 배수 (5부터 50까지)");
        for(int i = 5; i <= 50; i++) {
            if(i%5==0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // TODO: 제곱수
        // 힌트:
        // 1. "\n제곱수:" 출력
        // 2. for 루프로 i를 1부터 10까지 반복
        // 3. i * i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요

        System.out.println("제곱수:");
        for(int i = 1; i <= 10; i++) {
            System.out.print(i*i+" ");

        }
        System.out.println();
    }
}

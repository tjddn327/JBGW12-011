package j3_4;

public class BasicForLoop {
    public static void main(String[] args) {
        // TODO: 1부터 10까지 출력
        // 힌트:
        // 1. "1부터 10까지:" 출력
        // 2. for 루프로 i를 1부터 10까지 반복
        // 3. i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요\
        System.out.println("1부터 10까지:");
        for(int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // TODO: 0부터 9까지 출력 (프로그래머 스타일)
        // 힌트:
        // 1. "\n0부터 9까지:" 출력
        // 2. for 루프로 i를 0부터 9까지 반복 (i < 10)
        // 3. i와 공백 출력
        // 4. 줄바꿈

        // 여기에 코드를 작성하세요
        System.out.println("0부터 9까지:");
        for(int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        // TODO: 10부터 1까지 역순
        // 힌트:
        // 1. "\n10부터 1까지:" 출력
        // 2. for 루프로 i를 10부터 1까지 감소시키며 반복
        // 3. i와 공백 출력
        // 4. 줄바꿈
        System.out.println("10부터 1까지:");
        for(int i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();

        // 여기에 코드를 작성하세요
    }
}

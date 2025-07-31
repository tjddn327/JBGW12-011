package j3_4;

public class MultiVariableFor {
    public static void main(String[] args) {
        // TODO: 두 변수 동시 사용
        // 힌트:
        // 1. "두 변수 동시 변화:" 출력
        // 2. for 루프에서 i=0, j=10으로 시작
        // 3. i < 10 && j > 0 조건
        // 4. i++, j-- 로 변경
        // 5. printf로 i, j, i+j 출력
        System.out.println("두 변수 동시 변화:");
        for(int i = 0, j=10;  i<10 && j >0; i++, j--){
            System.out.printf("i = %d, j = %d, 합 = %d\n",i,j,i+j);
        }

        System.out.println();
        // 여기에 코드를 작성하세요

        // TODO: 서로 다른 증가율
        // 힌트:
        // 1. "\n서로 다른 증가율:" 출력
        // 2. for 루프에서 x=1, y=1로 시작
        // 3. x <= 10 조건
        // 4. x++, y *= 2 로 변경
        // 5. printf로 x, y 출력 (형식: "x = %2d, y = %4d%n")

        // 여기에 코드를 작성하세요
        System.out.println("서로 다른 증가율:");
        for(int i = 1, j=1;  i<=10; i++, j*=2){
            System.out.printf("x = %2d, y = %4d\n",i,j);
        }
        System.out.println();
        // TODO: 조건부 증가
        // 힌트:
        // 1. "\n조건부 증가:" 출력
        // 2. for 루프에서 a=0, b=0으로 시작
        // 3. a < 20 조건
        // 4. a += (b % 2 == 0 ? 2 : 1), b++
        // 5. printf로 a, b 출력

        // 여기에 코드를 작성하세요
        System.out.println("조건부 증가:");
        for(int a = 0, b=0;  a< 20; a += (b % 2 == 0 ? 2 : 1), b++){
            System.out.printf("a = %d, b = %d\n",a,b);
        }
        System.out.println();
    }
}

package j3.j3_4;

public class LoopPerformance {
    public static void main(String[] args) {
        int n = 100000000;  // 1억
        long sum;

        // TODO: for 루프 성능 측정
        // 힌트:
        // 1. System.currentTimeMillis()로 시작 시간 기록
        // 2. sum = 0으로 초기화
        // 3. for 루프로 i를 1부터 n까지 반복하며 sum에 더하기
        // 4. 종료 시간 - 시작 시간으로 소요 시간 계산
        // 5. 결과와 소요 시간 출력

        // 여기에 코드를 작성하세요
        long st = System.currentTimeMillis();
        sum = 0;
        for(int i = 1; i <= n; i++){
            sum+=i;
        }
        long et = System.currentTimeMillis();
        System.out.println("for 루프 결과: " + sum);
        System.out.println("소요 시간: "+(et-st)+"ms");
        System.out.println();

        // TODO: while 루프 성능 측정
        // 힌트:
        // 1. 시작 시간 기록
        // 2. sum = 0, i = 1로 초기화
        // 3. while 루프로 i <= n 동안 sum += i, i++ 수행
        // 4. 소요 시간 계산
        // 5. 결과와 소요 시간 출력

        // 여기에 코드를 작성하세요
        long st1 = System.currentTimeMillis();
        sum = 0;
        int i = 1;
        while(i <= n){
            sum+=i;
            i++;
        }
        long et1 = System.currentTimeMillis();
        System.out.println("while 루프 결과: " + sum);
        System.out.println("소요 시간: "+(et1-st1)+"ms");
        System.out.println();

        // TODO: 수학 공식 사용
        // 힌트:
        // 1. 시작 시간 기록
        // 2. sum = (long)n * (n + 1) / 2 계산
        // 3. 소요 시간 계산
        // 4. 결과와 소요 시간 출력

        // 여기에 코드를 작성하세요
        long st2 = System.currentTimeMillis();
        sum = (long)n * (n+1);
        long et2 = System.currentTimeMillis();
        System.out.println("수학 공식 결과: " + sum);
        System.out.println("소요 시간: "+(et2-st2)+"ms");
    }
}

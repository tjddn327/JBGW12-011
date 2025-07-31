package j3_4;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("1부터 10000까지의 완전수:");
        System.out.println("(완전수: 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수)");

        for (int n = 1; n <= 10000; n++) {
            int sumOfDivisors = 0;

            // TODO: n의 진약수(자기 자신 제외) 합 구하기
            // 힌트:
            // 1. d를 1부터 n-1까지 반복
            // 2. n % d == 0 이면:
            //    - sumOfDivisors에 d를 더하기

            // 여기에 코드를 작성하세요

            for(int d = 1; d < n-1; d++){
                if(n % d == 0){
                    sumOfDivisors += d;
                }
            }

            // 완전수 확인 및 출력
            if (sumOfDivisors == n) {
                System.out.print("\n" + n + " = ");

                // TODO: 약수 출력
                // 힌트:
                // 1. first를 true로 초기화
                // 2. d를 1부터 n-1까지 반복
                // 3. n % d == 0 이면:
                //    - first가 false면 " + " 출력
                //    - d 출력
                //    - first를 false로 설정

                // 여기에 코드를 작성하세요
                boolean first = true;
                for(int d = 1; d < n-1; d++){
                    if(n % d == 0){
                        if(!first){
                            System.out.print(" + ");
                        }
                        System.out.print(d);
                        first = false;
                    }
                }
            }
        }
        System.out.println();
    }
}

package j4.j4_3;

public class ThreeNPlusOneStats {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 통계 분석 ===\n");

        // 범위 분석하기
        analyzeRange(1, 10);

        // 가장 긴 시퀀스 찾기
        findLongestSequence(1, 20);
    }

    // TODO 25: 범위 내 모든 수의 시퀀스 분석 메서드 구현하기
    static void analyzeRange(int start, int end) {
        System.out.println(start + "부터 " +end+ "까지의 시퀀스 길이:");
        System.out.println("시작값\t갈이\t최대값");
        for(int i = start; i <= end; i++) {
            System.out.println(i + "\t" + getSequenceLength(i) + "\t" + getMaxValue(i));
        }
    }

    // TODO 26: 가장 긴 시퀀스 찾기 메서드 구현하기
    static void findLongestSequence(int start, int end) {
        int[] num = new int[end];
            for(int j = 0; j < end; j++){
                num[j] = getSequenceLength(j+1);
            }

            int maxl = num[0];
            int st = 0;

            for(int j = 0; j < end; j++){
                if(num[j] > maxl){
                    maxl = num[j];
                    st = j+1;
                }
            }

            System.out.println("\n=== 가장 긴 시퀀스 ===");
            System.out.println("범위: " + start + " ~ " + end);
            System.out.println("시작값: " + st);
            System.out.println("길이: " + maxl);
    }

    // TODO 27: 시퀀스 길이 계산 메서드 재구현하기
    static int getSequenceLength(int startingValue) {
        int count = 1;
        if(startingValue == 1){
            return count;
        }
        while (startingValue != 1){
            if(startingValue % 2 == 0){
                startingValue/=2;
            }

            else{
                startingValue = 3*startingValue + 1;
            }
            count++;
        }
        return count;
    }

    // TODO 28: 최대값 계산 메서드 재구현하기
    static int getMaxValue(int startingValue) {
        if(startingValue == 1){
            return 1;
        }
        int[] num = new int[getSequenceLength(startingValue)];
        num[0] = startingValue;
        int i = 1;
        while (startingValue != 1){
            if(startingValue % 2 == 0){
                startingValue/=2;
                num[i] = startingValue;
                i++;
            }

            else{
                startingValue = 3*startingValue + 1;
                num[i] = startingValue;
                i++;
            }

        }
        int max = num[0];
        for(int j = 0; j < num.length; j++){
            if(num[j] > max){
                max = num[j];
            }
        }
        return max;
    }
}
package j4.j4_3;

public class ThreeNPlusOne {
    public static void main(String[] args) {
        System.out.println("=== 3N+1 시퀀스 프로그램 ===\n");

        // TODO 18: 예제 시퀀스 실행하기
        System.out.println("예제 시퀀스:");
        System.out.println("시작값 3의 3N+1 시퀀스:");
        print3NSequence(3);
        System.out.println("시작값 7의 3N+1 시퀀스:");
        print3NSequence(7);

        // TODO 19: 추가 정보 출력하기
        int start = 3;
        System.out.println("추가 정보:");
        System.out.println("시작값 " + start + "의 시퀀스 길이: " + getSequenceLength(start));
        System.out.println("시작값 " + start + "의 최대값: " + getMaxValue(start));
    }

    // TODO 20: 3N+1 시퀀스 출력 메서드 구현하기
    static void print3NSequence(int startingValue) {
        System.out.print(startingValue);

        while (startingValue != 1){
            if(startingValue % 2 == 0){
                startingValue/=2;
                System.out.print(" -> "+startingValue);
            }

            else{
                startingValue = 3*startingValue + 1;
                System.out.print(" -> "+startingValue);
            }
        }
        System.out.println();
        System.out.println();


    }

    // TODO 21: 시퀀스 길이 계산 메서드 구현하기
    static int getSequenceLength(int startingValue) {
        int count = 1;
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

    // TODO 22: 시퀀스의 최대값 찾기 메서드 구현하기
    static int getMaxValue(int startingValue) {
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
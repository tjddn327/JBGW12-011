package j3_1;

public class AbsoluteValue {
    public static void main(String[] args) {
        int[] numbers = {-5, 3, -12, 0, 8, -1};

        System.out.println("절댓값 계산:");

        for (int num : numbers) {
            int absolute = 0;
            // TODO: 절댓값 계산
            // 힌트:
            // 1. num이 음수면 -num
            // 2. 그렇지 않으면 num 그대로

            // 여기에 코드를 작성하세요
            if(num < 0)
                absolute = -num;
            else
                absolute = num;


            System.out.println("|" + num + "| = " + absolute);
        }
    }
}

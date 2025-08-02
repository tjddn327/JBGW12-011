package j4.j4_3;


public class CommandLineBasic {
    public static void main(String[] args) {

        System.out.println("=== 명령줄 인수 처리 ===\n");

        // TODO 57: 인수 개수 확인하고 출력하기
        if (args.length == 0) {
        // TODO 58: 인수가 없는 경우 처리하기
            System.out.println("전달된 인수가 없습니다.");
            return;
        }
        System.out.println("전달받은 인수 개수: " + args.length);
        // TODO 59: 모든 인수 출력하기
        System.out.println("\n전달받은 인수:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }


        // TODO 60: 인수 타입 변환하기
        if (args.length >= 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int sum = num1 + num2;
                System.out.println("\n첫 두 인수의 합: " + sum);
            } catch (NumberFormatException e) {
                System.out.println("\n첫 두 인수가 숫자가 아닙니다.");
            }
        }
    }
}
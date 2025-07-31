package j3_1;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = (int)(Math.random() * 100) + 1;  // 1~100
        int guess;
        int attempts = 0;

        System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");


        // TODO: 숫자 맞추기 루프
        // 힌트:
        // 1. while(true) 무한 루프
        // 2. 사용자로부터 추측 입력받기
        // 3. attempts 증가
        // 4. 정답이면 축하 메시지 후 break
        // 5. 추측이 작으면 "더 큰 수입니다."
        // 6. 추측이 크면 "더 작은 수입니다."

        // 여기에 코드를 작성하세요
        while(true){
            guess = sc.nextInt();
            attempts++;
            if(guess == secretNumber){
                System.out.println("정답! " + secretNumber + "입니다. " + attempts + "번 만에 맞췄습니다!");
                System.out.println("축하합니다! \uD83C\uDF89");
                break;
            }
            else if(guess < secretNumber){
                System.out.println("추측: "+ guess);
                System.out.println("더 작은 수입니다.");
            }
            else{
                System.out.println("추측: "+ guess);
                System.out.println("더 큰 수입니다.");
            }

        }
    }
}
